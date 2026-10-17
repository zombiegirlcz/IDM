package su4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f265649a;

    public i(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f265649a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f265649a, ((i) obj2).f265649a);
    }

    public final int hashCode() {
        return this.f265649a.hashCode();
    }
}
