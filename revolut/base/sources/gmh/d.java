package gmh;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f144854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f144855b;

    public d(Data data, Data data2) {
        this.f144854a = data;
        this.f144855b = data2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f144854a, dVar.f144854a) && Intrinsics.f(this.f144855b, dVar.f144855b);
    }

    public final int hashCode() {
        Data data = this.f144854a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f144855b;
        return iHashCode + (data2 != null ? data2.hashCode() : 0);
    }
}
