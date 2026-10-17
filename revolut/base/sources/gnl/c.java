package gnl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.picker.PickerController;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s7a.x;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IdentifierInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(IdentifierInputScreen identifierInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = identifierInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IdentifierInputScreen identifierInputScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                identifierInputScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar = (s) identifierInputScreen.T2();
                sVar.getClass();
                x xVar = new x(new TextLocalisedClause(R$string.revolut_sso_login_input_country_title, null, null, 14), null, null, null, false, null, new TextLocalisedClause(com.revolut.feature.picker.R$string.picker_country_picker_search_hint, null, null, 14), null, null, false, null, null, null, null, true, mql.a.f208025a, null, null, null, null, 2105540094);
                Object obj3 = sVar.C.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                yji.l.j2(sVar, new PickerController(xVar, (x7a.d) obj3), null, new gmk.j(sVar, 3), 1);
                break;
        }
        return Unit.f186387a;
    }
}
