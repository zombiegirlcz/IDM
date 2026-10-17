package l10;

import com.revolut.cards.shared.ui.screen.catalogue.models.CatalogueToolbarButton;
import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class p implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10.b f191387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f191388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f191389c;
    public final boolean d;
    public final boolean e;
    public final o5l.u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f191390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wi0.b f191391h;
    public final CatalogueToolbarButton i;

    public p(n10.b cardType, Data cardDesignCatalogueInfo, boolean z, boolean z3, boolean z4, o5l.u uVar, Set set, wi0.b bVar, CatalogueToolbarButton catalogueToolbarButton) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(cardDesignCatalogueInfo, "cardDesignCatalogueInfo");
        this.f191387a = cardType;
        this.f191388b = cardDesignCatalogueInfo;
        this.f191389c = z;
        this.d = z3;
        this.e = z4;
        this.f = uVar;
        this.f191390g = set;
        this.f191391h = bVar;
        this.i = catalogueToolbarButton;
    }

    public static p a(p pVar, Data data, o5l.u uVar, wi0.b bVar, int i) {
        n10.b cardType = pVar.f191387a;
        if ((i & 2) != 0) {
            data = pVar.f191388b;
        }
        Data cardDesignCatalogueInfo = data;
        boolean z = pVar.f191389c;
        boolean z3 = pVar.d;
        boolean z4 = pVar.e;
        if ((i & 32) != 0) {
            uVar = pVar.f;
        }
        o5l.u uVar2 = uVar;
        Set set = pVar.f191390g;
        if ((i & 128) != 0) {
            bVar = pVar.f191391h;
        }
        CatalogueToolbarButton catalogueToolbarButton = pVar.i;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(cardDesignCatalogueInfo, "cardDesignCatalogueInfo");
        return new p(cardType, cardDesignCatalogueInfo, z, z3, z4, uVar2, set, bVar, catalogueToolbarButton);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f191387a == pVar.f191387a && Intrinsics.f(this.f191388b, pVar.f191388b) && this.f191389c == pVar.f191389c && this.d == pVar.d && this.e == pVar.e && this.f == pVar.f && Intrinsics.f(this.f191390g, pVar.f191390g) && Intrinsics.f(this.f191391h, pVar.f191391h) && Intrinsics.f(this.i, pVar.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(kii.e.c(this.f191388b, this.f191387a.hashCode() * 31, 31), 31, this.f191389c), 31, this.d), 31, this.e);
        o5l.u uVar = this.f;
        int iHashCode = (iC + (uVar == null ? 0 : uVar.hashCode())) * 31;
        Set set = this.f191390g;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        wi0.b bVar = this.f191391h;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        CatalogueToolbarButton catalogueToolbarButton = this.i;
        return iHashCode3 + (catalogueToolbarButton != null ? catalogueToolbarButton.hashCode() : 0);
    }
}
