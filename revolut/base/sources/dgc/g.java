package dgc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f114628b;

    public g(String icon, ArrayList texts) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(texts, "texts");
        this.f114627a = icon;
        this.f114628b = texts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f114627a, gVar.f114627a) && this.f114628b.equals(gVar.f114628b);
    }

    public final int hashCode() {
        return this.f114628b.hashCode() + (this.f114627a.hashCode() * 31);
    }
}
