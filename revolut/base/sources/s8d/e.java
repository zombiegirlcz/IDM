package s8d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f260973a;

    public e(Data items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f260973a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f260973a, ((e) obj2).f260973a);
    }

    public final int hashCode() {
        return this.f260973a.hashCode();
    }
}
