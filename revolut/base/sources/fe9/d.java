package fe9;

import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements wl0.a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow f134476a;

    public d(MutableSharedFlow mutableSharedFlow) {
        this.f134476a = mutableSharedFlow;
    }

    @Override // wl0.a
    public final void a(wl0.n p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.f134476a.k(p0);
    }

    public final boolean equals(Object obj2) {
        if ((obj2 instanceof wl0.a) && (obj2 instanceof n)) {
            return Intrinsics.f(getFunctionDelegate(), ((n) obj2).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        return new kotlin.jvm.internal.a(1, 8, MutableSharedFlow.class, this.f134476a, "tryEmit", "tryEmit(Ljava/lang/Object;)Z");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
