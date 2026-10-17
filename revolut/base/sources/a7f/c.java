package a7f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f1860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f1861b;

    public c() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f1860a, cVar.f1860a) && Intrinsics.f(this.f1861b, cVar.f1861b);
    }

    public final int hashCode() {
        Data data = this.f1860a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f1861b;
        return iHashCode + (data2 != null ? data2.hashCode() : 0);
    }

    public c(Data data, Data data2) {
        this.f1860a = data;
        this.f1861b = data2;
    }
}
