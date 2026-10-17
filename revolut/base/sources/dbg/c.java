package dbg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f112745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112746b;

    public c(TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f112745a = text;
        this.f112746b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f112745a, cVar.f112745a) && this.f112746b == cVar.f112746b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112746b) + (this.f112745a.hashCode() * 31);
    }
}
