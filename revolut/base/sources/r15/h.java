package r15;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f250906a;

    public h(Data configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f250906a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f250906a, ((h) obj2).f250906a);
    }

    public final int hashCode() {
        return this.f250906a.hashCode();
    }
}
