package qeb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f245106a;

    public f(Data details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f245106a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f245106a, ((f) obj2).f245106a);
    }

    public final int hashCode() {
        return this.f245106a.hashCode();
    }
}
