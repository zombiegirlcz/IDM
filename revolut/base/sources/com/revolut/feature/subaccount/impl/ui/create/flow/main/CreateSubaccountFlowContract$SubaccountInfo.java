package com.revolut.feature.subaccount.impl.ui.create.flow.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$SubaccountInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateSubaccountFlowContract$SubaccountInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreateSubaccountFlowContract$SubaccountInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtendedSubaccountType f89033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f89035c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreateSubaccountFlowContract$SubaccountInfo((ExtendedSubaccountType) parcel.readParcelable(CreateSubaccountFlowContract$SubaccountInfo.class.getClassLoader()), parcel.readString(), (xi0.b) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreateSubaccountFlowContract$SubaccountInfo[i];
        }
    }

    public CreateSubaccountFlowContract$SubaccountInfo(ExtendedSubaccountType subaccountType, String name, xi0.b currency, String imageId) {
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        this.f89033a = subaccountType;
        this.f89034b = name;
        this.f89035c = currency;
        this.d = imageId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreateSubaccountFlowContract$SubaccountInfo)) {
            return false;
        }
        CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo = (CreateSubaccountFlowContract$SubaccountInfo) obj2;
        return Intrinsics.f(this.f89033a, createSubaccountFlowContract$SubaccountInfo.f89033a) && Intrinsics.f(this.f89034b, createSubaccountFlowContract$SubaccountInfo.f89034b) && Intrinsics.f(this.f89035c, createSubaccountFlowContract$SubaccountInfo.f89035c) && Intrinsics.f(this.d, createSubaccountFlowContract$SubaccountInfo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.j(this.f89035c, p.a.c(this.f89033a.hashCode() * 31, 31, this.f89034b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89033a, i);
        dest.writeString(this.f89034b);
        dest.writeSerializable(this.f89035c);
        dest.writeString(this.d);
    }
}
