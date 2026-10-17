package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACClaimFlowMode;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Native", "EverydayProtection", "a", "Lcom/revolut/feature/insurance/api/models/details/CFACClaimFlowMode$EverydayProtection;", "Lcom/revolut/feature/insurance/api/models/details/CFACClaimFlowMode$Native;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CFACClaimFlowMode implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACClaimFlowMode$EverydayProtection;", "Lcom/revolut/feature/insurance/api/models/details/CFACClaimFlowMode;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EverydayProtection extends CFACClaimFlowMode {

        @NotNull
        public static final Parcelable.Creator<EverydayProtection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dl7.a f74971b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EverydayProtection(parcel.readString(), dl7.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EverydayProtection[i];
            }
        }

        public EverydayProtection(String policyId, dl7.a policySubtype) {
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            Intrinsics.checkNotNullParameter(policySubtype, "policySubtype");
            this.f74970a = policyId;
            this.f74971b = policySubtype;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EverydayProtection)) {
                return false;
            }
            EverydayProtection everydayProtection = (EverydayProtection) obj2;
            return Intrinsics.f(this.f74970a, everydayProtection.f74970a) && this.f74971b == everydayProtection.f74971b;
        }

        public final int hashCode() {
            return this.f74971b.hashCode() + (this.f74970a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74970a);
            dest.writeString(this.f74971b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACClaimFlowMode$Native;", "Lcom/revolut/feature/insurance/api/models/details/CFACClaimFlowMode;", "<init>", "()V", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Native extends CFACClaimFlowMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Native f74972a = new Native();

        @NotNull
        public static final Parcelable.Creator<Native> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Native.f74972a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Native[i];
            }
        }

        private Native() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private CFACClaimFlowMode() {
    }
}
