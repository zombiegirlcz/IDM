package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes16.dex */
final class zac implements Runnable {
    final /* synthetic */ ImageManager zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final Uri f38008zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final Bitmap f38009zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private final CountDownLatch f38010zad;

    public zac(ImageManager imageManager, Uri uri2, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.zaa = imageManager;
        this.f38008zab = uri2;
        this.f38009zac = bitmap;
        this.f38010zad = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.zaa.f37997zai.remove(this.f38008zab);
        if (imageReceiver != null) {
            ArrayList arrayList = imageReceiver.f38000zac;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zag zagVar = (zag) arrayList.get(i);
                Bitmap bitmap = this.f38009zac;
                if (bitmap != null) {
                    zagVar.zac(this.zaa.f37992zad, bitmap, false);
                } else {
                    this.zaa.f37998zaj.put(this.f38008zab, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.zaa;
                    zagVar.zab(imageManager.f37992zad, imageManager.f37995zag, false);
                }
                if (!(zagVar instanceof zaf)) {
                    this.zaa.f37996zah.remove(zagVar);
                }
            }
        }
        this.f38010zad.countDown();
        synchronized (ImageManager.zaa) {
            ImageManager.f37990zab.remove(this.f38008zab);
        }
    }
}
