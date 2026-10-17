package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/api/model/PortabilityRequestArgsModel;", "Landroid/os/Parcelable;", "SameOwnership", "DifferentOwnership", "Lcom/revolut/feature/pix/api/model/PortabilityRequestArgsModel$DifferentOwnership;", "Lcom/revolut/feature/pix/api/model/PortabilityRequestArgsModel$SameOwnership;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PortabilityRequestArgsModel implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PortabilityRequestArgsModel$DifferentOwnership;", "Lcom/revolut/feature/pix/api/model/PortabilityRequestArgsModel;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DifferentOwnership extends PortabilityRequestArgsModel {

        @NotNull
        public static final Parcelable.Creator<DifferentOwnership> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80481b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DifferentOwnership(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DifferentOwnership[i];
            }
        }

        public DifferentOwnership(String operationId, String str) {
            Intrinsics.checkNotNullParameter(operationId, "operationId");
            this.f80480a = operationId;
            this.f80481b = str;
        }

        @Override // com.revolut.feature.pix.api.model.PortabilityRequestArgsModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF80482a() {
            return this.f80480a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DifferentOwnership)) {
                return false;
            }
            DifferentOwnership differentOwnership = (DifferentOwnership) obj2;
            return Intrinsics.f(this.f80480a, differentOwnership.f80480a) && Intrinsics.f(this.f80481b, differentOwnership.f80481b);
        }

        public final int hashCode() {
            int iHashCode = this.f80480a.hashCode() * 31;
            String str = this.f80481b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80480a);
            dest.writeString(this.f80481b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PortabilityRequestArgsModel$SameOwnership;", "Lcom/revolut/feature/pix/api/model/PortabilityRequestArgsModel;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SameOwnership extends PortabilityRequestArgsModel {

        @NotNull
        public static final Parcelable.Creator<SameOwnership> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80483b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SameOwnership(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SameOwnership[i];
            }
        }

        public SameOwnership(String operationId, String str) {
            Intrinsics.checkNotNullParameter(operationId, "operationId");
            this.f80482a = operationId;
            this.f80483b = str;
        }

        @Override // com.revolut.feature.pix.api.model.PortabilityRequestArgsModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF80482a() {
            return this.f80482a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SameOwnership)) {
                return false;
            }
            SameOwnership sameOwnership = (SameOwnership) obj2;
            return Intrinsics.f(this.f80482a, sameOwnership.f80482a) && Intrinsics.f(this.f80483b, sameOwnership.f80483b);
        }

        public final int hashCode() {
            int iHashCode = this.f80482a.hashCode() * 31;
            String str = this.f80483b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80482a);
            dest.writeString(this.f80483b);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF80482a();
}
