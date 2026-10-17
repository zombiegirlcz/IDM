package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120619a;

    public i() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f120619a, ((i) obj2).f120619a);
    }

    public final int hashCode() {
        String str = this.f120619a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // dx4.l
    public final String j() {
        return p.a.p("ShowScreen(screenId=", this.f120619a, ")");
    }

    public i(String str) {
        this.f120619a = str;
    }
}
