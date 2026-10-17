package ib7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f160112a;

    public g(ArrayList listItems) {
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.f160112a = listItems;
    }

    @Override // ib7.h
    public final List a() {
        return this.f160112a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f160112a.equals(((g) obj2).f160112a);
    }

    public final int hashCode() {
        return this.f160112a.hashCode();
    }
}
