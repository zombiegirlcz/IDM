package iw4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f168950a;

    public l(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f168950a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f168950a, ((l) obj2).f168950a);
    }

    public final int hashCode() {
        return this.f168950a.hashCode();
    }
}
