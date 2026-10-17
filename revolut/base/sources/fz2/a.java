package fz2;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f139078a;

    public a(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f139078a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f139078a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f139078a.equals(((a) obj2).f139078a);
    }

    public final int hashCode() {
        return this.f139078a.hashCode();
    }
}
