package tv4;

import ip0.v7;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f274695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f274696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vl4.g f274697c;
    public final LinkedHashMap d;

    public d(LocalDate referenceDate, dj0.d statementBalance, vl4.g statement, LinkedHashMap transactionsByDate) {
        Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
        Intrinsics.checkNotNullParameter(statementBalance, "statementBalance");
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(transactionsByDate, "transactionsByDate");
        this.f274695a = referenceDate;
        this.f274696b = statementBalance;
        this.f274697c = statement;
        this.d = transactionsByDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f274695a, dVar.f274695a) && this.f274696b.equals(dVar.f274696b) && Intrinsics.f(this.f274697c, dVar.f274697c) && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f274697c.hashCode() + v7.c(this.f274695a.hashCode() * 31, 31, this.f274696b)) * 31);
    }
}
