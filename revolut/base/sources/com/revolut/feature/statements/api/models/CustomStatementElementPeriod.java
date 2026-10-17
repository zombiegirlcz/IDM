package com.revolut.feature.statements.api.models;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/revolut/feature/statements/api/models/CustomStatementElementPeriod;", "", "id", "", "startDate", "Ljava/time/LocalDate;", "endDate", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "getId", "()Ljava/lang/String;", "getStartDate", "()Ljava/time/LocalDate;", "getEndDate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomStatementElementPeriod {
    private final LocalDate endDate;

    @NotNull
    private final String id;

    @NotNull
    private final LocalDate startDate;

    public CustomStatementElementPeriod(@NotNull String id10, @NotNull LocalDate startDate, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.id = id10;
        this.startDate = startDate;
        this.endDate = localDate;
    }

    public static /* synthetic */ CustomStatementElementPeriod copy$default(CustomStatementElementPeriod customStatementElementPeriod, String str, LocalDate localDate, LocalDate localDate2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = customStatementElementPeriod.id;
        }
        if ((i & 2) != 0) {
            localDate = customStatementElementPeriod.startDate;
        }
        if ((i & 4) != 0) {
            localDate2 = customStatementElementPeriod.endDate;
        }
        return customStatementElementPeriod.copy(str, localDate, localDate2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final CustomStatementElementPeriod copy(@NotNull String id10, @NotNull LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        return new CustomStatementElementPeriod(id10, startDate, endDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomStatementElementPeriod)) {
            return false;
        }
        CustomStatementElementPeriod customStatementElementPeriod = (CustomStatementElementPeriod) other;
        return Intrinsics.f(this.id, customStatementElementPeriod.id) && Intrinsics.f(this.startDate, customStatementElementPeriod.startDate) && Intrinsics.f(this.endDate, customStatementElementPeriod.endDate);
    }

    public final LocalDate getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int iA = y.a(this.id.hashCode() * 31, 31, this.startDate);
        LocalDate localDate = this.endDate;
        return iA + (localDate == null ? 0 : localDate.hashCode());
    }
}
