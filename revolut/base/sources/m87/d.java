package m87;

import cli.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f203442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203443b;

    public d(String str, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f203442a = tabs;
        this.f203443b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f203442a.equals(dVar.f203442a) && Intrinsics.f(this.f203443b, dVar.f203443b);
    }

    public final int hashCode() {
        int iHashCode = this.f203442a.hashCode() * 31;
        String str = this.f203443b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
