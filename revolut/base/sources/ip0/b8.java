package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsReceiptDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class b8 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f163555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f163556c;
    public final ResourceImage d;
    public final Image e;
    public final File f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f163557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163558h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f163559j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f163560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f163561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f163562n;
    public final int o;

    public b8(String listId, TextLocalisedClause cellTitle, TextLocalisedClause actionText, ResourceImage actionIcon, Image image, File file) {
        int i = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        Intrinsics.checkNotNullParameter(actionIcon, "actionIcon");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        Intrinsics.checkNotNullParameter(actionIcon, "actionIcon");
        Intrinsics.checkNotNullParameter(image, "image");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f163554a = listId;
        this.f163555b = cellTitle;
        this.f163556c = actionText;
        this.d = actionIcon;
        this.e = image;
        this.f = file;
        this.f163557g = positionInBox;
        this.f163558h = null;
        this.i = null;
        this.f163559j = null;
        this.k = null;
        this.f163560l = i;
        this.f163561m = i;
        this.f163562n = i;
        this.o = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsReceiptDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52567m() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53482a() {
        return this.f163554a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj2;
        return Intrinsics.f(this.f163554a, b8Var.f163554a) && this.f163555b.equals(b8Var.f163555b) && this.f163556c.equals(b8Var.f163556c) && this.d.equals(b8Var.d) && Intrinsics.f(this.e, b8Var.e) && Intrinsics.f(this.f, b8Var.f) && Intrinsics.f(this.f163557g, b8Var.f163557g) && Intrinsics.f(this.f163558h, b8Var.f163558h) && Intrinsics.f(this.i, b8Var.i) && Intrinsics.f(this.f163559j, b8Var.f163559j) && Intrinsics.f(this.k, b8Var.k) && this.f163560l == b8Var.f163560l && this.f163561m == b8Var.f163561m && this.f163562n == b8Var.f163562n && this.o == b8Var.o;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f163560l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163560l = i;
    }

    public final int hashCode() {
        int iC = j6.a.c(a10.b.c(this.e, org.bouncycastle.jcajce.provider.digest.a.b(this.d, t61.a.a(t61.a.a(this.f163554a.hashCode() * 31, 31, this.f163555b), 31, this.f163556c), 31), 31), 31, true);
        File file = this.f;
        int i = h30.l.i(this.f163557g, (iC + (file == null ? 0 : file.hashCode())) * 31, 31);
        p31.c cVar = this.f163558h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163559j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return Integer.hashCode(this.o) + j6.a.b(this.f163562n, j6.a.b(this.f163561m, j6.a.b(this.f163560l, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getE() {
        return this.f163558h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163557g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163559j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53487j() {
        return this.f163561m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53488l() {
        return this.o;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163561m = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getD() {
        return this.f163557g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53486h() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53485g() {
        return this.f163559j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163558h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.f163562n;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }
}
