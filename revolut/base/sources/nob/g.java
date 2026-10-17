package nob;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f217966a;

    public g(Data contentData) {
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f217966a = contentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f217966a, ((g) obj2).f217966a);
    }

    public final int hashCode() {
        return this.f217966a.hashCode();
    }
}
