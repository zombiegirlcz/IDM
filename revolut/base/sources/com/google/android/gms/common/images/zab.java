package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.SystemClock;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.ImageManager.ImageReceiver;
import com.google.android.gms.common.internal.Asserts;

/* JADX INFO: loaded from: classes16.dex */
final class zab implements Runnable {
    final /* synthetic */ ImageManager zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final zag f38007zab;

    public zab(ImageManager imageManager, zag zagVar) {
        this.zaa = imageManager;
        this.f38007zab = zagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.zaa.f37996zah.get(this.f38007zab);
        if (imageReceiver != null) {
            ImageManager imageManager = this.zaa;
            imageManager.f37996zah.remove(this.f38007zab);
            imageReceiver.zac(this.f38007zab);
        }
        zag zagVar = this.f38007zab;
        zad zadVar = zagVar.zaa;
        Uri uri2 = zadVar.zaa;
        if (uri2 == null) {
            ImageManager imageManager2 = this.zaa;
            zagVar.zab(imageManager2.f37992zad, imageManager2.f37995zag, true);
            return;
        }
        Long l2 = (Long) this.zaa.f37998zaj.get(uri2);
        if (l2 != null) {
            if (SystemClock.elapsedRealtime() - l2.longValue() < CoreConstants.MILLIS_IN_ONE_HOUR) {
                zag zagVar2 = this.f38007zab;
                ImageManager imageManager3 = this.zaa;
                zagVar2.zab(imageManager3.f37992zad, imageManager3.f37995zag, true);
                return;
            } else {
                ImageManager imageManager4 = this.zaa;
                imageManager4.f37998zaj.remove(zadVar.zaa);
            }
        }
        this.f38007zab.zaa(null, false, true, false);
        ImageManager imageManager5 = this.zaa;
        ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) imageManager5.f37997zai.get(zadVar.zaa);
        if (imageReceiver2 == null) {
            ImageManager.ImageReceiver imageReceiver3 = this.zaa.new ImageReceiver(zadVar.zaa);
            ImageManager imageManager6 = this.zaa;
            imageManager6.f37997zai.put(zadVar.zaa, imageReceiver3);
            imageReceiver2 = imageReceiver3;
        }
        imageReceiver2.zab(this.f38007zab);
        zag zagVar3 = this.f38007zab;
        if (!(zagVar3 instanceof zaf)) {
            this.zaa.f37996zah.put(zagVar3, imageReceiver2);
        }
        synchronized (ImageManager.zaa) {
            try {
                if (!ImageManager.f37990zab.contains(zadVar.zaa)) {
                    ImageManager.f37990zab.add(zadVar.zaa);
                    imageReceiver2.zad();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
