package w4d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f294538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f294539b;

    public c(g content, Data data) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f294538a = content;
        this.f294539b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f294538a, cVar.f294538a) && Intrinsics.f(this.f294539b, cVar.f294539b);
    }

    public final int hashCode() {
        return this.f294539b.hashCode() + (this.f294538a.f294547a.hashCode() * 31);
    }
}
