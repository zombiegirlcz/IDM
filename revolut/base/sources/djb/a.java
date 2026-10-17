package djb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f115272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f115273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hzi.g f115274c;
    public final g d;

    public a(j recurringTransfers, t spareChanges, hzi.g incomeSorterEntryPointData, g proTax) {
        Intrinsics.checkNotNullParameter(recurringTransfers, "recurringTransfers");
        Intrinsics.checkNotNullParameter(spareChanges, "spareChanges");
        Intrinsics.checkNotNullParameter(incomeSorterEntryPointData, "incomeSorterEntryPointData");
        Intrinsics.checkNotNullParameter(proTax, "proTax");
        this.f115272a = recurringTransfers;
        this.f115273b = spareChanges;
        this.f115274c = incomeSorterEntryPointData;
        this.d = proTax;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f115272a, aVar.f115272a) && Intrinsics.f(this.f115273b, aVar.f115273b) && Intrinsics.f(this.f115274c, aVar.f115274c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f115274c.hashCode() + ((this.f115273b.hashCode() + (this.f115272a.hashCode() * 31)) * 31)) * 31);
    }

    public /* synthetic */ a(j jVar, t tVar, hzi.g gVar) {
        this(jVar, tVar, gVar, f.f115278a);
    }
}
