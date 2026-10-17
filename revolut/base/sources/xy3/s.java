package xy3;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f309595a;

    public s(Map answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f309595a = answers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f309595a, ((s) obj2).f309595a);
    }

    public final int hashCode() {
        return this.f309595a.hashCode();
    }
}
