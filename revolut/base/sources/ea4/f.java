package ea4;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f124130a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f124130a, ((f) obj2).f124130a);
    }

    public final int hashCode() {
        return this.f124130a.hashCode();
    }

    public f(Map documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f124130a = documents;
    }

    public /* synthetic */ f(int i) {
        this(r0.g());
    }
}
