package ib7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f160110a;

    public e(ArrayList listItems) {
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.f160110a = listItems;
    }

    @Override // ib7.h
    public final List a() {
        return this.f160110a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f160110a.equals(((e) obj2).f160110a);
    }

    public final int hashCode() {
        return this.f160110a.hashCode();
    }
}
