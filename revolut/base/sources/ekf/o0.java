package ekf;

import akf.t1;
import akf.u1;
import akf.v1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.R$string;
import d9.e1;
import java.util.List;
import klf.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 extends gim.i implements oim.o {
    public /* synthetic */ a3 u;
    public /* synthetic */ do3.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Boolean f127109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ j1 f127110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r0 f127111y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Continuation continuation) {
        super(5, continuation);
        this.f127111y = r0Var;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        o0 o0Var = new o0(this.f127111y, (Continuation) obj6);
        o0Var.u = (a3) obj2;
        o0Var.v = (do3.n) obj3;
        o0Var.f127109w = (Boolean) obj4;
        o0Var.f127110x = (j1) obj5;
        return o0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        a3 transaction = this.u;
        do3.n user = this.v;
        Boolean bool = this.f127109w;
        j1 youthWalletOwner = this.f127110x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.h(bool);
        boolean zBooleanValue = bool.booleanValue();
        this.f127111y.f127122p.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(youthWalletOwner, "youthWalletOwner");
        tof.w0 w0Var = transaction.D0;
        if (w0Var == null || (str = w0Var.f273123a) == null) {
            str = user.f116408a;
        }
        if (e1.B(transaction) || !cp5.d.B(transaction, zBooleanValue) || !Intrinsics.f(str, user.f116408a) || k71.k.q1(transaction) || youthWalletOwner.c()) {
            return zhm.f0.f322471a;
        }
        u1 u1Var = v1.Companion;
        t1 t1Var = t1.SEND_AGAIN_PUSH_TO_CARD;
        u1Var.getClass();
        String strA = u1.a(t1Var);
        mx0.d dVar = mx0.d.ACCENT;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transaction_details_actions_send_again, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        String str2 = transaction.j0;
        if (str2 != null) {
            return zhm.u.c(new ActionsView.Item(strA, dVar, false, null, null, textLocalisedClause, resourceImage, null, null, null, false, null, null, new cmf.b(str2), null, 24476));
        }
        throw new IllegalStateException("Required value was null.");
    }
}
