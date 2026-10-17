package yh4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f313751a;

    public c(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f313751a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f313751a, ((c) obj2).f313751a);
    }

    public final int hashCode() {
        return this.f313751a.hashCode();
    }
}
