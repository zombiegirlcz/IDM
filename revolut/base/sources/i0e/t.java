package i0e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f157389b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(List listItems) {
        super(listItems);
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.f157389b = listItems;
    }

    @Override // i0e.w
    public final List a() {
        return this.f157389b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f157389b, ((t) obj2).f157389b);
    }

    public final int hashCode() {
        return this.f157389b.hashCode();
    }
}
