package com.revolut.retail.feature.pricing_plans.ui.impl.footer;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/footer/PricingPlanFooterInternalContract$TermsClauseClickParcel", "Landroid/os/Parcelable;", "<init>", "()V", "UrlNavigation", "BottomSheetNavigation", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/footer/PricingPlanFooterInternalContract$TermsClauseClickParcel$BottomSheetNavigation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/footer/PricingPlanFooterInternalContract$TermsClauseClickParcel$UrlNavigation;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PricingPlanFooterInternalContract$TermsClauseClickParcel implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/footer/PricingPlanFooterInternalContract$TermsClauseClickParcel$BottomSheetNavigation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/footer/PricingPlanFooterInternalContract$TermsClauseClickParcel;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheetNavigation extends PricingPlanFooterInternalContract$TermsClauseClickParcel {

        @NotNull
        public static final Parcelable.Creator<BottomSheetNavigation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f103300b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BottomSheetNavigation.class, parcel, arrayList, iE, 1);
                }
                return new BottomSheetNavigation(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheetNavigation[i];
            }
        }

        public BottomSheetNavigation(String planId, List documents) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f103299a = planId;
            this.f103300b = documents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BottomSheetNavigation)) {
                return false;
            }
            BottomSheetNavigation bottomSheetNavigation = (BottomSheetNavigation) obj2;
            return Intrinsics.f(this.f103299a, bottomSheetNavigation.f103299a) && Intrinsics.f(this.f103300b, bottomSheetNavigation.f103300b);
        }

        public final int hashCode() {
            return this.f103300b.hashCode() + (this.f103299a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103299a);
            Iterator itV = p.a.v(this.f103300b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/footer/PricingPlanFooterInternalContract$TermsClauseClickParcel$UrlNavigation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/footer/PricingPlanFooterInternalContract$TermsClauseClickParcel;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UrlNavigation extends PricingPlanFooterInternalContract$TermsClauseClickParcel {

        @NotNull
        public static final Parcelable.Creator<UrlNavigation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103301a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UrlNavigation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UrlNavigation[i];
            }
        }

        public UrlNavigation(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f103301a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UrlNavigation) && Intrinsics.f(this.f103301a, ((UrlNavigation) obj2).f103301a);
        }

        public final int hashCode() {
            return this.f103301a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103301a);
        }
    }

    private PricingPlanFooterInternalContract$TermsClauseClickParcel() {
    }
}
