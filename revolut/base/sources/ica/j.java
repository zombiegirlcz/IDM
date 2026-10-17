package ica;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f160228a;

    public j(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f160228a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f160228a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f160228a.equals(((j) obj2).f160228a);
    }

    public final int hashCode() {
        return this.f160228a.hashCode();
    }
}
