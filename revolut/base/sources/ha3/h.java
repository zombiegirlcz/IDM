package ha3;

import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import h93.f0;
import h93.j0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f150406b;

    public /* synthetic */ h(j jVar, int i) {
        this.f150405a = i;
        this.f150406b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f150405a) {
            case 0:
                od0.i virtualProCardOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(virtualProCardOptional, "virtualProCardOptional");
                f0 f0Var = (f0) virtualProCardOptional.g();
                if (f0Var != null) {
                    ufm.b bVarM = d0.m(f0Var);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                j0 j0Var = j0.PRO;
                j jVar = this.f150406b;
                d0 d0VarFirstOrError = j.b(jVar, j0Var, null, 2).firstOrError();
                ha1.s sVar = new ha1.s(8, new h(jVar, 1));
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, sVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            default:
                List designs = (List) obj2;
                Intrinsics.checkNotNullParameter(designs, "designs");
                Iterator it8 = designs.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        b93.b bVarC = ((e93.f) next).c();
                        b93.b.Companion.getClass();
                        if (Intrinsics.f(bVarC, b93.b.f13605w0)) {
                        }
                    } else {
                        next = null;
                    }
                }
                e93.f fVar = (e93.f) next;
                Intrinsics.i(fVar, "null cannot be cast to non-null type com.revolut.feature.cards.models.design.CardDesign.VirtualCardDesign");
                return l93.f.g(this.f150406b.f150411b, (e93.e) fVar, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
        }
    }
}
