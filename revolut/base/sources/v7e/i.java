package v7e;

import com.revolut.feature.subaccount.api.models.SubaccountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubaccountType f286596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f286598c;
    public final String d;

    public i(SubaccountType subaccountType, String name, String imageId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        this.f286596a = subaccountType;
        this.f286597b = name;
        this.f286598c = currency;
        this.d = imageId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f286596a, iVar.f286596a) && Intrinsics.f(this.f286597b, iVar.f286597b) && Intrinsics.f(this.f286598c, iVar.f286598c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.j(this.f286598c, p.a.c(this.f286596a.hashCode() * 31, 31, this.f286597b), 31);
    }
}
