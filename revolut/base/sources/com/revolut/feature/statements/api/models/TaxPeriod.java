package com.revolut.feature.statements.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/revolut/feature/statements/api/models/TaxPeriod;", "Landroid/os/Parcelable;", "from", "Ljava/time/LocalDate;", "to", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "getFrom", "()Ljava/time/LocalDate;", "getTo", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxPeriod implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TaxPeriod> CREATOR = new Creator();

    @NotNull
    private final LocalDate from;

    @NotNull
    private final LocalDate to;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TaxPeriod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaxPeriod createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxPeriod((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaxPeriod[] newArray(int i) {
            return new TaxPeriod[i];
        }
    }

    public TaxPeriod(@NotNull LocalDate from, @NotNull LocalDate to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.from = from;
        this.to = to6;
    }

    public static /* synthetic */ TaxPeriod copy$default(TaxPeriod taxPeriod, LocalDate localDate, LocalDate localDate2, int i, Object obj2) {
        if ((i & 1) != 0) {
            localDate = taxPeriod.from;
        }
        if ((i & 2) != 0) {
            localDate2 = taxPeriod.to;
        }
        return taxPeriod.copy(localDate, localDate2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LocalDate getFrom() {
        return this.from;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDate getTo() {
        return this.to;
    }

    @NotNull
    public final TaxPeriod copy(@NotNull LocalDate from, @NotNull LocalDate to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        return new TaxPeriod(from, to6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxPeriod)) {
            return false;
        }
        TaxPeriod taxPeriod = (TaxPeriod) other;
        return Intrinsics.f(this.from, taxPeriod.from) && Intrinsics.f(this.to, taxPeriod.to);
    }

    @NotNull
    public final LocalDate getFrom() {
        return this.from;
    }

    @NotNull
    public final LocalDate getTo() {
        return this.to;
    }

    public int hashCode() {
        return this.to.hashCode() + (this.from.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.from);
        dest.writeSerializable(this.to);
    }
}
