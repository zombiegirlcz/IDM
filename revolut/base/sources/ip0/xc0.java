package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f167132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f167133c;

    public xc0(Object obj2, String listId, List listItems) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.f167131a = listId;
        this.f167132b = obj2;
        this.f167133c = listItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xc0)) {
            return false;
        }
        xc0 xc0Var = (xc0) obj2;
        return Intrinsics.f(this.f167131a, xc0Var.f167131a) && Intrinsics.f(this.f167132b, xc0Var.f167132b) && Intrinsics.f(this.f167133c, xc0Var.f167133c);
    }

    public final int hashCode() {
        int iHashCode = this.f167131a.hashCode() * 31;
        Object obj2 = this.f167132b;
        return this.f167133c.hashCode() + ((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31);
    }
}
