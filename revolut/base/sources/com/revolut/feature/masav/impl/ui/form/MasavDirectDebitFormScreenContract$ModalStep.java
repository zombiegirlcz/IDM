package com.revolut.feature.masav.impl.ui.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "InstitutionsList", "SelectDate", "EditDebit", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$ModalStep$EditDebit;", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$ModalStep$InstitutionsList;", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$ModalStep$SelectDate;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MasavDirectDebitFormScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$ModalStep$EditDebit;", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$ModalStep;", "<init>", "()V", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EditDebit implements MasavDirectDebitFormScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditDebit f78113a = new EditDebit();

        @NotNull
        public static final Parcelable.Creator<EditDebit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EditDebit.f78113a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditDebit[i];
            }
        }

        private EditDebit() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$ModalStep$InstitutionsList;", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$ModalStep;", "<init>", "()V", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstitutionsList implements MasavDirectDebitFormScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstitutionsList f78114a = new InstitutionsList();

        @NotNull
        public static final Parcelable.Creator<InstitutionsList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstitutionsList.f78114a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$ModalStep$SelectDate;", "Lcom/revolut/feature/masav/impl/ui/form/MasavDirectDebitFormScreenContract$ModalStep;", "<init>", "()V", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectDate implements MasavDirectDebitFormScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectDate f78115a = new SelectDate();

        @NotNull
        public static final Parcelable.Creator<SelectDate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectDate.f78115a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectDate[i];
            }
        }

        private SelectDate() {
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
