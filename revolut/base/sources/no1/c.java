package no1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217899a;

    public c(List inputItem) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        this.f217899a = inputItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f217899a, ((c) obj2).f217899a);
    }

    public final int hashCode() {
        return this.f217899a.hashCode();
    }
}
