package ip0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListingCardDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ku implements qv0.q, qv0.p {
    public p31.c A;
    public p31.c B;
    public p31.c C;
    public int D;
    public int E;
    public final int F;
    public final int G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f165072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f165073c;
    public final Image d;
    public final Object e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextLocalisedClause f165074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f165075h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f165076j;
    public final Clause k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f165077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Image f165078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Clause f165079n;
    public final TagViewData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Clause f165080p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mu f165081q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TagViewData f165082r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TagViewData f165083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final aw0.i9 f165084t;
    public final Clause u;
    public final ju v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f165085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f165086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public qv0.c f165087y;
    public p31.c z;

    public ku(String listId, TextClause title, CompositeClause compositeClause, UrlImage urlImage, Clause clause, MoneyClause moneyClause, TextLocalisedClause textLocalisedClause, int i, TextLocalisedClause textLocalisedClause2, CompositeClause compositeClause2, Clause clause2, ArrayList arrayList, ResourceImage resourceImage, TextLocalisedClause textLocalisedClause3, TagViewData tagViewData, TextLocalisedClause textLocalisedClause4, mu muVar, TagViewData tagViewData2, TagViewData tagViewData3, aw0.i9 i9Var, CompositeClause compositeClause3, ju juVar, Parcelable parcelable, int i2) {
        mu muVar2;
        ju blurOption;
        CompositeClause compositeClause4 = (i2 & 4) != 0 ? null : compositeClause;
        UrlImage urlImage2 = (i2 & 8) != 0 ? null : urlImage;
        MoneyClause moneyClause2 = (i2 & 32) != 0 ? null : moneyClause;
        int i3 = (i2 & 128) != 0 ? 0 : i;
        TextLocalisedClause textLocalisedClause5 = (i2 & 256) != 0 ? null : textLocalisedClause2;
        CompositeClause compositeClause5 = (i2 & 512) != 0 ? null : compositeClause2;
        Clause clause3 = (i2 & 1024) != 0 ? null : clause2;
        ArrayList arrayList2 = (i2 & 2048) != 0 ? null : arrayList;
        ResourceImage resourceImage2 = (i2 & 4096) != 0 ? null : resourceImage;
        TextLocalisedClause textLocalisedClause6 = (i2 & 8192) != 0 ? null : textLocalisedClause3;
        TagViewData tagViewData4 = (i2 & 16384) != 0 ? null : tagViewData;
        TextLocalisedClause textLocalisedClause7 = (i2 & 32768) != 0 ? null : textLocalisedClause4;
        mu muVar3 = (i2 & 65536) != 0 ? null : muVar;
        TagViewData tagViewData5 = (i2 & 262144) != 0 ? null : tagViewData2;
        TagViewData tagViewData6 = (i2 & 524288) != 0 ? null : tagViewData3;
        aw0.i9 i9Var2 = (i2 & PKIFailureInfo.badCertTemplate) != 0 ? null : i9Var;
        CompositeClause compositeClause6 = (i2 & PKIFailureInfo.badSenderNonce) != 0 ? null : compositeClause3;
        if ((i2 & 4194304) != 0) {
            muVar2 = muVar3;
            blurOption = ju.NO_BLUR;
        } else {
            muVar2 = muVar3;
            blurOption = juVar;
        }
        Parcelable parcelable2 = (i2 & 16777216) != 0 ? null : parcelable;
        TextLocalisedClause textLocalisedClause8 = textLocalisedClause7;
        int i5 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(blurOption, "blurOption");
        this.f165071a = listId;
        this.f165072b = title;
        this.f165073c = compositeClause4;
        this.d = urlImage2;
        this.e = clause;
        this.f = moneyClause2;
        this.f165074g = textLocalisedClause;
        this.f165075h = i3;
        this.i = textLocalisedClause5;
        this.f165076j = compositeClause5;
        this.k = clause3;
        this.f165077l = arrayList2;
        this.f165078m = resourceImage2;
        this.f165079n = textLocalisedClause6;
        this.o = tagViewData4;
        this.f165080p = textLocalisedClause8;
        this.f165081q = muVar2;
        this.f165082r = tagViewData5;
        this.f165083s = tagViewData6;
        this.f165084t = i9Var2;
        this.u = compositeClause6;
        this.v = blurOption;
        this.f165085w = true;
        this.f165086x = parcelable2;
        this.f165087y = c.d.f249513a;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = i5;
        this.E = i5;
        this.F = i5;
        this.G = i5;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ListingCardDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return this.f165086x;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52256a() {
        return this.f165071a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ku)) {
            return false;
        }
        ku kuVar = (ku) obj2;
        return Intrinsics.f(this.f165071a, kuVar.f165071a) && Intrinsics.f(this.f165072b, kuVar.f165072b) && Intrinsics.f(this.f165073c, kuVar.f165073c) && Intrinsics.f(this.d, kuVar.d) && Intrinsics.f(this.e, kuVar.e) && Intrinsics.f(this.f, kuVar.f) && Intrinsics.f(this.f165074g, kuVar.f165074g) && this.f165075h == kuVar.f165075h && Intrinsics.f(this.i, kuVar.i) && Intrinsics.f(this.f165076j, kuVar.f165076j) && Intrinsics.f(this.k, kuVar.k) && Intrinsics.f(this.f165077l, kuVar.f165077l) && Intrinsics.f(this.f165078m, kuVar.f165078m) && Intrinsics.f(this.f165079n, kuVar.f165079n) && Intrinsics.f(this.o, kuVar.o) && Intrinsics.f(this.f165080p, kuVar.f165080p) && Intrinsics.f(this.f165081q, kuVar.f165081q) && Intrinsics.f(this.f165082r, kuVar.f165082r) && Intrinsics.f(this.f165083s, kuVar.f165083s) && Intrinsics.f(this.f165084t, kuVar.f165084t) && Intrinsics.f(this.u, kuVar.u) && this.v == kuVar.v && this.f165085w == kuVar.f165085w && Intrinsics.f(this.f165086x, kuVar.f165086x) && Intrinsics.f(this.f165087y, kuVar.f165087y) && Intrinsics.f(this.z, kuVar.z) && Intrinsics.f(this.A, kuVar.A) && Intrinsics.f(this.B, kuVar.B) && Intrinsics.f(this.C, kuVar.C) && this.D == kuVar.D && this.E == kuVar.E && this.F == kuVar.F && this.G == kuVar.G;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52263m() {
        return this.D;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.D = i;
    }

    public final int hashCode() {
        int iB = v7.b(this.f165071a.hashCode() * 31, 31, this.f165072b);
        Clause clause = this.f165073c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.d;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Object obj2 = this.e;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Clause clause2 = this.f;
        int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        TextLocalisedClause textLocalisedClause = this.f165074g;
        int iB2 = j6.a.b(this.f165075h, (iHashCode4 + (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode())) * 31, 31);
        Clause clause3 = this.i;
        int iHashCode5 = (iB2 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.f165076j;
        int iHashCode6 = (iHashCode5 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Clause clause5 = this.k;
        int iHashCode7 = (iHashCode6 + (clause5 == null ? 0 : clause5.hashCode())) * 31;
        List list = this.f165077l;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Image image2 = this.f165078m;
        int iHashCode9 = (iHashCode8 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Clause clause6 = this.f165079n;
        int iHashCode10 = (iHashCode9 + (clause6 == null ? 0 : clause6.hashCode())) * 31;
        TagViewData tagViewData = this.o;
        int iHashCode11 = (iHashCode10 + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31;
        Clause clause7 = this.f165080p;
        int iHashCode12 = (iHashCode11 + (clause7 == null ? 0 : clause7.hashCode())) * 31;
        mu muVar = this.f165081q;
        int iHashCode13 = (iHashCode12 + (muVar == null ? 0 : muVar.hashCode())) * 961;
        TagViewData tagViewData2 = this.f165082r;
        int iHashCode14 = (iHashCode13 + (tagViewData2 == null ? 0 : tagViewData2.hashCode())) * 31;
        TagViewData tagViewData3 = this.f165083s;
        int iHashCode15 = (iHashCode14 + (tagViewData3 == null ? 0 : tagViewData3.hashCode())) * 31;
        aw0.i9 i9Var = this.f165084t;
        int iHashCode16 = (iHashCode15 + (i9Var == null ? 0 : i9Var.hashCode())) * 31;
        Clause clause8 = this.u;
        int iC = j6.a.c((this.v.hashCode() + ((iHashCode16 + (clause8 == null ? 0 : clause8.hashCode())) * 31)) * 31, 31, this.f165085w);
        Object obj3 = this.f165086x;
        int i = h30.l.i(this.f165087y, (iC + (obj3 == null ? 0 : obj3.hashCode())) * 31, 31);
        p31.c cVar = this.z;
        int iHashCode17 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.A;
        int iHashCode18 = (iHashCode17 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.B;
        int iHashCode19 = (iHashCode18 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.C;
        return Integer.hashCode(this.G) + j6.a.b(this.F, j6.a.b(this.E, j6.a.b(this.D, (iHashCode19 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.z;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165087y = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52261j() {
        return this.A;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.B = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52264n() {
        return this.E;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52265p() {
        return this.G;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.E = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52260h() {
        return this.f165087y;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52262l() {
        return this.C;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.B;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.z = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.F;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.A = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.C = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof ku ? (ku) oldItem : null) == null) {
            return null;
        }
        ku kuVar = (ku) oldItem;
        TextClause textClause = kuVar.f165072b;
        TextLocalisedClause textLocalisedClause = kuVar.f165074g;
        boolean z3 = !Intrinsics.f(textClause, this.f165072b);
        boolean z4 = !Intrinsics.f(kuVar.f165073c, this.f165073c);
        boolean z6 = !Intrinsics.f(kuVar.d, this.d);
        boolean zF = Intrinsics.f(kuVar.e, this.e);
        TextLocalisedClause textLocalisedClause2 = this.f165074g;
        boolean z11 = false;
        if (zF && Intrinsics.f(textLocalisedClause, textLocalisedClause2)) {
            z = false;
        } else {
            z = false;
            z11 = true;
        }
        return new lu(z3, z4, z6, z11, kuVar.f165075h != this.f165075h ? true : z, !Intrinsics.f(kuVar.f, this.f), !Intrinsics.f(textLocalisedClause, textLocalisedClause2), !Intrinsics.f(kuVar.i, this.i), !Intrinsics.f(kuVar.f165076j, this.f165076j), !Intrinsics.f(kuVar.f165077l, this.f165077l), !Intrinsics.f(kuVar.f165078m, this.f165078m), !Intrinsics.f(kuVar.k, this.k), !Intrinsics.f(kuVar.f165079n, this.f165079n), !Intrinsics.f(kuVar.o, this.o), !true, !Intrinsics.f(kuVar.f165080p, this.f165080p), !Intrinsics.f(kuVar.f165081q, this.f165081q), !Intrinsics.f(kuVar.f165082r, this.f165082r), !Intrinsics.f(kuVar.f165083s, this.f165083s), !Intrinsics.f(kuVar.f165084t, this.f165084t), (Intrinsics.f(kuVar.z, this.z) && Intrinsics.f(kuVar.A, this.A) && Intrinsics.f(kuVar.B, this.B) && Intrinsics.f(kuVar.C, this.C)) ? z : true, !Intrinsics.f(kuVar.u, this.u), kuVar.v != this.v ? true : z, kuVar.f165085w != this.f165085w ? true : z);
    }
}
