package ip0;

import com.revolut.core.ui_kit.delegates.IconLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ep implements koi.j, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164132a;

    public ep(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f164132a = listId;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new IconLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53492a() {
        return this.f164132a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ep) && Intrinsics.f(this.f164132a, ((ep) obj2).f164132a);
    }

    public final int hashCode() {
        return this.f164132a.hashCode();
    }
}
