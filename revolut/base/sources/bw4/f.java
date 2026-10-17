package bw4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f19225a;

    public f(Data content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f19225a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f19225a, ((f) obj2).f19225a);
    }

    public final int hashCode() {
        return this.f19225a.hashCode();
    }
}
