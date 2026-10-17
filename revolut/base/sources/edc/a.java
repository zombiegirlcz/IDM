package edc;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124972b;

    public a(List items, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f124971a = items;
        this.f124972b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f124971a, aVar.f124971a) && Intrinsics.f(this.f124972b, aVar.f124972b);
    }

    public final int hashCode() {
        int iHashCode = this.f124971a.hashCode() * 31;
        String str = this.f124972b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
