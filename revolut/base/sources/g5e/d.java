package g5e;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f140772b;

    public d() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f140771a, dVar.f140771a) && Intrinsics.f(this.f140772b, dVar.f140772b);
    }

    public final int hashCode() {
        Data data = this.f140771a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f140772b;
        return iHashCode + (data2 != null ? data2.hashCode() : 0);
    }

    public d(Data data, Data data2) {
        this.f140771a = data;
        this.f140772b = data2;
    }
}
