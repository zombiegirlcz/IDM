package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.base.zat;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes16.dex */
public final class ImageManager {
    private static final Object zaa = new Object();

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private static final HashSet f37990zab = new HashSet();

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private static ImageManager f37991zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private final Context f37992zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private final Handler f37993zae = new zau(Looper.getMainLooper());

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private final ExecutorService f37994zaf = zat.zaa().zab(4, 2);

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private final zam f37995zag = new zam();

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private final Map f37996zah = new HashMap();

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private final Map f37997zai = new HashMap();

    /* JADX INFO: renamed from: zaj, reason: collision with root package name */
    private final Map f37998zaj = new HashMap();

    @KeepName
    public final class ImageReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: zab, reason: collision with root package name */
        private final Uri f37999zab;

        /* JADX INFO: renamed from: zac, reason: collision with root package name */
        private final ArrayList f38000zac;

        public ImageReceiver(Uri uri2) {
            super(new zau(Looper.getMainLooper()));
            this.f37999zab = uri2;
            this.f38000zac = new ArrayList();
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager imageManager = ImageManager.this;
            imageManager.f37994zaf.execute(new zaa(imageManager, this.f37999zab, parcelFileDescriptor));
        }

        public final void zab(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f38000zac.add(zagVar);
        }

        public final void zac(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f38000zac.remove(zagVar);
        }

        public final void zad() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("com.google.android.gms.extras.uri", this.f37999zab);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.this.f37992zad.sendBroadcast(intent);
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(@NonNull Uri uri2, Drawable drawable, boolean z);
    }

    private ImageManager(Context context, boolean z) {
        this.f37992zad = context.getApplicationContext();
    }

    @NonNull
    public static ImageManager create(@NonNull Context context) {
        if (f37991zac == null) {
            f37991zac = new ImageManager(context, false);
        }
        return f37991zac;
    }

    public void loadImage(@NonNull ImageView imageView, int i) {
        zaj(new zae(imageView, i));
    }

    public final void zaj(zag zagVar) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zab(this, zagVar).run();
    }

    public void loadImage(@NonNull ImageView imageView, @NonNull Uri uri2) {
        zaj(new zae(imageView, uri2));
    }

    public void loadImage(@NonNull ImageView imageView, @NonNull Uri uri2, int i) {
        zae zaeVar = new zae(imageView, uri2);
        zaeVar.f38013zab = i;
        zaj(zaeVar);
    }

    public void loadImage(@NonNull OnImageLoadedListener onImageLoadedListener, @NonNull Uri uri2) {
        zaj(new zaf(onImageLoadedListener, uri2));
    }

    public void loadImage(@NonNull OnImageLoadedListener onImageLoadedListener, @NonNull Uri uri2, int i) {
        zaf zafVar = new zaf(onImageLoadedListener, uri2);
        zafVar.f38013zab = i;
        zaj(zafVar);
    }
}
