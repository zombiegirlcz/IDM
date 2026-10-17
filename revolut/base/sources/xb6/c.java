package xb6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f304000a;

    public c(Data charitiesCollection) {
        Intrinsics.checkNotNullParameter(charitiesCollection, "charitiesCollection");
        this.f304000a = charitiesCollection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f304000a, ((c) obj2).f304000a);
    }

    public final int hashCode() {
        return this.f304000a.hashCode();
    }
}
