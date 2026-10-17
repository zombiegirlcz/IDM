package lwl;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import ish.a0;
import java.util.concurrent.CopyOnWriteArrayList;
import km2.u;
import km2.v;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();
    public static volatile boolean k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zfe.b f200484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cm2.f f200485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q30.i f200486c;
    public final ij0.a d;
    public final zd0.b e;
    public final yii.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rn0.b f200487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ekg.g f200488h;
    public final a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kgm.i f200489j;

    public e(zfe.b accountsPresentationPrefetcher, cm2.f backgroundsLoader, q30.i chatIntroPrefetcher, ij0.a coreNetworkConfiguration, zd0.b currencyInfoInitializer, phi.a kompotBridgeStorageApiDependency, yii.c persistentModelStateStorage, rn0.b startupPreferencesInteractor, ekg.g uiPersonalisationInteractor, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(accountsPresentationPrefetcher, "accountsPresentationPrefetcher");
        Intrinsics.checkNotNullParameter(backgroundsLoader, "backgroundsLoader");
        Intrinsics.checkNotNullParameter(chatIntroPrefetcher, "chatIntroPrefetcher");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(currencyInfoInitializer, "currencyInfoInitializer");
        Intrinsics.checkNotNullParameter(kompotBridgeStorageApiDependency, "kompotBridgeStorageApiDependency");
        Intrinsics.checkNotNullParameter(persistentModelStateStorage, "persistentModelStateStorage");
        Intrinsics.checkNotNullParameter(startupPreferencesInteractor, "startupPreferencesInteractor");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f200484a = accountsPresentationPrefetcher;
        this.f200485b = backgroundsLoader;
        this.f200486c = chatIntroPrefetcher;
        this.d = coreNetworkConfiguration;
        this.e = currencyInfoInitializer;
        this.f = persistentModelStateStorage;
        this.f200487g = startupPreferencesInteractor;
        this.f200488h = uiPersonalisationInteractor;
        this.i = widgetsUiInteractor;
        this.f200489j = new kgm.i(new lu5.o(this, 9));
    }

    public final efm.b a() {
        return this.e.a(sd0.f.LAZY_RELOAD);
    }

    public final NavBarWithContainerBackground b() {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = this.f200487g.a();
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        rn0.a aVar = (rn0.a) objA;
        if (aVar == null) {
            return null;
        }
        String baseUrl = this.d.getBaseUrl();
        u defaultBackgroundCatalogue = v.a();
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        fn2.a backgroundIdHelper = fn2.a.f136512a;
        Intrinsics.checkNotNullParameter(backgroundIdHelper, "backgroundIdHelper");
        Intrinsics.checkNotNullParameter(defaultBackgroundCatalogue, "defaultBackgroundCatalogue");
        em2.e eVarD = fn2.a.d(aVar.f255386a, baseUrl, defaultBackgroundCatalogue);
        if (eVarD != null) {
            return fm2.a.a(eVarD);
        }
        return null;
    }

    public final efm.b c() {
        return this.f200489j.j(Unit.f186387a);
    }
}
