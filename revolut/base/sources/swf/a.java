package swf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f266203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f266204b;

    public a(Map values, boolean z) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f266203a = values;
        this.f266204b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f266203a, aVar.f266203a) && this.f266204b == aVar.f266204b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266204b) + (this.f266203a.hashCode() * 31);
    }
}
