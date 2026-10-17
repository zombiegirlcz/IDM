package pd5;

import com.revolut.feature.crypto.config.api.models.CryptoPersonalExchangeFeesResources;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f235095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f235097c;
    public final int d;
    public final b e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f235098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f235099h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f235100j;
    public final CryptoPersonalExchangeFeesResources k;

    public d(boolean z, String sentimentIndicatorFaqsLink, ArrayList currencies, int i, b bVar, Map riskDisclaimers, Map explorers, e compliance, ArrayList arrayList, ArrayList arrayList2, CryptoPersonalExchangeFeesResources cryptoPersonalExchangeFeesResources) {
        Intrinsics.checkNotNullParameter(sentimentIndicatorFaqsLink, "sentimentIndicatorFaqsLink");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(riskDisclaimers, "riskDisclaimers");
        Intrinsics.checkNotNullParameter(explorers, "explorers");
        Intrinsics.checkNotNullParameter(compliance, "compliance");
        this.f235095a = z;
        this.f235096b = sentimentIndicatorFaqsLink;
        this.f235097c = currencies;
        this.d = i;
        this.e = bVar;
        this.f = riskDisclaimers;
        this.f235098g = explorers;
        this.f235099h = compliance;
        this.i = arrayList;
        this.f235100j = arrayList2;
        this.k = cryptoPersonalExchangeFeesResources;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f235095a == dVar.f235095a && Intrinsics.f(this.f235096b, dVar.f235096b) && this.f235097c.equals(dVar.f235097c) && this.d == dVar.d && Intrinsics.f(this.e, dVar.e) && this.f.equals(dVar.f) && this.f235098g.equals(dVar.f235098g) && this.f235099h.equals(dVar.f235099h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f235100j, dVar.f235100j) && Intrinsics.f(this.k, dVar.k);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f235097c, p.a.c(Boolean.hashCode(this.f235095a) * 31, 31, this.f235096b), 31), 31);
        b bVar = this.e;
        int iB2 = p.a.b(p.a.b(p.a.b((iB + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f), 31, this.f235098g), 31, this.f235099h.f235101a);
        List list = this.i;
        int iHashCode = (iB2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f235100j;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        CryptoPersonalExchangeFeesResources cryptoPersonalExchangeFeesResources = this.k;
        return iHashCode2 + (cryptoPersonalExchangeFeesResources != null ? cryptoPersonalExchangeFeesResources.hashCode() : 0);
    }
}
