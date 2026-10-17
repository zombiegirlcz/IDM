package sng;

import com.revolut.shared.feature.user_declarations.api.models.DateOfBirthScreenConfig;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f264608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateOfBirthScreenConfig f264609b;

    public d(LocalDate localDate, DateOfBirthScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        this.f264608a = localDate;
        this.f264609b = screenConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f264608a, dVar.f264608a) && Intrinsics.f(this.f264609b, dVar.f264609b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f264608a;
        return this.f264609b.hashCode() + ((localDate == null ? 0 : localDate.hashCode()) * 31);
    }
}
