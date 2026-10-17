package pyj;

import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import pth.l;
import pyc.r;
import rfm.f0;
import rfm.j;
import sri.m;
import u09.v;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements iyj.b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f240850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final myj.e f240851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FeatureCommand f240852c;
    public final FeatureCommand d;

    public h(m navigator, myj.e featureStateChecker) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureStateChecker, "featureStateChecker");
        this.f240850a = navigator;
        this.f240851b = featureStateChecker;
        s49.a aVar = s49.a.SINGLE_TOP;
        this.f240852c = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(aVar, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
        this.d = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(aVar, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "learn");
    }

    public final FeatureCommand b(jf0.c cVar) {
        String upperCase = ((String) cVar.h().get(2)).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        v vVarValueOf = v.valueOf(upperCase);
        switch (f.f240846b[vVarValueOf.ordinal()]) {
            case 1:
                return this.f240852c;
            case 2:
                return this.d;
            case 3:
            case 4:
            case 5:
            case 6:
                return new FeatureCommand(new LearnKompotFeatureConfig.Home(vVarValueOf));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pyj.h.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        int i = 24;
        i iVar = new i(new ufm.c(new fg8.b(this, deeplink, 3), 2), new r(i, new pvc.e(1, this.f240851b, myj.e.class, "getFeatureStateForDomain", "getFeatureStateForDomain(Lcom/revolut/feature/learn/shared/models/domain/LearnProductDomain;)Lio/reactivex/Single;", 0, 4)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        j jVar = new j(ue0.e.F(iVar, yoj.d.DISABLED), new r(25, new pth.m(this, deeplink, 13)), 2);
        DummyCommand dummyCommand = DummyCommand.f98635a;
        f0 f0VarP = jVar.p(dummyCommand);
        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
        pfm.a aVar = new pfm.a(ue0.e.F(f0VarP, dummyCommand), new r(23, new l(this, 20)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        Boolean bool = Boolean.TRUE;
        z zVarD = aVar.D(bool);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return ue0.e.F(zVarD, bool);
    }
}
