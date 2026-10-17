package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_documents_bottom_sheet/PlanDocumentsBottomSheetScreenContract$TitleConfig", "Landroid/os/Parcelable;", "Default", "Custom", "NoTitle", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_documents_bottom_sheet/PlanDocumentsBottomSheetScreenContract$TitleConfig$Custom;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_documents_bottom_sheet/PlanDocumentsBottomSheetScreenContract$TitleConfig$Default;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_documents_bottom_sheet/PlanDocumentsBottomSheetScreenContract$TitleConfig$NoTitle;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanDocumentsBottomSheetScreenContract$TitleConfig extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_documents_bottom_sheet/PlanDocumentsBottomSheetScreenContract$TitleConfig$Custom;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_documents_bottom_sheet/PlanDocumentsBottomSheetScreenContract$TitleConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom implements PlanDocumentsBottomSheetScreenContract$TitleConfig {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f103522a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom((Clause) parcel.readParcelable(Custom.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(Clause title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f103522a = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Custom) && Intrinsics.f(this.f103522a, ((Custom) obj2).f103522a);
        }

        public final int hashCode() {
            return this.f103522a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103522a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_documents_bottom_sheet/PlanDocumentsBottomSheetScreenContract$TitleConfig$Default;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_documents_bottom_sheet/PlanDocumentsBottomSheetScreenContract$TitleConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default implements PlanDocumentsBottomSheetScreenContract$TitleConfig {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103523a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(String planId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f103523a = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Default) && Intrinsics.f(this.f103523a, ((Default) obj2).f103523a);
        }

        public final int hashCode() {
            return this.f103523a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103523a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_documents_bottom_sheet/PlanDocumentsBottomSheetScreenContract$TitleConfig$NoTitle;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_documents_bottom_sheet/PlanDocumentsBottomSheetScreenContract$TitleConfig;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoTitle implements PlanDocumentsBottomSheetScreenContract$TitleConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoTitle f103524a = new NoTitle();

        @NotNull
        public static final Parcelable.Creator<NoTitle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoTitle.f103524a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoTitle[i];
            }
        }

        private NoTitle() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
