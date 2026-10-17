package xge;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import vge.i0;
import vkm.q0;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f305727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f305728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f305729c;
    public final Lazy d;

    public j(CoroutineScope scope, i0 accountsState, u availableSpacesSourcesProvider) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        Intrinsics.checkNotNullParameter(availableSpacesSourcesProvider, "availableSpacesSourcesProvider");
        this.f305727a = scope;
        this.f305728b = accountsState;
        this.f305729c = availableSpacesSourcesProvider;
        this.d = yhm.j.b(new h(this, 0));
    }

    public final q0 a() {
        return new q0(vkm.q.q(new vy5.d0((Flow) this.d.getValue(), 21)), new x64.b(this, null, 23), 1);
    }
}
