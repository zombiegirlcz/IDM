package mid;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f205767b;

    public v(String str, ArrayList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f205766a = str;
        this.f205767b = elements;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f205766a, vVar.f205766a) && this.f205767b.equals(vVar.f205767b);
    }

    public final int hashCode() {
        String str = this.f205766a;
        return this.f205767b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
