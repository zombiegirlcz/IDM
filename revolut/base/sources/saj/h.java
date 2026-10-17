package saj;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.newlyadded.api.R$string;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.youTransactor.uCube.rpc.Constants;
import dsh.j;
import ip0.c2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mle.x;
import op0.q;
import org.jetbrains.annotations.NotNull;
import qij.s;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements csh.e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oaj.a f261431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vs5.a f261432c;
    public final dsh.e d;

    public h(oaj.a newlyAddedCryptoInteractor, vs5.a widgetConfigProvider) {
        Intrinsics.checkNotNullParameter(newlyAddedCryptoInteractor, "newlyAddedCryptoInteractor");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        this.f261431b = newlyAddedCryptoInteractor;
        this.f261432c = widgetConfigProvider;
        dsh.e.Companion.getClass();
        this.d = dsh.d.a();
    }

    public static final ErrorWidgetDelegate.Model i(h hVar, String str) {
        return new ErrorWidgetDelegate.Model(str, null, new TextLocalisedClause(R$string.crypto_home_feed_widget_newly_added_error_title, null, null, 14), new TextLocalisedClause(R$string.crypto_home_feed_widget_common_error_action, null, null, 14), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        return this.d;
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        this.f261432c.getClass();
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return ContactsWidgetDelegate.Model.Companion.b(ContactsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.crypto_home_widget_newly_added_title, null, null, 14), c2.CIRCLE);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((CryptoWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext r5, java.lang.String r6, java.lang.String r7, dsh.e r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r8 = r9 instanceof saj.c
            if (r8 == 0) goto L13
            r8 = r9
            saj.c r8 = (saj.c) r8
            int r0 = r8.A
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.A = r0
            goto L1a
        L13:
            saj.c r8 = new saj.c
            gim.c r9 = (gim.c) r9
            r8.<init>(r4, r9)
        L1a:
            java.lang.Object r9 = r8.f261424y
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.A
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.String r7 = r8.f261423x
            java.lang.String r6 = r8.f261422w
            com.revolut.feature.crypto_feed.models.CryptoWidgetContext r5 = r8.v
            saj.h r1 = r8.u
            yhm.o.b(r9)
            goto L53
        L40:
            yhm.o.b(r9)
            r8.u = r4
            r8.v = r5
            r8.f261422w = r6
            r8.f261423x = r7
            r8.A = r3
            dsh.e r9 = r4.d
            if (r9 != r0) goto L52
            goto L6a
        L52:
            r1 = r4
        L53:
            dsh.e r9 = (dsh.e) r9
            kotlinx.coroutines.flow.Flow r5 = r1.g(r5, r6, r7, r9)
            r6 = 0
            r8.u = r6
            r8.v = r6
            r8.f261422w = r6
            r8.f261423x = r6
            r8.A = r2
            java.lang.Object r5 = vkm.q.x(r5, r8)
            if (r5 != r0) goto L6b
        L6a:
            return r0
        L6b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: saj.h.f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Flow g(CryptoWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new x(new s(oaj.a.a(this.f261431b), 10), this, id10, 26);
    }
}
