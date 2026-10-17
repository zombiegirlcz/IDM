package sw4;

import al4.n;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mle.x;
import om4.k0;
import om4.n0;
import op0.q;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f266102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f266103c;
    public final k0 d;

    public h(n0 feeWaiverInteractor, bl4.e feeWaiverMapper, n creditCardInteractor, k0 creditCardFeatureInteractor) {
        Intrinsics.checkNotNullParameter(feeWaiverInteractor, "feeWaiverInteractor");
        Intrinsics.checkNotNullParameter(feeWaiverMapper, "feeWaiverMapper");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.f266102b = feeWaiverInteractor;
        this.f266103c = creditCardInteractor;
        this.d = creditCardFeatureInteractor;
    }

    public static ErrorWidgetDelegate.Model j(String str) {
        return new ErrorWidgetDelegate.Model(str, null, new TextLocalisedClause(R$string.credit_credit_card_fee_waiver_widget_error, null, null, 14), new TextLocalisedClause(R$string.common_try_again, null, null, 14), q.SMALL, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new AvatarWidgetLoadingDelegate.Model(id10, null, null);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return k((CreditCardWidgetContext) widgetContext, eVar);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return i(str, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        CreditCardWidgetContext widgetContext2 = (CreditCardWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return l(id10);
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((CreditCardWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sw4.a
            if (r0 == 0) goto L13
            r0 = r6
            sw4.a r0 = (sw4.a) r0
            int r1 = r0.f266093x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266093x = r1
            goto L1a
        L13:
            sw4.a r0 = new sw4.a
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266093x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            vkm.y r6 = r4.l(r5)
            r0.u = r5
            r0.f266093x = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model r6 = (com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model) r6
            if (r6 != 0) goto L4e
            com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate$Model r5 = j(r5)
            return r5
        L4e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sw4.h.i(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sw4.b
            if (r0 == 0) goto L13
            r0 = r7
            sw4.b r0 = (sw4.b) r0
            int r1 = r0.f266095x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266095x = r1
            goto L1a
        L13:
            sw4.b r0 = new sw4.b
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266095x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext r6 = r0.u
            yhm.o.b(r7)
            goto L50
        L3a:
            yhm.o.b(r7)
            java.lang.String r7 = r6.getCreditCardFacilityId()
            r0.u = r6
            r0.f266095x = r4
            al4.n r2 = r5.f266103c
            om4.x2 r2 = (om4.x2) r2
            java.lang.Object r7 = r2.u(r7, r0)
            if (r7 != r1) goto L50
            goto L6b
        L50:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6d
            java.lang.String r6 = r6.getCreditCardFacilityId()
            yw4.f r7 = yw4.f.PREMIUM_FEE_WAIVER
            r2 = 0
            r0.u = r2
            r0.f266095x = r3
            om4.k0 r2 = r5.d
            java.lang.Object r6 = r2.b(r6, r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            return r6
        L6d:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sw4.h.k(com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final y l(String str) {
        return rd0.e.e(new x(n0.b(this.f266102b, nl4.a.f216991a), this, str, 29), h0.f322473a, new s9b.n((Object) new g(this, str, null), (Continuation) null, 11));
    }
}
