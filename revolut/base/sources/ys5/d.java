package ys5;

import c2d.m0;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import dsh.r;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import pt5.t;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements csh.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.g f316399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.b f316400c;
    public final t d;

    public d(thf.g transactionItemMapper, whf.b transactionsContentProvider, t transactionsFilterProvider) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(transactionsFilterProvider, "transactionsFilterProvider");
        this.f316399b = transactionItemMapper;
        this.f316400c = transactionsContentProvider;
        this.d = transactionsFilterProvider;
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return Intrinsics.f(widgetType, "TransactionsDynamic") ? u.c(r.a.a(r.Companion, inputConfig, null, null, 14)) : super.a(widgetType, inputConfig);
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
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_investments_transactions_title, null, null, 14);
        r.Companion.getClass();
        return RowsWidgetDelegate.Model.Companion.b(companion, id10, textLocalisedClause, 2, null, 24);
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext r6, java.lang.String r7, java.lang.String r8, dsh.e r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof ys5.b
            if (r0 == 0) goto L13
            r0 = r10
            ys5.b r0 = (ys5.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L1a
        L13:
            ys5.b r0 = new ys5.b
            gim.c r10 = (gim.c) r10
            r0.<init>(r5, r10)
        L1a:
            java.lang.Object r10 = r0.f316397y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r10)
            return r10
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.String r8 = r0.f316396x
            java.lang.String r7 = r0.f316395w
            com.revolut.feature.crypto_feed.models.CryptoWidgetContext r6 = r0.v
            ys5.d r9 = r0.u
            yhm.o.b(r10)
            goto L5c
        L40:
            yhm.o.b(r10)
            if (r9 != 0) goto L5f
            r0.u = r5
            r0.v = r6
            r0.f316395w = r7
            r0.f316396x = r8
            r0.A = r4
            dsh.d r9 = dsh.e.Companion
            r9.getClass()
            dsh.e r10 = dsh.d.a()
            if (r10 != r1) goto L5b
            goto L76
        L5b:
            r9 = r5
        L5c:
            dsh.e r10 = (dsh.e) r10
            goto L61
        L5f:
            r10 = r9
            r9 = r5
        L61:
            kotlinx.coroutines.flow.Flow r6 = r9.g(r6, r7, r8, r10)
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f316395w = r7
            r0.f316396x = r7
            r0.A = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L77
        L76:
            return r1
        L77:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ys5.d.f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Flow g(CryptoWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        int iC = r.a.c(r.Companion, config);
        return new m0(mo3.a.g(rd0.e.b(pd.b.r(this.d.a(CryptoInvestmentsFeatureConfig.CurrencyMode.AllCurrencies.f71404a, new ft5.a(null, 7)), new vvc.t(this, iC, 5))), null, new ypg.h(12), 1), this, iC, id10);
    }
}
