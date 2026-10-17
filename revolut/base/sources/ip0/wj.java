package ip0;

import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wj implements koi.j, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167036a;

    public wj(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f167036a = listId;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new FullScreenDocumentLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52373a() {
        return this.f167036a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof wj) && Intrinsics.f(this.f167036a, ((wj) obj2).f167036a);
    }

    public final int hashCode() {
        return this.f167036a.hashCode();
    }
}
