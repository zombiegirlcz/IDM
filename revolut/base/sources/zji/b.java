package zji;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f322866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f322867b;

    public b(d modelBinder, e modelObserver) {
        Intrinsics.checkNotNullParameter(modelBinder, "modelBinder");
        Intrinsics.checkNotNullParameter(modelObserver, "modelObserver");
        this.f322866a = modelBinder;
        this.f322867b = modelObserver;
    }

    @Override // zji.a
    public final void clear() {
        e observer = this.f322867b;
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f322866a.f322869a.remove(observer);
    }
}
