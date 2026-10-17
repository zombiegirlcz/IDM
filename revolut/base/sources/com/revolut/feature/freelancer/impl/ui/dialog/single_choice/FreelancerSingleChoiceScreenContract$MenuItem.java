package com.revolut.feature.freelancer.impl.ui.dialog.single_choice;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/dialog/single_choice/FreelancerSingleChoiceScreenContract$MenuItem", "Landroid/os/Parcelable;", "AddNew", "Lcom/revolut/feature/freelancer/impl/ui/dialog/single_choice/FreelancerSingleChoiceScreenContract$MenuItem$AddNew;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerSingleChoiceScreenContract$MenuItem extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/dialog/single_choice/FreelancerSingleChoiceScreenContract$MenuItem$AddNew;", "Lcom/revolut/feature/freelancer/impl/ui/dialog/single_choice/FreelancerSingleChoiceScreenContract$MenuItem;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddNew implements FreelancerSingleChoiceScreenContract$MenuItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddNew f73776a = new AddNew();

        @NotNull
        public static final Parcelable.Creator<AddNew> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddNew.f73776a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNew[i];
            }
        }

        private AddNew() {
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
