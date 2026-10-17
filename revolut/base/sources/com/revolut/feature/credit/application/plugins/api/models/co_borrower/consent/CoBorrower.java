package com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/co_borrower/consent/CoBorrower;", "Landroid/os/Parcelable;", "InternalPhone", "ExternalPhone", "InternalUsername", "Lcom/revolut/feature/credit/application/plugins/api/models/co_borrower/consent/CoBorrower$ExternalPhone;", "Lcom/revolut/feature/credit/application/plugins/api/models/co_borrower/consent/CoBorrower$InternalPhone;", "Lcom/revolut/feature/credit/application/plugins/api/models/co_borrower/consent/CoBorrower$InternalUsername;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CoBorrower extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/co_borrower/consent/CoBorrower$ExternalPhone;", "Lcom/revolut/feature/credit/application/plugins/api/models/co_borrower/consent/CoBorrower;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalPhone implements CoBorrower {

        @NotNull
        public static final Parcelable.Creator<ExternalPhone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f66319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f66320c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalPhone((Image) parcel.readParcelable(ExternalPhone.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalPhone[i];
            }
        }

        public ExternalPhone(Image avatar, String name, String phoneNumber) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f66318a = name;
            this.f66319b = avatar;
            this.f66320c = phoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExternalPhone)) {
                return false;
            }
            ExternalPhone externalPhone = (ExternalPhone) obj2;
            return Intrinsics.f(this.f66318a, externalPhone.f66318a) && Intrinsics.f(this.f66319b, externalPhone.f66319b) && Intrinsics.f(this.f66320c, externalPhone.f66320c);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF66324a() {
            return this.f66318a;
        }

        public final int hashCode() {
            return this.f66320c.hashCode() + b.c(this.f66319b, this.f66318a.hashCode() * 31, 31);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getF66325b() {
            return this.f66319b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66318a);
            dest.writeParcelable(this.f66319b, i);
            dest.writeString(this.f66320c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/co_borrower/consent/CoBorrower$InternalPhone;", "Lcom/revolut/feature/credit/application/plugins/api/models/co_borrower/consent/CoBorrower;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InternalPhone implements CoBorrower {

        @NotNull
        public static final Parcelable.Creator<InternalPhone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f66322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f66323c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InternalPhone((Image) parcel.readParcelable(InternalPhone.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InternalPhone[i];
            }
        }

        public InternalPhone(Image avatar, String name, String phoneNumber) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f66321a = name;
            this.f66322b = avatar;
            this.f66323c = phoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InternalPhone)) {
                return false;
            }
            InternalPhone internalPhone = (InternalPhone) obj2;
            return Intrinsics.f(this.f66321a, internalPhone.f66321a) && Intrinsics.f(this.f66322b, internalPhone.f66322b) && Intrinsics.f(this.f66323c, internalPhone.f66323c);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF66324a() {
            return this.f66321a;
        }

        public final int hashCode() {
            return this.f66323c.hashCode() + b.c(this.f66322b, this.f66321a.hashCode() * 31, 31);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getF66325b() {
            return this.f66322b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66321a);
            dest.writeParcelable(this.f66322b, i);
            dest.writeString(this.f66323c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/co_borrower/consent/CoBorrower$InternalUsername;", "Lcom/revolut/feature/credit/application/plugins/api/models/co_borrower/consent/CoBorrower;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InternalUsername implements CoBorrower {

        @NotNull
        public static final Parcelable.Creator<InternalUsername> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f66325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f66326c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InternalUsername((Image) parcel.readParcelable(InternalUsername.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InternalUsername[i];
            }
        }

        public InternalUsername(Image avatar, String name, String username) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(username, "username");
            this.f66324a = name;
            this.f66325b = avatar;
            this.f66326c = username;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InternalUsername)) {
                return false;
            }
            InternalUsername internalUsername = (InternalUsername) obj2;
            return Intrinsics.f(this.f66324a, internalUsername.f66324a) && Intrinsics.f(this.f66325b, internalUsername.f66325b) && Intrinsics.f(this.f66326c, internalUsername.f66326c);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF66324a() {
            return this.f66324a;
        }

        public final int hashCode() {
            return this.f66326c.hashCode() + b.c(this.f66325b, this.f66324a.hashCode() * 31, 31);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrower
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getF66325b() {
            return this.f66325b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66324a);
            dest.writeParcelable(this.f66325b, i);
            dest.writeString(this.f66326c);
        }
    }

    /* JADX INFO: renamed from: getName */
    String getF66324a();

    /* JADX INFO: renamed from: v */
    Image getF66325b();
}
