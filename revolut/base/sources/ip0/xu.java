package ip0;

import com.revolut.core.ui_kit.delegates.ListingCardSmallDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class xu implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f167208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167209c;
    public final CompositeClause d;
    public final ResourceImage e;
    public final uu f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f167210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ResourceImage f167211h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zu f167212j;
    public final HotelsProperty k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f167213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f167214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f167215n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public qv0.c f167216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f167217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f167218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f167219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f167220t;

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    public xu(String listId, TextClause title, CompositeClause compositeClause, ResourceImage resourceImage, uu uuVar, ArrayList arrayList, Image image, ResourceImage resourceImage2, HotelsProperty hotelsProperty, zu style) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        style.getClass();
        if (style == zu.ON_MEDIA_STATIC && !((Boolean) jo0.g.M.getValue()).booleanValue()) {
            style = zu.DEFAULT;
        }
        this.f167207a = listId;
        this.f167208b = title;
        this.f167209c = true;
        this.d = compositeClause;
        this.e = resourceImage;
        this.f = uuVar;
        this.f167210g = arrayList;
        this.f167211h = resourceImage2;
        this.i = image;
        this.f167212j = style;
        this.k = hotelsProperty;
        this.f167213l = null;
        this.f167214m = null;
        this.f167215n = null;
        this.o = null;
        this.f167216p = c.d.f249513a;
        this.f167217q = i;
        this.f167218r = i;
        this.f167219s = i;
        this.f167220t = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ListingCardSmallDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53623w() {
        return this.k;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53609a() {
        return this.f167207a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xu)) {
            return false;
        }
        xu xuVar = (xu) obj2;
        return Intrinsics.f(this.f167207a, xuVar.f167207a) && Intrinsics.f(this.f167208b, xuVar.f167208b) && this.f167209c == xuVar.f167209c && Intrinsics.f(this.d, xuVar.d) && Intrinsics.f(this.e, xuVar.e) && Intrinsics.f(this.f, xuVar.f) && Intrinsics.f(this.f167210g, xuVar.f167210g) && Intrinsics.f(this.f167211h, xuVar.f167211h) && Intrinsics.f(this.i, xuVar.i) && this.f167212j == xuVar.f167212j && Intrinsics.f(this.k, xuVar.k) && Intrinsics.f(this.f167213l, xuVar.f167213l) && Intrinsics.f(this.f167214m, xuVar.f167214m) && Intrinsics.f(this.f167215n, xuVar.f167215n) && Intrinsics.f(this.o, xuVar.o) && Intrinsics.f(this.f167216p, xuVar.f167216p) && this.f167217q == xuVar.f167217q && this.f167218r == xuVar.f167218r && this.f167219s == xuVar.f167219s && this.f167220t == xuVar.f167220t;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53621s() {
        return this.f167217q;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167217q = i;
    }

    public final int hashCode() {
        int iC = j6.a.c(v7.b(this.f167207a.hashCode() * 31, 31, this.f167208b), 31, this.f167209c);
        CompositeClause compositeClause = this.d;
        int iHashCode = (iC + (compositeClause == null ? 0 : compositeClause.hashCode())) * 31;
        ResourceImage resourceImage = this.e;
        int iHashCode2 = (iHashCode + (resourceImage == null ? 0 : resourceImage.hashCode())) * 961;
        uu uuVar = this.f;
        int iHashCode3 = (iHashCode2 + (uuVar == null ? 0 : uuVar.hashCode())) * 31;
        ArrayList arrayList = this.f167210g;
        int iHashCode4 = (iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ResourceImage resourceImage2 = this.f167211h;
        int iHashCode5 = (this.f167212j.hashCode() + p.a.b((iHashCode4 + (resourceImage2 == null ? 0 : resourceImage2.hashCode())) * 31, 31, this.i)) * 31;
        HotelsProperty hotelsProperty = this.k;
        int iHashCode6 = (iHashCode5 + (hotelsProperty == null ? 0 : hotelsProperty.hashCode())) * 31;
        p31.c cVar = this.f167213l;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f167214m;
        int iHashCode8 = (iHashCode7 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f167215n;
        int iHashCode9 = (iHashCode8 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.o;
        return Integer.hashCode(this.f167220t) + j6.a.b(this.f167219s, j6.a.b(this.f167218r, j6.a.b(this.f167217q, h30.l.i(this.f167216p, (iHashCode9 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53624x() {
        return this.f167213l;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f167216p = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53625y() {
        return this.f167214m;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f167215n = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53622t() {
        return this.f167218r;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getV() {
        return this.f167220t;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f167218r = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getB() {
        return this.f167216p;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getA() {
        return this.o;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getZ() {
        return this.f167215n;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167213l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getU() {
        return this.f167219s;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f167214m = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.o = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        boolean z3;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof xu ? (xu) oldItem : null) == null) {
            return null;
        }
        xu xuVar = (xu) oldItem;
        boolean z4 = !Intrinsics.f(xuVar.f167208b, this.f167208b);
        boolean z6 = !Intrinsics.f(xuVar.d, this.d);
        boolean z11 = !Intrinsics.f(xuVar.e, this.e);
        if (xuVar.f167209c != this.f167209c) {
            z3 = true;
            z = false;
        } else {
            z = false;
            z3 = false;
        }
        return new yu(z4, z6, !true, z3, z11, !Intrinsics.f(xuVar.f, this.f), !Intrinsics.f(xuVar.f167210g, this.f167210g), !Intrinsics.f(xuVar.i, this.i), !Intrinsics.f(xuVar.f167211h, this.f167211h), (Intrinsics.f(xuVar.f167213l, this.f167213l) && Intrinsics.f(xuVar.f167214m, this.f167214m) && Intrinsics.f(xuVar.f167215n, this.f167215n) && Intrinsics.f(xuVar.o, this.o)) ? z : true, xuVar.f167212j != this.f167212j ? true : z);
    }
}
