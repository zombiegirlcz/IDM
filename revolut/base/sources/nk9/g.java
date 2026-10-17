package nk9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f216760a;

    public g(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f216760a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f216760a, ((g) obj2).f216760a);
    }

    public final int hashCode() {
        return this.f216760a.hashCode();
    }
}
