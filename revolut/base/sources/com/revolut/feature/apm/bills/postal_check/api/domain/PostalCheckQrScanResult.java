package com.revolut.feature.apm.bills.postal_check.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/api/domain/PostalCheckQrScanResult;", "Landroid/os/Parcelable;", "TermsRequired", "Success", "Lcom/revolut/feature/apm/bills/postal_check/api/domain/PostalCheckQrScanResult$Success;", "Lcom/revolut/feature/apm/bills/postal_check/api/domain/PostalCheckQrScanResult$TermsRequired;", "feature_apm_bills_postal_check_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PostalCheckQrScanResult extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/api/domain/PostalCheckQrScanResult$Success;", "Lcom/revolut/feature/apm/bills/postal_check/api/domain/PostalCheckQrScanResult;", "", "toString", "()Ljava/lang/String;", "Details", "feature_apm_bills_postal_check_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements PostalCheckQrScanResult {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Details f61498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61499b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/api/domain/PostalCheckQrScanResult$Success$Details;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_postal_check_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Details implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Details> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Long f61500a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f61501b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final d f61502c;
            public final d d;
            public final String e;
            public final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f61503g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final String f61504h;
            public final String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final boolean f61505j;
            public final List k;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    d dVar = (d) parcel.readSerializable();
                    d dVar2 = (d) parcel.readSerializable();
                    d dVar3 = (d) parcel.readSerializable();
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    int iE = 0;
                    boolean z = parcel.readInt() != 0;
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    while (iE != i) {
                        iE = j6.a.e(Details.class, parcel, arrayList, iE, 1);
                    }
                    return new Details(lValueOf, dVar, dVar2, dVar3, string, string2, string3, string4, string5, z, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Details[i];
                }
            }

            public Details(Long l2, d dVar, d dVar2, d dVar3, String str, String str2, String str3, String str4, String str5, boolean z, List formFields) {
                Intrinsics.checkNotNullParameter(formFields, "formFields");
                this.f61500a = l2;
                this.f61501b = dVar;
                this.f61502c = dVar2;
                this.d = dVar3;
                this.e = str;
                this.f = str2;
                this.f61503g = str3;
                this.f61504h = str4;
                this.i = str5;
                this.f61505j = z;
                this.k = formFields;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Details)) {
                    return false;
                }
                Details details = (Details) obj2;
                return Intrinsics.f(this.f61500a, details.f61500a) && Intrinsics.f(this.f61501b, details.f61501b) && Intrinsics.f(this.f61502c, details.f61502c) && Intrinsics.f(this.d, details.d) && Intrinsics.f(this.e, details.e) && Intrinsics.f(this.f, details.f) && Intrinsics.f(this.f61503g, details.f61503g) && Intrinsics.f(this.f61504h, details.f61504h) && Intrinsics.f(this.i, details.i) && this.f61505j == details.f61505j && Intrinsics.f(this.k, details.k);
            }

            public final int hashCode() {
                Long l2 = this.f61500a;
                int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
                d dVar = this.f61501b;
                int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
                d dVar2 = this.f61502c;
                int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
                d dVar3 = this.d;
                int iHashCode4 = (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
                String str = this.e;
                int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f;
                int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f61503g;
                int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f61504h;
                int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.i;
                return this.k.hashCode() + j6.a.c((iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.f61505j);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Long l2 = this.f61500a;
                if (l2 == null) {
                    dest.writeInt(0);
                } else {
                    b.A(dest, 1, l2);
                }
                dest.writeSerializable(this.f61501b);
                dest.writeSerializable(this.f61502c);
                dest.writeSerializable(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.f61503g);
                dest.writeString(this.f61504h);
                dest.writeString(this.i);
                dest.writeInt(this.f61505j ? 1 : 0);
                Iterator itV = p.a.v(this.k, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success(Details.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(Details details, String qrCode) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(qrCode, "qrCode");
            this.f61498a = details;
            this.f61499b = qrCode;
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
            return Intrinsics.f(this.f61498a, success.f61498a) && Intrinsics.f(this.f61499b, success.f61499b);
        }

        public final int hashCode() {
            return this.f61499b.hashCode() + (this.f61498a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f61498a.writeToParcel(dest, i);
            dest.writeString(this.f61499b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/api/domain/PostalCheckQrScanResult$TermsRequired;", "Lcom/revolut/feature/apm/bills/postal_check/api/domain/PostalCheckQrScanResult;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_postal_check_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsRequired implements PostalCheckQrScanResult {

        @NotNull
        public static final Parcelable.Creator<TermsRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmOnboardingStatusTerms f61506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61507b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TermsRequired((ApmOnboardingStatusTerms) parcel.readParcelable(TermsRequired.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsRequired[i];
            }
        }

        public TermsRequired(ApmOnboardingStatusTerms terms, String qrCode) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            Intrinsics.checkNotNullParameter(qrCode, "qrCode");
            this.f61506a = terms;
            this.f61507b = qrCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TermsRequired)) {
                return false;
            }
            TermsRequired termsRequired = (TermsRequired) obj2;
            return Intrinsics.f(this.f61506a, termsRequired.f61506a) && Intrinsics.f(this.f61507b, termsRequired.f61507b);
        }

        public final int hashCode() {
            return this.f61507b.hashCode() + (this.f61506a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61506a, i);
            dest.writeString(this.f61507b);
        }
    }
}
