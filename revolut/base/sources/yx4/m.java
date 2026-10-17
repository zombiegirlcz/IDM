package yx4;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f317554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f317555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f317556c;
    public final Integer d;
    public final l e;
    public final Lazy f;

    public m(long j2, long j3, Integer num, l rounding, int i) {
        float f = (i & 4) != 0 ? 10.0f : 1.0f;
        num = (i & 8) != 0 ? null : num;
        rounding = (i & 16) != 0 ? l.DOWN : rounding;
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        this.f317554a = j2;
        this.f317555b = j3;
        this.f317556c = f;
        this.d = num;
        this.e = rounding;
        this.f = yhm.j.b(new yq0.e(this, 15));
    }

    public final long a(long j2, boolean z) {
        if (z) {
            return j2;
        }
        long j3 = this.f317555b;
        if (j2 / j3 > 0.999d) {
            return j3;
        }
        l lVar = this.e;
        l lVar2 = l.UP;
        Lazy lazy = this.f;
        long jIntValue = ((j2 / ((long) ((Number) lazy.getValue()).intValue())) * ((long) ((Number) lazy.getValue()).intValue())) + ((long) ((lVar != lVar2 || j2 % ((long) ((Number) lazy.getValue()).intValue()) == 0) ? 0 : ((Number) lazy.getValue()).intValue()));
        long j5 = this.f317554a;
        return jIntValue < j5 ? j5 : jIntValue;
    }
}
