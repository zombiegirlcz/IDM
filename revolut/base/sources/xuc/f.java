package xuc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vuc.m f309012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f309013b;

    public f(vuc.m type, Data connections) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(connections, "connections");
        this.f309012a = type;
        this.f309013b = connections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f309012a == fVar.f309012a && Intrinsics.f(this.f309013b, fVar.f309013b);
    }

    public final int hashCode() {
        return this.f309013b.hashCode() + (this.f309012a.hashCode() * 31);
    }
}
