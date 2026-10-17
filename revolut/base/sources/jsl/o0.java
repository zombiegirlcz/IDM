package jsl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f178228b;

    public o0(TextLocalisedClause textLocalisedClause, String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f178227a = url2;
        this.f178228b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f178227a, o0Var.f178227a) && this.f178228b.equals(o0Var.f178228b);
    }

    public final int hashCode() {
        return this.f178228b.hashCode() + (this.f178227a.hashCode() * 31);
    }
}
