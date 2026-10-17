package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/api/models/SsoChangeClaimMode;", "Landroid/os/Parcelable;", "Current", "Multiple", "Lcom/revolut/sso/api/models/SsoChangeClaimMode$Current;", "Lcom/revolut/sso/api/models/SsoChangeClaimMode$Multiple;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SsoChangeClaimMode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/models/SsoChangeClaimMode$Current;", "Lcom/revolut/sso/api/models/SsoChangeClaimMode;", "<init>", "()V", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Current implements SsoChangeClaimMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Current f105982a = new Current();

        @NotNull
        public static final Parcelable.Creator<Current> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Current.f105982a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Current[i];
            }
        }

        private Current() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/models/SsoChangeClaimMode$Multiple;", "Lcom/revolut/sso/api/models/SsoChangeClaimMode;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Multiple implements SsoChangeClaimMode {

        @NotNull
        public static final Parcelable.Creator<Multiple> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105983a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Multiple(((RegisteredIdentityId) parcel.readParcelable(Multiple.class.getClassLoader())).f74764a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Multiple[i];
            }
        }

        public Multiple(String accountIdChangeInitiated) {
            Intrinsics.checkNotNullParameter(accountIdChangeInitiated, "accountIdChangeInitiated");
            this.f105983a = accountIdChangeInitiated;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Multiple) && Intrinsics.f(this.f105983a, ((Multiple) obj2).f105983a);
        }

        public final int hashCode() {
            return this.f105983a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            e.x(this.f105983a, dest, i);
        }
    }
}
