package po9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f237914a;

    public f(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f237914a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f237914a, ((f) obj2).f237914a);
    }

    public final int hashCode() {
        return this.f237914a.hashCode();
    }
}
