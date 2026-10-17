package com.revolut.core.backend_flow.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/backend_flow/domain/model/PermissionFlowResult;", "Landroid/os/Parcelable;", "Companion", "Success", "Cancelled", "Skipped", "a", "Lcom/revolut/core/backend_flow/domain/model/PermissionFlowResult$Cancelled;", "Lcom/revolut/core/backend_flow/domain/model/PermissionFlowResult$Skipped;", "Lcom/revolut/core/backend_flow/domain/model/PermissionFlowResult$Success;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PermissionFlowResult extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f51229a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/backend_flow/domain/model/PermissionFlowResult$Cancelled;", "Lcom/revolut/core/backend_flow/domain/model/PermissionFlowResult;", "<init>", "()V", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancelled implements PermissionFlowResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cancelled f51224a = new Cancelled();

        @NotNull
        public static final Parcelable.Creator<Cancelled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancelled.f51224a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancelled[i];
            }
        }

        private Cancelled() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/backend_flow/domain/model/PermissionFlowResult$Skipped;", "Lcom/revolut/core/backend_flow/domain/model/PermissionFlowResult;", "<init>", "()V", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Skipped implements PermissionFlowResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Skipped f51225a = new Skipped();

        @NotNull
        public static final Parcelable.Creator<Skipped> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Skipped.f51225a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Skipped[i];
            }
        }

        private Skipped() {
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

    /* JADX INFO: renamed from: com.revolut.core.backend_flow.domain.model.PermissionFlowResult$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f51229a = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/domain/model/PermissionFlowResult$Success;", "Lcom/revolut/core/backend_flow/domain/model/PermissionFlowResult;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements PermissionFlowResult {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f51226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f51227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51228c;
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

        public Success(String str, Double d, Double d5, String str2, String str3) {
            this.f51226a = d;
            this.f51227b = d5;
            this.f51228c = str;
            this.d = str2;
            this.e = str3;
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
            return Intrinsics.f(this.f51226a, success.f51226a) && Intrinsics.f(this.f51227b, success.f51227b) && Intrinsics.f(this.f51228c, success.f51228c) && Intrinsics.f(this.d, success.d) && Intrinsics.f(this.e, success.e);
        }

        public final int hashCode() {
            Double d = this.f51226a;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d5 = this.f51227b;
            int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
            String str = this.f51228c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Double d = this.f51226a;
            if (d == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
            }
            Double d5 = this.f51227b;
            if (d5 == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d5);
            }
            dest.writeString(this.f51228c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }

        public Success() {
            this(null, null, null, null, null);
        }
    }
}
