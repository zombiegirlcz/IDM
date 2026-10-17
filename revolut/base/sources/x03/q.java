package x03;

import efm.d0;
import g48.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f301481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f301482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f301483c;
    public final wsg.n d;
    public final z03.c e;
    public final z03.c f;

    public q(r0 jointAccountsInteractor, ln.a navigationCommandsDispatcher, h presentationModel, wsg.n walletsInteractor, z03.c retailCardCommandProvider, z03.c juniorCardCommandProvider) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(retailCardCommandProvider, "retailCardCommandProvider");
        Intrinsics.checkNotNullParameter(juniorCardCommandProvider, "juniorCardCommandProvider");
        this.f301481a = jointAccountsInteractor;
        this.f301482b = navigationCommandsDispatcher;
        this.f301483c = presentationModel;
        this.d = walletsInteractor;
        this.e = retailCardCommandProvider;
        this.f = juniorCardCommandProvider;
    }

    public final pfm.a a(wy2.d reason, boolean z, b neverReceivedMode) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(neverReceivedMode, "neverReceivedMode");
        d0 d0VarJ3 = this.f301483c.j3();
        wx9.b bVar = new wx9.b(new w43.b(this, reason, neverReceivedMode, z, 1), 20);
        d0VarJ3.getClass();
        pfm.a aVar = new pfm.a(d0VarJ3, bVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
