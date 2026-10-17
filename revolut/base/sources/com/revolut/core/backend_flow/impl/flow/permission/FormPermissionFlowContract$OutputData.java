package com.revolut.core.backend_flow.impl.flow.permission;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"com/revolut/core/backend_flow/impl/flow/permission/FormPermissionFlowContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "Skip", "Success", "Lcom/revolut/core/backend_flow/impl/flow/permission/FormPermissionFlowContract$OutputData$Skip;", "Lcom/revolut/core/backend_flow/impl/flow/permission/FormPermissionFlowContract$OutputData$Success;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FormPermissionFlowContract$OutputData extends r, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/backend_flow/impl/flow/permission/FormPermissionFlowContract$OutputData$Skip;", "Lcom/revolut/core/backend_flow/impl/flow/permission/FormPermissionFlowContract$OutputData;", "<init>", "()V", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Skip implements FormPermissionFlowContract$OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Skip f51233a = new Skip();

        @NotNull
        public static final Parcelable.Creator<Skip> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Skip.f51233a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Skip[i];
            }
        }

        private Skip() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/impl/flow/permission/FormPermissionFlowContract$OutputData$Success;", "Lcom/revolut/core/backend_flow/impl/flow/permission/FormPermissionFlowContract$OutputData;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements FormPermissionFlowContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f51234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f51235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51236c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success() {
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
            if (!(obj2 instanceof Success)) {
                return false;
            }
            Success success = (Success) obj2;
            return Intrinsics.f(this.f51234a, success.f51234a) && Intrinsics.f(this.f51235b, success.f51235b) && Intrinsics.f(this.f51236c, success.f51236c) && Intrinsics.f(this.d, success.d) && Intrinsics.f(this.e, success.e);
        }

        public final int hashCode() {
            Double d = this.f51234a;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d5 = this.f51235b;
            int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
            String str = this.f51236c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Double d = this.f51234a;
            if (d == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
            }
            Double d5 = this.f51235b;
            if (d5 == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d5);
            }
            dest.writeString(this.f51236c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }

        public /* synthetic */ Success(int i) {
            this(null, null, null, null, null);
        }

        public Success(String str, Double d, Double d5, String str2, String str3) {
            this.f51234a = d;
            this.f51235b = d5;
            this.f51236c = str;
            this.d = str2;
            this.e = str3;
        }
    }
}
