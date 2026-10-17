package gig;

import com.revolut.data.model.Data;
import hfg.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f144189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f144190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f144191c;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f144189a, gVar.f144189a) && Intrinsics.f(this.f144190b, gVar.f144190b) && Intrinsics.f(this.f144191c, gVar.f144191c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f144190b, this.f144189a.hashCode() * 31, 31);
        y yVar = this.f144191c;
        return iC + (yVar == null ? 0 : yVar.hashCode());
    }

    public g(Data recommendedFlightsData, Data milesProviderData, y yVar) {
        Intrinsics.checkNotNullParameter(recommendedFlightsData, "recommendedFlightsData");
        Intrinsics.checkNotNullParameter(milesProviderData, "milesProviderData");
        this.f144189a = recommendedFlightsData;
        this.f144190b = milesProviderData;
        this.f144191c = yVar;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null);
    }
}
