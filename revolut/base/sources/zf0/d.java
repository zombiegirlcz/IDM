package zf0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f321835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321837c;

    public d(String langKey, String str, List listFaqEntry) {
        Intrinsics.checkNotNullParameter(listFaqEntry, "listFaqEntry");
        Intrinsics.checkNotNullParameter(langKey, "langKey");
        this.f321835a = listFaqEntry;
        this.f321836b = langKey;
        this.f321837c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f321835a, dVar.f321835a) && Intrinsics.f(this.f321836b, dVar.f321836b) && Intrinsics.f(this.f321837c, dVar.f321837c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f321835a.hashCode() * 31, 31, this.f321836b);
        String str = this.f321837c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
