package tn6;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f272318a;

    public j(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f272318a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f272318a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f272318a.equals(((j) obj2).f272318a);
    }

    public final int hashCode() {
        return this.f272318a.hashCode();
    }
}
