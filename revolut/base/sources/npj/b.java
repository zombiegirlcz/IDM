package npj;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends f3c.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f218232l = new b();

    private b() {
    }

    @Override // f3c.a
    public final void Z2(Function0 onNext, Function0 onNavigate) {
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Intrinsics.checkNotNullParameter(onNavigate, "onNavigate");
        onNext.invoke();
    }
}
