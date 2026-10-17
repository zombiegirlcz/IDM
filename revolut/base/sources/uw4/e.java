package uw4;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ip0.c2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.h3;
import vkm.q;
import vkm.v1;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f283548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f283549c;

    public e(h3 creditCardMsiInteractor, i creditCardMsiWidgetMapper, j creditCardMsiWidgetVisibilityProvider) {
        Intrinsics.checkNotNullParameter(creditCardMsiInteractor, "creditCardMsiInteractor");
        Intrinsics.checkNotNullParameter(creditCardMsiWidgetMapper, "creditCardMsiWidgetMapper");
        Intrinsics.checkNotNullParameter(creditCardMsiWidgetVisibilityProvider, "creditCardMsiWidgetVisibilityProvider");
        this.f283548b = creditCardMsiInteractor;
        this.f283549c = creditCardMsiWidgetVisibilityProvider;
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
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return ContactsWidgetDelegate.Model.Companion.b(ContactsWidgetDelegate.Model.INSTANCE, widgetId, new TextLocalisedClause(R$string.credit_msi_widget_title, null, null, 14), c2.CIRCLE);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return i((CreditCardWidgetContext) widgetContext, eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(j(str, ((CreditCardWidgetContext) widgetContext).getCreditCardFacilityId()), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        CreditCardWidgetContext widgetContext2 = (CreditCardWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return j(id10, widgetContext2.getCreditCardFacilityId());
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
    public final java.lang.Object i(com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof uw4.b
            if (r0 == 0) goto L13
            r0 = r6
            uw4.b r0 = (uw4.b) r0
            int r1 = r0.f283544w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f283544w = r1
            goto L1a
        L13:
            uw4.b r0 = new uw4.b
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f283544w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r5 = r5.getCreditCardFacilityId()
            r0.f283544w = r3
            uw4.j r6 = r4.f283549c
            om4.h3 r6 = r6.f283557a
            om4.k0 r6 = r6.f226596b
            yw4.f r2 = yw4.f.MSI_SHOPS_VIEW
            java.lang.Object r6 = r6.b(r5, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uw4.e.i(com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final y j(String str, String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return rd0.e.e(new t38.e(mo3.a.g(new v1(new nyd.j(26, this.f283548b, facilityId, continuation)), null, new utk.b(10), 1), 13, this, str), h0.f322473a, new uec.d((Object) new d(this, str, null), continuation, 8));
    }
}
