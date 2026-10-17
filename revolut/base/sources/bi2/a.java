package bi2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f15374a;

    public a(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f15374a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f15374a, ((a) obj2).f15374a);
    }

    public final int hashCode() {
        return this.f15374a.hashCode();
    }
}
