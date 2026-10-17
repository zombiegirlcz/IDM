package com.revolut.feature.security_hub.api.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo;", "Landroid/os/Parcelable;", "InProgress", "Created", "Ready", "Unknown", "NotFound", "Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo$Created;", "Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo$InProgress;", "Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo$NotFound;", "Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo$Ready;", "Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo$Unknown;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SecurityDelayInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo$Created;", "Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Created implements SecurityDelayInfo {

        @NotNull
        public static final Parcelable.Creator<Created> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85411a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Created(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Created[i];
            }
        }

        public Created(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f85411a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Created) && Intrinsics.f(this.f85411a, ((Created) obj2).f85411a);
        }

        @Override // com.revolut.feature.security_hub.api.models.SecurityDelayInfo
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF85417a() {
            return this.f85411a;
        }

        public final int hashCode() {
            return this.f85411a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85411a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo$InProgress;", "Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InProgress implements SecurityDelayInfo {

        @NotNull
        public static final Parcelable.Creator<InProgress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f85413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f85414c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InProgress(parcel.readString(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InProgress[i];
            }
        }

        public InProgress(String id10, long j2, long j3) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f85412a = id10;
            this.f85413b = j2;
            this.f85414c = j3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InProgress)) {
                return false;
            }
            InProgress inProgress = (InProgress) obj2;
            return Intrinsics.f(this.f85412a, inProgress.f85412a) && this.f85413b == inProgress.f85413b && this.f85414c == inProgress.f85414c;
        }

        @Override // com.revolut.feature.security_hub.api.models.SecurityDelayInfo
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF85417a() {
            return this.f85412a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f85414c) + d.c(this.f85412a.hashCode() * 31, 31, this.f85413b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85412a);
            dest.writeLong(this.f85413b);
            dest.writeLong(this.f85414c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo$NotFound;", "Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotFound implements SecurityDelayInfo {

        @NotNull
        public static final Parcelable.Creator<NotFound> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85415a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotFound(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotFound[i];
            }
        }

        public NotFound() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NotFound) && Intrinsics.f(this.f85415a, ((NotFound) obj2).f85415a);
        }

        @Override // com.revolut.feature.security_hub.api.models.SecurityDelayInfo
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF85417a() {
            return this.f85415a;
        }

        public final int hashCode() {
            return this.f85415a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85415a);
        }

        public NotFound(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f85415a = id10;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NotFound(int i) {
            this("");
            m70.a.c(t0.f186434a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo$Ready;", "Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Ready implements SecurityDelayInfo {

        @NotNull
        public static final Parcelable.Creator<Ready> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85416a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ready(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ready[i];
            }
        }

        public Ready(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f85416a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Ready) && Intrinsics.f(this.f85416a, ((Ready) obj2).f85416a);
        }

        @Override // com.revolut.feature.security_hub.api.models.SecurityDelayInfo
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF85417a() {
            return this.f85416a;
        }

        public final int hashCode() {
            return this.f85416a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85416a);
        }
    }

    /* JADX INFO: renamed from: getId */
    String getF85417a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo$Unknown;", "Lcom/revolut/feature/security_hub/api/models/SecurityDelayInfo;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unknown implements SecurityDelayInfo {

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85417a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unknown(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        public Unknown(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f85417a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unknown) && Intrinsics.f(this.f85417a, ((Unknown) obj2).f85417a);
        }

        @Override // com.revolut.feature.security_hub.api.models.SecurityDelayInfo
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF85417a() {
            return this.f85417a;
        }

        public final int hashCode() {
            return this.f85417a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85417a);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Unknown() {
            this("");
            m70.a.c(t0.f186434a);
        }
    }
}
