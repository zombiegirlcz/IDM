package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f163467b;

    public al(String listId, List listItems) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.f163466a = listId;
        this.f163467b = listItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof al)) {
            return false;
        }
        al alVar = (al) obj2;
        return Intrinsics.f(this.f163466a, alVar.f163466a) && Intrinsics.f(this.f163467b, alVar.f163467b);
    }

    public final int hashCode() {
        return this.f163467b.hashCode() + (this.f163466a.hashCode() * 31);
    }
}
