package at;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f8968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f8969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8970c;
    public final String d;
    public final boolean e;

    public o(TextLocalisedClause title, TextLocalisedClause description, String expiryYear, String securityCode, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(expiryYear, "expiryYear");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        this.f8968a = title;
        this.f8969b = description;
        this.f8970c = expiryYear;
        this.d = securityCode;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f8968a.equals(oVar.f8968a) && this.f8969b.equals(oVar.f8969b) && Intrinsics.f(this.f8970c, oVar.f8970c) && Intrinsics.f(this.d, oVar.d) && this.e == oVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(p.a.c(t61.a.a(this.f8968a.hashCode() * 31, 31, this.f8969b), 31, this.f8970c), 31, this.d);
    }
}
