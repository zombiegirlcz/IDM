package vm5;

import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f290538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f290539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f290540c;

    public g(TextLocalisedClause textLocalisedClause, LocalDate localDate, boolean z) {
        this.f290538a = localDate;
        this.f290539b = textLocalisedClause;
        this.f290540c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f290538a, gVar.f290538a) && Intrinsics.f(this.f290539b, gVar.f290539b) && this.f290540c == gVar.f290540c;
    }

    public final int hashCode() {
        LocalDate localDate = this.f290538a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        TextLocalisedClause textLocalisedClause = this.f290539b;
        return Boolean.hashCode(this.f290540c) + ((iHashCode + (textLocalisedClause != null ? textLocalisedClause.hashCode() : 0)) * 31);
    }
}
