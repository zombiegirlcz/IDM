package d5k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemittanceReferenceField f111428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f111429b;

    public h(RemittanceReferenceField field, TextLocalisedClause userFacingClause) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(userFacingClause, "userFacingClause");
        this.f111428a = field;
        this.f111429b = userFacingClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f111428a.equals(hVar.f111428a) && this.f111429b.equals(hVar.f111429b);
    }

    public final int hashCode() {
        return this.f111429b.hashCode() + (this.f111428a.hashCode() * 31);
    }
}
