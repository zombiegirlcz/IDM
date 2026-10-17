package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/TranscriptDateRange;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TranscriptDateRange implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TranscriptDateRange> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f51076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f51077b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TranscriptDateRange((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TranscriptDateRange[i];
        }
    }

    public TranscriptDateRange(LocalDate start, LocalDate end2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f51076a = start;
        this.f51077b = end2;
        if (start.compareTo((ChronoLocalDate) end2) <= 0) {
            return;
        }
        throw new IllegalArgumentException(("start (" + start + ") must be <= end (" + end2 + ")").toString());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getF51077b() {
        return this.f51077b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getF51076a() {
        return this.f51076a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TranscriptDateRange)) {
            return false;
        }
        TranscriptDateRange transcriptDateRange = (TranscriptDateRange) obj2;
        return Intrinsics.f(this.f51076a, transcriptDateRange.f51076a) && Intrinsics.f(this.f51077b, transcriptDateRange.f51077b);
    }

    public final int hashCode() {
        return this.f51077b.hashCode() + (this.f51076a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f51076a);
        dest.writeSerializable(this.f51077b);
    }
}
