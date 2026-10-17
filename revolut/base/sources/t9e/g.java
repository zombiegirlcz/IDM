package t9e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f268986a;

    public g(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f268986a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f268986a, ((g) obj2).f268986a);
    }

    public final int hashCode() {
        return this.f268986a.hashCode();
    }
}
