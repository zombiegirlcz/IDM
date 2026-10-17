package rr4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f256691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f256692b;

    public o(TextLocalisedClause title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f256691a = title;
        this.f256692b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f256691a.equals(oVar.f256691a) && Intrinsics.f(this.f256692b, oVar.f256692b);
    }

    public final int hashCode() {
        return this.f256692b.hashCode() + (this.f256691a.hashCode() * 31);
    }
}
