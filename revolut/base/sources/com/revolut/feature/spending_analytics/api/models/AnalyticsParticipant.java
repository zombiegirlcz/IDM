package com.revolut.feature.spending_analytics.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/AnalyticsParticipant;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsParticipant implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AnalyticsParticipant> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87446c;
    public final String d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnalyticsParticipant(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsParticipant[i];
        }
    }

    public AnalyticsParticipant(String id10, String firstName, String lastName, String code, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f87444a = id10;
        this.f87445b = firstName;
        this.f87446c = lastName;
        this.d = code;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AnalyticsParticipant)) {
            return false;
        }
        AnalyticsParticipant analyticsParticipant = (AnalyticsParticipant) obj2;
        return Intrinsics.f(this.f87444a, analyticsParticipant.f87444a) && Intrinsics.f(this.f87445b, analyticsParticipant.f87445b) && Intrinsics.f(this.f87446c, analyticsParticipant.f87446c) && Intrinsics.f(this.d, analyticsParticipant.d) && this.e == analyticsParticipant.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(p.a.c(p.a.c(this.f87444a.hashCode() * 31, 31, this.f87445b), 31, this.f87446c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87444a);
        dest.writeString(this.f87445b);
        dest.writeString(this.f87446c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
    }
}
