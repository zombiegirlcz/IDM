package com.revolut.feature.payments.groups.impl.ui_new.customize;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/customize/GroupCustomizationScreenModel$StatusViewSuccessPayload", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupCustomizationScreenModel$StatusViewSuccessPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GroupCustomizationScreenModel$StatusViewSuccessPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f79403a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupCustomizationScreenModel$StatusViewSuccessPayload((PaymentGroup) parcel.readParcelable(GroupCustomizationScreenModel$StatusViewSuccessPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupCustomizationScreenModel$StatusViewSuccessPayload[i];
        }
    }

    public GroupCustomizationScreenModel$StatusViewSuccessPayload(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f79403a = group;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof GroupCustomizationScreenModel$StatusViewSuccessPayload) && Intrinsics.f(this.f79403a, ((GroupCustomizationScreenModel$StatusViewSuccessPayload) obj2).f79403a);
    }

    public final int hashCode() {
        return this.f79403a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79403a, i);
    }
}
