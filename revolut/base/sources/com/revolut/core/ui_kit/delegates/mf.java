package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nf f54480c;

    public mf(Image image, boolean z, nf size) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f54478a = image;
        this.f54479b = z;
        this.f54480c = size;
    }

    public final boolean a() {
        return this.f54479b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mf)) {
            return false;
        }
        mf mfVar = (mf) obj2;
        return Intrinsics.f(this.f54478a, mfVar.f54478a) && this.f54479b == mfVar.f54479b && this.f54480c == mfVar.f54480c;
    }

    public final int hashCode() {
        return this.f54480c.hashCode() + j6.a.c(this.f54478a.hashCode() * 31, 31, this.f54479b);
    }

    public /* synthetic */ mf(Image image, boolean z) {
        this(image, z, nf.DP_16);
    }
}
