package r74;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f251990a;

    public j(Data prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f251990a = prompt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f251990a, ((j) obj2).f251990a);
    }

    public final int hashCode() {
        return this.f251990a.hashCode();
    }
}
