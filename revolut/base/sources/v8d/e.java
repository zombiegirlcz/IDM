package v8d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f286735a;

    public e(Data categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f286735a = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f286735a, ((e) obj2).f286735a);
    }

    public final int hashCode() {
        return this.f286735a.hashCode();
    }
}
