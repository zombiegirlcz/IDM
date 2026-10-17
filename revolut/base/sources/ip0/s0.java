package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166264c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bw0.h f166266h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f166267j;

    public s0(bw0.h amountInputModel, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        Intrinsics.checkNotNullParameter(amountInputModel, "amountInputModel");
        this.f166262a = z;
        this.f166263b = z3;
        this.f166264c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166265g = z29;
        this.f166266h = amountInputModel;
        this.i = z31;
        this.f166267j = z41;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f166267j;
    }
}
