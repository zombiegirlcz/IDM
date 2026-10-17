package mg7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205171c;
    public final List d;

    public i(String title, String subtitle, String terms, List options) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f205169a = title;
        this.f205170b = subtitle;
        this.f205171c = terms;
        this.d = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f205169a, iVar.f205169a) && Intrinsics.f(this.f205170b, iVar.f205170b) && Intrinsics.f(this.f205171c, iVar.f205171c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f205169a.hashCode() * 31, 31, this.f205170b), 31, this.f205171c);
    }
}
