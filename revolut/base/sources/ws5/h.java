package ws5;

import ard.c0;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_feed.impl.R$string;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import com.youTransactor.uCube.rpc.Constants;
import dsh.j;
import dsh.r;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import op0.q;
import org.jetbrains.annotations.NotNull;
import wp5.w;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements csh.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0k.e f299665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1k.b f299666c;
    public final dsh.e d;

    public h(m0k.e wealthNewsInteractor, a1k.b newsItemsMapper) {
        Intrinsics.checkNotNullParameter(wealthNewsInteractor, "wealthNewsInteractor");
        Intrinsics.checkNotNullParameter(newsItemsMapper, "newsItemsMapper");
        this.f299665b = wealthNewsInteractor;
        this.f299666c = newsItemsMapper;
        dsh.f fVar = new dsh.f();
        r.Companion.getClass();
        fVar.a("itemsCountLimit", "3");
        this.d = new dsh.e(fVar);
    }

    public static final ErrorWidgetDelegate.Model i(h hVar, String str) {
        return new ErrorWidgetDelegate.Model(str, null, new TextLocalisedClause(R$string.crypto_home_feed_widget_news_error_title, null, null, 14), new TextLocalisedClause(R$string.crypto_home_feed_widget_common_error_action, null, null, 14), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return Intrinsics.f(widgetType, "NewsDynamic") ? u.c(r.a.a(r.Companion, inputConfig, null, null, 14)) : super.a(widgetType, inputConfig);
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        return this.d;
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        NewsWidgetDelegate.Model.Companion companion = NewsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_home_widget_news_title, null, null, 14);
        r.Companion.getClass();
        return NewsWidgetDelegate.Model.Companion.b(companion, id10, textLocalisedClause, r.a.b(eVar, 3));
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
            boolean r8 = r9 instanceof ws5.b
            if (r8 == 0) goto L13
            r8 = r9
            ws5.b r8 = (ws5.b) r8
            int r0 = r8.A
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.A = r0
            goto L1a
        L13:
            ws5.b r8 = new ws5.b
            gim.c r9 = (gim.c) r9
            r8.<init>(r4, r9)
        L1a:
            java.lang.Object r9 = r8.f299656y
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
            java.lang.String r7 = r8.f299655x
            java.lang.String r6 = r8.f299654w
            com.revolut.feature.crypto_feed.models.CryptoWidgetContext r5 = r8.v
            ws5.h r1 = r8.u
            yhm.o.b(r9)
            goto L53
        L40:
            yhm.o.b(r9)
            r8.u = r4
            r8.v = r5
            r8.f299654w = r6
            r8.f299655x = r7
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
            r8.f299654w = r6
            r8.f299655x = r6
            r8.A = r2
            java.lang.Object r5 = vkm.q.x(r5, r8)
            if (r5 != r0) goto L6b
        L6a:
            return r0
        L6b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ws5.h.f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Flow g(CryptoWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        r.Companion.getClass();
        int iB = r.a.b(config, 3) + 1;
        return new c0(new wa3.d(rd0.e.b(nim.a.w(m0k.e.b(this.f299665b, WealthNewsCategory.Crypto.f101805b, true, null, null, null, null, Integer.valueOf(iB), false, 188), new w(27))), 23), this, id10, config, 27);
    }
}
