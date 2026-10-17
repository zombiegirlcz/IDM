package m2f;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f201973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f201974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f201975c;

    public k(TextLocalisedClause text, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f201973a = text;
        this.f201974b = z;
        this.f201975c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f201973a.equals(kVar.f201973a) && this.f201974b == kVar.f201974b && this.f201975c == kVar.f201975c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201975c) + j6.a.c(this.f201973a.hashCode() * 31, 31, this.f201974b);
    }
}
