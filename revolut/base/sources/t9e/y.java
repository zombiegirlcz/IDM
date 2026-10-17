package t9e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements jki.p {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mae.o f269011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ur2.c f269012b;

    public y(mae.o subscriptionList, ur2.c blockedMerchantsInteractor) {
        Intrinsics.checkNotNullParameter(subscriptionList, "subscriptionList");
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        this.f269011a = subscriptionList;
        this.f269012b = blockedMerchantsInteractor;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k((List) iii.c.f(domainState.f268986a, new t9b.a(3), new t5e.j(17), new sa5.b(this, 27)));
    }
}
