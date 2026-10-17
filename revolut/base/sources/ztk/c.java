package ztk;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f325175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f325176b;

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
        return Intrinsics.f(this.f325175a, cVar.f325175a) && Intrinsics.f(this.f325176b, cVar.f325176b);
    }

    public final int hashCode() {
        Data data = this.f325175a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f325176b;
        return iHashCode + (data2 != null ? data2.hashCode() : 0);
    }

    public c(Data data, Data data2) {
        this.f325175a = data;
        this.f325176b = data2;
    }
}
