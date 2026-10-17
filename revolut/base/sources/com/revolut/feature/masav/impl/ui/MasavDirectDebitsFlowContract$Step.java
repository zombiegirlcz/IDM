package com.revolut.feature.masav.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import com.revolut.kompot.navigable.flow.FlowStep;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ProductArticle", "InstitutionsList", "Form", "Review", "Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step$Form;", "Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step$InstitutionsList;", "Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step$Review;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MasavDirectDebitsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step$Form;", "Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Form extends MasavDirectDebitsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Form> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Biller f78099a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Form((Biller) parcel.readParcelable(Form.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Form[i];
            }
        }

        public Form(Biller creditor) {
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            this.f78099a = creditor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Form) && Intrinsics.f(this.f78099a, ((Form) obj2).f78099a);
        }

        public final int hashCode() {
            return this.f78099a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78099a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step$InstitutionsList;", "Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step;", "<init>", "()V", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstitutionsList extends MasavDirectDebitsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstitutionsList f78100a = new InstitutionsList();

        @NotNull
        public static final Parcelable.Creator<InstitutionsList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstitutionsList.f78100a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionsList[i];
            }
        }

        private InstitutionsList() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step;", "<init>", "()V", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle extends MasavDirectDebitsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f78101a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f78101a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        private ProductArticle() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step$Review;", "Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review extends MasavDirectDebitsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DirectDebitData f78102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f78103b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(DirectDebitData.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(DirectDebitData directDebitData, d pocket) {
            Intrinsics.checkNotNullParameter(directDebitData, "directDebitData");
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.f78102a = directDebitData;
            this.f78103b = pocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return Intrinsics.f(this.f78102a, review.f78102a) && Intrinsics.f(this.f78103b, review.f78103b);
        }

        public final int hashCode() {
            return this.f78103b.hashCode() + (this.f78102a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f78102a.writeToParcel(dest, i);
            dest.writeSerializable(this.f78103b);
        }
    }

    private MasavDirectDebitsFlowContract$Step() {
    }
}
