package com.revolut.domain.models.topup.methods;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/domain/models/topup/methods/PreselectedTopUpMethodId;", "Landroid/os/Parcelable;", "<init>", "()V", "ExternalPocketId", "OtherMethodType", "StoredMethodId", "Lcom/revolut/domain/models/topup/methods/PreselectedTopUpMethodId$ExternalPocketId;", "Lcom/revolut/domain/models/topup/methods/PreselectedTopUpMethodId$OtherMethodType;", "Lcom/revolut/domain/models/topup/methods/PreselectedTopUpMethodId$StoredMethodId;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PreselectedTopUpMethodId implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/PreselectedTopUpMethodId$ExternalPocketId;", "Lcom/revolut/domain/models/topup/methods/PreselectedTopUpMethodId;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalPocketId extends PreselectedTopUpMethodId {

        @NotNull
        public static final Parcelable.Creator<ExternalPocketId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60436a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalPocketId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalPocketId[i];
            }
        }

        public ExternalPocketId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f60436a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExternalPocketId) && Intrinsics.f(this.f60436a, ((ExternalPocketId) obj2).f60436a);
        }

        public final int hashCode() {
            return this.f60436a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60436a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/PreselectedTopUpMethodId$OtherMethodType;", "Lcom/revolut/domain/models/topup/methods/PreselectedTopUpMethodId;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OtherMethodType extends PreselectedTopUpMethodId {

        @NotNull
        public static final Parcelable.Creator<OtherMethodType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopupMethodType f60437a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OtherMethodType(TopupMethodType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OtherMethodType[i];
            }
        }

        public OtherMethodType(TopupMethodType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f60437a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OtherMethodType) && this.f60437a == ((OtherMethodType) obj2).f60437a;
        }

        public final int hashCode() {
            return this.f60437a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60437a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/topup/methods/PreselectedTopUpMethodId$StoredMethodId;", "Lcom/revolut/domain/models/topup/methods/PreselectedTopUpMethodId;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StoredMethodId extends PreselectedTopUpMethodId {

        @NotNull
        public static final Parcelable.Creator<StoredMethodId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60438a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StoredMethodId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoredMethodId[i];
            }
        }

        public StoredMethodId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f60438a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StoredMethodId) && Intrinsics.f(this.f60438a, ((StoredMethodId) obj2).f60438a);
        }

        public final int hashCode() {
            return this.f60438a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60438a);
        }
    }

    private PreselectedTopUpMethodId() {
    }
}
