package zod;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f324035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f324036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f324037c;
    public final u d;
    public final jnd.d e;
    public final Object f;

    public v(a type, dj0.d currentValue, dj0.d dVar, u chartData, jnd.d budget, Object obj2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(budget, "budget");
        this.f324035a = type;
        this.f324036b = currentValue;
        this.f324037c = dVar;
        this.d = chartData;
        this.e = budget;
        this.f = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f324035a == vVar.f324035a && Intrinsics.f(this.f324036b, vVar.f324036b) && Intrinsics.f(this.f324037c, vVar.f324037c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f);
    }

    public final int hashCode() {
        int iC = v7.c(this.f324035a.hashCode() * 31, 31, this.f324036b);
        dj0.d dVar = this.f324037c;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31)) * 31;
        Object obj2 = this.f;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public /* synthetic */ v(a aVar, dj0.d dVar, dj0.d dVar2, u uVar, n nVar) {
        this(aVar, dVar, dVar2, uVar, jnd.c.f176709a, nVar);
    }
}
