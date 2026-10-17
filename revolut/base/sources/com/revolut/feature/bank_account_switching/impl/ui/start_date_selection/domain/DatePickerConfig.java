package com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/start_date_selection/domain/DatePickerConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DatePickerConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f63987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f63988c;
    public final Set d;

    @NotNull
    public static final Parcelable.Creator<DatePickerConfig> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iD = 0;
            while (iD != i) {
                iD = v7.d(parcel, linkedHashSet, iD, 1);
            }
            return new DatePickerConfig(string, localDate, localDate2, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DatePickerConfig[i];
        }
    }

    static {
        new DatePickerConfig(null, null, null, h0.f322473a);
    }

    public DatePickerConfig(String str, LocalDate localDate, LocalDate localDate2, Set excludedDates) {
        Intrinsics.checkNotNullParameter(excludedDates, "excludedDates");
        this.f63986a = str;
        this.f63987b = localDate;
        this.f63988c = localDate2;
        this.d = excludedDates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DatePickerConfig)) {
            return false;
        }
        DatePickerConfig datePickerConfig = (DatePickerConfig) obj2;
        return Intrinsics.f(this.f63986a, datePickerConfig.f63986a) && Intrinsics.f(this.f63987b, datePickerConfig.f63987b) && Intrinsics.f(this.f63988c, datePickerConfig.f63988c) && Intrinsics.f(this.d, datePickerConfig.d);
    }

    public final int hashCode() {
        String str = this.f63986a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalDate localDate = this.f63987b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f63988c;
        return this.d.hashCode() + ((iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63986a);
        dest.writeSerializable(this.f63987b);
        dest.writeSerializable(this.f63988c);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
