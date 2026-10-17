package o8h;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0006\u000b\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"Lo8h/b;", "", "", "toString", "()Ljava/lang/String;", "Lo8h/a;", "a", "Lo8h/a;", "getAssetType", "()Lo8h/a;", "assetType", "Lo8h/c;", "b", "Lo8h/c;", "()Lo8h/c;", "timeSpan", "", "Lo8h/b$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "topGainers", "d", "topLosers", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("assetType")
    @NotNull
    private final o8h.a assetType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("timeSpan")
    @NotNull
    private final c timeSpan;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("topGainers")
    private final List<a> topGainers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("topLosers")
    private final List<a> topLosers;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lo8h/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "ref", "Lo8h/a;", "b", "Lo8h/a;", "()Lo8h/a;", "assetType", "Ljo3/b;", "c", "Ljo3/b;", "()Ljo3/b;", "basePrice", "Lko3/b;", "Lko3/b;", "()Lko3/b;", "basePricePrecise", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("assetType")
        @NotNull
        private final o8h.a assetType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("basePrice")
        @NotNull
        private final jo3.b basePrice;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("basePricePrecise")
        private final ko3.b basePricePrecise;

        public a(String ref2, o8h.a assetType, jo3.b basePrice, ko3.b bVar) {
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(basePrice, "basePrice");
            this.ref = ref2;
            this.assetType = assetType;
            this.basePrice = basePrice;
            this.basePricePrecise = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final o8h.a getAssetType() {
            return this.assetType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.b getBasePrice() {
            return this.basePrice;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ko3.b getBasePricePrecise() {
            return this.basePricePrecise;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.ref, aVar.ref) && this.assetType == aVar.assetType && Intrinsics.f(this.basePrice, aVar.basePrice) && Intrinsics.f(this.basePricePrecise, aVar.basePricePrecise);
        }

        public final int hashCode() {
            int iE = y.e(this.basePrice, (this.assetType.hashCode() + (this.ref.hashCode() * 31)) * 31, 31);
            ko3.b bVar = this.basePricePrecise;
            return iE + (bVar == null ? 0 : bVar.hashCode());
        }
    }

    public b(o8h.a assetType, c timeSpan, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        this.assetType = assetType;
        this.timeSpan = timeSpan;
        this.topGainers = arrayList;
        this.topLosers = arrayList2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getTimeSpan() {
        return this.timeSpan;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getTopGainers() {
        return this.topGainers;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getTopLosers() {
        return this.topLosers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.assetType == bVar.assetType && this.timeSpan == bVar.timeSpan && Intrinsics.f(this.topGainers, bVar.topGainers) && Intrinsics.f(this.topLosers, bVar.topLosers);
    }

    public final int hashCode() {
        int iHashCode = (this.timeSpan.hashCode() + (this.assetType.hashCode() * 31)) * 31;
        List<a> list = this.topGainers;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<a> list2 = this.topLosers;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}
