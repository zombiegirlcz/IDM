package v94;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f286975a;

    public g(Data fileData) {
        Intrinsics.checkNotNullParameter(fileData, "fileData");
        this.f286975a = fileData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f286975a, ((g) obj2).f286975a);
    }

    public final int hashCode() {
        return this.f286975a.hashCode();
    }
}
