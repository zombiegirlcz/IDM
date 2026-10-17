package dda;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113188c;
    public final List d;
    public final n e;

    public m(String icon, String title, String value, List highlights, n nVar) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f113186a = icon;
        this.f113187b = title;
        this.f113188c = value;
        this.d = highlights;
        this.e = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f113186a, mVar.f113186a) && Intrinsics.f(this.f113187b, mVar.f113187b) && Intrinsics.f(this.f113188c, mVar.f113188c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(this.f113186a.hashCode() * 31, 31, this.f113187b), 31, this.f113188c), 31, this.d);
        n nVar = this.e;
        return iD + (nVar == null ? 0 : nVar.hashCode());
    }
}
