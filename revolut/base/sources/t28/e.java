package t28;

import com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v28.f f267453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t9h.a f267454c;
    public final g d;

    public e(v28.f popularAssetsWidgetMapper, t9h.a popularAssetsPresentationModel, g variant) {
        Intrinsics.checkNotNullParameter(popularAssetsWidgetMapper, "popularAssetsWidgetMapper");
        Intrinsics.checkNotNullParameter(popularAssetsPresentationModel, "popularAssetsPresentationModel");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f267453b = popularAssetsWidgetMapper;
        this.f267454c = popularAssetsPresentationModel;
        this.d = variant;
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return this.d.a(inputConfig);
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return this.d.d(str, (gim.c) continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        v28.c layout = this.d.f(eVar);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (layout instanceof v28.b) {
            v28.b bVar = (v28.b) layout;
            return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, bVar.f285678a, bVar.f285679b, null, 24);
        }
        if (layout instanceof v28.a) {
            return AvatarGridWidgetDelegate.Model.Companion.d(AvatarGridWidgetDelegate.Model.INSTANCE, id10, ((v28.a) layout).f285677a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((InvestWidgetContext) widgetContext, str, eVar);
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
    public final java.lang.Object f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext r6, java.lang.String r7, java.lang.String r8, dsh.e r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof t28.a
            if (r0 == 0) goto L13
            r0 = r10
            t28.a r0 = (t28.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L1a
        L13:
            t28.a r0 = new t28.a
            gim.c r10 = (gim.c) r10
            r0.<init>(r5, r10)
        L1a:
            java.lang.Object r10 = r0.f267448y
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
            java.lang.String r8 = r0.f267447x
            java.lang.String r7 = r0.f267446w
            com.revolut.feature.invest_feed.api.models.InvestWidgetContext r6 = r0.v
            t28.e r9 = r0.u
            yhm.o.b(r10)
            goto L5c
        L40:
            yhm.o.b(r10)
            if (r9 != 0) goto L5f
            r0.u = r5
            r0.v = r6
            r0.f267446w = r7
            r0.f267447x = r8
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
            r0.f267446w = r7
            r0.f267447x = r7
            r0.A = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L77
        L76:
            return r1
        L77:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t28.e.f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Flow g(InvestWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return q.Q(new v1(new sma.f(this, widgetType, (Continuation) null)), new mki.d((Continuation) null, this, config, id10, 12));
    }
}
