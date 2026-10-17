package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.d f185478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f185479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f185480c;

    public f2(mkd.d slotManagerFeedExtension, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(slotManagerFeedExtension, "slotManagerFeedExtension");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f185478a = slotManagerFeedExtension;
        this.f185479b = coroutineScope;
        this.f185480c = yhm.j.b(new k98.a(this, 22));
    }
}
