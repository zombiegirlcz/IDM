package l48;

import efm.d0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import skm.p0;
import te0.w;
import u38.m;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f192069b;

    public /* synthetic */ a(e eVar, int i) {
        this.f192068a = i;
        this.f192069b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f192068a) {
            case 0:
                i jointAccountOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(jointAccountOptional, "jointAccountOptional");
                n38.a aVar = (n38.a) jointAccountOptional.f224257a;
                e eVar = this.f192069b;
                if (aVar == null) {
                    int i = 1;
                    return new ufm.i(w.o0(p0.f264003c, new b(eVar, null, i)), new l2d.b(new a(eVar, i), 27), 0);
                }
                d0 d0VarJ = osg.b.j(eVar.f192076c, null, null, io3.i.INTERNAL, null, null, l38.a.c(aVar), 27);
                l2d.b bVar = new l2d.b(new a(eVar, 2), 28);
                d0VarJ.getClass();
                ufm.i iVar = new ufm.i(d0VarJ, bVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 1:
                i pendingInvitationOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(pendingInvitationOptional, "pendingInvitationOptional");
                n38.d0 d0Var = (n38.d0) pendingInvitationOptional.f224257a;
                e eVar2 = this.f192069b;
                if (d0Var == null) {
                    return w.o0(p0.f264003c, new c(eVar2, null));
                }
                if (!d0Var.f) {
                    return w.o0(p0.f264003c, new d(eVar2, d0Var, null));
                }
                ufm.b bVarM = d0.m(eVar2.a("JOINT_PENDING_INVITATION_PRODUCT_ID", null));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            default:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                int size = pockets.size();
                e eVar3 = this.f192069b;
                if (size == 1) {
                    return eVar3.a(((io3.d) zhm.d0.b0(pockets)).f163145a, null);
                }
                m.Companion.getClass();
                return eVar3.a(m.e, null);
        }
    }
}
