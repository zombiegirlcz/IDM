package n8f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f213370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jlc.r f213371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7f.c f213372c;
    public final r6f.e d;
    public final j6f.a e;
    public final d1h.g f;

    public h(Data data, jlc.r rVar, b7f.c performance, r6f.e fees, j6f.a allocationItems, d1h.g disclaimers) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(allocationItems, "allocationItems");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f213370a = data;
        this.f213371b = rVar;
        this.f213372c = performance;
        this.d = fees;
        this.e = allocationItems;
        this.f = disclaimers;
    }

    public static h a(h hVar, Data data, jlc.r rVar, b7f.c cVar, r6f.e eVar, j6f.a aVar, d1h.g gVar, int i) {
        if ((i & 1) != 0) {
            data = hVar.f213370a;
        }
        Data data2 = data;
        if ((i & 2) != 0) {
            rVar = hVar.f213371b;
        }
        jlc.r rVar2 = rVar;
        if ((i & 4) != 0) {
            cVar = hVar.f213372c;
        }
        b7f.c performance = cVar;
        if ((i & 8) != 0) {
            eVar = hVar.d;
        }
        r6f.e fees = eVar;
        if ((i & 16) != 0) {
            aVar = hVar.e;
        }
        j6f.a allocationItems = aVar;
        if ((i & 32) != 0) {
            gVar = hVar.f;
        }
        d1h.g disclaimers = gVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(allocationItems, "allocationItems");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        return new h(data2, rVar2, performance, fees, allocationItems, disclaimers);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f213370a, hVar.f213370a) && Intrinsics.f(this.f213371b, hVar.f213371b) && Intrinsics.f(this.f213372c, hVar.f213372c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        Data data = this.f213370a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        jlc.r rVar = this.f213371b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + kii.e.c(this.f213372c.f13035a, (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 31, 31)) * 31)) * 31);
    }
}
