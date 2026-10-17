package snc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f264503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f264504b;

    public e() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f264503a, eVar.f264503a) && Intrinsics.f(this.f264504b, eVar.f264504b);
    }

    public final int hashCode() {
        Data data = this.f264503a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f264504b;
        return iHashCode + (data2 != null ? data2.hashCode() : 0);
    }

    public e(Data data, Data data2) {
        this.f264503a = data;
        this.f264504b = data2;
    }
}
