package vmj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f290606a;

    public h(Data details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f290606a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f290606a, ((h) obj2).f290606a);
    }

    public final int hashCode() {
        return this.f290606a.hashCode();
    }
}
