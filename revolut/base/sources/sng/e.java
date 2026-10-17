package sng;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f264610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f264611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f264612c;
    public final Clause d;

    public e(LocalDate localDate, TextLocalisedClause textLocalisedClause, boolean z, Clause largeButtonText) {
        Intrinsics.checkNotNullParameter(largeButtonText, "largeButtonText");
        this.f264610a = localDate;
        this.f264611b = textLocalisedClause;
        this.f264612c = z;
        this.d = largeButtonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f264610a, eVar.f264610a) && Intrinsics.f(this.f264611b, eVar.f264611b) && this.f264612c == eVar.f264612c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        LocalDate localDate = this.f264610a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        TextLocalisedClause textLocalisedClause = this.f264611b;
        return this.d.hashCode() + j6.a.c((iHashCode + (textLocalisedClause != null ? textLocalisedClause.hashCode() : 0)) * 31, 31, this.f264612c);
    }
}
