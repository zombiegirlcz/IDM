package ocg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f224240a;

    public m(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f224240a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f224240a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f224240a.equals(((m) obj2).f224240a);
    }

    public final int hashCode() {
        return this.f224240a.hashCode();
    }
}
