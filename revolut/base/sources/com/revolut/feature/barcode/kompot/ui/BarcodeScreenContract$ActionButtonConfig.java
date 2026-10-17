package com.revolut.feature.barcode.kompot.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$ActionButtonConfig", "Landroid/os/Parcelable;", "Hidden", "Visible", "Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$ActionButtonConfig$Hidden;", "Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$ActionButtonConfig$Visible;", "feature_barcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BarcodeScreenContract$ActionButtonConfig extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$ActionButtonConfig$Hidden;", "Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$ActionButtonConfig;", "<init>", "()V", "feature_barcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Hidden implements BarcodeScreenContract$ActionButtonConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Hidden f64117a = new Hidden();

        @NotNull
        public static final Parcelable.Creator<Hidden> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Hidden.f64117a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Hidden[i];
            }
        }

        private Hidden() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$ActionButtonConfig$Visible;", "Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$ActionButtonConfig;", "", "toString", "()Ljava/lang/String;", "feature_barcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Visible implements BarcodeScreenContract$ActionButtonConfig {

        @NotNull
        public static final Parcelable.Creator<Visible> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f64118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f64119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f64120c;
        public final h4 d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Visible((Clause) parcel.readParcelable(Visible.class.getClassLoader()), (Image) parcel.readParcelable(Visible.class.getClassLoader()), (Image) parcel.readParcelable(Visible.class.getClassLoader()), h4.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Visible[i];
            }
        }

        public Visible(Clause clause, Image image, Image image2, h4 style) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.f64118a = clause;
            this.f64119b = image;
            this.f64120c = image2;
            this.d = style;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Visible)) {
                return false;
            }
            Visible visible = (Visible) obj2;
            return Intrinsics.f(this.f64118a, visible.f64118a) && Intrinsics.f(this.f64119b, visible.f64119b) && Intrinsics.f(this.f64120c, visible.f64120c) && this.d == visible.d;
        }

        public final int hashCode() {
            Clause clause = this.f64118a;
            int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
            Image image = this.f64119b;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.f64120c;
            return this.d.hashCode() + ((iHashCode2 + (image2 != null ? image2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64118a, i);
            dest.writeParcelable(this.f64119b, i);
            dest.writeParcelable(this.f64120c, i);
            dest.writeString(this.d.name());
        }

        public Visible() {
            this(null, null, null, h4.SECONDARY_WHITE);
        }
    }
}
