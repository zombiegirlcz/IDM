package uj6;

import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f280504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f280505c;

    public n(String fieldId, TextClause title, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f280503a = fieldId;
        this.f280504b = title;
        this.f280505c = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f280503a, nVar.f280503a) && this.f280504b.equals(nVar.f280504b) && Intrinsics.f(this.f280505c, nVar.f280505c);
    }

    public final int hashCode() {
        int iB = v7.b(this.f280503a.hashCode() * 31, 31, this.f280504b);
        LocalDate localDate = this.f280505c;
        return iB + (localDate == null ? 0 : localDate.hashCode());
    }
}
