package ip0;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class um0 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tm0 f166696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tm0 f166697c;
    public final Object d;
    public final Parcelable e;
    public final Parcelable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f166698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166699h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166700j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f166701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f166702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f166703n;
    public final int o;

    public um0(String str, tm0 tm0Var, tm0 tm0Var2, Object obj2, Parcelable parcelable, Parcelable parcelable2, qv0.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, int i, int i2, int i3, int i5) {
        this.f166695a = str;
        this.f166696b = tm0Var;
        this.f166697c = tm0Var2;
        this.d = obj2;
        this.e = parcelable;
        this.f = parcelable2;
        this.f166698g = cVar;
        this.f166699h = cVar2;
        this.i = cVar3;
        this.f166700j = cVar4;
        this.k = cVar5;
        this.f166701l = i;
        this.f166702m = i2;
        this.f166703n = i3;
        this.o = i5;
    }

    public static um0 e(um0 um0Var, String listId) {
        tm0 primaryButton = um0Var.f166696b;
        tm0 secondaryButton = um0Var.f166697c;
        Object obj2 = um0Var.d;
        Parcelable parcelable = um0Var.e;
        Parcelable parcelable2 = um0Var.f;
        qv0.c positionInBox = um0Var.f166698g;
        p31.c cVar = um0Var.f166699h;
        p31.c cVar2 = um0Var.i;
        p31.c cVar3 = um0Var.f166700j;
        p31.c cVar4 = um0Var.k;
        int i = um0Var.f166701l;
        int i2 = um0Var.f166702m;
        int i3 = um0Var.f166703n;
        int i5 = um0Var.o;
        um0Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        return new um0(listId, primaryButton, secondaryButton, obj2, parcelable, parcelable2, positionInBox, cVar, cVar2, cVar3, cVar4, i, i2, i3, i5);
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TwinHorizontalButtonDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52424a() {
        return this.f166695a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof um0)) {
            return false;
        }
        um0 um0Var = (um0) obj2;
        return Intrinsics.f(this.f166695a, um0Var.f166695a) && Intrinsics.f(this.f166696b, um0Var.f166696b) && Intrinsics.f(this.f166697c, um0Var.f166697c) && Intrinsics.f(this.d, um0Var.d) && Intrinsics.f(this.e, um0Var.e) && Intrinsics.f(this.f, um0Var.f) && Intrinsics.f(this.f166698g, um0Var.f166698g) && Intrinsics.f(this.f166699h, um0Var.f166699h) && Intrinsics.f(this.i, um0Var.i) && Intrinsics.f(this.f166700j, um0Var.f166700j) && Intrinsics.f(this.k, um0Var.k) && this.f166701l == um0Var.f166701l && this.f166702m == um0Var.f166702m && this.f166703n == um0Var.f166703n && this.o == um0Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f166701l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166701l = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f166697c.hashCode() + ((this.f166696b.hashCode() + (this.f166695a.hashCode() * 31)) * 31)) * 31;
        Object obj2 = this.d;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Parcelable parcelable = this.e;
        int iHashCode3 = (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        Parcelable parcelable2 = this.f;
        int i = h30.l.i(this.f166698g, (iHashCode3 + (parcelable2 == null ? 0 : parcelable2.hashCode())) * 31, 31);
        p31.c cVar = this.f166699h;
        int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166700j;
        int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f166703n, j6.a.b(this.f166702m, j6.a.b(this.f166701l, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52435r() {
        return this.f166699h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166698g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166700j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52430l() {
        return this.f166702m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52432n() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166702m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52436s() {
        return this.f166698g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52434q() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52433p() {
        return this.f166700j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166699h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52431m() {
        return this.f166703n;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof um0 ? (um0) oldItem : null) == null) {
            return null;
        }
        um0 um0Var = (um0) oldItem;
        tm0 tm0Var = um0Var.f166696b;
        tm0 tm0Var2 = um0Var.f166696b;
        tm0 tm0Var3 = um0Var.f166697c;
        Image image = tm0Var.f166540b;
        tm0 tm0Var4 = this.f166696b;
        boolean z11 = !Intrinsics.f(image, tm0Var4.f166540b);
        boolean z12 = !Intrinsics.f(tm0Var2.f166541c, tm0Var4.f166541c);
        boolean z29 = !Intrinsics.f(tm0Var2.f166539a, tm0Var4.f166539a);
        if (tm0Var2.d != tm0Var4.d) {
            z = true;
            z3 = z12;
            z4 = z29;
            z6 = true;
        } else {
            z = true;
            z3 = z12;
            z4 = z29;
            z6 = false;
        }
        boolean zF = Intrinsics.f(tm0Var2.e, tm0Var4.e) ^ z;
        Image image2 = tm0Var3.f166540b;
        tm0 tm0Var5 = this.f166697c;
        return new vm0(z11, z3, z4, z6, zF, Intrinsics.f(image2, tm0Var5.f166540b) ^ z, Intrinsics.f(tm0Var3.f166541c, tm0Var5.f166541c) ^ z, Intrinsics.f(tm0Var3.f166539a, tm0Var5.f166539a) ^ z, tm0Var3.d != tm0Var5.d ? z : false, !Intrinsics.f(tm0Var3.e, tm0Var5.e));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public um0(String listId, tm0 primaryButton, tm0 secondaryButton, Object obj2, Parcelable parcelable, Parcelable parcelable2, int i, int i2, int i3, int i5) {
        this(listId, primaryButton, secondaryButton, obj2, parcelable, parcelable2, c.d.f249513a, null, null, null, null, i, i2, i3, i5);
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ um0(String str, tm0 tm0Var, tm0 tm0Var2, Object obj2, AnalyticsContext analyticsContext, AnalyticsContext analyticsContext2, int i, int i2, int i3, int i5) {
        Object obj3 = (i5 & 8) != 0 ? null : obj2;
        AnalyticsContext analyticsContext3 = (i5 & 16) != 0 ? null : analyticsContext;
        AnalyticsContext analyticsContext4 = (i5 & 32) != 0 ? null : analyticsContext2;
        int i6 = R$attr.uikit_dp0;
        this(str, tm0Var, tm0Var2, obj3, (Parcelable) analyticsContext3, (Parcelable) analyticsContext4, i6, (i5 & 128) != 0 ? i6 : i, (i5 & 256) != 0 ? i6 : i2, (i5 & 512) != 0 ? i6 : i3);
    }
}
