package com.revolut.feature.statements.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/revolut/feature/statements/api/models/StatementPeriod;", "Landroid/os/Parcelable;", "start", "Ljava/time/LocalDate;", "end", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "getStart", "()Ljava/time/LocalDate;", "getEnd", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementPeriod implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StatementPeriod> CREATOR = new Creator();

    @NotNull
    private final LocalDate end;

    @NotNull
    private final LocalDate start;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StatementPeriod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StatementPeriod createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StatementPeriod((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StatementPeriod[] newArray(int i) {
            return new StatementPeriod[i];
        }
    }

    public StatementPeriod(@NotNull LocalDate start, @NotNull LocalDate end2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.start = start;
        this.end = end2;
    }

    public static /* synthetic */ StatementPeriod copy$default(StatementPeriod statementPeriod, LocalDate localDate, LocalDate localDate2, int i, Object obj2) {
        if ((i & 1) != 0) {
            localDate = statementPeriod.start;
        }
        if ((i & 2) != 0) {
            localDate2 = statementPeriod.end;
        }
        return statementPeriod.copy(localDate, localDate2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LocalDate getStart() {
        return this.start;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDate getEnd() {
        return this.end;
    }

    @NotNull
    public final StatementPeriod copy(@NotNull LocalDate start, @NotNull LocalDate end2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        return new StatementPeriod(start, end2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementPeriod)) {
            return false;
        }
        StatementPeriod statementPeriod = (StatementPeriod) other;
        return Intrinsics.f(this.start, statementPeriod.start) && Intrinsics.f(this.end, statementPeriod.end);
    }

    @NotNull
    public final LocalDate getEnd() {
        return this.end;
    }

    @NotNull
    public final LocalDate getStart() {
        return this.start;
    }

    public int hashCode() {
        return this.end.hashCode() + (this.start.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.start);
        dest.writeSerializable(this.end);
    }
}
