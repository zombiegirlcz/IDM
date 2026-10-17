package com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/sign_in_methods/impl/ui/sign_in_methods/SignInMethodsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "BankIdDeeplink", "DAPDeeplink", "Lcom/revolut/feature/sign_in_methods/impl/ui/sign_in_methods/SignInMethodsScreenContract$InputData$BankIdDeeplink;", "Lcom/revolut/feature/sign_in_methods/impl/ui/sign_in_methods/SignInMethodsScreenContract$InputData$DAPDeeplink;", "feature_sign_in_methods_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SignInMethodsScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/sign_in_methods/impl/ui/sign_in_methods/SignInMethodsScreenContract$InputData$BankIdDeeplink;", "Lcom/revolut/feature/sign_in_methods/impl/ui/sign_in_methods/SignInMethodsScreenContract$InputData;", "feature_sign_in_methods_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BankIdDeeplink extends SignInMethodsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<BankIdDeeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87245a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankIdDeeplink(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankIdDeeplink[i];
            }
        }

        public BankIdDeeplink(String challengeId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            this.f87245a = challengeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87245a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/sign_in_methods/impl/ui/sign_in_methods/SignInMethodsScreenContract$InputData$DAPDeeplink;", "Lcom/revolut/feature/sign_in_methods/impl/ui/sign_in_methods/SignInMethodsScreenContract$InputData;", "feature_sign_in_methods_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DAPDeeplink extends SignInMethodsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<DAPDeeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87246a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DAPDeeplink(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DAPDeeplink[i];
            }
        }

        public DAPDeeplink(String challengeId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            this.f87246a = challengeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87246a);
        }
    }

    private SignInMethodsScreenContract$InputData() {
    }
}
