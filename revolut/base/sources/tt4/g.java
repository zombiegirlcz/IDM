package tt4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f274216a;

    public g(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f274216a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f274216a, ((g) obj2).f274216a);
    }

    public final int hashCode() {
        return this.f274216a.hashCode();
    }
}
