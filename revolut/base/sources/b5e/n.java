package b5e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f12502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2h.b f12503c;
    public final List d;

    public n(String str, m header, x2h.b actions, f0 tabs) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f12501a = str;
        this.f12502b = header;
        this.f12503c = actions;
        this.d = tabs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f12501a, nVar.f12501a) && Intrinsics.f(this.f12502b, nVar.f12502b) && Intrinsics.f(this.f12503c, nVar.f12503c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        String str = this.f12501a;
        return this.d.hashCode() + ((this.f12503c.hashCode() + ((this.f12502b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31);
    }
}
