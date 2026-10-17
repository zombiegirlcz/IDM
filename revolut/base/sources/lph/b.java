package lph;

import cli.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f199124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199125b;

    public b(String str, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f199124a = tabs;
        this.f199125b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f199124a.equals(bVar.f199124a) && Intrinsics.f(this.f199125b, bVar.f199125b);
    }

    public final int hashCode() {
        int iHashCode = this.f199124a.hashCode() * 31;
        String str = this.f199125b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
