package eu4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f129514a;

    public n(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f129514a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f129514a, ((n) obj2).f129514a);
    }

    public final int hashCode() {
        return this.f129514a.hashCode();
    }
}
