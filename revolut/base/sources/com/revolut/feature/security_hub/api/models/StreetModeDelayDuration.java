package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/StreetModeDelayDuration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StreetModeDelayDuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StreetModeDelayDuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85420c;
    public final String d;
    public final StreetModeDelayDurationDisclaimer e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StreetModeDelayDuration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StreetModeDelayDurationDisclaimer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StreetModeDelayDuration[i];
        }
    }

    public StreetModeDelayDuration(String durationCode, String title, String subtitle, String description, StreetModeDelayDurationDisclaimer streetModeDelayDurationDisclaimer, boolean z) {
        Intrinsics.checkNotNullParameter(durationCode, "durationCode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f85418a = durationCode;
        this.f85419b = title;
        this.f85420c = subtitle;
        this.d = description;
        this.e = streetModeDelayDurationDisclaimer;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StreetModeDelayDuration)) {
            return false;
        }
        StreetModeDelayDuration streetModeDelayDuration = (StreetModeDelayDuration) obj2;
        return Intrinsics.f(this.f85418a, streetModeDelayDuration.f85418a) && Intrinsics.f(this.f85419b, streetModeDelayDuration.f85419b) && Intrinsics.f(this.f85420c, streetModeDelayDuration.f85420c) && Intrinsics.f(this.d, streetModeDelayDuration.d) && Intrinsics.f(this.e, streetModeDelayDuration.e) && this.f == streetModeDelayDuration.f;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f85418a.hashCode() * 31, 31, this.f85419b), 31, this.f85420c), 31, this.d);
        StreetModeDelayDurationDisclaimer streetModeDelayDurationDisclaimer = this.e;
        return Boolean.hashCode(this.f) + ((iC + (streetModeDelayDurationDisclaimer == null ? 0 : streetModeDelayDurationDisclaimer.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85418a);
        dest.writeString(this.f85419b);
        dest.writeString(this.f85420c);
        dest.writeString(this.d);
        StreetModeDelayDurationDisclaimer streetModeDelayDurationDisclaimer = this.e;
        if (streetModeDelayDurationDisclaimer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            streetModeDelayDurationDisclaimer.writeToParcel(dest, i);
        }
        dest.writeInt(this.f ? 1 : 0);
    }
}
