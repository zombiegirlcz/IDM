package ho2;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.impl.ui.form.phone_number_input.PhoneNumberInputScreen;
import com.revolut.feature.picker.PickerController;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s7a.x;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PhoneNumberInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PhoneNumberInputScreen phoneNumberInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = phoneNumberInputScreen;
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
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PhoneNumberInputScreen phoneNumberInputScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                phoneNumberInputScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) ((g) phoneNumberInputScreen.Q.getValue());
                jVar.getClass();
                x xVar = new x(null, null, null, null, false, null, new TextLocalisedClause(R.string.search_country, null, null, 14), null, null, false, null, ((e) ((j2) jVar.f154216q.f22677a).getValue()).f154204a.f297794a, null, null, true, null, null, null, null, null, 2138963454);
                Object obj3 = jVar.o.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                jVar.f2(new PickerController(xVar, (x7a.d) obj3), ModalDestination.Style.POPUP.f98311a, new hg4.a(jVar, 22));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar2 = (j) ((g) phoneNumberInputScreen.Q.getValue());
                y yVar = jVar2.f154216q;
                wi0.b bVar = ((e) ((j2) yVar.f22677a).getValue()).f154204a;
                j2 j2Var = (j2) yVar.f22677a;
                jVar2.C2(new f(((e) j2Var.getValue()).f154205b, ((e) j2Var.getValue()).f154206c, bVar));
                break;
        }
        return Unit.f186387a;
    }
}
