package j6b;

import cli.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f171726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f171728c;

    public h(g headerState, String selectedTabId, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f171726a = headerState;
        this.f171727b = selectedTabId;
        this.f171728c = tabs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f171726a, hVar.f171726a) && Intrinsics.f(this.f171727b, hVar.f171727b) && this.f171728c.equals(hVar.f171728c);
    }

    public final int hashCode() {
        return this.f171728c.hashCode() + p.a.c(this.f171726a.hashCode() * 31, 31, this.f171727b);
    }
}
