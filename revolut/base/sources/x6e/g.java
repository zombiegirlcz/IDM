package x6e;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig$InvitationConfirmation$Destination;
import efm.r;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import pcd.v;
import rp0.y;
import te0.w;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements g6e.e {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppg.b f303066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.b f303067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qpa.b f303068c;
    public final ihm.f d;

    public g(ppg.b vaultsInteractor, g6e.b subaccountBackgroundInteractor, qpa.b pushMessagesInteractor) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(pushMessagesInteractor, "pushMessagesInteractor");
        this.f303066a = vaultsInteractor;
        this.f303067b = subaccountBackgroundInteractor;
        this.f303068c = pushMessagesInteractor;
        this.d = v0.a.d("create(...)");
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.f54722b.f51596l instanceof v;
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
            boolean r0 = r10 instanceof x6e.f
            if (r0 == 0) goto L13
            r0 = r10
            x6e.f r0 = (x6e.f) r0
            int r1 = r0.f303065w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303065w = r1
            goto L1a
        L13:
            x6e.f r0 = new x6e.f
            gim.c r10 = (gim.c) r10
            r0.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303065w
            j49.a r3 = j49.a.f171320a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r10)
            goto L87
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
            if (r10 == 0) goto L9c
            java.lang.String r10 = r10.getF52499a()
            if (r10 != 0) goto L49
            goto L9c
        L49:
            boolean r5 = r8 instanceof qv0.p
            if (r5 == 0) goto L50
            qv0.p r8 = (qv0.p) r8
            goto L51
        L50:
            r8 = r2
        L51:
            if (r8 == 0) goto L58
            java.lang.Object r8 = r8.getF52505l()
            goto L59
        L58:
            r8 = r2
        L59:
            java.lang.String r5 = "BUTTON_DECLINE_ITEM_ID"
            boolean r5 = r10.equals(r5)
            r6 = 2
            if (r5 == 0) goto L8f
            boolean r5 = r8 instanceof pcd.v
            if (r5 == 0) goto L8f
            j60.a.v(r9, r4, r2, r6)
            pcd.v r8 = (pcd.v) r8
            java.lang.String r8 = r8.f234899a
            ppg.b r9 = r7.f303066a
            ypg.p r9 = (ypg.p) r9
            java.lang.String r10 = "vaultId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r10)
            qdd.a r9 = r9.f315887a
            aed.o r9 = (aed.o) r9
            pfm.r r8 = r9.b(r8)
            r0.f303065w = r4
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto L87
            return r1
        L87:
            ihm.f r8 = r7.d
            kotlin.Unit r9 = kotlin.Unit.f186387a
            r8.onNext(r9)
            return r3
        L8f:
            java.lang.String r8 = "BUTTON_GO_BACK_ITEM_ID"
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L9c
            r8 = 0
            j60.a.v(r9, r8, r2, r6)
            return r3
        L9c:
            j49.c r8 = j49.c.f171322a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x6e.g.e(java.lang.Object, j60.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // i49.c
    public final Flow f(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        r map = this.f303068c.f248320a.map(new x0i.i(new x64.a(3), 20));
        Unit unit = Unit.f186387a;
        r rVarStartWith = map.startWith(unit);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        r rVarStartWith2 = this.d.startWith(unit);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith2, "startWith(...)");
        r rVarSwitchMap = w.l(rVarStartWith, rVarStartWith2).switchMap(new x0i.i(new x0b.c(this, 23), 21));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rd0.e.b(ue0.e.E(rVarSwitchMap, f0.f322471a));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        Object obj2 = tVar.f54722b.f51596l;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.shared.savings.models.vault.VaultInvite");
        v vVar = (v) obj2;
        ActionWidgetDelegate.a aVar = tVar.f54721a;
        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
            return new j49.b(new VaultsKompotFeatureConfig$InvitationConfirmation$Destination(vVar));
        }
        if (!Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
            if ((aVar instanceof com.revolut.core.ui_kit.delegates.h) || Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a) || Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
                return j49.c.f171322a;
            }
            throw new NoWhenBranchMatchedException();
        }
        rp0.t tVar2 = new rp0.t(new TextLocalisedClause(R$string.group_pockets_invitation_decline_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.group_pockets_invitation_decline_confirmation_description, u.c(new TextClause(vVar.d.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("BUTTON_DECLINE_ITEM_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.group_pockets_invitation_decline_confirmation_confirm, null, null, 14), false, null, vVar, 0, R$attr.uikit_dp8, 0, 0, 7024);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("BUTTON_GO_BACK_ITEM_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.group_pockets_invitation_decline_confirmation_cancel, null, null, 14), false, null, null, 0, R$attr.uikit_dp24, 0, 0, 7152);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        return new j49.d(new y(zhm.v.k(model, model2), tVar2, null, null, null, null, 1020));
    }
}
