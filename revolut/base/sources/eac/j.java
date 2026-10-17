package eac;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124168a;

    public j(List merchants) {
        Intrinsics.checkNotNullParameter(merchants, "merchants");
        this.f124168a = merchants;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f124168a, ((j) obj2).f124168a);
    }

    public final int hashCode() {
        return this.f124168a.hashCode();
    }
}
