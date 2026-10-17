package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import android.media.Image;
import android.util.Size;
import com.fourthline.vision.ScannerImage;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class n7 implements q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i7 f36596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j7 f36597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f36598c;

    public n7(@NotNull i7 imageConverter, @NotNull j7 imageCropper, @NotNull Size imageSize) {
        Intrinsics.checkNotNullParameter(imageConverter, "imageConverter");
        Intrinsics.checkNotNullParameter(imageCropper, "imageCropper");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        this.f36596a = imageConverter;
        this.f36597b = imageCropper;
        this.f36598c = imageSize;
    }

    @Override // com.fourthline.vision.internal.q7
    public /* bridge */ /* synthetic */ Object process(Object obj2, Continuation continuation) {
        return process((Pair<? extends Image, fa>) obj2, (Continuation<? super ScannerImage>) continuation);
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public /* bridge */ void start() {
        super.start();
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    public void stop() {
        super.stop();
        this.f36596a.close();
    }

    public Object process(@NotNull Pair<? extends Image, fa> pair, @NotNull Continuation<? super ScannerImage> continuation) {
        Bitmap bitmap = this.f36596a.toBitmap((Image) pair.f186385a, this.f36598c.getWidth(), this.f36598c.getHeight());
        return new ScannerImage(bitmap, j7.crop$default(this.f36597b, bitmap, (fa) pair.f186386b, 0, 4, null));
    }
}
