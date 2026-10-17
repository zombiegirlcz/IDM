package nua;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f219269a;

    public c(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f219269a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f219269a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f219269a.equals(((c) obj2).f219269a);
    }

    public final int hashCode() {
        return this.f219269a.hashCode();
    }
}
