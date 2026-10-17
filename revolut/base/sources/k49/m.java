package k49;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i49.a f180864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f180865b;

    public m(i49.a pendingActionsItemsProvider, Set delegates) {
        Intrinsics.checkNotNullParameter(pendingActionsItemsProvider, "pendingActionsItemsProvider");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f180864a = pendingActionsItemsProvider;
        this.f180865b = delegates;
    }
}
