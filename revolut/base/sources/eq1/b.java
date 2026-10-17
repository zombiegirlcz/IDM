package eq1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128219a;

    public b(List forms) {
        Intrinsics.checkNotNullParameter(forms, "forms");
        this.f128219a = forms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f128219a, ((b) obj2).f128219a);
    }

    public final int hashCode() {
        return this.f128219a.hashCode();
    }
}
