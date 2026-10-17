package com.revolut.feature.add.new_product.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf1.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add/new_product/api/declaration/AddNewProductDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_add_new_product_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddNewProductDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AddNewProductDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f60851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransitionAnimation f60852b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddNewProductDestination(parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), (TransitionAnimation) parcel.readParcelable(AddNewProductDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddNewProductDestination[i];
        }
    }

    public AddNewProductDestination() {
        this((c) null, 3);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF94150b() {
        return this.f60852b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddNewProductDestination)) {
            return false;
        }
        AddNewProductDestination addNewProductDestination = (AddNewProductDestination) obj2;
        return this.f60851a == addNewProductDestination.f60851a && Intrinsics.f(this.f60852b, addNewProductDestination.f60852b);
    }

    public final int hashCode() {
        c cVar = this.f60851a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        TransitionAnimation transitionAnimation = this.f60852b;
        return iHashCode + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        c cVar = this.f60851a;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeParcelable(this.f60852b, i);
    }

    public AddNewProductDestination(c cVar, TransitionAnimation transitionAnimation) {
        this.f60851a = cVar;
        this.f60852b = transitionAnimation;
    }

    public /* synthetic */ AddNewProductDestination(c cVar, int i) {
        this((i & 1) != 0 ? null : cVar, (TransitionAnimation) null);
    }
}
