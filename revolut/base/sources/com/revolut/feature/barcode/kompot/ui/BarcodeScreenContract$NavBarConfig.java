package com.revolut.feature.barcode.kompot.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$NavBarConfig", "Landroid/os/Parcelable;", "Hidden", "Visible", "Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$NavBarConfig$Hidden;", "Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$NavBarConfig$Visible;", "feature_barcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BarcodeScreenContract$NavBarConfig extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$NavBarConfig$Hidden;", "Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$NavBarConfig;", "<init>", "()V", "feature_barcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Hidden implements BarcodeScreenContract$NavBarConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Hidden f64124a = new Hidden();

        @NotNull
        public static final Parcelable.Creator<Hidden> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Hidden.f64124a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$NavBarConfig$Visible;", "Lcom/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$NavBarConfig;", "", "toString", "()Ljava/lang/String;", "feature_barcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Visible implements BarcodeScreenContract$NavBarConfig {

        @NotNull
        public static final Parcelable.Creator<Visible> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f64125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f64126b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Visible((Clause) parcel.readParcelable(Visible.class.getClassLoader()), (Clause) parcel.readParcelable(Visible.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Visible[i];
            }
        }

        public Visible(Clause clause, Clause clause2) {
            this.f64125a = clause;
            this.f64126b = clause2;
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
            return Intrinsics.f(this.f64125a, visible.f64125a) && Intrinsics.f(this.f64126b, visible.f64126b);
        }

        public final int hashCode() {
            Clause clause = this.f64125a;
            int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
            Clause clause2 = this.f64126b;
            return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64125a, i);
            dest.writeParcelable(this.f64126b, i);
        }
    }
}
