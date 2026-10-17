package wpl;

import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f299361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f299362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f299363c;
    public final b d;
    public final b e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f299364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CountryImage f299365h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f299366j;
    public final vpl.b k;

    public g(b number, b type, b bVar, b bVar2, b bVar3, b bVar4, b bVar5, CountryImage issuerCountry, b bVar6, f state, vpl.b designConfig) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(issuerCountry, "issuerCountry");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(designConfig, "designConfig");
        this.f299361a = number;
        this.f299362b = type;
        this.f299363c = bVar;
        this.d = bVar2;
        this.e = bVar3;
        this.f = bVar4;
        this.f299364g = bVar5;
        this.f299365h = issuerCountry;
        this.i = bVar6;
        this.f299366j = state;
        this.k = designConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f299361a.equals(gVar.f299361a) && this.f299362b.equals(gVar.f299362b) && Intrinsics.f(this.f299363c, gVar.f299363c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f299364g, gVar.f299364g) && this.f299365h.equals(gVar.f299365h) && Intrinsics.f(this.i, gVar.i) && this.f299366j.equals(gVar.f299366j) && this.k.equals(gVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f299362b.hashCode() + (this.f299361a.hashCode() * 31)) * 31;
        b bVar = this.f299363c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.d;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        b bVar3 = this.e;
        int iHashCode4 = (iHashCode3 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        b bVar4 = this.f;
        int iHashCode5 = (iHashCode4 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        b bVar5 = this.f299364g;
        int iHashCode6 = (this.f299365h.hashCode() + ((iHashCode5 + (bVar5 == null ? 0 : bVar5.hashCode())) * 31)) * 31;
        b bVar6 = this.i;
        return this.k.hashCode() + ((this.f299366j.hashCode() + ((iHashCode6 + (bVar6 != null ? bVar6.hashCode() : 0)) * 31)) * 31);
    }
}
