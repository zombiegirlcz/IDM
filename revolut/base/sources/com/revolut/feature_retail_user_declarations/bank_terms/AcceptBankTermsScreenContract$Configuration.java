package com.revolut.feature_retail_user_declarations.bank_terms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature_retail_user_declarations/bank_terms/AcceptBankTermsScreenContract$Configuration", "Landroid/os/Parcelable;", "TermsCountry", "TermsScopes", "Lcom/revolut/feature_retail_user_declarations/bank_terms/AcceptBankTermsScreenContract$Configuration$TermsCountry;", "Lcom/revolut/feature_retail_user_declarations/bank_terms/AcceptBankTermsScreenContract$Configuration$TermsScopes;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AcceptBankTermsScreenContract$Configuration extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/bank_terms/AcceptBankTermsScreenContract$Configuration$TermsCountry;", "Lcom/revolut/feature_retail_user_declarations/bank_terms/AcceptBankTermsScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsCountry implements AcceptBankTermsScreenContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<TermsCountry> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f97481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WorkflowScreenConfiguration f97482b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TermsCountry((b) parcel.readSerializable(), (WorkflowScreenConfiguration) parcel.readParcelable(TermsCountry.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsCountry[i];
            }
        }

        public TermsCountry(b countryCode, WorkflowScreenConfiguration workflowScreenConfiguration) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f97481a = countryCode;
            this.f97482b = workflowScreenConfiguration;
        }

        @Override // com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$Configuration
        /* JADX INFO: renamed from: I, reason: from getter */
        public final WorkflowScreenConfiguration getF97484b() {
            return this.f97482b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TermsCountry)) {
                return false;
            }
            TermsCountry termsCountry = (TermsCountry) obj2;
            return Intrinsics.f(this.f97481a, termsCountry.f97481a) && Intrinsics.f(this.f97482b, termsCountry.f97482b);
        }

        @Override // com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$Configuration
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final b getF97483a() {
            return this.f97481a;
        }

        public final int hashCode() {
            int iHashCode = this.f97481a.f297794a.hashCode() * 31;
            WorkflowScreenConfiguration workflowScreenConfiguration = this.f97482b;
            return iHashCode + (workflowScreenConfiguration == null ? 0 : workflowScreenConfiguration.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97481a);
            dest.writeParcelable(this.f97482b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/bank_terms/AcceptBankTermsScreenContract$Configuration$TermsScopes;", "Lcom/revolut/feature_retail_user_declarations/bank_terms/AcceptBankTermsScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsScopes implements AcceptBankTermsScreenContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<TermsScopes> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f97483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WorkflowScreenConfiguration f97484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97485c;
        public final ArrayList d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVar = (b) parcel.readSerializable();
                WorkflowScreenConfiguration workflowScreenConfiguration = (WorkflowScreenConfiguration) parcel.readParcelable(TermsScopes.class.getClassLoader());
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TermsScopes.class, parcel, arrayList, iE, 1);
                }
                return new TermsScopes(workflowScreenConfiguration, string, arrayList, bVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsScopes[i];
            }
        }

        public TermsScopes(WorkflowScreenConfiguration workflowScreenConfiguration, String str, ArrayList termsScopes, b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(termsScopes, "termsScopes");
            this.f97483a = countryCode;
            this.f97484b = workflowScreenConfiguration;
            this.f97485c = str;
            this.d = termsScopes;
        }

        @Override // com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$Configuration
        /* JADX INFO: renamed from: I, reason: from getter */
        public final WorkflowScreenConfiguration getF97484b() {
            return this.f97484b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TermsScopes)) {
                return false;
            }
            TermsScopes termsScopes = (TermsScopes) obj2;
            return Intrinsics.f(this.f97483a, termsScopes.f97483a) && Intrinsics.f(this.f97484b, termsScopes.f97484b) && Intrinsics.f(this.f97485c, termsScopes.f97485c) && this.d.equals(termsScopes.d);
        }

        @Override // com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$Configuration
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final b getF97483a() {
            return this.f97483a;
        }

        public final int hashCode() {
            int iHashCode = this.f97483a.f297794a.hashCode() * 31;
            WorkflowScreenConfiguration workflowScreenConfiguration = this.f97484b;
            int iHashCode2 = (iHashCode + (workflowScreenConfiguration == null ? 0 : workflowScreenConfiguration.hashCode())) * 31;
            String str = this.f97485c;
            return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97483a);
            dest.writeParcelable(this.f97484b, i);
            dest.writeString(this.f97485c);
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    WorkflowScreenConfiguration getF97484b();

    /* JADX INFO: renamed from: getCountryCode */
    b getF97483a();
}
