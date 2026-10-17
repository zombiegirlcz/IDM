package mtd;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f208819a;

    public a(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f208819a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f208819a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f208819a, ((a) obj2).f208819a);
    }

    public final int hashCode() {
        return this.f208819a.hashCode();
    }
}
