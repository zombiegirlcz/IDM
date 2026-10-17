package v20;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.StatementUrlState;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f285348b;

    public /* synthetic */ c0(Object obj2, int i) {
        this.f285347a = i;
        this.f285348b = obj2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) throws Throwable {
        Object objL2;
        int i = this.f285347a;
        Continuation continuation2 = null;
        Object obj3 = this.f285348b;
        switch (i) {
            case 0:
                x4l.c cVar = ((f0) obj3).z;
                Unit unit = Unit.f186387a;
                Object objD = cVar.d(unit, false, continuation);
                return objD == fim.a.COROUTINE_SUSPENDED ? objD : unit;
            case 1:
                ((Collection) obj3).add(obj2);
                return Unit.f186387a;
            case 2:
                com.revolut.feature.payments.profile.impl.ui_kompot.flow.b bVar = (com.revolut.feature.payments.profile.impl.ui_kompot.flow.b) obj3;
                bVar.H2(bVar.f79642w, new v2e.x(((Boolean) obj2).booleanValue(), 11));
                return Unit.f186387a;
            case 3:
                Object objQ = ((wl3.s) obj3).e.q((List) obj2, continuation);
                return objQ == fim.a.COROUTINE_SUSPENDED ? objQ : Unit.f186387a;
            case 4:
                ((x44.c) obj3).d.setValue((Data) obj2);
                Unit unit2 = Unit.f186387a;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                return unit2;
            case 5:
                xni.h hVar = new xni.h((xo.d) obj3, continuation2, 1);
                skm.p0 p0Var = skm.p0.f264001a;
                Object objJ = skm.e0.J(zkm.o.f323119a.e, hVar, continuation);
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                if (objJ != aVar2) {
                    objJ = Unit.f186387a;
                }
                return objJ == aVar2 ? objJ : Unit.f186387a;
            case 6:
                ((zz4.d) obj3).f326512c.setValue((Data) obj2);
                Unit unit3 = Unit.f186387a;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                return unit3;
            default:
                Data data = (Data) obj2;
                com.revolut.feature.statements.impl.ui.documents_hub.a aVar4 = (com.revolut.feature.statements.impl.ui.documents_hub.a) obj3;
                vyd.a aVar5 = aVar4.v;
                StatementUrlState statementUrlState = (StatementUrlState) data.getContent();
                if (statementUrlState instanceof StatementUrlState.Ready) {
                    objL2 = aVar4.L2(((StatementUrlState.Ready) statementUrlState).getUrl(), continuation);
                    if (objL2 != fim.a.COROUTINE_SUSPENDED) {
                        objL2 = Unit.f186387a;
                    }
                } else {
                    if (statementUrlState instanceof StatementUrlState.InPreparation) {
                        aVar4.X1(new nii.y0(null, aVar5.b(((StatementUrlState.InPreparation) statementUrlState).getEmail()), false, 5));
                    } else {
                        if (statementUrlState != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Throwable error = data.getError();
                        if (error != null) {
                            aVar4.X1(new nii.y0(null, aVar5.c(error), false, 5));
                        }
                    }
                    objL2 = Unit.f186387a;
                }
                return objL2 == fim.a.COROUTINE_SUSPENDED ? objL2 : Unit.f186387a;
        }
    }
}
