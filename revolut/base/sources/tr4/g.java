package tr4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f273733a;

    public g(Data model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f273733a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f273733a, ((g) obj2).f273733a);
    }

    public final int hashCode() {
        return this.f273733a.hashCode();
    }
}
