package fu6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138093b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List items) {
        super(items);
        Intrinsics.checkNotNullParameter(items, "items");
        this.f138093b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f138093b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f138093b, ((l) obj2).f138093b);
    }

    public final int hashCode() {
        return this.f138093b.hashCode();
    }
}
