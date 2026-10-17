package ip0;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsView.Item f167226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f167227c;

    public y(String listId, ActionsView.Item item, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f167225a = listId;
        this.f167226b = item;
        this.f167227c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f167225a, yVar.f167225a) && Intrinsics.f(this.f167226b, yVar.f167226b) && Intrinsics.f(this.f167227c, yVar.f167227c);
    }

    public final int hashCode() {
        int iHashCode = (this.f167226b.hashCode() + (this.f167225a.hashCode() * 31)) * 31;
        Object obj2 = this.f167227c;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
