package iu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f168476c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f168477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f168478h;
    public final boolean i;

    public i(String title, String str, String searchPlaceholder, String emptyResultTitle, String emptyResultSubtitle, String noResultsDisclaimer, String buttonTitle, h availableContacts, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(searchPlaceholder, "searchPlaceholder");
        Intrinsics.checkNotNullParameter(emptyResultTitle, "emptyResultTitle");
        Intrinsics.checkNotNullParameter(emptyResultSubtitle, "emptyResultSubtitle");
        Intrinsics.checkNotNullParameter(noResultsDisclaimer, "noResultsDisclaimer");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(availableContacts, "availableContacts");
        this.f168474a = title;
        this.f168475b = str;
        this.f168476c = searchPlaceholder;
        this.d = emptyResultTitle;
        this.e = emptyResultSubtitle;
        this.f = noResultsDisclaimer;
        this.f168477g = buttonTitle;
        this.f168478h = availableContacts;
        this.i = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f168474a, iVar.f168474a) && Intrinsics.f(this.f168475b, iVar.f168475b) && Intrinsics.f(this.f168476c, iVar.f168476c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f168477g, iVar.f168477g) && this.f168478h == iVar.f168478h && this.i == iVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.f168474a.hashCode() * 31;
        String str = this.f168475b;
        return Boolean.hashCode(this.i) + ((this.f168478h.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f168476c), 31, this.d), 31, this.e), 31, this.f), 31, this.f168477g)) * 31);
    }
}
