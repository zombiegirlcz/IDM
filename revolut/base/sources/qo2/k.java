package qo2;

import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f247998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DatePickerConfig f247999c;
    public final int d;

    public k(String description, Map payments, DatePickerConfig transferDateConfig) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(transferDateConfig, "transferDateConfig");
        this.f247997a = description;
        this.f247998b = payments;
        this.f247999c = transferDateConfig;
        Collection<i> collectionValues = payments.values();
        int i = 0;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            for (i iVar : collectionValues) {
                if (iVar.f247993b && iVar.f247992a.f247987l && (i = i + 1) < 0) {
                    v.r();
                    throw null;
                }
            }
        }
        this.d = i;
    }

    public static k a(k kVar, Map payments) {
        String description = kVar.f247997a;
        DatePickerConfig transferDateConfig = kVar.f247999c;
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(transferDateConfig, "transferDateConfig");
        return new k(description, payments, transferDateConfig);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f247997a, kVar.f247997a) && Intrinsics.f(this.f247998b, kVar.f247998b) && Intrinsics.f(this.f247999c, kVar.f247999c);
    }

    public final int hashCode() {
        return this.f247999c.hashCode() + p.a.e(this.f247997a.hashCode() * 31, 31, this.f247998b);
    }
}
