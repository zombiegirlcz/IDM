package wt4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f299772a;

    public e(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f299772a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f299772a, ((e) obj2).f299772a);
    }

    public final int hashCode() {
        return this.f299772a.hashCode();
    }
}
