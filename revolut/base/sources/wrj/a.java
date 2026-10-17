package wrj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f299593a;

    public a(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f299593a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f299593a, ((a) obj2).f299593a);
    }

    public final int hashCode() {
        return this.f299593a.hashCode();
    }
}
