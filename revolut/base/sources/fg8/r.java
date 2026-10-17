package fg8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f134989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f134990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q78.e f134991c;

    public r(sri.m navigator, hj8.a juniorProfileInteractor, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f134989a = navigator;
        this.f134990b = juniorProfileInteractor;
        this.f134991c = juniorAccountDestinationResolver;
    }

    public static final Object a(r rVar, String str, w4l.k kVar, esa.i iVar) {
        return vkm.q.x(mo3.a.f(hj8.a.a(rVar.f134990b, str, kVar), new fci.e0(24), new et6.a(21), new fci.e0(25)), iVar);
    }
}
