package com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformScreenAction", "Landroid/os/Parcelable;", "Save", "Add", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformScreenAction$Add;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformScreenAction$Save;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SubformScreenContract$SubformScreenAction extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformScreenAction$Add;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformScreenAction;", "<init>", "()V", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Add implements SubformScreenContract$SubformScreenAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Add f78733a = new Add();

        @NotNull
        public static final Parcelable.Creator<Add> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Add.f78733a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Add[i];
            }
        }

        private Add() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformScreenAction$Save;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformScreenAction;", "<init>", "()V", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Save implements SubformScreenContract$SubformScreenAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Save f78734a = new Save();

        @NotNull
        public static final Parcelable.Creator<Save> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Save.f78734a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Save[i];
            }
        }

        private Save() {
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
