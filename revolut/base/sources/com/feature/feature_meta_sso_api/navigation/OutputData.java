package com.feature.feature_meta_sso_api.navigation;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/feature/feature_meta_sso_api/navigation/OutputData;", "Laii/r;", "Landroid/os/Parcelable;", "Success", "Cancelled", "Lcom/feature/feature_meta_sso_api/navigation/OutputData$Cancelled;", "Lcom/feature/feature_meta_sso_api/navigation/OutputData$Success;", "feature_meta_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OutputData extends r, Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/feature/feature_meta_sso_api/navigation/OutputData$Cancelled;", "Lcom/feature/feature_meta_sso_api/navigation/OutputData;", "feature_meta_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cancelled implements OutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cancelled f26213a = new Cancelled();

        @NotNull
        public static final Parcelable.Creator<Cancelled> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Cancelled);
        }

        public final int hashCode() {
            return 1244146872;
        }

        public final String toString() {
            return "Cancelled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/feature/feature_meta_sso_api/navigation/OutputData$Success;", "Lcom/feature/feature_meta_sso_api/navigation/OutputData;", "feature_meta_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements OutputData {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26214a;

        public Success(String accessCode) {
            Intrinsics.checkNotNullParameter(accessCode, "accessCode");
            this.f26214a = accessCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Success) && Intrinsics.f(this.f26214a, ((Success) obj2).f26214a);
        }

        public final int hashCode() {
            return this.f26214a.hashCode();
        }

        public final String toString() {
            return p.a.p("Success(accessCode=", this.f26214a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f26214a);
        }
    }
}
