package zge;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nya.i0;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f322121a = new j();

    private j() {
    }

    @Override // zge.a
    public final Flow a(oge.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return new go.g(null, 2);
    }

    @Override // zge.a
    public final Flow b() {
        return new go.g(0, 2);
    }

    @Override // zge.a
    public final Object c(oge.a aVar, Continuation continuation) {
        return Unit.f186387a;
    }

    @Override // zge.a
    public final Object d(oge.a aVar, i0 i0Var) {
        return Unit.f186387a;
    }
}
