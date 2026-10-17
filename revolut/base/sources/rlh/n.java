package rlh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f255065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f255066b;

    public n() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f255065a, nVar.f255065a) && Intrinsics.f(this.f255066b, nVar.f255066b);
    }

    public final int hashCode() {
        return this.f255066b.hashCode() + (this.f255065a.hashCode() * 31);
    }

    public n(Data collections, Data selectedCollectionId) {
        Intrinsics.checkNotNullParameter(collections, "collections");
        Intrinsics.checkNotNullParameter(selectedCollectionId, "selectedCollectionId");
        this.f255065a = collections;
        this.f255066b = selectedCollectionId;
    }

    public /* synthetic */ n(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
