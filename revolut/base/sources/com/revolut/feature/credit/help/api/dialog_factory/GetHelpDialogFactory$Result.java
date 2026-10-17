package com.revolut.feature.credit.help.api.dialog_factory;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ux4.k;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/help/api/dialog_factory/GetHelpDialogFactory$Result", "Landroid/os/Parcelable;", "<init>", "()V", "Faq", "FinancialDifficulties", "Lcom/revolut/feature/credit/help/api/dialog_factory/GetHelpDialogFactory$Result$Faq;", "Lcom/revolut/feature/credit/help/api/dialog_factory/GetHelpDialogFactory$Result$FinancialDifficulties;", "feature_credit_help_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GetHelpDialogFactory$Result implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/help/api/dialog_factory/GetHelpDialogFactory$Result$Faq;", "Lcom/revolut/feature/credit/help/api/dialog_factory/GetHelpDialogFactory$Result;", "", "toString", "()Ljava/lang/String;", "feature_credit_help_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Faq extends GetHelpDialogFactory$Result {

        @NotNull
        public static final Parcelable.Creator<Faq> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70002a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Faq(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Faq[i];
            }
        }

        public Faq(String str) {
            this.f70002a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Faq) && Intrinsics.f(this.f70002a, ((Faq) obj2).f70002a);
        }

        public final int hashCode() {
            String str = this.f70002a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70002a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/help/api/dialog_factory/GetHelpDialogFactory$Result$FinancialDifficulties;", "Lcom/revolut/feature/credit/help/api/dialog_factory/GetHelpDialogFactory$Result;", "", "toString", "()Ljava/lang/String;", "feature_credit_help_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinancialDifficulties extends GetHelpDialogFactory$Result {

        @NotNull
        public static final Parcelable.Creator<FinancialDifficulties> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f70003a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FinancialDifficulties((k) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FinancialDifficulties[i];
            }
        }

        public FinancialDifficulties(k creditFacility) {
            Intrinsics.checkNotNullParameter(creditFacility, "creditFacility");
            this.f70003a = creditFacility;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FinancialDifficulties) && Intrinsics.f(this.f70003a, ((FinancialDifficulties) obj2).f70003a);
        }

        public final int hashCode() {
            return this.f70003a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70003a);
        }
    }

    private GetHelpDialogFactory$Result() {
    }
}
