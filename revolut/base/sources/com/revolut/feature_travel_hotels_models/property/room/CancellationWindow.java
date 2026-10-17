package com.revolut.feature_travel_hotels_models.property.room;

import android.os.Parcel;
import android.os.Parcelable;
import cgi.b;
import com.revolut.feature_travel_hotels_models.property.cancellation.CancelPenalties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/room/CancellationWindow;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "cgi/b", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CancellationWindow implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CancellationWindow> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f98095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f98096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f98097c;
    public final CancelPenalties d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CancellationWindow((DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), b.valueOf(parcel.readString()), (CancelPenalties) parcel.readParcelable(CancellationWindow.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CancellationWindow[i];
        }
    }

    public CancellationWindow(DateTime dateTime, DateTime dateTime2, b type, CancelPenalties penalties) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(penalties, "penalties");
        this.f98095a = dateTime;
        this.f98096b = dateTime2;
        this.f98097c = type;
        this.d = penalties;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CancellationWindow)) {
            return false;
        }
        CancellationWindow cancellationWindow = (CancellationWindow) obj2;
        return Intrinsics.f(this.f98095a, cancellationWindow.f98095a) && Intrinsics.f(this.f98096b, cancellationWindow.f98096b) && this.f98097c == cancellationWindow.f98097c && Intrinsics.f(this.d, cancellationWindow.d);
    }

    public final int hashCode() {
        DateTime dateTime = this.f98095a;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        DateTime dateTime2 = this.f98096b;
        return this.d.hashCode() + ((this.f98097c.hashCode() + ((iHashCode + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f98095a);
        dest.writeSerializable(this.f98096b);
        dest.writeString(this.f98097c.name());
        dest.writeParcelable(this.d, i);
    }
}
