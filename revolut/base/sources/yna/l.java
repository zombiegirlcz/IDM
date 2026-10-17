package yna;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f315357a;

    public l(Data item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f315357a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f315357a, ((l) obj2).f315357a);
    }

    public final int hashCode() {
        return this.f315357a.hashCode();
    }
}
