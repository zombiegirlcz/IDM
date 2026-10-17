package zr4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f324568a;

    public i(Data model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f324568a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f324568a, ((i) obj2).f324568a);
    }

    public final int hashCode() {
        return this.f324568a.hashCode();
    }
}
