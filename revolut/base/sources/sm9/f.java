package sm9;

import cli.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f264395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f264397c;

    public f(String str, ArrayList tabs, boolean z) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f264395a = tabs;
        this.f264396b = str;
        this.f264397c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f264395a.equals(fVar.f264395a) && Intrinsics.f(this.f264396b, fVar.f264396b) && this.f264397c == fVar.f264397c;
    }

    public final int hashCode() {
        int iHashCode = this.f264395a.hashCode() * 31;
        String str = this.f264396b;
        return Boolean.hashCode(this.f264397c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
