package com.revolut.feature.address.common.impl.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.common.impl.models.AddressConfiguration$Behavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/address/common/impl/models/AddressConfiguration$FieldConfiguration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressConfiguration$FieldConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AddressConfiguration$FieldConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FieldMode f61040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AddressConfiguration$Behavior f61041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f61042c;
    public final int d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            FieldMode fieldMode = (FieldMode) j6.a.f(parcel, "parcel", AddressConfiguration$FieldConfiguration.class);
            AddressConfiguration$Behavior addressConfiguration$Behavior = (AddressConfiguration$Behavior) parcel.readParcelable(AddressConfiguration$FieldConfiguration.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readValue(AddressConfiguration$FieldConfiguration.class.getClassLoader()));
            }
            return new AddressConfiguration$FieldConfiguration(fieldMode, addressConfiguration$Behavior, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddressConfiguration$FieldConfiguration[i];
        }
    }

    public AddressConfiguration$FieldConfiguration(FieldMode mode, AddressConfiguration$Behavior behavior, List filters, int i) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f61040a = mode;
        this.f61041b = behavior;
        this.f61042c = filters;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddressConfiguration$FieldConfiguration)) {
            return false;
        }
        AddressConfiguration$FieldConfiguration addressConfiguration$FieldConfiguration = (AddressConfiguration$FieldConfiguration) obj2;
        return Intrinsics.f(this.f61040a, addressConfiguration$FieldConfiguration.f61040a) && Intrinsics.f(this.f61041b, addressConfiguration$FieldConfiguration.f61041b) && Intrinsics.f(this.f61042c, addressConfiguration$FieldConfiguration.f61042c) && this.d == addressConfiguration$FieldConfiguration.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.d((this.f61041b.hashCode() + (this.f61040a.hashCode() * 31)) * 31, 31, this.f61042c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61040a, i);
        dest.writeParcelable(this.f61041b, i);
        Iterator itV = p.a.v(this.f61042c, dest);
        while (itV.hasNext()) {
            dest.writeValue(itV.next());
        }
        dest.writeInt(this.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AddressConfiguration$FieldConfiguration(FieldMode fieldMode, List list, int i, int i2) {
        AddressConfiguration$Behavior addressConfiguration$Behavior;
        if ((i2 & 2) != 0) {
            addressConfiguration$Behavior = AddressConfiguration$Behavior.Default.f61038a;
        } else {
            addressConfiguration$Behavior = AddressConfiguration$Behavior.Dropdown.f61039a;
        }
        this(fieldMode, addressConfiguration$Behavior, (i2 & 4) != 0 ? f0.f322471a : list, (i2 & 8) != 0 ? 16385 : i);
    }
}
