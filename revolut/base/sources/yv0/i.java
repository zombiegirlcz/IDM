package yv0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.shops.api.model.ShopsOutlet;
import ehe.n;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ah0.a f317071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f317072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f317073c;
    public final boolean d;
    public final f e;
    public final Color.Solid f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Color f317074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f317075h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f317076j;
    public final Clause k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f317077l;

    public i(ah0.a aVar, d dVar, TextClause textClause, boolean z, f fVar, Color.Solid solid, Color.Solid solid2, e eVar, int i, int i2, Clause clause, Object obj2, int i3) {
        z = (i3 & 8) != 0 ? false : z;
        fVar = (i3 & 16) != 0 ? null : fVar;
        solid2 = (i3 & 64) != 0 ? new Color.Solid(R$attr.uikit_colorForeground) : solid2;
        eVar = (i3 & 128) != 0 ? e.DP_40 : eVar;
        i = (i3 & 256) != 0 ? R$attr.uikit_colorAccent_10 : i;
        i2 = (i3 & 512) != 0 ? R$attr.uikit_colorBackground : i2;
        this.f317071a = aVar;
        this.f317072b = dVar;
        this.f317073c = textClause;
        this.d = z;
        this.e = fVar;
        this.f = solid;
        this.f317074g = solid2;
        this.f317075h = eVar;
        this.i = i;
        this.f317076j = i2;
        this.k = clause;
        this.f317077l = obj2;
    }

    @Override // yv0.k
    public final Object a() {
        return this.f317077l;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f317071a, iVar.f317071a) && Intrinsics.f(this.f317072b, iVar.f317072b) && Intrinsics.f(this.f317073c, iVar.f317073c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f317074g, iVar.f317074g) && this.f317075h == iVar.f317075h && this.i == iVar.i && this.f317076j == iVar.f317076j && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f317077l, iVar.f317077l);
    }

    @Override // yv0.k
    public final ah0.a getPosition() {
        return this.f317071a;
    }

    public final int hashCode() {
        int iC = j6.a.c(v7.b((this.f317072b.hashCode() + (this.f317071a.hashCode() * 31)) * 31, 31, this.f317073c), 31, this.d);
        f fVar = this.e;
        int iB = j6.a.b(this.f317076j, j6.a.b(this.i, (this.f317075h.hashCode() + n.d(this.f317074g, j6.a.b(this.f.f51464b, (iC + (fVar == null ? 0 : fVar.hashCode())) * 31, 31), 31)) * 31, 31), 31);
        Clause clause = this.k;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Object obj2 = this.f317077l;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(ah0.a location, b icon, TextClause titleText, boolean z, Color.Solid backgroundColor, Color.Solid foregroundColor, f fVar, ShopsOutlet shopsOutlet) {
        this(location, icon, titleText, z, fVar, backgroundColor, foregroundColor, null, 0, 0, null, shopsOutlet, 896);
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
    }

    public /* synthetic */ i(ah0.a aVar, b bVar, TextClause textClause, TextLocalisedClause textLocalisedClause, e eVar, int i, int i2, Atm atm, int i3) {
        this(aVar, bVar, textClause, (i3 & 8) != 0 ? null : textLocalisedClause, (i3 & 16) != 0 ? e.DP_40 : eVar, i, (i3 & 64) != 0 ? R$attr.uikit_colorBackground : i2, (i3 & 128) != 0 ? null : atm);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(ah0.a location, d icon, TextClause titleText, Clause clause, e iconSize, int i, int i2, Object obj2) {
        this(location, icon, titleText, false, null, new Color.Solid(i2), null, iconSize, i, i2, clause, obj2, 88);
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(iconSize, "iconSize");
    }
}
