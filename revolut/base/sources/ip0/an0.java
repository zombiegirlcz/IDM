package ip0;

import com.revolut.core.ui_kit.delegates.TwinHorizontalSmallButtonDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pockets.api.details_v2.domain.AccountDetailsQrCode;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class an0 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cn0 f163473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ym0 f163474c;
    public final AccountDetailsQrCode d;
    public qv0.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163476h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f163477j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f163478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f163479m;

    public an0(String str, cn0 cn0Var, ym0 ym0Var, AccountDetailsQrCode accountDetailsQrCode) {
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        this.f163472a = str;
        this.f163473b = cn0Var;
        this.f163474c = ym0Var;
        this.d = accountDetailsQrCode;
        this.e = c.d.f249513a;
        this.f = null;
        this.f163475g = null;
        this.f163476h = null;
        this.i = null;
        this.f163477j = i;
        this.k = i2;
        this.f163478l = i2;
        this.f163479m = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TwinHorizontalSmallButtonDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53496h() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53492a() {
        return this.f163472a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof an0)) {
            return false;
        }
        an0 an0Var = (an0) obj2;
        return this.f163472a.equals(an0Var.f163472a) && this.f163473b.equals(an0Var.f163473b) && this.f163474c.equals(an0Var.f163474c) && Intrinsics.f(this.d, an0Var.d) && Intrinsics.f(this.e, an0Var.e) && Intrinsics.f(this.f, an0Var.f) && Intrinsics.f(this.f163475g, an0Var.f163475g) && Intrinsics.f(this.f163476h, an0Var.f163476h) && Intrinsics.f(this.i, an0Var.i) && this.f163477j == an0Var.f163477j && this.k == an0Var.k && this.f163478l == an0Var.f163478l && this.f163479m == an0Var.f163479m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52384r() {
        return this.f163477j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163477j = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f163474c.hashCode() + ((this.f163473b.hashCode() + (this.f163472a.hashCode() * 31)) * 31)) * 31;
        AccountDetailsQrCode accountDetailsQrCode = this.d;
        int i = h30.l.i(this.e, (iHashCode + (accountDetailsQrCode == null ? 0 : accountDetailsQrCode.hashCode())) * 29791, 31);
        p31.c cVar = this.f;
        int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f163475g;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163476h;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return Integer.hashCode(this.f163479m) + j6.a.b(this.f163478l, j6.a.b(this.k, j6.a.b(this.f163477j, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52381n() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f163475g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163476h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52385s() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f163479m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52380m() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52383q() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52382p() {
        return this.f163476h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52386t() {
        return this.f163478l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163475g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof an0 ? (an0) oldItem : null) == null) {
            return null;
        }
        an0 an0Var = (an0) oldItem;
        cn0 cn0Var = an0Var.f163473b;
        cn0 cn0Var2 = an0Var.f163473b;
        ym0 ym0Var = an0Var.f163474c;
        ResourceImage resourceImage = cn0Var.f163765b;
        cn0 cn0Var3 = this.f163473b;
        boolean z29 = !resourceImage.equals(cn0Var3.f163765b);
        boolean z31 = !cn0Var2.f163766c.equals(cn0Var3.f163766c);
        if (cn0Var2.f163764a != cn0Var3.f163764a) {
            z = true;
            z3 = z31;
            z4 = true;
        } else {
            z = true;
            z3 = z31;
            z4 = false;
        }
        boolean z41 = z ^ z;
        ms0.l4 l4VarA = cn0Var2.a(ym0Var);
        ym0 ym0Var2 = this.f163474c;
        boolean zEquals = l4VarA.equals(cn0Var3.a(ym0Var2)) ^ z;
        boolean zF = Intrinsics.f(ym0Var.getIcon(), ym0Var2.getIcon()) ^ z;
        boolean zF2 = Intrinsics.f(ym0Var.getText(), ym0Var2.getText()) ^ z;
        boolean z49 = z;
        if (ym0Var.h() != ym0Var2.h()) {
            z6 = zEquals;
            z11 = zF;
            z12 = z49;
        } else {
            z6 = zEquals;
            z11 = zF;
            z12 = false;
        }
        return new bn0(z29, z3, z4, false, z41, z6, z11, zF2, z12, ym0Var.x() != ym0Var2.x() ? z49 : false, !Intrinsics.f(ym0Var.getTag(), ym0Var2.getTag()), !ym0Var.a(cn0Var2).equals(ym0Var2.a(cn0Var3)));
    }
}
