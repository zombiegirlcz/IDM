package ds4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f117211a;

    public h(Data model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f117211a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f117211a, ((h) obj2).f117211a);
    }

    public final int hashCode() {
        return this.f117211a.hashCode();
    }
}
