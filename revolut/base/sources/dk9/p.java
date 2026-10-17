package dk9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f115475a;

    public p(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f115475a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f115475a, ((p) obj2).f115475a);
    }

    public final int hashCode() {
        return this.f115475a.hashCode();
    }
}
