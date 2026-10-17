package i0e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f157391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(List listItems) {
        super(listItems);
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.f157391b = listItems;
    }

    @Override // i0e.w
    public final List a() {
        return this.f157391b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f157391b, ((v) obj2).f157391b);
    }

    public final int hashCode() {
        return this.f157391b.hashCode();
    }
}
