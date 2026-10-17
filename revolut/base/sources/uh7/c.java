package uh7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.instruments.trend.collections.api.feedwidget.InstrumentsTrendCollectionsFeedWidgetContext;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsCollectionAssetsTypeFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionTimeframeFilterValue;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import zhm.d0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nh7.d f280106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e38.f f280107c;
    public final e d;
    public final twg.c e;

    public c(nh7.d widget, e38.f widgetAvailabilityProvider, e widgetContentMapper, twg.c instrumentsTrendCollectionsInteractor, o widgetFiltersProvider) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(widgetContentMapper, "widgetContentMapper");
        Intrinsics.checkNotNullParameter(instrumentsTrendCollectionsInteractor, "instrumentsTrendCollectionsInteractor");
        Intrinsics.checkNotNullParameter(widgetFiltersProvider, "widgetFiltersProvider");
        this.f280106b = widget;
        this.f280107c = widgetAvailabilityProvider;
        this.d = widgetContentMapper;
        this.e = instrumentsTrendCollectionsInteractor;
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
        int[] iArr = a.f280102a;
        nh7.d widget = this.f280106b;
        int i = iArr[widget.ordinal()];
        int i2 = 3;
        if (i == 1 || i == 2) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            Continuation continuation2 = null;
            return vkm.q.x(rd0.e.e(new v1(new e38.c(widget, this.f280107c, continuation2, 0)), m72.b.w("InstrumentsTrendCollectionsFeedWidgetContentProvider", "isAvailable"), new tc6.d(i2, 21, continuation2)), continuation);
        }
        if (i == 3 || i == 4) {
            return Boolean.FALSE;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        ph7.c cVar;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        nh7.c cVarC = this.f280106b.c();
        if (cVarC instanceof nh7.a) {
            cVar = ((nh7.a) cVarC).f215377a;
        } else {
            if (!(cVarC instanceof nh7.b)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = (ph7.c) d0.b0(((nh7.b) cVarC).f215378a);
        }
        return this.d.b(id10, cVar, eVar);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return i(str, eVar, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        InstrumentsTrendCollectionsFeedWidgetContext widgetContext2 = (InstrumentsTrendCollectionsFeedWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        nh7.d widget = this.f280106b;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Continuation continuation = null;
        return vkm.q.Q(new v1(new e38.c(widget, this.f280107c, continuation, 0)), new mki.d(continuation, this, id10, config, 22));
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((InstrumentsTrendCollectionsFeedWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, dsh.e r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof uh7.b
            if (r0 == 0) goto L13
            r0 = r8
            uh7.b r0 = (uh7.b) r0
            int r1 = r0.f280105y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280105y = r1
            goto L18
        L13:
            uh7.b r0 = new uh7.b
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f280103w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280105y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.v
            uh7.c r7 = r0.u
            yhm.o.b(r8)
            goto L52
        L3a:
            yhm.o.b(r8)
            if (r7 != 0) goto L55
            r0.u = r5
            r0.v = r6
            r0.f280105y = r4
            dsh.d r7 = dsh.e.Companion
            r7.getClass()
            dsh.e r8 = dsh.d.a()
            if (r8 != r1) goto L51
            goto L68
        L51:
            r7 = r5
        L52:
            dsh.e r8 = (dsh.e) r8
            goto L57
        L55:
            r8 = r7
            r7 = r5
        L57:
            kotlinx.coroutines.flow.Flow r6 = r7.k(r6, r8)
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f280105y = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uh7.c.i(java.lang.String, dsh.e, gim.c):java.lang.Object");
    }

    public final akg.n j(ph7.c collectionKey, dsh.e config) {
        Map mapK;
        w4l.k kVar;
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        Intrinsics.checkNotNullParameter(config, "config");
        nh7.d widget = this.f280106b;
        InstrumentsTrendCollectionId instrumentsTrendCollectionIdA = widget.a();
        Intrinsics.checkNotNullParameter(widget, "widget");
        int i = n.f280124a[widget.ordinal()];
        if (i == 1) {
            mapK = r0.k(new Pair(ph7.b.TIMEFRAME, InstrumentsTrendCollectionTimeframeFilterValue.ONE_WEEK), new Pair(ph7.b.ASSETS_TYPE, InstrumentsCollectionAssetsTypeFilterValue.ALL));
        } else if (i == 2) {
            mapK = r0.g();
        } else if (i == 3) {
            mapK = q0.c(new Pair(ph7.b.TIMEFRAME, InstrumentsTrendCollectionTimeframeFilterValue.ONE_DAY));
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            mapK = r0.g();
        }
        Map map = mapK;
        Integer numValueOf = Integer.valueOf(this.d.c(config));
        nh7.c cVarC = widget.c();
        if (cVarC instanceof nh7.a) {
            kVar = w4l.i.f294643c;
        } else {
            if (!(cVarC instanceof nh7.b)) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = w4l.h.f294642c;
        }
        return this.e.N(instrumentsTrendCollectionIdA, collectionKey, map, numValueOf, kVar);
    }

    public abstract Flow k(String str, dsh.e eVar);
}
