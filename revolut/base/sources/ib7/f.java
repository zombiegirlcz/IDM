package ib7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f160111a;

    public f(List listItems) {
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.f160111a = listItems;
    }

    @Override // ib7.h
    public final List a() {
        return this.f160111a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f160111a, ((f) obj2).f160111a);
    }

    public final int hashCode() {
        return this.f160111a.hashCode();
    }
}
