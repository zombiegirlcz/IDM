package com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import d27.v;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Catalogue", "CustomisationInfo", "DatePicker", "Preview", "Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step$Catalogue;", "Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step$CustomisationInfo;", "Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step$DatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step$Preview;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrderInitPageCreateScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step$Catalogue;", "Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Catalogue implements OrderInitPageCreateScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Catalogue f74171a = new Catalogue();

        @NotNull
        public static final Parcelable.Creator<Catalogue> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Catalogue.f74171a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Catalogue[i];
            }
        }

        private Catalogue() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step$CustomisationInfo;", "Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomisationInfo implements OrderInitPageCreateScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomisationInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f74172a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomisationInfo(v.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomisationInfo[i];
            }
        }

        public CustomisationInfo(v type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f74172a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CustomisationInfo) && this.f74172a == ((CustomisationInfo) obj2).f74172a;
        }

        public final int hashCode() {
            return this.f74172a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74172a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step$DatePicker;", "Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DatePicker implements OrderInitPageCreateScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<DatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f74173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f74174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f74175c;
        public final LocalDate d;
        public final LocalDate e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DatePicker((Clause) parcel.readParcelable(DatePicker.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DatePicker[i];
            }
        }

        public DatePicker(Clause title, LocalDate presentedMonth, LocalDate localDate, LocalDate minAvailableDate, LocalDate maxAvailableDate) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
            Intrinsics.checkNotNullParameter(minAvailableDate, "minAvailableDate");
            Intrinsics.checkNotNullParameter(maxAvailableDate, "maxAvailableDate");
            this.f74173a = title;
            this.f74174b = presentedMonth;
            this.f74175c = localDate;
            this.d = minAvailableDate;
            this.e = maxAvailableDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DatePicker)) {
                return false;
            }
            DatePicker datePicker = (DatePicker) obj2;
            return Intrinsics.f(this.f74173a, datePicker.f74173a) && Intrinsics.f(this.f74174b, datePicker.f74174b) && Intrinsics.f(this.f74175c, datePicker.f74175c) && Intrinsics.f(this.d, datePicker.d) && Intrinsics.f(this.e, datePicker.e);
        }

        public final int hashCode() {
            int iA = y.a(this.f74173a.hashCode() * 31, 31, this.f74174b);
            LocalDate localDate = this.f74175c;
            return this.e.hashCode() + y.a((iA + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74173a, i);
            dest.writeSerializable(this.f74174b);
            dest.writeSerializable(this.f74175c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step$Preview;", "Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/create/OrderInitPageCreateScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Preview implements OrderInitPageCreateScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<Preview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f74176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f74177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i6d.a f74178c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Preview((d) parcel.readSerializable(), parcel.readString(), i6d.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Preview[i];
            }
        }

        public Preview(d amount, String title, i6d.a type) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f74176a = amount;
            this.f74177b = title;
            this.f74178c = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Preview)) {
                return false;
            }
            Preview preview = (Preview) obj2;
            return Intrinsics.f(this.f74176a, preview.f74176a) && Intrinsics.f(this.f74177b, preview.f74177b) && this.f74178c == preview.f74178c;
        }

        public final int hashCode() {
            return this.f74178c.hashCode() + p.a.c(this.f74176a.hashCode() * 31, 31, this.f74177b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74176a);
            dest.writeString(this.f74177b);
            dest.writeString(this.f74178c.name());
        }
    }
}
