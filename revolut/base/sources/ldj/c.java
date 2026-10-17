package ldj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f194146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ncj.g f194147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f194148c;

    public c() {
        this(0);
    }

    public static c a(c cVar, Data detailedPriceTargetsInfoData, ncj.g gVar, Data disclaimersData, int i) {
        if ((i & 1) != 0) {
            detailedPriceTargetsInfoData = cVar.f194146a;
        }
        if ((i & 2) != 0) {
            gVar = cVar.f194147b;
        }
        if ((i & 4) != 0) {
            disclaimersData = cVar.f194148c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(detailedPriceTargetsInfoData, "detailedPriceTargetsInfoData");
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        return new c(detailedPriceTargetsInfoData, gVar, disclaimersData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f194146a, cVar.f194146a) && Intrinsics.f(this.f194147b, cVar.f194147b) && Intrinsics.f(this.f194148c, cVar.f194148c);
    }

    public final int hashCode() {
        int iHashCode = this.f194146a.hashCode() * 31;
        ncj.g gVar = this.f194147b;
        return this.f194148c.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }

    public c(Data detailedPriceTargetsInfoData, ncj.g gVar, Data disclaimersData) {
        Intrinsics.checkNotNullParameter(detailedPriceTargetsInfoData, "detailedPriceTargetsInfoData");
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        this.f194146a = detailedPriceTargetsInfoData;
        this.f194147b = gVar;
        this.f194148c = disclaimersData;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null));
    }
}
