package yi5;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.r;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements csh.e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dv5.l f314253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yd9.e f314254c;
    public final dsh.e d;

    public j(dv5.l presentationModel, yd9.e ordersMapper, xs5.a configProvider) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(ordersMapper, "ordersMapper");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.f314253b = presentationModel;
        this.f314254c = ordersMapper;
        dsh.e.Companion.getClass();
        this.d = dsh.d.a();
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return Intrinsics.f(widgetType, "OrdersDynamic") ? u.c(r.a.a(r.Companion, inputConfig, null, null, 14)) : super.a(widgetType, inputConfig);
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
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_investments_orders_title, null, null, 14);
        r.Companion.getClass();
        return RowsWidgetDelegate.Model.Companion.b(companion, id10, textLocalisedClause, 2, null, 24);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((CryptoWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext r5, java.lang.String r6, java.lang.String r7, dsh.e r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r8 = r9 instanceof yi5.d
            if (r8 == 0) goto L13
            r8 = r9
            yi5.d r8 = (yi5.d) r8
            int r0 = r8.A
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.A = r0
            goto L1a
        L13:
            yi5.d r8 = new yi5.d
            gim.c r9 = (gim.c) r9
            r8.<init>(r4, r9)
        L1a:
            java.lang.Object r9 = r8.f314243y
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
            java.lang.String r7 = r8.f314242x
            java.lang.String r6 = r8.f314241w
            com.revolut.feature.crypto_feed.models.CryptoWidgetContext r5 = r8.v
            yi5.j r1 = r8.u
            yhm.o.b(r9)
            goto L53
        L40:
            yhm.o.b(r9)
            r8.u = r4
            r8.v = r5
            r8.f314241w = r6
            r8.f314242x = r7
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
            r8.f314241w = r6
            r8.f314242x = r6
            r8.A = r2
            java.lang.Object r5 = vkm.q.x(r5, r8)
            if (r5 != r0) goto L6b
        L6a:
            return r0
        L6b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yi5.j.f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Flow g(CryptoWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        efm.r rVarFilter = this.f314253b.b(null).filter(new ya6.f(new b(0), 25));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        return new f(rd0.e.b(rVarFilter), this, id10, config, 0);
    }
}
