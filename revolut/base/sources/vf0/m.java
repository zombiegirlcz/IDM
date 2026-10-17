package vf0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m implements kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f288458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f288459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f288460c;
    public final Function1 d;
    public int e;
    public long f;

    public m() {
        this(0, 31);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public final Object apply(Object obj2) {
        efm.r attempts = (efm.r) obj2;
        Intrinsics.checkNotNullParameter(attempts, "attempts");
        efm.r rVarFlatMap = attempts.flatMap(new v3e.s(this, 6));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    public m(long j2, long j3, double d, int i, Function1 checkIsUnhandable) {
        Intrinsics.checkNotNullParameter(checkIsUnhandable, "checkIsUnhandable");
        this.f288458a = j3;
        this.f288459b = d;
        this.f288460c = i;
        this.d = checkIsUnhandable;
        this.f = j2;
    }

    public /* synthetic */ m(int i, int i2) {
        this(2000L, 2000L, (i2 & 4) != 0 ? 2.0d : 1.0d, (i2 & 8) != 0 ? Integer.MAX_VALUE : i, new vea.n(25));
    }
}
