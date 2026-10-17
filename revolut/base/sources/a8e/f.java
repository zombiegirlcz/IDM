package a8e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2188a;

    public f(List listOfCurrencies) {
        Intrinsics.checkNotNullParameter(listOfCurrencies, "listOfCurrencies");
        this.f2188a = listOfCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f2188a, ((f) obj2).f2188a);
    }

    public final int hashCode() {
        return this.f2188a.hashCode();
    }
}
