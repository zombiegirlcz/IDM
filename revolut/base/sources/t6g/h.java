package t6g;

import cli.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f268350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f268352c;

    public h(String selectedTabId, ArrayList tabs, boolean z) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f268350a = tabs;
        this.f268351b = selectedTabId;
        this.f268352c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f268350a.equals(hVar.f268350a) && this.f268351b.equals(hVar.f268351b) && this.f268352c == hVar.f268352c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268352c) + p.a.c(this.f268350a.hashCode() * 31, 31, this.f268351b);
    }
}
