package wp4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f299048a;

    public g(Data model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f299048a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f299048a, ((g) obj2).f299048a);
    }

    public final int hashCode() {
        return this.f299048a.hashCode();
    }
}
