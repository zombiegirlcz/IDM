package ip0;

import com.revolut.core.ui_kit.delegates.ChatMessagesLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class oa implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qv0.c f165640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f165641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f165642c;
    public p31.c d;
    public p31.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f165643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f165644h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final UUID f165645j;

    public oa(UUID uuid) {
        int i = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter("LIST_ID_LOADING", "listId");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f165640a = positionInBox;
        this.f165641b = null;
        this.f165642c = null;
        this.d = null;
        this.e = null;
        this.f = i;
        this.f165643g = i;
        this.f165644h = i;
        this.i = i;
        this.f165645j = uuid;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ChatMessagesLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52567m() {
        return this.f165645j;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52560a() {
        return "LIST_ID_LOADING";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj2;
        return Intrinsics.f(this.f165640a, oaVar.f165640a) && Intrinsics.f(this.f165641b, oaVar.f165641b) && Intrinsics.f(this.f165642c, oaVar.f165642c) && Intrinsics.f(this.d, oaVar.d) && Intrinsics.f(this.e, oaVar.e) && this.f == oaVar.f && this.f165643g == oaVar.f165643g && this.f165644h == oaVar.f165644h && this.i == oaVar.i && Intrinsics.f(this.f165645j, oaVar.f165645j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52568n() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f165640a, -360614169, 31);
        p31.c cVar = this.f165641b;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165642c;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.d;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.e;
        int iB = j6.a.b(this.i, j6.a.b(this.f165644h, j6.a.b(this.f165643g, j6.a.b(this.f, (iHashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
        UUID uuid = this.f165645j;
        return iB + (uuid != null ? uuid.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52572s() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165640a = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52573t() {
        return this.f165641b;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165642c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getO() {
        return this.f165643g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52570q() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165643g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52571r() {
        return this.f165640a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getV() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getU() {
        return this.f165642c;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52569p() {
        return this.f165644h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165641b = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.d = cVar;
    }
}
