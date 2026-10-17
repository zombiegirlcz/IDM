package akg;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.youTransactor.uCube.rpc.Constants;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements b {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f5950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f5951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ip.b f5952c;
    public final vjg.g d;
    public final n80.c e;
    public final mk0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z1 f5953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f5954h;
    public final w4l.f i;

    public o(ue0.c storage, ne0.j memoryCache, ip.b defaultUiConfiguration, vjg.g themeCatalog, n80.c metricsProvider, mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(defaultUiConfiguration, "defaultUiConfiguration");
        Intrinsics.checkNotNullParameter(themeCatalog, "themeCatalog");
        Intrinsics.checkNotNullParameter(metricsProvider, "metricsProvider");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f5950a = storage;
        this.f5951b = memoryCache;
        this.f5952c = defaultUiConfiguration;
        this.d = themeCatalog;
        this.e = metricsProvider;
        this.f = personalisationStorage;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f5953g = z1VarB;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: akg.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f5934b;

            {
                this.f5934b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        final int i2 = 1;
                        final o oVar = this.f5934b;
                        ufm.c cVar = new ufm.c(new Callable() { // from class: akg.c
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int iHeight;
                                m80.a aVar;
                                switch (i2) {
                                    case 0:
                                        o oVar2 = oVar;
                                        mk0.a aVar2 = oVar2.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_TAB_BAR_LABELS");
                                        Boolean bool = (Boolean) aVar2.a(new tk0.b("HIDE_TAB_BAR_LABELS"));
                                        if (bool == null) {
                                            bool = (Boolean) oVar2.f5950a.T2("HIDE_TAB_BAR_LABELS", Boolean.TYPE);
                                        }
                                        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                                    default:
                                        o oVar3 = oVar;
                                        mk0.a aVar3 = oVar3.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_BOTTOM_BAR_ON_SCROLL");
                                        Boolean bool2 = (Boolean) aVar3.a(new tk0.b("HIDE_BOTTOM_BAR_ON_SCROLL"));
                                        if (bool2 == null) {
                                            bool2 = (Boolean) oVar3.f5950a.T2("HIDE_BOTTOM_BAR", Boolean.TYPE);
                                        }
                                        if (bool2 != null) {
                                            return bool2;
                                        }
                                        n80.c cVar2 = oVar3.e;
                                        Activity activityC = h80.c.c();
                                        if (activityC == null) {
                                            aVar = m80.a.NORMAL;
                                        } else {
                                            WindowManager windowManager = activityC.getWindowManager();
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                                            } else {
                                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                                                iHeight = displayMetrics.heightPixels;
                                            }
                                            aVar = iHeight <= kli.a.k(cVar2.f213184a, 640.0f) ? m80.a.SMALL : m80.a.NORMAL;
                                        }
                                        return Boolean.valueOf(h.f5937a[aVar.ordinal()] == 1);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 1:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f5934b.f5951b.f("HIDE_BOTTOM_BAR", bool);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        final int i3 = 0;
                        final o oVar2 = this.f5934b;
                        ufm.c cVar2 = new ufm.c(new Callable() { // from class: akg.c
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int iHeight;
                                m80.a aVar;
                                switch (i3) {
                                    case 0:
                                        o oVar22 = oVar2;
                                        mk0.a aVar2 = oVar22.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_TAB_BAR_LABELS");
                                        Boolean bool2 = (Boolean) aVar2.a(new tk0.b("HIDE_TAB_BAR_LABELS"));
                                        if (bool2 == null) {
                                            bool2 = (Boolean) oVar22.f5950a.T2("HIDE_TAB_BAR_LABELS", Boolean.TYPE);
                                        }
                                        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                                    default:
                                        o oVar3 = oVar2;
                                        mk0.a aVar3 = oVar3.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_BOTTOM_BAR_ON_SCROLL");
                                        Boolean bool22 = (Boolean) aVar3.a(new tk0.b("HIDE_BOTTOM_BAR_ON_SCROLL"));
                                        if (bool22 == null) {
                                            bool22 = (Boolean) oVar3.f5950a.T2("HIDE_BOTTOM_BAR", Boolean.TYPE);
                                        }
                                        if (bool22 != null) {
                                            return bool22;
                                        }
                                        n80.c cVar22 = oVar3.e;
                                        Activity activityC = h80.c.c();
                                        if (activityC == null) {
                                            aVar = m80.a.NORMAL;
                                        } else {
                                            WindowManager windowManager = activityC.getWindowManager();
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                                            } else {
                                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                                                iHeight = displayMetrics.heightPixels;
                                            }
                                            aVar = iHeight <= kli.a.k(cVar22.f213184a, 640.0f) ? m80.a.SMALL : m80.a.NORMAL;
                                        }
                                        return Boolean.valueOf(h.f5937a[aVar.ordinal()] == 1);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                        return cVar2;
                    default:
                        Boolean bool2 = (Boolean) obj3;
                        bool2.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f5934b.f5951b.f("HIDE_TAB_BAR_LABELS", bool2);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: akg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f5936b;

            {
                this.f5936b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Boolean) this.f5936b.f5951b.get("HIDE_BOTTOM_BAR");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Boolean) this.f5936b.f5951b.get("HIDE_TAB_BAR_LABELS");
                }
            }
        };
        final int i2 = 1;
        this.f5954h = new w4l.f(function2, function1, new Function2(this) { // from class: akg.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f5934b;

            {
                this.f5934b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        final int i22 = 1;
                        final o oVar = this.f5934b;
                        ufm.c cVar = new ufm.c(new Callable() { // from class: akg.c
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int iHeight;
                                m80.a aVar;
                                switch (i22) {
                                    case 0:
                                        o oVar22 = oVar;
                                        mk0.a aVar2 = oVar22.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_TAB_BAR_LABELS");
                                        Boolean bool2 = (Boolean) aVar2.a(new tk0.b("HIDE_TAB_BAR_LABELS"));
                                        if (bool2 == null) {
                                            bool2 = (Boolean) oVar22.f5950a.T2("HIDE_TAB_BAR_LABELS", Boolean.TYPE);
                                        }
                                        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                                    default:
                                        o oVar3 = oVar;
                                        mk0.a aVar3 = oVar3.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_BOTTOM_BAR_ON_SCROLL");
                                        Boolean bool22 = (Boolean) aVar3.a(new tk0.b("HIDE_BOTTOM_BAR_ON_SCROLL"));
                                        if (bool22 == null) {
                                            bool22 = (Boolean) oVar3.f5950a.T2("HIDE_BOTTOM_BAR", Boolean.TYPE);
                                        }
                                        if (bool22 != null) {
                                            return bool22;
                                        }
                                        n80.c cVar22 = oVar3.e;
                                        Activity activityC = h80.c.c();
                                        if (activityC == null) {
                                            aVar = m80.a.NORMAL;
                                        } else {
                                            WindowManager windowManager = activityC.getWindowManager();
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                                            } else {
                                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                                                iHeight = displayMetrics.heightPixels;
                                            }
                                            aVar = iHeight <= kli.a.k(cVar22.f213184a, 640.0f) ? m80.a.SMALL : m80.a.NORMAL;
                                        }
                                        return Boolean.valueOf(h.f5937a[aVar.ordinal()] == 1);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 1:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f5934b.f5951b.f("HIDE_BOTTOM_BAR", bool);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        final int i3 = 0;
                        final o oVar2 = this.f5934b;
                        ufm.c cVar2 = new ufm.c(new Callable() { // from class: akg.c
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int iHeight;
                                m80.a aVar;
                                switch (i3) {
                                    case 0:
                                        o oVar22 = oVar2;
                                        mk0.a aVar2 = oVar22.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_TAB_BAR_LABELS");
                                        Boolean bool2 = (Boolean) aVar2.a(new tk0.b("HIDE_TAB_BAR_LABELS"));
                                        if (bool2 == null) {
                                            bool2 = (Boolean) oVar22.f5950a.T2("HIDE_TAB_BAR_LABELS", Boolean.TYPE);
                                        }
                                        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                                    default:
                                        o oVar3 = oVar2;
                                        mk0.a aVar3 = oVar3.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_BOTTOM_BAR_ON_SCROLL");
                                        Boolean bool22 = (Boolean) aVar3.a(new tk0.b("HIDE_BOTTOM_BAR_ON_SCROLL"));
                                        if (bool22 == null) {
                                            bool22 = (Boolean) oVar3.f5950a.T2("HIDE_BOTTOM_BAR", Boolean.TYPE);
                                        }
                                        if (bool22 != null) {
                                            return bool22;
                                        }
                                        n80.c cVar22 = oVar3.e;
                                        Activity activityC = h80.c.c();
                                        if (activityC == null) {
                                            aVar = m80.a.NORMAL;
                                        } else {
                                            WindowManager windowManager = activityC.getWindowManager();
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                                            } else {
                                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                                                iHeight = displayMetrics.heightPixels;
                                            }
                                            aVar = iHeight <= kli.a.k(cVar22.f213184a, 640.0f) ? m80.a.SMALL : m80.a.NORMAL;
                                        }
                                        return Boolean.valueOf(h.f5937a[aVar.ordinal()] == 1);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                        return cVar2;
                    default:
                        Boolean bool2 = (Boolean) obj3;
                        bool2.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f5934b.f5951b.f("HIDE_TAB_BAR_LABELS", bool2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i3 = 2;
        Function2 function22 = new Function2(this) { // from class: akg.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f5934b;

            {
                this.f5934b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        final int i22 = 1;
                        final o oVar = this.f5934b;
                        ufm.c cVar = new ufm.c(new Callable() { // from class: akg.c
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int iHeight;
                                m80.a aVar;
                                switch (i22) {
                                    case 0:
                                        o oVar22 = oVar;
                                        mk0.a aVar2 = oVar22.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_TAB_BAR_LABELS");
                                        Boolean bool2 = (Boolean) aVar2.a(new tk0.b("HIDE_TAB_BAR_LABELS"));
                                        if (bool2 == null) {
                                            bool2 = (Boolean) oVar22.f5950a.T2("HIDE_TAB_BAR_LABELS", Boolean.TYPE);
                                        }
                                        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                                    default:
                                        o oVar3 = oVar;
                                        mk0.a aVar3 = oVar3.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_BOTTOM_BAR_ON_SCROLL");
                                        Boolean bool22 = (Boolean) aVar3.a(new tk0.b("HIDE_BOTTOM_BAR_ON_SCROLL"));
                                        if (bool22 == null) {
                                            bool22 = (Boolean) oVar3.f5950a.T2("HIDE_BOTTOM_BAR", Boolean.TYPE);
                                        }
                                        if (bool22 != null) {
                                            return bool22;
                                        }
                                        n80.c cVar22 = oVar3.e;
                                        Activity activityC = h80.c.c();
                                        if (activityC == null) {
                                            aVar = m80.a.NORMAL;
                                        } else {
                                            WindowManager windowManager = activityC.getWindowManager();
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                                            } else {
                                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                                                iHeight = displayMetrics.heightPixels;
                                            }
                                            aVar = iHeight <= kli.a.k(cVar22.f213184a, 640.0f) ? m80.a.SMALL : m80.a.NORMAL;
                                        }
                                        return Boolean.valueOf(h.f5937a[aVar.ordinal()] == 1);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 1:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f5934b.f5951b.f("HIDE_BOTTOM_BAR", bool);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        final int i32 = 0;
                        final o oVar2 = this.f5934b;
                        ufm.c cVar2 = new ufm.c(new Callable() { // from class: akg.c
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int iHeight;
                                m80.a aVar;
                                switch (i32) {
                                    case 0:
                                        o oVar22 = oVar2;
                                        mk0.a aVar2 = oVar22.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_TAB_BAR_LABELS");
                                        Boolean bool2 = (Boolean) aVar2.a(new tk0.b("HIDE_TAB_BAR_LABELS"));
                                        if (bool2 == null) {
                                            bool2 = (Boolean) oVar22.f5950a.T2("HIDE_TAB_BAR_LABELS", Boolean.TYPE);
                                        }
                                        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                                    default:
                                        o oVar3 = oVar2;
                                        mk0.a aVar3 = oVar3.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_BOTTOM_BAR_ON_SCROLL");
                                        Boolean bool22 = (Boolean) aVar3.a(new tk0.b("HIDE_BOTTOM_BAR_ON_SCROLL"));
                                        if (bool22 == null) {
                                            bool22 = (Boolean) oVar3.f5950a.T2("HIDE_BOTTOM_BAR", Boolean.TYPE);
                                        }
                                        if (bool22 != null) {
                                            return bool22;
                                        }
                                        n80.c cVar22 = oVar3.e;
                                        Activity activityC = h80.c.c();
                                        if (activityC == null) {
                                            aVar = m80.a.NORMAL;
                                        } else {
                                            WindowManager windowManager = activityC.getWindowManager();
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                                            } else {
                                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                                                iHeight = displayMetrics.heightPixels;
                                            }
                                            aVar = iHeight <= kli.a.k(cVar22.f213184a, 640.0f) ? m80.a.SMALL : m80.a.NORMAL;
                                        }
                                        return Boolean.valueOf(h.f5937a[aVar.ordinal()] == 1);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                        return cVar2;
                    default:
                        Boolean bool2 = (Boolean) obj3;
                        bool2.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f5934b.f5951b.f("HIDE_TAB_BAR_LABELS", bool2);
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 1;
        Function1 function12 = new Function1(this) { // from class: akg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f5936b;

            {
                this.f5936b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Boolean) this.f5936b.f5951b.get("HIDE_BOTTOM_BAR");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (Boolean) this.f5936b.f5951b.get("HIDE_TAB_BAR_LABELS");
                }
            }
        };
        final int i6 = 3;
        this.i = new w4l.f(function22, function12, new Function2(this) { // from class: akg.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f5934b;

            {
                this.f5934b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        final int i22 = 1;
                        final o oVar = this.f5934b;
                        ufm.c cVar = new ufm.c(new Callable() { // from class: akg.c
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int iHeight;
                                m80.a aVar;
                                switch (i22) {
                                    case 0:
                                        o oVar22 = oVar;
                                        mk0.a aVar2 = oVar22.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_TAB_BAR_LABELS");
                                        Boolean bool2 = (Boolean) aVar2.a(new tk0.b("HIDE_TAB_BAR_LABELS"));
                                        if (bool2 == null) {
                                            bool2 = (Boolean) oVar22.f5950a.T2("HIDE_TAB_BAR_LABELS", Boolean.TYPE);
                                        }
                                        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                                    default:
                                        o oVar3 = oVar;
                                        mk0.a aVar3 = oVar3.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_BOTTOM_BAR_ON_SCROLL");
                                        Boolean bool22 = (Boolean) aVar3.a(new tk0.b("HIDE_BOTTOM_BAR_ON_SCROLL"));
                                        if (bool22 == null) {
                                            bool22 = (Boolean) oVar3.f5950a.T2("HIDE_BOTTOM_BAR", Boolean.TYPE);
                                        }
                                        if (bool22 != null) {
                                            return bool22;
                                        }
                                        n80.c cVar22 = oVar3.e;
                                        Activity activityC = h80.c.c();
                                        if (activityC == null) {
                                            aVar = m80.a.NORMAL;
                                        } else {
                                            WindowManager windowManager = activityC.getWindowManager();
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                                            } else {
                                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                                                iHeight = displayMetrics.heightPixels;
                                            }
                                            aVar = iHeight <= kli.a.k(cVar22.f213184a, 640.0f) ? m80.a.SMALL : m80.a.NORMAL;
                                        }
                                        return Boolean.valueOf(h.f5937a[aVar.ordinal()] == 1);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 1:
                        Boolean bool = (Boolean) obj3;
                        bool.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f5934b.f5951b.f("HIDE_BOTTOM_BAR", bool);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it9, "it");
                        final int i32 = 0;
                        final o oVar2 = this.f5934b;
                        ufm.c cVar2 = new ufm.c(new Callable() { // from class: akg.c
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int iHeight;
                                m80.a aVar;
                                switch (i32) {
                                    case 0:
                                        o oVar22 = oVar2;
                                        mk0.a aVar2 = oVar22.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_TAB_BAR_LABELS");
                                        Boolean bool2 = (Boolean) aVar2.a(new tk0.b("HIDE_TAB_BAR_LABELS"));
                                        if (bool2 == null) {
                                            bool2 = (Boolean) oVar22.f5950a.T2("HIDE_TAB_BAR_LABELS", Boolean.TYPE);
                                        }
                                        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                                    default:
                                        o oVar3 = oVar2;
                                        mk0.a aVar3 = oVar3.f;
                                        o.Companion.getClass();
                                        tk0.b.b("HIDE_BOTTOM_BAR_ON_SCROLL");
                                        Boolean bool22 = (Boolean) aVar3.a(new tk0.b("HIDE_BOTTOM_BAR_ON_SCROLL"));
                                        if (bool22 == null) {
                                            bool22 = (Boolean) oVar3.f5950a.T2("HIDE_BOTTOM_BAR", Boolean.TYPE);
                                        }
                                        if (bool22 != null) {
                                            return bool22;
                                        }
                                        n80.c cVar22 = oVar3.e;
                                        Activity activityC = h80.c.c();
                                        if (activityC == null) {
                                            aVar = m80.a.NORMAL;
                                        } else {
                                            WindowManager windowManager = activityC.getWindowManager();
                                            if (Build.VERSION.SDK_INT >= 30) {
                                                iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
                                            } else {
                                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                                                iHeight = displayMetrics.heightPixels;
                                            }
                                            aVar = iHeight <= kli.a.k(cVar22.f213184a, 640.0f) ? m80.a.SMALL : m80.a.NORMAL;
                                        }
                                        return Boolean.valueOf(h.f5937a[aVar.ordinal()] == 1);
                                }
                            }
                        }, 2);
                        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                        return cVar2;
                    default:
                        Boolean bool2 = (Boolean) obj3;
                        bool2.booleanValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f5934b.f5951b.f("HIDE_TAB_BAR_LABELS", bool2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dkg.a a(java.util.Map r6) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akg.o.a(java.util.Map):dkg.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof akg.k
            if (r0 == 0) goto L13
            r0 = r7
            akg.k r0 = (akg.k) r0
            int r1 = r0.f5942x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5942x = r1
            goto L18
        L13:
            akg.k r0 = new akg.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5942x
            java.lang.String r3 = "HIDE_TAB_BAR_LABELS"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            boolean r6 = r0.u
            yhm.o.b(r7)
            goto L53
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            akg.g r7 = akg.o.Companion
            r7.getClass()
            tk0.b.b(r3)
            tk0.b r7 = tk0.b.a(r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r0.u = r6
            r0.f5942x = r4
            mk0.a r4 = r5.f
            java.lang.Object r7 = r4.e(r7, r2, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            ue0.c r1 = r5.f5950a
            com.revolut.data.database.models.openbanking.d.D(r0, r1, r3, r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            w4l.f r0 = r5.i
            r0.k(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: akg.o.b(boolean, gim.c):java.lang.Object");
    }
}
