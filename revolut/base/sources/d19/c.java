package d19;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f110610a;

    public c(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f110610a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f110610a, ((c) obj2).f110610a);
    }

    public final int hashCode() {
        return this.f110610a.hashCode();
    }
}
