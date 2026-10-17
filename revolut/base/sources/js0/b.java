package js0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Function0 f178088a;

    public b(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f178088a = action;
    }

    public final boolean a() {
        return this.f178088a == null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Function0 function0 = this.f178088a;
        this.f178088a = null;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
