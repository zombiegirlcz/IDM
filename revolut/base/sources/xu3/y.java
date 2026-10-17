package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f308953c;
    public final String d;

    public y(String title, String str, String search, String buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f308951a = title;
        this.f308952b = str;
        this.f308953c = search;
        this.d = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f308951a, yVar.f308951a) && Intrinsics.f(this.f308952b, yVar.f308952b) && Intrinsics.f(this.f308953c, yVar.f308953c) && Intrinsics.f(this.d, yVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f308951a.hashCode() * 31;
        String str = this.f308952b;
        return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f308953c);
    }
}
