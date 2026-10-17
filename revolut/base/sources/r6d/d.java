package r6d;

import com.revolut.data.model.Data;
import ip0.xo0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo0 f251664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f251665b;

    public d(xo0 heightMode, Data previewUrlData) {
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(previewUrlData, "previewUrlData");
        this.f251664a = heightMode;
        this.f251665b = previewUrlData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f251664a == dVar.f251664a && Intrinsics.f(this.f251665b, dVar.f251665b);
    }

    public final int hashCode() {
        return this.f251665b.hashCode() + (this.f251664a.hashCode() * 31);
    }
}
