package g58;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.joint.impl.ui.phone_confirmation.JointContactPhoneConfirmationScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import g58.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.f0;
import nii.y0;
import nii.z;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JointContactPhoneConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(JointContactPhoneConfirmationScreen jointContactPhoneConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = jointContactPhoneConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        JointContactPhoneConfirmationScreen jointContactPhoneConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jointContactPhoneConfirmationScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) ((d) jointContactPhoneConfirmationScreen.Y.getValue());
                String str2 = ((b) jVar.t2()).f140687b;
                if (str2 == null) {
                    throw new IllegalArgumentException("Confirmation code should be set now");
                }
                d58.f fVar = ((b) jVar.t2()).f140686a;
                fVar.getClass();
                if (fVar instanceof d58.e) {
                    str = ((d58.e) fVar).f111399a;
                } else if (fVar instanceof d58.d) {
                    str = null;
                } else {
                    if (!(fVar instanceof d58.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = ((d58.b) fVar).f111396a.f211939c.f211960b;
                }
                if (str2.equals(str != null ? f0.V0(4, str) : null)) {
                    jVar.v2(c.b.f140689a);
                } else {
                    jVar.X1(new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(R$string.joint_invitee_confirm_number_error_incorrect_phone_number_title, null, null, 14), new TextLocalisedClause(R$string.joint_invitee_confirm_number_error_incorrect_phone_number_description, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4));
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((d) jointContactPhoneConfirmationScreen.Y.getValue())).v2(c.a.f140688a);
                return Unit.f186387a;
        }
    }
}
