package qo2;

import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f247995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DatePickerConfig f247996c;
    public final LocalDate d;

    public j(String description, ArrayList payments, DatePickerConfig datePickerConfig, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.f247994a = description;
        this.f247995b = payments;
        this.f247996c = datePickerConfig;
        this.d = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f247994a, jVar.f247994a) && this.f247995b.equals(jVar.f247995b) && Intrinsics.f(this.f247996c, jVar.f247996c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f247995b, this.f247994a.hashCode() * 31, 31);
        DatePickerConfig datePickerConfig = this.f247996c;
        int iHashCode = (iB + (datePickerConfig == null ? 0 : datePickerConfig.hashCode())) * 31;
        LocalDate localDate = this.d;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }
}
