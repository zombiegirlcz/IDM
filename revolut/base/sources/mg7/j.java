package mg7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f205172a;

    public j(Data contentData) {
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f205172a = contentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f205172a, ((j) obj2).f205172a);
    }

    public final int hashCode() {
        return this.f205172a.hashCode();
    }
}
