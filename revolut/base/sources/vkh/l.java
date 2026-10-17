package vkh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.wealth.ui.impl.documents.details.a f289950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f289951b;

    public l(com.revolut.feature.wealth.ui.impl.documents.details.a headerState, ArrayList items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f289950a = headerState;
        this.f289951b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f289951b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f289950a.equals(lVar.f289950a) && this.f289951b.equals(lVar.f289951b);
    }

    public final int hashCode() {
        return this.f289951b.hashCode() + (this.f289950a.hashCode() * 31);
    }
}
