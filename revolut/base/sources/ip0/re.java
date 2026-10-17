package ip0;

import com.revolut.core.ui_kit.delegates.DoublePickerDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class re implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te f166162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te f166163c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166165h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f166166j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f166167l;

    public re(String listId, te firstModel, te secondModel) {
        int i = R$attr.uikit_dp16;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(firstModel, "firstModel");
        Intrinsics.checkNotNullParameter(secondModel, "secondModel");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(firstModel, "firstModel");
        Intrinsics.checkNotNullParameter(secondModel, "secondModel");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f166161a = listId;
        this.f166162b = firstModel;
        this.f166163c = secondModel;
        this.d = positionInBox;
        this.e = null;
        this.f = null;
        this.f166164g = null;
        this.f166165h = null;
        this.i = i;
        this.f166166j = i;
        this.k = i2;
        this.f166167l = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new DoublePickerDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52138b() {
        return this.f166161a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof re)) {
            return false;
        }
        re reVar = (re) obj2;
        return this.f166161a.equals(reVar.f166161a) && this.f166162b.equals(reVar.f166162b) && this.f166163c.equals(reVar.f166163c) && Intrinsics.f(this.d, reVar.d) && Intrinsics.f(this.e, reVar.e) && Intrinsics.f(this.f, reVar.f) && Intrinsics.f(this.f166164g, reVar.f166164g) && Intrinsics.f(this.f166165h, reVar.f166165h) && this.i == reVar.i && this.f166166j == reVar.f166166j && this.k == reVar.k && this.f166167l == reVar.f166167l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.d, (this.f166163c.hashCode() + ((this.f166162b.hashCode() + (this.f166161a.hashCode() * 31)) * 31)) * 961, 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166164g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166165h;
        return Integer.hashCode(this.f166167l) + j6.a.b(this.k, j6.a.b(this.f166166j, j6.a.b(this.i, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53344m() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53345n() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166164g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52143l() {
        return this.f166166j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52145n() {
        return this.f166167l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166166j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53343l() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53346p() {
        return this.f166165h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return this.f166164g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52144m() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166165h = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    @Override // koi.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "oldItem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            boolean r2 = r1 instanceof ip0.re
            r3 = 0
            if (r2 == 0) goto L12
            r2 = r1
            ip0.re r2 = (ip0.re) r2
            goto L13
        L12:
            r2 = r3
        L13:
            if (r2 == 0) goto L91
            ip0.re r1 = (ip0.re) r1
            ip0.te r2 = r1.f166162b
            ip0.te r3 = r1.f166162b
            ip0.te r1 = r1.f166163c
            java.util.ArrayList r2 = r2.f166510b
            ip0.te r4 = r0.f166162b
            java.util.ArrayList r5 = r4.f166510b
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r5)
            r5 = 1
            r10 = r2 ^ 1
            java.lang.Integer r2 = r4.f166511c
            r6 = 0
            if (r2 == 0) goto L40
            java.lang.Integer r7 = r3.f166511c
            int r2 = r2.intValue()
            if (r7 != 0) goto L38
            goto L3e
        L38:
            int r7 = r7.intValue()
            if (r7 == r2) goto L40
        L3e:
            r7 = r5
            goto L41
        L40:
            r7 = r6
        L41:
            int r2 = r3.d
            int r8 = r4.d
            if (r2 == r8) goto L49
            r8 = r5
            goto L4a
        L49:
            r8 = r6
        L4a:
            com.revolut.core.ui_kit.models.Clause r2 = r3.f166509a
            com.revolut.core.ui_kit.models.Clause r3 = r4.f166509a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r3)
            r11 = r2 ^ 1
            java.util.ArrayList r2 = r1.f166510b
            ip0.te r3 = r0.f166163c
            java.util.ArrayList r4 = r3.f166510b
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r4)
            r15 = r2 ^ 1
            java.lang.Integer r2 = r3.f166511c
            if (r2 == 0) goto L75
            java.lang.Integer r4 = r1.f166511c
            int r2 = r2.intValue()
            if (r4 != 0) goto L6d
            goto L73
        L6d:
            int r4 = r4.intValue()
            if (r4 == r2) goto L75
        L73:
            r12 = r5
            goto L76
        L75:
            r12 = r6
        L76:
            int r2 = r1.d
            int r4 = r3.d
            if (r2 == r4) goto L7e
            r13 = r5
            goto L7f
        L7e:
            r13 = r6
        L7f:
            com.revolut.core.ui_kit.models.Clause r1 = r1.f166509a
            com.revolut.core.ui_kit.models.Clause r2 = r3.f166509a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            r16 = r1 ^ 1
            ip0.se r6 = new ip0.se
            r9 = 0
            r14 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r6
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ip0.re.z(java.lang.Object):java.lang.Object");
    }
}
