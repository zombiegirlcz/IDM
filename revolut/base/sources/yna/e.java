package yna;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f315332a;

    public e(Data items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f315332a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f315332a, ((e) obj2).f315332a);
    }

    public final int hashCode() {
        return this.f315332a.hashCode();
    }
}
