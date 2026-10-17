package umk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f281323a;

    public f(Data prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f281323a = prompt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f281323a, ((f) obj2).f281323a);
    }

    public final int hashCode() {
        return this.f281323a.hashCode();
    }
}
