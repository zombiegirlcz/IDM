package fu6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138097b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List items) {
        super(items);
        Intrinsics.checkNotNullParameter(items, "items");
        this.f138097b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f138097b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f138097b, ((n) obj2).f138097b);
    }

    public final int hashCode() {
        return this.f138097b.hashCode();
    }
}
