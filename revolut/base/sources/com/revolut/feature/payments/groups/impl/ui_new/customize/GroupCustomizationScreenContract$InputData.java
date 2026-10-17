package com.revolut.feature.payments.groups.impl.ui_new.customize;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import st9.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/customize/GroupCustomizationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupCustomizationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GroupCustomizationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f79402c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new GroupCustomizationScreenContract$InputData(string, arrayList, b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupCustomizationScreenContract$InputData[i];
        }
    }

    public GroupCustomizationScreenContract$InputData(String name, List selectedContacts, b initialGroupSettingsCalculationType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
        Intrinsics.checkNotNullParameter(initialGroupSettingsCalculationType, "initialGroupSettingsCalculationType");
        this.f79400a = name;
        this.f79401b = selectedContacts;
        this.f79402c = initialGroupSettingsCalculationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GroupCustomizationScreenContract$InputData)) {
            return false;
        }
        GroupCustomizationScreenContract$InputData groupCustomizationScreenContract$InputData = (GroupCustomizationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f79400a, groupCustomizationScreenContract$InputData.f79400a) && Intrinsics.f(this.f79401b, groupCustomizationScreenContract$InputData.f79401b) && this.f79402c == groupCustomizationScreenContract$InputData.f79402c;
    }

    public final int hashCode() {
        return this.f79402c.hashCode() + p.a.d(this.f79400a.hashCode() * 31, 31, this.f79401b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79400a);
        Iterator itV = p.a.v(this.f79401b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeString(this.f79402c.name());
    }
}
