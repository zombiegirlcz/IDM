package nv4;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f219464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f219465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f219466c;
    public final Data d;

    public i(LocalDate localDate, h selectedStatementFormat, Data cachedStatementFile, Data data) {
        Intrinsics.checkNotNullParameter(selectedStatementFormat, "selectedStatementFormat");
        Intrinsics.checkNotNullParameter(cachedStatementFile, "cachedStatementFile");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f219464a = localDate;
        this.f219465b = selectedStatementFormat;
        this.f219466c = cachedStatementFile;
        this.d = data;
    }

    public static i a(i iVar, LocalDate localDate, h selectedStatementFormat, Data cachedStatementFile, Data data, int i) {
        if ((i & 1) != 0) {
            localDate = iVar.f219464a;
        }
        if ((i & 2) != 0) {
            selectedStatementFormat = iVar.f219465b;
        }
        if ((i & 4) != 0) {
            cachedStatementFile = iVar.f219466c;
        }
        if ((i & 8) != 0) {
            data = iVar.d;
        }
        iVar.getClass();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(selectedStatementFormat, "selectedStatementFormat");
        Intrinsics.checkNotNullParameter(cachedStatementFile, "cachedStatementFile");
        Intrinsics.checkNotNullParameter(data, "data");
        return new i(localDate, selectedStatementFormat, cachedStatementFile, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f219464a, iVar.f219464a) && this.f219465b == iVar.f219465b && Intrinsics.f(this.f219466c, iVar.f219466c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        LocalDate localDate = this.f219464a;
        return kii.e.c(this.d, kii.e.c(this.f219466c, (this.f219465b.hashCode() + ((localDate == null ? 0 : localDate.hashCode()) * 31)) * 31, 31), 31);
    }
}
