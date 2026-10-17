package ex;

import kotlin.jvm.internal.Intrinsics;
import xv.m;

/* JADX INFO: loaded from: classes16.dex */
public final class b {
    public static m a(ch0.a image) {
        Intrinsics.checkNotNullParameter(image, "image");
        int i = image.e;
        if (i == 1) {
            return new m(image.f24097a, image.f24098b, image.f24099c, image.d);
        }
        throw new IllegalArgumentException(j6.a.l(i, "Format ", " of MsImage is not supported"));
    }
}
