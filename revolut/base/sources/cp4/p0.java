package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107846c;

    public p0(String facilityId, String format) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f107844a = facilityId;
        this.f107845b = format;
        this.f107846c = j6.a.s("credit_card_statements_", facilityId, "_", format, "_null");
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends xo4.z>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$Statements$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f107844a, p0Var.f107844a) && Intrinsics.f(this.f107845b, p0Var.f107845b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107846c;
    }

    public final int hashCode() {
        return p.a.c(this.f107844a.hashCode() * 31, 31, this.f107845b);
    }
}
