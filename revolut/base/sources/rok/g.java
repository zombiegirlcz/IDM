package rok;

import cli.o;
import kotlin.jvm.internal.Intrinsics;
import mx0.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f256032a;

    public g(j2 introModel) {
        Intrinsics.checkNotNullParameter(introModel, "introModel");
        this.f256032a = introModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f256032a.equals(((g) obj2).f256032a);
    }

    public final int hashCode() {
        return this.f256032a.hashCode();
    }
}
