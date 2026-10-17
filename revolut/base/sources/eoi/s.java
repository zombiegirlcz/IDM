package eoi;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import uo.p0;
import uo.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class s implements kz0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f127972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz0.a f127973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aoi.c f127974c;
    public final long d;
    public final uo.b e;
    public final p0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f127975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f127976h;
    public s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f127977j;

    public s(Activity activity, kz0.a dialog, aoi.c analyticsInteractor, long j2, uo.b activeScreenHolder, q0 screenNameFinder, c sessionMetricsAggregator, u screenNameProvider) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(sessionMetricsAggregator, "sessionMetricsAggregator");
        Intrinsics.checkNotNullParameter(screenNameProvider, "screenNameProvider");
        this.f127972a = activity;
        this.f127973b = dialog;
        this.f127974c = analyticsInteractor;
        this.d = j2;
        this.e = activeScreenHolder;
        this.f = screenNameFinder;
        this.f127975g = sessionMetricsAggregator;
        this.f127976h = screenNameProvider;
        dialog.b(this);
    }

    @Override // kz0.a
    public final efm.r a() {
        return this.f127973b.a();
    }

    @Override // kz0.a
    public final void b(s callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.i = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(kz0.h type) {
        Activity activity;
        Object screen;
        Intrinsics.checkNotNullParameter(type, "type");
        boolean z = type == kz0.h.FULLSCREEN;
        this.f127977j = z;
        if (z) {
            aoi.h hVarC = this.f127974c.c("FULL_SCREEN_LOADER_VISIBLE");
            hVarC.a("delayMilliseconds", String.valueOf(this.d));
            ArrayList arrayListB = this.e.b();
            int iJ = zhm.v.j(arrayListB);
            while (true) {
                activity = this.f127972a;
                if (-1 >= iJ) {
                    screen = null;
                    break;
                }
                screen = arrayListB.get(iJ);
                ((q0) this.f).getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                View viewK = rd0.e.k(screen);
                if (viewK != null) {
                    o.Companion.getClass();
                    if (m.b(activity, screen, viewK)) {
                        break;
                    }
                }
                iJ--;
            }
            if (screen != null) {
                activity = screen;
            }
            u uVar = this.f127976h;
            hVarC.a("screenName", uVar.b(activity));
            hVarC.a("analyticsScreenName", uVar.a(activity));
        }
        s sVar = this.i;
        if (sVar != null) {
            sVar.c(type);
        }
    }

    public final void d() {
        if (this.f127977j) {
            aoi.c cVar = this.f127974c;
            aoi.h hVarB = cVar.b("FULL_SCREEN_LOADER_VISIBLE");
            if (hVarB != null) {
                hVarB.a("stoppedByGoingToBackground", "false");
            }
            aoi.h hVarF = cVar.f("FULL_SCREEN_LOADER_VISIBLE");
            if (hVarF != null && hVarF.getDuration() >= 0) {
                long duration = hVarF.getDuration();
                ((c) this.f127975g).getClass();
                c.f++;
                c.f127922g += duration;
            }
        }
        s sVar = this.i;
        if (sVar != null) {
            sVar.d();
        }
    }

    @Override // kz0.a
    public final void dismiss() {
        this.f127973b.dismiss();
    }

    @Override // kz0.a
    public final void show() {
        this.f127973b.show();
    }
}
