package dt4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f117367a;

    public f(Data model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f117367a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f117367a, ((f) obj2).f117367a);
    }

    public final int hashCode() {
        return this.f117367a.hashCode();
    }
}
