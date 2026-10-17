package fc8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f133658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f133659b;

    public a(int i, List args) {
        Intrinsics.checkNotNullParameter(args, "args");
        this.f133658a = i;
        this.f133659b = args;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f133658a == aVar.f133658a && Intrinsics.f(this.f133659b, aVar.f133659b);
    }

    public final int hashCode() {
        return this.f133659b.hashCode() + (Integer.hashCode(this.f133658a) * 31);
    }
}
