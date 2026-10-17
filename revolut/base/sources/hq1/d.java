package hq1;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154583a;

    public d(List forms) {
        Intrinsics.checkNotNullParameter(forms, "forms");
        this.f154583a = forms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f154583a, ((d) obj2).f154583a);
    }

    public final int hashCode() {
        return this.f154583a.hashCode();
    }
}
