package x42;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f302779c;

    public e(boolean z) {
        super(new TextLocalisedClause(R$string.apm_transfer_amount_settings_field_note, null, null, 14), "ID_EDITABLE_NOTE");
        this.f302779c = z;
    }

    @Override // x42.c
    public final boolean a() {
        return this.f302779c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f302779c == ((e) obj2).f302779c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f302779c);
    }
}
