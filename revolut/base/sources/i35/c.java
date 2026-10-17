package i35;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f158097a;

    public c(Data pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f158097a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f158097a, ((c) obj2).f158097a);
    }

    public final int hashCode() {
        return this.f158097a.hashCode();
    }
}
