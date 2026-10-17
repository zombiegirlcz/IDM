package x42;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f302778c;

    public d(boolean z) {
        super(new TextLocalisedClause(R$string.apm_transfer_amount_settings_field_amount, null, null, 14), "ID_EDITABLE_AMOUNT");
        this.f302778c = z;
    }

    @Override // x42.c
    public final boolean a() {
        return this.f302778c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f302778c == ((d) obj2).f302778c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f302778c);
    }
}
