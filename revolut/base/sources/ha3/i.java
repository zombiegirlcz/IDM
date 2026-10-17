package ha3;

import com.youTransactor.uCube.rpc.Constants;
import e93.m0;
import efm.d0;
import h93.f0;
import h93.l0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f150408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f150409c;

    public /* synthetic */ i(j jVar, l0 l0Var, int i) {
        this.f150407a = i;
        this.f150408b = jVar;
        this.f150409c = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        switch (this.f150407a) {
            case 0:
                od0.i virtualCardOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(virtualCardOptional, "virtualCardOptional");
                f0 f0Var = (f0) virtualCardOptional.f224257a;
                if (f0Var != null) {
                    ufm.b bVarM = d0.m(f0Var);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                j jVar = this.f150408b;
                l0 l0Var = this.f150409c;
                d0 d0VarFirstOrError = j.b(jVar, null, l0Var, 1).firstOrError();
                ha1.s sVar = new ha1.s(7, new i(jVar, l0Var, 1));
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, sVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            default:
                List designs = (List) obj2;
                Intrinsics.checkNotNullParameter(designs, "designs");
                List list = designs;
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        e93.f fVar = (e93.f) next;
                        b93.b bVarC = fVar.c();
                        b93.b.Companion.getClass();
                        if (!Intrinsics.f(bVarC, b93.b.X) || fVar.r() != this.f150409c) {
                        }
                    } else {
                        next = null;
                    }
                }
                e93.f fVar2 = (e93.f) next;
                if (fVar2 == null) {
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            e93.f fVar3 = (e93.f) next2;
                            e93.e eVar = fVar3 instanceof e93.e ? (e93.e) fVar3 : null;
                            if ((eVar != null ? eVar.f : null) == m0.VIRTUAL) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    fVar2 = (e93.f) next2;
                }
                Intrinsics.i(fVar2, "null cannot be cast to non-null type com.revolut.feature.cards.models.design.CardDesign.VirtualCardDesign");
                return l93.f.g(this.f150408b.f150411b, (e93.e) fVar2, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
        }
    }
}
