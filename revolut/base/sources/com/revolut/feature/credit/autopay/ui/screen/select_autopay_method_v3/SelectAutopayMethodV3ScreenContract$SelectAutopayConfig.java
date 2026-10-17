package com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/select_autopay_method_v3/SelectAutopayMethodV3ScreenContract$SelectAutopayConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ToolbarConfig", "ItemConfig", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectAutopayMethodV3ScreenContract$SelectAutopayConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SelectAutopayMethodV3ScreenContract$SelectAutopayConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarConfig f68657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ItemConfig f68658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ItemConfig f68659c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/select_autopay_method_v3/SelectAutopayMethodV3ScreenContract$SelectAutopayConfig$ItemConfig;", "Landroid/os/Parcelable;", "ChevronItem", "Lcom/revolut/feature/credit/autopay/ui/screen/select_autopay_method_v3/SelectAutopayMethodV3ScreenContract$SelectAutopayConfig$ItemConfig$ChevronItem;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ItemConfig extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/select_autopay_method_v3/SelectAutopayMethodV3ScreenContract$SelectAutopayConfig$ItemConfig$ChevronItem;", "Lcom/revolut/feature/credit/autopay/ui/screen/select_autopay_method_v3/SelectAutopayMethodV3ScreenContract$SelectAutopayConfig$ItemConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ChevronItem implements ItemConfig {

            @NotNull
            public static final Parcelable.Creator<ChevronItem> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Image f68660a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f68661b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f68662c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ChevronItem((Clause) parcel.readParcelable(ChevronItem.class.getClassLoader()), (Clause) parcel.readParcelable(ChevronItem.class.getClassLoader()), (Image) parcel.readParcelable(ChevronItem.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ChevronItem[i];
                }
            }

            public ChevronItem(Clause title, Clause description, Image image) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.f68660a = image;
                this.f68661b = title;
                this.f68662c = description;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ChevronItem)) {
                    return false;
                }
                ChevronItem chevronItem = (ChevronItem) obj2;
                return Intrinsics.f(this.f68660a, chevronItem.f68660a) && Intrinsics.f(this.f68661b, chevronItem.f68661b) && Intrinsics.f(this.f68662c, chevronItem.f68662c);
            }

            public final int hashCode() {
                return this.f68662c.hashCode() + p.a.a(this.f68660a.hashCode() * 31, 31, this.f68661b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f68660a, i);
                dest.writeParcelable(this.f68661b, i);
                dest.writeParcelable(this.f68662c, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/select_autopay_method_v3/SelectAutopayMethodV3ScreenContract$SelectAutopayConfig$ToolbarConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToolbarConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ToolbarConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f68663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f68664b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ToolbarConfig((Clause) parcel.readParcelable(ToolbarConfig.class.getClassLoader()), (Clause) parcel.readParcelable(ToolbarConfig.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ToolbarConfig[i];
            }
        }

        public ToolbarConfig(Clause title, Clause clause) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f68663a = title;
            this.f68664b = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ToolbarConfig)) {
                return false;
            }
            ToolbarConfig toolbarConfig = (ToolbarConfig) obj2;
            return Intrinsics.f(this.f68663a, toolbarConfig.f68663a) && Intrinsics.f(this.f68664b, toolbarConfig.f68664b);
        }

        public final int hashCode() {
            int iHashCode = this.f68663a.hashCode() * 31;
            Clause clause = this.f68664b;
            return iHashCode + (clause == null ? 0 : clause.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68663a, i);
            dest.writeParcelable(this.f68664b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectAutopayMethodV3ScreenContract$SelectAutopayConfig(ToolbarConfig.CREATOR.createFromParcel(parcel), (ItemConfig) parcel.readParcelable(SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.class.getClassLoader()), (ItemConfig) parcel.readParcelable(SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectAutopayMethodV3ScreenContract$SelectAutopayConfig[i];
        }
    }

    public SelectAutopayMethodV3ScreenContract$SelectAutopayConfig(ToolbarConfig toolbar, ItemConfig itemConfig, ItemConfig itemConfig2) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        this.f68657a = toolbar;
        this.f68658b = itemConfig;
        this.f68659c = itemConfig2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectAutopayMethodV3ScreenContract$SelectAutopayConfig)) {
            return false;
        }
        SelectAutopayMethodV3ScreenContract$SelectAutopayConfig selectAutopayMethodV3ScreenContract$SelectAutopayConfig = (SelectAutopayMethodV3ScreenContract$SelectAutopayConfig) obj2;
        return Intrinsics.f(this.f68657a, selectAutopayMethodV3ScreenContract$SelectAutopayConfig.f68657a) && Intrinsics.f(this.f68658b, selectAutopayMethodV3ScreenContract$SelectAutopayConfig.f68658b) && Intrinsics.f(this.f68659c, selectAutopayMethodV3ScreenContract$SelectAutopayConfig.f68659c);
    }

    public final int hashCode() {
        int iHashCode = this.f68657a.hashCode() * 31;
        ItemConfig itemConfig = this.f68658b;
        int iHashCode2 = (iHashCode + (itemConfig == null ? 0 : itemConfig.hashCode())) * 31;
        ItemConfig itemConfig2 = this.f68659c;
        return iHashCode2 + (itemConfig2 != null ? itemConfig2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f68657a.writeToParcel(dest, i);
        dest.writeParcelable(this.f68658b, i);
        dest.writeParcelable(this.f68659c, i);
    }
}
