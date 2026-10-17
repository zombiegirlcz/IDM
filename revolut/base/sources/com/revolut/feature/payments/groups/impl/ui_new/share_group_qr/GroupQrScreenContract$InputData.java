package com.revolut.feature.payments.groups.impl.ui_new.share_group_qr;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/share_group_qr/GroupQrScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupQrScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GroupQrScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79496c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupQrScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupQrScreenContract$InputData[i];
        }
    }

    public GroupQrScreenContract$InputData(String str, String groupName, String link) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f79494a = str;
        this.f79495b = groupName;
        this.f79496c = link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GroupQrScreenContract$InputData)) {
            return false;
        }
        GroupQrScreenContract$InputData groupQrScreenContract$InputData = (GroupQrScreenContract$InputData) obj2;
        return Intrinsics.f(this.f79494a, groupQrScreenContract$InputData.f79494a) && Intrinsics.f(this.f79495b, groupQrScreenContract$InputData.f79495b) && Intrinsics.f(this.f79496c, groupQrScreenContract$InputData.f79496c);
    }

    public final int hashCode() {
        String str = this.f79494a;
        return this.f79496c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f79495b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79494a);
        dest.writeString(this.f79495b);
        dest.writeString(this.f79496c);
    }
}
