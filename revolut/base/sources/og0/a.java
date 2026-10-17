package og0;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f224954a;

    public a(CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f224954a = appCoroutineScope;
    }

    public final void a() {
        e0.k(this.f224954a, null);
    }
}
