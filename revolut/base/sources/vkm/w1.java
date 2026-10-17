package vkm;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class w1 implements skm.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f290136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f290137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f290138c;
    public final skm.l d;

    public w1(z1 z1Var, long j2, Object obj2, skm.l lVar) {
        this.f290136a = z1Var;
        this.f290137b = j2;
        this.f290138c = obj2;
        this.d = lVar;
    }

    @Override // skm.r0
    public final void dispose() {
        z1 z1Var = this.f290136a;
        synchronized (z1Var) {
            if (this.f290137b < z1Var.q()) {
                return;
            }
            Object[] objArr = z1Var.f290161h;
            Intrinsics.h(objArr);
            long j2 = this.f290137b;
            if (objArr[((int) j2) & (objArr.length - 1)] != this) {
                return;
            }
            q.f(objArr, j2, q.f290101c);
            z1Var.j();
            Unit unit = Unit.f186387a;
        }
    }
}
