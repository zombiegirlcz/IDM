package vml;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.ui.email.enter_email.EnterEmailScreen;
import com.revolut.sso.impl.ui.email.enter_email.EnterEmailScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vfg.m;
import vkm.j2;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EnterEmailScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EnterEmailScreen enterEmailScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = enterEmailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        int i2 = this.u;
        EnterEmailScreen enterEmailScreen = this.v;
        switch (i2) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                enterEmailScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.sso.impl.ui.email.enter_email.a aVar3 = (com.revolut.sso.impl.ui.email.enter_email.a) ((e) enterEmailScreen.N.getValue());
                y yVar = aVar3.f106532q;
                if (((f) ((j2) yVar.f22677a).getValue()).f290620a.length() == 0) {
                    throw new IllegalStateException("Can't continue with empty email");
                }
                EnterEmailScreenContract$InputData.Mode mode = aVar3.o.f106527a;
                if ((mode instanceof EnterEmailScreenContract$InputData.Mode.Create) || (mode instanceof EnterEmailScreenContract$InputData.Mode.Verify)) {
                    i = R$string.revolut_sso_create_new_email_confirmation_dialog_description;
                } else {
                    if (!Intrinsics.f(mode, EnterEmailScreenContract$InputData.Mode.LostAccess.f106529a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.revolut_sso_lost_access_email_confirmation_dialog_description;
                }
                tll.a aVar4 = aVar3.f106531p;
                TextClause textClause = new TextClause(((f) ((j2) yVar.f22677a).getValue()).f290620a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
                Intrinsics.checkNotNullParameter("LIST_ID_ENTER_EMAIL", "id");
                l.b1(aVar3, aVar3.X1(((tll.b) aVar4).a(textClause, null, textLocalisedClause, new ListIdTarget("LIST_ID_ENTER_EMAIL"))), null, new m(aVar3, null, 17), 3);
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.sso.impl.ui.email.enter_email.a) ((e) enterEmailScreen.N.getValue())).C2(h.f290622a);
                return Unit.f186387a;
        }
    }
}
