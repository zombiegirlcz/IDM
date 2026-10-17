package com.revolut.feature.credit.autopay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import h30.l;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/AccountDetails;", "Landroid/os/Parcelable;", "LinkedAccount", "Lcom/revolut/feature/credit/autopay/models/AccountDetails$LinkedAccount;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountDetails extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/AccountDetails$LinkedAccount;", "Lcom/revolut/feature/credit/autopay/models/AccountDetails;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccount implements AccountDetails {

        @NotNull
        public static final Parcelable.Creator<LinkedAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f68541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f68542c;
        public final String d;
        public final Image e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f68543g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f68544h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccount(parcel.readString(), (d) parcel.readSerializable(), (b) parcel.readSerializable(), parcel.readString(), (Image) parcel.readParcelable(LinkedAccount.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccount[i];
            }
        }

        public LinkedAccount(String institutionName, d pocket, b currency, String pocketName, Image image, String bankIdentifier, String accountNumber, String str) {
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(pocketName, "pocketName");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(bankIdentifier, "bankIdentifier");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.f68540a = institutionName;
            this.f68541b = pocket;
            this.f68542c = currency;
            this.d = pocketName;
            this.e = image;
            this.f = bankIdentifier;
            this.f68543g = accountNumber;
            this.f68544h = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedAccount)) {
                return false;
            }
            LinkedAccount linkedAccount = (LinkedAccount) obj2;
            return Intrinsics.f(this.f68540a, linkedAccount.f68540a) && Intrinsics.f(this.f68541b, linkedAccount.f68541b) && Intrinsics.f(this.f68542c, linkedAccount.f68542c) && Intrinsics.f(this.d, linkedAccount.d) && Intrinsics.f(this.e, linkedAccount.e) && Intrinsics.f(this.f, linkedAccount.f) && Intrinsics.f(this.f68543g, linkedAccount.f68543g) && Intrinsics.f(this.f68544h, linkedAccount.f68544h);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(a10.b.c(this.e, p.a.c(l.j(this.f68542c, l.g(this.f68541b, this.f68540a.hashCode() * 31, 31), 31), 31, this.d), 31), 31, this.f), 31, this.f68543g);
            String str = this.f68544h;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68540a);
            dest.writeSerializable(this.f68541b);
            dest.writeSerializable(this.f68542c);
            dest.writeString(this.d);
            dest.writeParcelable(this.e, i);
            dest.writeString(this.f);
            dest.writeString(this.f68543g);
            dest.writeString(this.f68544h);
        }
    }
}
