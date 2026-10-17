package fg8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    @NotNull
    private static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f134945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rul.e f134946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yg8.d f134947c;

    public l0(sri.m navigator, rul.e juniorGraduationInteractor, yg8.d juniorGraduationStatusNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(juniorGraduationInteractor, "juniorGraduationInteractor");
        Intrinsics.checkNotNullParameter(juniorGraduationStatusNaviCommandProvider, "juniorGraduationStatusNaviCommandProvider");
        this.f134945a = navigator;
        this.f134946b = juniorGraduationInteractor;
        this.f134947c = juniorGraduationStatusNaviCommandProvider;
    }

    public static pfm.n a(jf0.c cVar) {
        pfm.n nVarN = efm.b.n(new UnsupportedOperationException(p.a.p("Junior deeplink ", cVar.f173627a, " is not supported")));
        Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
        return nVarN;
    }
}
