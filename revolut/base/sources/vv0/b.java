package vv0;

import android.view.Window;
import ht0.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window f292431a;

    public b(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.f292431a = window;
    }

    @Override // vv0.a
    public final boolean a() {
        return (this.f292431a.getAttributes().softInputMode & 15) == 3;
    }

    @Override // vv0.a
    public final void b(b0 onStateChanged) {
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
    }

    @Override // vv0.a
    public final void detach() {
    }
}
