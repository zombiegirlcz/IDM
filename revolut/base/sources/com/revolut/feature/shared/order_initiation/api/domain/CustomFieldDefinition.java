package com.revolut.feature.shared.order_initiation.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/order_initiation/api/domain/CustomFieldDefinition;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_order_initiation_page_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomFieldDefinition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomFieldDefinition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86426b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomFieldDefinition(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomFieldDefinition[i];
        }
    }

    public CustomFieldDefinition(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f86425a = name;
        this.f86426b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomFieldDefinition)) {
            return false;
        }
        CustomFieldDefinition customFieldDefinition = (CustomFieldDefinition) obj2;
        return Intrinsics.f(this.f86425a, customFieldDefinition.f86425a) && this.f86426b == customFieldDefinition.f86426b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86426b) + (this.f86425a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86425a);
        dest.writeInt(this.f86426b ? 1 : 0);
    }
}
