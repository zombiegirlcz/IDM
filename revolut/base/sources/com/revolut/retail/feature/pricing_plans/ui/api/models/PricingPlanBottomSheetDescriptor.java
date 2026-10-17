package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import hha.w0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetDescriptor;", "Landroid/os/Parcelable;", "<init>", "()V", "BottomSheet", "PartnerOfferDetail", "CryptoExchangeFees", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetDescriptor$BottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetDescriptor$CryptoExchangeFees;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetDescriptor$PartnerOfferDetail;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PricingPlanBottomSheetDescriptor implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetDescriptor$BottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetDescriptor;", "", "toString", "()Ljava/lang/String;", "Params", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheet extends PricingPlanBottomSheetDescriptor {

        @NotNull
        public static final Parcelable.Creator<BottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Params f102825c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomSheet(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Params.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheet[i];
            }
        }

        public BottomSheet(String bottomSheetId, String str, Params params) {
            Intrinsics.checkNotNullParameter(bottomSheetId, "bottomSheetId");
            this.f102823a = bottomSheetId;
            this.f102824b = str;
            this.f102825c = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BottomSheet)) {
                return false;
            }
            BottomSheet bottomSheet = (BottomSheet) obj2;
            return Intrinsics.f(this.f102823a, bottomSheet.f102823a) && Intrinsics.f(this.f102824b, bottomSheet.f102824b) && Intrinsics.f(this.f102825c, bottomSheet.f102825c);
        }

        public final int hashCode() {
            int iHashCode = this.f102823a.hashCode() * 31;
            String str = this.f102824b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Params params = this.f102825c;
            return iHashCode2 + (params != null ? params.f102826a.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102823a);
            dest.writeString(this.f102824b);
            Params params = this.f102825c;
            if (params == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                params.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetDescriptor$BottomSheet$Params;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Params implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Params> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Map f102826a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    int iD = 0;
                    while (iD != i) {
                        iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                    }
                    return new Params(linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Params[i];
                }
            }

            public Params(Map parameters) {
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                this.f102826a = parameters;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Params) && Intrinsics.f(this.f102826a, ((Params) obj2).f102826a);
            }

            public final int hashCode() {
                return this.f102826a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itZ = j6.a.z(this.f102826a, dest);
                while (itZ.hasNext()) {
                    Map.Entry entry = (Map.Entry) itZ.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
            }

            public Params() {
                this(r0.g());
            }
        }

        public /* synthetic */ BottomSheet(String str, String str2, int i) {
            this(str, (i & 2) != 0 ? null : str2, (Params) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetDescriptor$PartnerOfferDetail;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PartnerOfferDetail extends PricingPlanBottomSheetDescriptor {

        @NotNull
        public static final Parcelable.Creator<PartnerOfferDetail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102828a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PartnerOfferDetail(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PartnerOfferDetail[i];
            }
        }

        public PartnerOfferDetail(String perkId) {
            Intrinsics.checkNotNullParameter(perkId, "perkId");
            this.f102828a = perkId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PartnerOfferDetail) && Intrinsics.f(this.f102828a, ((PartnerOfferDetail) obj2).f102828a);
        }

        public final int hashCode() {
            return this.f102828a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102828a);
        }
    }

    private PricingPlanBottomSheetDescriptor() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetDescriptor$CryptoExchangeFees;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanBottomSheetDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoExchangeFees extends PricingPlanBottomSheetDescriptor {

        @NotNull
        public static final Parcelable.Creator<CryptoExchangeFees> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f102827a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoExchangeFees(parcel.readInt() == 0 ? null : w0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoExchangeFees[i];
            }
        }

        public CryptoExchangeFees(w0 w0Var) {
            this.f102827a = w0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoExchangeFees) && this.f102827a == ((CryptoExchangeFees) obj2).f102827a;
        }

        public final int hashCode() {
            w0 w0Var = this.f102827a;
            if (w0Var == null) {
                return 0;
            }
            return w0Var.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            w0 w0Var = this.f102827a;
            if (w0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(w0Var.name());
            }
        }

        public CryptoExchangeFees() {
            this(null);
        }
    }
}
