package pw4;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mle.x;
import vkm.q;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.d f240323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f240324c;

    public e(al4.d creditCardAdditionalCardholdersInteractor, i creditCardAdditionalCardholdersWidgetMapper, j creditCardAdditionalCardholdersWidgetVisibilityProvider) {
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersWidgetMapper, "creditCardAdditionalCardholdersWidgetMapper");
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersWidgetVisibilityProvider, "creditCardAdditionalCardholdersWidgetVisibilityProvider");
        this.f240323b = creditCardAdditionalCardholdersInteractor;
        this.f240324c = creditCardAdditionalCardholdersWidgetVisibilityProvider;
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
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_additional_cardholders_widget_title, null, null, 14);
        r.Companion.getClass();
        return RowsWidgetDelegate.Model.Companion.b(companion, widgetId, textLocalisedClause, 2, null, 16);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return i((CreditCardWidgetContext) widgetContext, eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(j(str, (CreditCardWidgetContext) widgetContext), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        CreditCardWidgetContext widgetContext2 = (CreditCardWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return j(id10, widgetContext2);
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
            boolean r0 = r6 instanceof pw4.b
            if (r0 == 0) goto L13
            r0 = r6
            pw4.b r0 = (pw4.b) r0
            int r1 = r0.f240319w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240319w = r1
            goto L1a
        L13:
            pw4.b r0 = new pw4.b
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240319w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r5 = r5.getCreditCardFacilityId()
            r0.f240319w = r3
            pw4.j r6 = r4.f240324c
            pw4.n r6 = (pw4.n) r6
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pw4.e.i(com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final y j(String str, CreditCardWidgetContext creditCardWidgetContext) {
        return rd0.e.e(new x(mo3.a.g(((om4.l) this.f240323b).c(creditCardWidgetContext.getCreditCardFacilityId(), w4l.h.f294642c), null, new psl.m(27), 1), this, str, 10), h0.f322473a, new pkf.x(new d(this, str, null), null));
    }
}
