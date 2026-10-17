package w38;

import aw0.o9;
import ble.c1;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements i38.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qpa.b f294171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g48.r0 f294172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r38.b f294173c;
    public final t d;

    public e(qpa.b pushMessagesInteractor, g48.r0 jointAccountsInteractor, r38.b jointProductInteractor, l80.e dateProvider, t pendingAccountBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(pushMessagesInteractor, "pushMessagesInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointProductInteractor, "jointProductInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(pendingAccountBottomSheetProvider, "pendingAccountBottomSheetProvider");
        this.f294171a = pushMessagesInteractor;
        this.f294172b = jointAccountsInteractor;
        this.f294173c = jointProductInteractor;
        this.d = pendingAccountBottomSheetProvider;
    }

    @Override // i49.c
    public final boolean a(com.revolut.core.ui_kit.delegates.t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        return (obj2 instanceof n38.d0) || (obj2 instanceof n38.c0);
    }

    @Override // i49.c
    public final Object d(Object obj2) {
        return Intrinsics.f(obj2, dii.e.f115068a) ? j49.a.f171320a : j49.c.f171322a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i49.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r8, j60.a r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof w38.b
            if (r0 == 0) goto L13
            r0 = r10
            w38.b r0 = (w38.b) r0
            int r1 = r0.f294157w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294157w = r1
            goto L1a
        L13:
            w38.b r0 = new w38.b
            gim.c r10 = (gim.c) r10
            r0.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294157w
            j49.a r3 = j49.a.f171320a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r10)
            return r3
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r10)
            boolean r10 = r8 instanceof koi.j
            r2 = 0
            if (r10 == 0) goto L3f
            r10 = r8
            koi.j r10 = (koi.j) r10
            goto L40
        L3f:
            r10 = r2
        L40:
            if (r10 == 0) goto L86
            java.lang.String r10 = r10.getF55721a()
            if (r10 != 0) goto L49
            goto L86
        L49:
            boolean r5 = r8 instanceof qv0.p
            if (r5 == 0) goto L50
            qv0.p r8 = (qv0.p) r8
            goto L51
        L50:
            r8 = r2
        L51:
            if (r8 == 0) goto L58
            java.lang.Object r8 = r8.getI()
            goto L59
        L58:
            r8 = r2
        L59:
            java.lang.String r5 = "BUTTON_DECLINE_ITEM_ID"
            boolean r5 = r10.equals(r5)
            r6 = 2
            if (r5 == 0) goto L79
            boolean r5 = r8 instanceof n38.d0
            if (r5 == 0) goto L79
            j60.a.v(r9, r4, r2, r6)
            n38.d0 r8 = (n38.d0) r8
            java.lang.String r8 = r8.f211937a
            r0.f294157w = r4
            g48.r0 r9 = r7.f294172b
            java.lang.Object r8 = r9.t(r8, r0)
            if (r8 != r1) goto L78
            return r1
        L78:
            return r3
        L79:
            java.lang.String r8 = "BUTTON_GO_BACK_ITEM_ID"
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L86
            r8 = 0
            j60.a.v(r9, r8, r2, r6)
            return r3
        L86:
            j49.c r8 = j49.c.f171322a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w38.e.e(java.lang.Object, j60.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return vkm.q.Q(mo3.a.e(zh9.u0.m(new c1(new v1(new vnl.o(this, null, 26)), 29), ((r38.l) this.f294173c).f(w4l.h.f294642c)), new w2.d(7), new w2.d(8)), new sdi.a((Continuation) null, params, this));
    }

    @Override // i49.c
    public final Object g(com.revolut.core.ui_kit.delegates.t tVar, Continuation continuation) {
        ActionWidgetDelegate.Model model = tVar.f54722b;
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        Object obj2 = model.f51596l;
        boolean z = obj2 instanceof n38.c0;
        ActionWidgetDelegate.a.b bVar = ActionWidgetDelegate.a.b.f51608a;
        if (z && Intrinsics.f(aVar, bVar)) {
            return new j49.e(this.d.a(h38.d.JOINT_ACCOUNT_PENDING_BANNER), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        if (obj2 instanceof n38.d0) {
            if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
                return new j49.b(new JointAccountsFeatureConfig.Invite.Destination((n38.d0) obj2, false));
            }
            if (Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
                n38.d0 d0Var = (n38.d0) obj2;
                rp0.t tVar2 = new rp0.t(new TextLocalisedClause(R$string.joint_incoming_invitation_action_decline_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.joint_incoming_invitation_action_decline_confirmation_subtitle, zhm.u.c(new TextClause(d0Var.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 28);
                LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("BUTTON_DECLINE_ITEM_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.joint_incoming_invitation_action_decline_confirmation_button_yes, null, null, 14), false, null, d0Var, 0, R$attr.uikit_dp8, 0, 0, 7024);
                yp0.b.r(model2, 0, 0, 0, 0, 15);
                LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("BUTTON_GO_BACK_ITEM_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.joint_incoming_invitation_action_decline_confirmation_button_go_back, null, null, 14), false, null, null, 0, R$attr.uikit_dp24, 0, 0, 7152);
                yp0.b.r(model3, 0, 0, 0, 0, 15);
                return new j49.d(new rp0.y(zhm.v.k(model2, model3), tVar2, null, null, null, null, 1020));
            }
            if (!(aVar instanceof com.revolut.core.ui_kit.delegates.h) && !Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a) && !Intrinsics.f(aVar, bVar)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return j49.c.f171322a;
    }
}
