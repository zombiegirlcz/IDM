package juk;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f178673a;

    public f(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f178673a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f178673a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f178673a.equals(((f) obj2).f178673a);
    }

    public final int hashCode() {
        return this.f178673a.hashCode();
    }
}
