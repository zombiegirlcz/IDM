package rz7;

import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f258519a;

    public s(m state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f258519a = state;
    }

    @Override // rz7.l
    public final efm.b Z1(boolean z) {
        return w.z0(this.f258519a.y(), Boolean.valueOf(z));
    }

    @Override // rz7.l
    public final efm.r f0() {
        return this.f258519a.y().a();
    }
}
