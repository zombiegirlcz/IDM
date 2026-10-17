package w9a;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f295699a;

    public c(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f295699a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f295699a, ((c) obj2).f295699a);
    }

    public final int hashCode() {
        return this.f295699a.hashCode();
    }
}
