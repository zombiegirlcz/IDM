package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.Asserts;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes16.dex */
final class zaa implements Runnable {
    final /* synthetic */ ImageManager zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final Uri f38005zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final ParcelFileDescriptor f38006zac;

    public zaa(ImageManager imageManager, Uri uri2, ParcelFileDescriptor parcelFileDescriptor) {
        this.zaa = imageManager;
        this.f38005zab = uri2;
        this.f38006zac = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f38006zac;
        Bitmap bitmapDecodeFileDescriptor = null;
        boolean z = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e) {
                "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f38005zab));
                z = true;
            }
            try {
                this.f38006zac.close();
            } catch (IOException e2) {
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.zaa;
        imageManager.f37993zae.post(new zac(imageManager, this.f38005zab, bitmapDecodeFileDescriptor, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            "Latch interrupted while posting ".concat(String.valueOf(this.f38005zab));
        }
    }
}
