package wgd;

import cli.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f297314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f297315b;

    public h(String str, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f297314a = tabs;
        this.f297315b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f297314a.equals(hVar.f297314a) && Intrinsics.f(this.f297315b, hVar.f297315b);
    }

    public final int hashCode() {
        int iHashCode = this.f297314a.hashCode() * 31;
        String str = this.f297315b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
