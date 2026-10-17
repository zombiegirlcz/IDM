package bsi;

import a08.f0;
import ag.j;
import akl.s;
import androidx.appcompat.app.AppCompatActivity;
import b9i.h;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.r;
import io.f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import sri.l;
import sri.m;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends pri.d implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f18206c;
    public final asi.d d;
    public final yri.a e;
    public final p1b.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final om0.b f18207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zm0.b f18208h;
    public final io.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kji.b f18209j;
    public Boolean k;

    public d(m navigator, asi.d userSessionInteractor, yri.a screensInteractor, p1b.b naviCommandsProvider, om0.b inactivityTimer, zm0.b sessionController, io.c appStartupTracker) {
        kji.b kompotWallpaperHostFinder = new kji.b();
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        Intrinsics.checkNotNullParameter(screensInteractor, "screensInteractor");
        Intrinsics.checkNotNullParameter(naviCommandsProvider, "naviCommandsProvider");
        Intrinsics.checkNotNullParameter(inactivityTimer, "inactivityTimer");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Intrinsics.checkNotNullParameter(appStartupTracker, "appStartupTracker");
        Intrinsics.checkNotNullParameter(kompotWallpaperHostFinder, "kompotWallpaperHostFinder");
        this.f18206c = navigator;
        this.d = userSessionInteractor;
        this.e = screensInteractor;
        this.f = naviCommandsProvider;
        this.f18207g = inactivityTimer;
        this.f18208h = sessionController;
        this.i = appStartupTracker;
        this.f18209j = kompotWallpaperHostFinder;
    }

    @Override // pri.f
    public final boolean C(Object obj2) {
        rri.a view = (rri.a) obj2;
        Intrinsics.checkNotNullParameter(view, "view");
        if ((view instanceof dri.a) && !((dri.a) view).D0()) {
            return true;
        }
        this.f18206c.d(this);
        Boolean bool = this.k;
        if (bool == null) {
            asi.c cVarA = this.d.a();
            Boolean boolValueOf = Boolean.valueOf(jh.d.h(cVarA));
            NaviCommand naviCommandA = this.f.a(cVarA);
            if (cVarA == asi.c.EXIST) {
                r map = this.f18207g.f226491b.map(new j(new s(this, 4), 3));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                b bVar = new b(this, view, 0);
                r rVarOnErrorResumeNext = map.onErrorResumeNext(new zjh.c(new h(new BreadcrumbException(), 14)));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new f0(1, bVar), new f0(1, c.f18205a));
                Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
                Intrinsics.checkNotNullParameter(cVarSubscribe, "<this>");
                this.f239036b.a(cVarSubscribe);
            }
            if (!(naviCommandA instanceof DummyCommand)) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "AuthorizedPresenterDelegate", a0.d.s("User session is in ", cVarA.name(), " and naviCommandsProvider returns ", o0.f186429a.b(naviCommandA.getClass()).m()), null, null, 16);
            }
            if (cVarA == asi.c.UNAUTHORIZED) {
                ((f) this.i).d = true;
            }
            if (cVarA == asi.c.EXPIRED || cVarA == asi.c.ABSENT) {
                naviCommandA = a(naviCommandA, view);
            }
            this.f18206c.c(naviCommandA);
            this.k = boolValueOf;
            bool = boolValueOf;
        }
        return bool.booleanValue();
    }

    @Override // pri.d, pri.f
    public final void I() {
        super.I();
        this.k = null;
        this.f18206c.e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final NaviCommand a(NaviCommand naviCommand, rri.a aVar) {
        com.revolut.kompot.navigable.a aVarA;
        if (!(naviCommand instanceof ActivityNavigateCommand) || !(aVar instanceof AppCompatActivity)) {
            return naviCommand;
        }
        ActivityNavigateCommand activityNavigateCommand = (ActivityNavigateCommand) naviCommand;
        AppCompatActivity activity = (AppCompatActivity) aVar;
        this.f18209j.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        kji.d.Companion.getClass();
        kji.d dVarA = kji.c.a(activity);
        if (dVarA != null && (aVarA = dVarA.a()) != null) {
            aVarA.D2().isAttachedToWindow();
        }
        LinkedHashMap linkedHashMapN = r0.n(new Pair("WALLPAPER_MODEL_EXTRAS_KEY", null));
        Map mapG = activityNavigateCommand.f98620c;
        if (mapG == null) {
            mapG = r0.g();
        }
        linkedHashMapN.putAll(mapG);
        Unit unit = Unit.f186387a;
        return ActivityNavigateCommand.a(activityNavigateCommand, linkedHashMapN, 0, 1019);
    }

    @Override // sri.l
    public final void c(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if ((command instanceof ActivityNavigateCommand) && (((ActivityNavigateCommand) command).f98618a instanceof ImplicitActivityDestination)) {
            this.e.b(true);
        }
    }
}
