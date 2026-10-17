package ish;

import android.os.Handler;
import android.os.Looper;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csh.b f168263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.f f168264b;

    public h(csh.b deprecatedWidgetsTypesAdapter, r10.f contentProvidersCache) {
        Intrinsics.checkNotNullParameter(deprecatedWidgetsTypesAdapter, "deprecatedWidgetsTypesAdapter");
        Intrinsics.checkNotNullParameter(contentProvidersCache, "contentProvidersCache");
        this.f168263a = deprecatedWidgetsTypesAdapter;
        this.f168264b = contentProvidersCache;
        new Handler(Looper.getMainLooper());
    }

    public final BaseDraggableWidgetDelegate.Model a(WidgetContext widgetContext, String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return e(widgetContext, widgetType).d(id10, widgetType, eVar);
    }

    public final dsh.j b(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return e(widgetContext, widgetType).h(widgetContext, widgetType, inputConfig);
    }

    public final csh.e c(WidgetContext widgetContext, String widgetType) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return d(widgetContext.getClass(), widgetType);
    }

    public final csh.e d(Class widgetContext, String str) {
        Object objPutIfAbsent;
        phm.a aVar;
        r10.f fVar = this.f168264b;
        String widgetType = this.f168263a.a(str);
        Intrinsics.checkNotNullParameter(widgetContext, "contextClass");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) fVar.c).get(widgetContext);
        csh.e eVar = null;
        csh.e eVar2 = concurrentHashMap != null ? (csh.e) concurrentHashMap.get(widgetType) : null;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (fVar) {
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) ((ConcurrentHashMap) fVar.c).get(widgetContext);
            csh.e eVar3 = concurrentHashMap2 != null ? (csh.e) concurrentHashMap2.get(widgetType) : null;
            if (eVar3 != null) {
                return eVar3;
            }
            dsh.h hVar = (dsh.h) fVar.b;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
            Object obj2 = hVar.f117322a.get(widgetContext);
            Map map = obj2 instanceof Map ? (Map) obj2 : null;
            if (map != null && (aVar = (phm.a) map.get(widgetType)) != null) {
                eVar = (csh.e) aVar.get();
            }
            if (eVar != null) {
                ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) fVar.c;
                Object concurrentHashMap4 = concurrentHashMap3.get(widgetContext);
                if (concurrentHashMap4 == null && (objPutIfAbsent = concurrentHashMap3.putIfAbsent(widgetContext, (concurrentHashMap4 = new ConcurrentHashMap()))) != null) {
                    concurrentHashMap4 = objPutIfAbsent;
                }
                ((ConcurrentHashMap) concurrentHashMap4).put(widgetType, eVar);
            }
            return eVar;
        }
    }

    public final csh.e e(WidgetContext widgetContext, String str) {
        csh.e eVarC = c(widgetContext, str);
        if (eVarC != null) {
            return eVarC;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r6, java.lang.Class r7, java.lang.String r8) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ish.d
            if (r0 == 0) goto L13
            r0 = r6
            ish.d r0 = (ish.d) r0
            int r1 = r0.f168256w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168256w = r1
            goto L18
        L13:
            ish.d r0 = new ish.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168256w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L42
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r6)
            csh.e r6 = r5.d(r7, r8)
            if (r6 == 0) goto L4b
            r0.f168256w = r4
            java.lang.Object r6 = r6.c(r8, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != r4) goto L4b
            r3 = r4
        L4b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ish.h.f(gim.c, java.lang.Class, java.lang.String):java.lang.Object");
    }

    public final boolean g(WidgetContext widgetContext, String widgetType) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return c(widgetContext, widgetType) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.widgets.api.dependencies.WidgetContext r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ish.e
            if (r0 == 0) goto L13
            r0 = r8
            ish.e r0 = (ish.e) r0
            int r1 = r0.f168257w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168257w = r1
            goto L18
        L13:
            ish.e r0 = new ish.e
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168257w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r8)
            goto L42
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r8)
            csh.e r8 = r5.c(r6, r7)
            if (r8 == 0) goto L4b
            r0.f168257w = r4
            java.lang.Object r8 = r8.e(r6, r7, r0)
            if (r8 != r1) goto L42
            return r1
        L42:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 != r4) goto L4b
            r3 = r4
        L4b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ish.h.h(com.revolut.feature.widgets.api.dependencies.WidgetContext, java.lang.String, gim.c):java.lang.Object");
    }
}
