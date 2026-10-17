package vsf;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.transfer_reasons.impl.ui.actions.TransferReasonsDeclarationActionsScreen;
import com.revolut.feature.transfer_reasons.impl.ui.actions.TransferReasonsDeclarationActionsScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ryd.w;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferReasonsDeclarationActionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TransferReasonsDeclarationActionsScreen transferReasonsDeclarationActionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferReasonsDeclarationActionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.N.getValue();
        Intrinsics.h(model);
        final i iVar = (i) fVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        final int i = 0;
        if (a0.H(str, "DECLARATION_ACTION_OPERATION_ROW_ID_", false)) {
            Object obj3 = model.u;
            ttf.d dVar = obj3 instanceof ttf.d ? (ttf.d) obj3 : null;
            if (dVar != null) {
                iVar.C2(new e(dVar));
            }
        } else if (str.equals("DECLARATION_ACTION_VIEW_ROW_ID")) {
            zxd.c cVar = iVar.f291782p;
            TransferReasonsDeclarationActionsScreenContract$InputData transferReasonsDeclarationActionsScreenContract$InputData = iVar.o;
            final int i2 = 1;
            yji.l.a1(iVar, ue8.c.i0(byd.g.a(byd.g.c(rd0.e.b(((w) cVar).h(transferReasonsDeclarationActionsScreenContract$InputData.f92371a, transferReasonsDeclarationActionsScreenContract$InputData.f92373c)), iVar.X(), iVar.f291784r.d(), new Function1() { // from class: vsf.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            Throwable error = (Throwable) obj4;
                            Intrinsics.checkNotNullParameter(error, "error");
                            i iVar2 = iVar;
                            ServerError serverErrorA = iVar2.f291785s.a(error);
                            if (serverErrorA == null || serverErrorA.f51362a != 9401) {
                                return iVar2.f291784r.c(error);
                            }
                            return null;
                        default:
                            vyd.a aVar2 = iVar.f291784r;
                            StatementUrlState content = (StatementUrlState) obj4;
                            Intrinsics.checkNotNullParameter(content, "content");
                            if (content instanceof StatementUrlState.InPreparation) {
                                return aVar2.b(((StatementUrlState.InPreparation) content).getEmail());
                            }
                            if (content instanceof StatementUrlState.Ready) {
                                return aVar2.a();
                            }
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }, new Function1() { // from class: vsf.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            Throwable error = (Throwable) obj4;
                            Intrinsics.checkNotNullParameter(error, "error");
                            i iVar2 = iVar;
                            ServerError serverErrorA = iVar2.f291785s.a(error);
                            if (serverErrorA == null || serverErrorA.f51362a != 9401) {
                                return iVar2.f291784r.c(error);
                            }
                            return null;
                        default:
                            vyd.a aVar2 = iVar.f291784r;
                            StatementUrlState content = (StatementUrlState) obj4;
                            Intrinsics.checkNotNullParameter(content, "content");
                            if (content instanceof StatementUrlState.InPreparation) {
                                return aVar2.b(((StatementUrlState.InPreparation) content).getEmail());
                            }
                            if (content instanceof StatementUrlState.Ready) {
                                return aVar2.a();
                            }
                            throw new NoWhenBranchMatchedException();
                    }
                }
            })), iVar), null, null, new vrl.d(iVar, null, 1), 3);
        }
        return Unit.f186387a;
    }
}
