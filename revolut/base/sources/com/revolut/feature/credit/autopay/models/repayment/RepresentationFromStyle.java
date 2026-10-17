package com.revolut.feature.credit.autopay.models.repayment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationFromStyle;", "Landroid/os/Parcelable;", "RevolutWallet", "JointAccount", "ExternalAccount", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationFromStyle$ExternalAccount;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationFromStyle$JointAccount;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationFromStyle$RevolutWallet;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RepresentationFromStyle extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationFromStyle$ExternalAccount;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationFromStyle;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalAccount implements RepresentationFromStyle {

        @NotNull
        public static final Parcelable.Creator<ExternalAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f68567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f68568b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalAccount((Clause) parcel.readParcelable(ExternalAccount.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalAccount[i];
            }
        }

        public ExternalAccount(Clause accountName, boolean z) {
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            this.f68567a = accountName;
            this.f68568b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExternalAccount)) {
                return false;
            }
            ExternalAccount externalAccount = (ExternalAccount) obj2;
            return Intrinsics.f(this.f68567a, externalAccount.f68567a) && this.f68568b == externalAccount.f68568b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f68568b) + (this.f68567a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68567a, i);
            dest.writeInt(this.f68568b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationFromStyle$JointAccount;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationFromStyle;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointAccount implements RepresentationFromStyle {

        @NotNull
        public static final Parcelable.Creator<JointAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f68569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f68570b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointAccount((b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointAccount[i];
            }
        }

        public JointAccount(b currency, boolean z) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f68569a = z;
            this.f68570b = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JointAccount)) {
                return false;
            }
            JointAccount jointAccount = (JointAccount) obj2;
            return this.f68569a == jointAccount.f68569a && Intrinsics.f(this.f68570b, jointAccount.f68570b);
        }

        public final int hashCode() {
            return this.f68570b.hashCode() + (Boolean.hashCode(this.f68569a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f68569a ? 1 : 0);
            dest.writeSerializable(this.f68570b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationFromStyle$RevolutWallet;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepresentationFromStyle;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutWallet implements RepresentationFromStyle {

        @NotNull
        public static final Parcelable.Creator<RevolutWallet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f68572b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevolutWallet(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutWallet[i];
            }
        }

        public RevolutWallet() {
            this((String) null, 3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevolutWallet)) {
                return false;
            }
            RevolutWallet revolutWallet = (RevolutWallet) obj2;
            return Intrinsics.f(this.f68571a, revolutWallet.f68571a) && this.f68572b == revolutWallet.f68572b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f68572b) + (this.f68571a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68571a);
            dest.writeInt(this.f68572b ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RevolutWallet(String str, int i) {
            if ((i & 1) != 0) {
                b.Companion.getClass();
                str = b.i.f306286a;
            }
            this(str, false);
        }

        public RevolutWallet(String code, boolean z) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f68571a = code;
            this.f68572b = z;
        }
    }
}
