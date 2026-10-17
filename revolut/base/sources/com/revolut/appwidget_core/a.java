package com.revolut.appwidget_core;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.CompositionLocalsKt;
import androidx.glance.GlanceId;
import androidx.glance.appwidget.GlanceAppWidget;
import androidx.glance.appwidget.GlanceAppWidgetKt;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import b9.e;
import com.revolut.appwidget_core.a;
import fq.c;
import k01.p;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rim.d;
import vkm.j2;
import vkm.q;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends GlanceAppWidget {

    @NotNull
    public static final C0392a Companion = new C0392a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j2 f50366g = q.c(c.INITIALIZED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Context f50367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile jq.c f50368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f50369c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: com.revolut.appwidget_core.a$a, reason: collision with other inner class name */
    public static final class C0392a {
        private C0392a() {
        }
    }

    public a() {
        super(0, 1, null);
        final int i = 0;
        this.f50369c = j.b(new Function0(this) { // from class: fq.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.appwidget_core.a f137136b;

            {
                this.f137136b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                com.revolut.appwidget_core.a aVar = this.f137136b;
                switch (i2) {
                    case 0:
                        a.C0392a c0392a = com.revolut.appwidget_core.a.Companion;
                        phm.a aVar2 = (phm.a) ue0.e.j(aVar.f()).a().get(l70.e.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return new k01.d(aVar.f(), ((l70.e) aVar3.b()).m());
                        }
                        throw new IllegalStateException(a0.d.q("Api ", l70.e.class, " is not found"));
                    case 1:
                        a.C0392a c0392a2 = com.revolut.appwidget_core.a.Companion;
                        return new k01.l(aVar.f());
                    case 2:
                        a.C0392a c0392a3 = com.revolut.appwidget_core.a.Companion;
                        return new GlanceAppWidgetManager(aVar.f());
                    default:
                        a.C0392a c0392a4 = com.revolut.appwidget_core.a.Companion;
                        return new p(aVar.f());
                }
            }
        });
        final int i2 = 1;
        this.d = j.b(new Function0(this) { // from class: fq.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.appwidget_core.a f137136b;

            {
                this.f137136b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                com.revolut.appwidget_core.a aVar = this.f137136b;
                switch (i22) {
                    case 0:
                        a.C0392a c0392a = com.revolut.appwidget_core.a.Companion;
                        phm.a aVar2 = (phm.a) ue0.e.j(aVar.f()).a().get(l70.e.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return new k01.d(aVar.f(), ((l70.e) aVar3.b()).m());
                        }
                        throw new IllegalStateException(a0.d.q("Api ", l70.e.class, " is not found"));
                    case 1:
                        a.C0392a c0392a2 = com.revolut.appwidget_core.a.Companion;
                        return new k01.l(aVar.f());
                    case 2:
                        a.C0392a c0392a3 = com.revolut.appwidget_core.a.Companion;
                        return new GlanceAppWidgetManager(aVar.f());
                    default:
                        a.C0392a c0392a4 = com.revolut.appwidget_core.a.Companion;
                        return new p(aVar.f());
                }
            }
        });
        final int i3 = 2;
        this.e = j.b(new Function0(this) { // from class: fq.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.appwidget_core.a f137136b;

            {
                this.f137136b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                com.revolut.appwidget_core.a aVar = this.f137136b;
                switch (i22) {
                    case 0:
                        a.C0392a c0392a = com.revolut.appwidget_core.a.Companion;
                        phm.a aVar2 = (phm.a) ue0.e.j(aVar.f()).a().get(l70.e.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return new k01.d(aVar.f(), ((l70.e) aVar3.b()).m());
                        }
                        throw new IllegalStateException(a0.d.q("Api ", l70.e.class, " is not found"));
                    case 1:
                        a.C0392a c0392a2 = com.revolut.appwidget_core.a.Companion;
                        return new k01.l(aVar.f());
                    case 2:
                        a.C0392a c0392a3 = com.revolut.appwidget_core.a.Companion;
                        return new GlanceAppWidgetManager(aVar.f());
                    default:
                        a.C0392a c0392a4 = com.revolut.appwidget_core.a.Companion;
                        return new p(aVar.f());
                }
            }
        });
        final int i5 = 3;
        this.f = j.b(new Function0(this) { // from class: fq.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.appwidget_core.a f137136b;

            {
                this.f137136b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                com.revolut.appwidget_core.a aVar = this.f137136b;
                switch (i22) {
                    case 0:
                        a.C0392a c0392a = com.revolut.appwidget_core.a.Companion;
                        phm.a aVar2 = (phm.a) ue0.e.j(aVar.f()).a().get(l70.e.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 != null) {
                            return new k01.d(aVar.f(), ((l70.e) aVar3.b()).m());
                        }
                        throw new IllegalStateException(a0.d.q("Api ", l70.e.class, " is not found"));
                    case 1:
                        a.C0392a c0392a2 = com.revolut.appwidget_core.a.Companion;
                        return new k01.l(aVar.f());
                    case 2:
                        a.C0392a c0392a3 = com.revolut.appwidget_core.a.Companion;
                        return new GlanceAppWidgetManager(aVar.f());
                    default:
                        a.C0392a c0392a4 = com.revolut.appwidget_core.a.Companion;
                        return new p(aVar.f());
                }
            }
        });
    }

    public static e a(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457449707, 0, -1, "com.revolut.appwidget_core.AppWidget.WidgetSpec (AppWidget.kt:165)");
        }
        long packedValue = ((DpSize) composer.consume(CompositionLocalsKt.getLocalSize())).getPackedValue();
        e eVar = new e(d.c(DpSize.m3322getWidthD9Ej5fM(packedValue)), d.c(DpSize.m3321getHeightD9Ej5fM(packedValue)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        if (androidx.glance.appwidget.GlanceAppWidgetKt.provideContent(r6, r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final fim.a b(com.revolut.appwidget_core.a r6, jq.a r7, android.content.Context r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof fq.l
            if (r0 == 0) goto L13
            r0 = r9
            fq.l r0 = (fq.l) r0
            int r1 = r0.f137158x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137158x = r1
            goto L18
        L13:
            fq.l r0 = new fq.l
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137158x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 == r3) goto L2f
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r9)
            goto Laf
        L34:
            p01.u r7 = r0.u
            yhm.o.b(r9)
            goto L96
        L3a:
            yhm.o.b(r9)
            jq.c r9 = r6.f50368b
            if (r9 != 0) goto L7b
            java.lang.Class<iq.b> r9 = iq.b.class
            java.lang.Object r8 = j6.a.i(r8, r9)
            phm.a r8 = (phm.a) r8
            if (r8 == 0) goto L52
            java.lang.Object r8 = r8.get()
            b60.a r8 = (b60.a) r8
            goto L53
        L52:
            r8 = r5
        L53:
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r8.b()
            java.lang.String r9 = "null cannot be cast to non-null type com.revolut.appwidget_core.di.AppWidgetCoreComponent"
            kotlin.jvm.internal.Intrinsics.i(r8, r9)
            iq.b r8 = (iq.b) r8
            jq.c r9 = new jq.c
            android.content.Context r2 = r8.d
            iq.g r8 = r8.i
            r9.<init>(r2, r8)
            r6.f50368b = r9
            goto L7b
        L6d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Api "
            java.lang.String r8 = " is not found"
            java.lang.String r7 = a0.d.q(r7, r9, r8)
            r6.<init>(r7)
            throw r6
        L7b:
            jq.c r8 = r6.f50368b
            if (r8 == 0) goto Lb5
            p01.u r7 = r8.a(r7)
            kotlin.Lazy r8 = r6.d
            java.lang.Object r8 = r8.getValue()
            k01.l r8 = (k01.l) r8
            r0.u = r7
            r0.f137158x = r4
            java.lang.Object r9 = r8.a(r7, r0)
            if (r9 != r1) goto L96
            goto Lae
        L96:
            k01.n r9 = (k01.n) r9
            fq.b r8 = new fq.b
            r8.<init>(r6, r7, r9)
            r7 = 1610095792(0x5ff81cb0, float:3.5756716E19)
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r7, r4, r8)
            r0.u = r5
            r0.f137158x = r3
            java.lang.Object r6 = androidx.glance.appwidget.GlanceAppWidgetKt.provideContent(r6, r7, r0)
            if (r6 != r1) goto Laf
        Lae:
            return r1
        Laf:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        Lb5:
            java.lang.String r6 = "onboardingMapper"
            kotlin.jvm.internal.Intrinsics.r(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.appwidget_core.a.b(com.revolut.appwidget_core.a, jq.a, android.content.Context, gim.c):fim.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final fim.a c(kotlinx.coroutines.flow.Flow r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof fq.d
            if (r0 == 0) goto L13
            r0 = r6
            fq.d r0 = (fq.d) r0
            int r1 = r0.f137140w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137140w = r1
            goto L18
        L13:
            fq.d r0 = new fq.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137140w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            yhm.o.b(r6)
            goto L41
        L2f:
            yhm.o.b(r6)
            fq.g r6 = new fq.g
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.f137140w = r3
            java.lang.Object r5 = skm.e0.o(r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.appwidget_core.a.c(kotlinx.coroutines.flow.Flow, gim.c):fim.a");
    }

    public Object d(Context context, gq.a aVar) {
        Object objUpdateAll = GlanceAppWidgetKt.updateAll(this, context, aVar);
        return objUpdateAll == fim.a.COROUTINE_SUSPENDED ? objUpdateAll : Unit.f186387a;
    }

    public abstract String e();

    public final Context f() {
        Context context = this.f50367a;
        if (context != null) {
            return context;
        }
        Intrinsics.r("applicationContext");
        throw null;
    }

    public abstract r1e.b g(Context context);

    public abstract Class h();

    public abstract Object i(Context context, GlanceId glanceId, fq.j jVar);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        if (r6 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.glance.appwidget.GlanceAppWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onDelete(android.content.Context r6, androidx.glance.GlanceId r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof fq.h
            if (r0 == 0) goto L13
            r0 = r8
            fq.h r0 = (fq.h) r0
            int r1 = r0.f137151y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137151y = r1
            goto L18
        L13:
            fq.h r0 = new fq.h
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f137149w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137151y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto Lb3
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            androidx.glance.GlanceId r7 = r0.v
            android.content.Context r6 = r0.u
            yhm.o.b(r8)
            goto L4b
        L3b:
            yhm.o.b(r8)
            r0.u = r6
            r0.v = r7
            r0.f137151y = r4
            java.lang.Object r8 = super.onDelete(r6, r7, r0)
            if (r8 != r1) goto L4b
            goto Lb2
        L4b:
            android.content.Context r8 = r5.f50367a
            if (r8 != 0) goto L5f
            android.content.Context r8 = r6.getApplicationContext()
            java.lang.String r2 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            java.lang.String r2 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            r5.f50367a = r8
        L5f:
            java.lang.Class<iq.b> r8 = iq.b.class
            java.lang.Object r6 = j6.a.i(r6, r8)
            phm.a r6 = (phm.a) r6
            r2 = 0
            if (r6 == 0) goto L71
            java.lang.Object r6 = r6.get()
            b60.a r6 = (b60.a) r6
            goto L72
        L71:
            r6 = r2
        L72:
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r6.b()
            iq.b r6 = (iq.b) r6
            e4m.e r6 = r6.f167779n
            java.lang.Object r6 = r6.get()
            kq.h r6 = (kq.h) r6
            kotlin.Lazy r8 = r5.e
            java.lang.Object r8 = r8.getValue()
            androidx.glance.appwidget.GlanceAppWidgetManager r8 = (androidx.glance.appwidget.GlanceAppWidgetManager) r8
            int r7 = r8.getAppWidgetId(r7)
            int[] r7 = new int[]{r7}
            r0.u = r2
            r0.v = r2
            r0.f137151y = r3
            boolean r8 = r6.f()
            if (r8 != 0) goto La1
            kotlin.Unit r6 = kotlin.Unit.f186387a
            goto Lb0
        La1:
            kpi.b r8 = new kpi.b
            r2 = 1
            r8.<init>(r7, r2)
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto Lae
            goto Lb0
        Lae:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        Lb0:
            if (r6 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        Lb6:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Api "
            java.lang.String r0 = " is not found"
            java.lang.String r7 = a0.d.q(r7, r8, r0)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.appwidget_core.a.onDelete(android.content.Context, androidx.glance.GlanceId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.glance.appwidget.GlanceAppWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object provideGlance(android.content.Context r6, androidx.glance.GlanceId r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof fq.i
            if (r0 == 0) goto L13
            r0 = r8
            fq.i r0 = (fq.i) r0
            int r1 = r0.f137152w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137152w = r1
            goto L18
        L13:
            fq.i r0 = new fq.i
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f137152w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L4c
        L28:
            r6 = move-exception
            goto L4f
        L2a:
            r6 = move-exception
            goto L6a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r8)
            r0.f137152w = r3     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            elm.g r8 = skm.p0.f264002b     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            com.revolut.appwidget_core.b r2 = new com.revolut.appwidget_core.b     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r2.<init>(r5, r6, r7, r4)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r6 = skm.e0.J(r8, r2, r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            if (r6 != r1) goto L47
            goto L49
        L47:
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
        L49:
            if (r6 != r1) goto L4c
            return r1
        L4c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L4f:
            com.revolut.appwidget_core.AppWidgetException r7 = new com.revolut.appwidget_core.AppWidgetException
            java.lang.Class r8 = r5.h()
            java.lang.String r0 = "Failed to provide glance widget["
            java.lang.String r1 = "]"
            java.lang.String r8 = a0.d.q(r0, r8, r1)
            r7.<init>(r8, r6)
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r7, r8)
            throw r6
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.appwidget_core.a.provideGlance(android.content.Context, androidx.glance.GlanceId, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
