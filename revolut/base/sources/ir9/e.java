package ir9;

import com.revolut.feature.payments.groups.api.navigation.CreateGroupDestination;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f168028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rq9.a f168029b;

    public e(m navigator, rq9.a groupBillsNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(groupBillsNaviCommandProvider, "groupBillsNaviCommandProvider");
        this.f168028a = navigator;
        this.f168029b = groupBillsNaviCommandProvider;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "create-group");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(CreateGroupDestination.f79291a, new q06.b(ibb.c.f160142c, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.i iVar = new ufm.i(new ufm.f(((zr9.a) this.f168029b).b(), new a(new gae.a(z, this, 17), 1), 3), new a(new ip4.m(10), 2), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
