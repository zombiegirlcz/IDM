package ip0;

import com.revolut.core.ui_kit.delegates.PromptContentLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q60 implements koi.j, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165931a;

    public q60(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f165931a = listId;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PromptContentLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58244a() {
        return this.f165931a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q60) && Intrinsics.f(this.f165931a, ((q60) obj2).f165931a);
    }

    public final int hashCode() {
        return this.f165931a.hashCode();
    }
}
