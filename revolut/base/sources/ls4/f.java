package ls4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f199614a;

    public f(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f199614a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f199614a, ((f) obj2).f199614a);
    }

    public final int hashCode() {
        return this.f199614a.hashCode();
    }
}
