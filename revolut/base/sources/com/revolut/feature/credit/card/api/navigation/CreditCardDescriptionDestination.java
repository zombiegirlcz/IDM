package com.revolut.feature.credit.card.api.navigation;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardKompotDestination;", "", "toString", "()Ljava/lang/String;", "DescriptionConfig", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardDescriptionDestination implements CreditCardKompotDestination {

    @NotNull
    public static final Parcelable.Creator<CreditCardDescriptionDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DescriptionConfig f68907a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig;", "Landroid/os/Parcelable;", "Local", "Remote", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Remote;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface DescriptionConfig extends Parcelable {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig;", "TotalLimit", "SecuredTotalLimit", "SpendingLimit", "Apr", "LateInterest", "PromotionalBalancePeriod", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$Apr;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$LateInterest;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$PromotionalBalancePeriod;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$SecuredTotalLimit;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$SpendingLimit;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$TotalLimit;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Local extends DescriptionConfig {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$Apr;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Apr implements Local {

                @NotNull
                public static final Parcelable.Creator<Apr> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f68908a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Apr((b) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Apr[i];
                    }
                }

                public Apr(b countryCode) {
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    this.f68908a = countryCode;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Apr) && Intrinsics.f(this.f68908a, ((Apr) obj2).f68908a);
                }

                public final int hashCode() {
                    return this.f68908a.f297794a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f68908a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$LateInterest;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class LateInterest implements Local {

                @NotNull
                public static final Parcelable.Creator<LateInterest> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f68909a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new LateInterest((b) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new LateInterest[i];
                    }
                }

                public LateInterest(b countryCode) {
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    this.f68909a = countryCode;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof LateInterest) && Intrinsics.f(this.f68909a, ((LateInterest) obj2).f68909a);
                }

                public final int hashCode() {
                    return this.f68909a.f297794a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f68909a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$PromotionalBalancePeriod;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class PromotionalBalancePeriod implements Local {

                @NotNull
                public static final Parcelable.Creator<PromotionalBalancePeriod> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final double f68910a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f68911b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f68912c;
                public final b d;
                public final int e;
                public final int f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final String f68913g;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PromotionalBalancePeriod(parcel.readDouble(), parcel.readLong(), parcel.readLong(), (b) parcel.readSerializable(), parcel.readInt(), parcel.readInt(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new PromotionalBalancePeriod[i];
                    }
                }

                public PromotionalBalancePeriod(double d, long j2, long j3, b countryCode, int i, int i2, String str) {
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    this.f68910a = d;
                    this.f68911b = j2;
                    this.f68912c = j3;
                    this.d = countryCode;
                    this.e = i;
                    this.f = i2;
                    this.f68913g = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof PromotionalBalancePeriod)) {
                        return false;
                    }
                    PromotionalBalancePeriod promotionalBalancePeriod = (PromotionalBalancePeriod) obj2;
                    return Double.compare(this.f68910a, promotionalBalancePeriod.f68910a) == 0 && this.f68911b == promotionalBalancePeriod.f68911b && this.f68912c == promotionalBalancePeriod.f68912c && Intrinsics.f(this.d, promotionalBalancePeriod.d) && this.e == promotionalBalancePeriod.e && this.f == promotionalBalancePeriod.f && Intrinsics.f(this.f68913g, promotionalBalancePeriod.f68913g);
                }

                public final int hashCode() {
                    int iB = j6.a.b(this.f, j6.a.b(this.e, p.a.c(d.c(d.c(Double.hashCode(this.f68910a) * 31, 31, this.f68911b), 31, this.f68912c), 31, this.d.f297794a), 31), 31);
                    String str = this.f68913g;
                    return iB + (str == null ? 0 : str.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeDouble(this.f68910a);
                    dest.writeLong(this.f68911b);
                    dest.writeLong(this.f68912c);
                    dest.writeSerializable(this.d);
                    dest.writeInt(this.e);
                    dest.writeInt(this.f);
                    dest.writeString(this.f68913g);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$SecuredTotalLimit;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SecuredTotalLimit implements Local {

                @NotNull
                public static final Parcelable.Creator<SecuredTotalLimit> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f68914a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f68915b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final dj0.d f68916c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SecuredTotalLimit(parcel.readInt(), (dj0.d) parcel.readSerializable(), (b) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SecuredTotalLimit[i];
                    }
                }

                public SecuredTotalLimit(int i, dj0.d maxLimit, b countryCode) {
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    Intrinsics.checkNotNullParameter(maxLimit, "maxLimit");
                    this.f68914a = countryCode;
                    this.f68915b = i;
                    this.f68916c = maxLimit;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof SecuredTotalLimit)) {
                        return false;
                    }
                    SecuredTotalLimit securedTotalLimit = (SecuredTotalLimit) obj2;
                    return Intrinsics.f(this.f68914a, securedTotalLimit.f68914a) && this.f68915b == securedTotalLimit.f68915b && Intrinsics.f(this.f68916c, securedTotalLimit.f68916c);
                }

                public final int hashCode() {
                    return this.f68916c.hashCode() + j6.a.b(this.f68915b, this.f68914a.f297794a.hashCode() * 31, 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f68914a);
                    dest.writeInt(this.f68915b);
                    dest.writeSerializable(this.f68916c);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$SpendingLimit;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SpendingLimit implements Local {

                @NotNull
                public static final Parcelable.Creator<SpendingLimit> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f68917a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f68918b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SpendingLimit(parcel.readInt(), (b) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SpendingLimit[i];
                    }
                }

                public SpendingLimit(int i, b countryCode) {
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    this.f68917a = countryCode;
                    this.f68918b = i;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof SpendingLimit)) {
                        return false;
                    }
                    SpendingLimit spendingLimit = (SpendingLimit) obj2;
                    return Intrinsics.f(this.f68917a, spendingLimit.f68917a) && this.f68918b == spendingLimit.f68918b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.f68918b) + (this.f68917a.f297794a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f68917a);
                    dest.writeInt(this.f68918b);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local$TotalLimit;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Local;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class TotalLimit implements Local {

                @NotNull
                public static final Parcelable.Creator<TotalLimit> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f68919a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f68920b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new TotalLimit((b) parcel.readSerializable(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new TotalLimit[i];
                    }
                }

                public TotalLimit(b countryCode, String facilityId) {
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                    this.f68919a = countryCode;
                    this.f68920b = facilityId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof TotalLimit)) {
                        return false;
                    }
                    TotalLimit totalLimit = (TotalLimit) obj2;
                    return Intrinsics.f(this.f68919a, totalLimit.f68919a) && Intrinsics.f(this.f68920b, totalLimit.f68920b);
                }

                public final int hashCode() {
                    return this.f68920b.hashCode() + (this.f68919a.f297794a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f68919a);
                    dest.writeString(this.f68920b);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig$Remote;", "Lcom/revolut/feature/credit/card/api/navigation/CreditCardDescriptionDestination$DescriptionConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Remote implements DescriptionConfig {

            @NotNull
            public static final Parcelable.Creator<Remote> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f68921a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final pl4.a f68922b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Remote(parcel.readString(), pl4.a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Remote[i];
                }
            }

            public Remote(String facilityId, pl4.a type) {
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(type, "type");
                this.f68921a = facilityId;
                this.f68922b = type;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Remote)) {
                    return false;
                }
                Remote remote = (Remote) obj2;
                return Intrinsics.f(this.f68921a, remote.f68921a) && this.f68922b == remote.f68922b;
            }

            public final int hashCode() {
                return this.f68922b.hashCode() + (this.f68921a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f68921a);
                dest.writeString(this.f68922b.name());
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardDescriptionDestination((DescriptionConfig) parcel.readParcelable(CreditCardDescriptionDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardDescriptionDestination[i];
        }
    }

    public CreditCardDescriptionDestination(DescriptionConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f68907a = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CreditCardDescriptionDestination) && Intrinsics.f(this.f68907a, ((CreditCardDescriptionDestination) obj2).f68907a);
    }

    public final int hashCode() {
        return this.f68907a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68907a, i);
    }
}
