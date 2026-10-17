package a5e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f1366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f1367b;

    public f() {
        this(null, null);
    }

    public static f a(f fVar, Data data, Data data2, int i) {
        if ((i & 1) != 0) {
            data = fVar.f1366a;
        }
        if ((i & 2) != 0) {
            data2 = fVar.f1367b;
        }
        fVar.getClass();
        return new f(data, data2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f1366a, fVar.f1366a) && Intrinsics.f(this.f1367b, fVar.f1367b);
    }

    public final int hashCode() {
        Data data = this.f1366a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f1367b;
        return iHashCode + (data2 != null ? data2.hashCode() : 0);
    }

    public f(Data data, Data data2) {
        this.f1366a = data;
        this.f1367b = data2;
    }
}
