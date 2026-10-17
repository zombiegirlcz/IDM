package j75;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f171856a;

    public f(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f171856a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f171856a, ((f) obj2).f171856a);
    }

    public final int hashCode() {
        return this.f171856a.hashCode();
    }
}
