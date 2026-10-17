package hw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f156007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f156008c;
    public final iw0.a d;
    public final Object e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f156009g;

    public /* synthetic */ k(float f, float f4, iw0.m mVar, Object obj2, Clause clause, int i) {
        this("", f, f4, (i & 8) != 0 ? null : mVar, (i & 16) != 0 ? null : obj2, (Clause) null, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f156006a, kVar.f156006a) && Float.compare(this.f156007b, kVar.f156007b) == 0 && Float.compare(this.f156008c, kVar.f156008c) == 0 && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f156009g, kVar.f156009g);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f156008c, m72.b.b(this.f156007b, this.f156006a.hashCode() * 31, 31), 31);
        iw0.a aVar = this.d;
        int iHashCode = (iB + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Object obj2 = this.e;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Clause clause = this.f;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f156009g;
        return iHashCode3 + (clause2 != null ? clause2.hashCode() : 0);
    }

    public k(String xDataLabel, float f, float f4, iw0.a aVar, Object obj2, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(xDataLabel, "xDataLabel");
        this.f156006a = xDataLabel;
        this.f156007b = f;
        this.f156008c = f4;
        this.d = aVar;
        this.e = obj2;
        this.f = clause;
        this.f156009g = clause2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(String str, float f, float f4, iw0.a aVar, Object obj2, Clause clause, int i) {
        String xDataLabel = (i & 1) != 0 ? "" : str;
        iw0.a aVar2 = (i & 8) != 0 ? null : aVar;
        Object obj3 = (i & 16) != 0 ? null : obj2;
        Clause clause2 = (i & 32) != 0 ? null : clause;
        Intrinsics.checkNotNullParameter(xDataLabel, "xDataLabel");
        this(xDataLabel, f, f4, aVar2, obj3, clause2, (Clause) null);
    }
}
