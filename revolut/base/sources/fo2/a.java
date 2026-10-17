package fo2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f136780a;

    public a(ArrayList tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f136780a = tabs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f136780a.equals(((a) obj2).f136780a);
    }

    public final int hashCode() {
        return this.f136780a.hashCode();
    }
}
