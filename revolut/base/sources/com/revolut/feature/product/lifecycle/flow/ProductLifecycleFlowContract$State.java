package com.revolut.feature.product.lifecycle.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product.lifecycle.domain.models.Interaction;
import com.revolut.kompot.navigable.flow.FlowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/product/lifecycle/flow/ProductLifecycleFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_product_lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductLifecycleFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<ProductLifecycleFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f81206b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Interaction.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ProductLifecycleFlowContract$State(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductLifecycleFlowContract$State[i];
        }
    }

    public ProductLifecycleFlowContract$State() {
        this(0);
    }

    public static ProductLifecycleFlowContract$State a(ProductLifecycleFlowContract$State productLifecycleFlowContract$State, String str, List interactions, int i) {
        if ((i & 1) != 0) {
            str = productLifecycleFlowContract$State.f81205a;
        }
        if ((i & 2) != 0) {
            interactions = productLifecycleFlowContract$State.f81206b;
        }
        productLifecycleFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(interactions, "interactions");
        return new ProductLifecycleFlowContract$State(str, interactions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductLifecycleFlowContract$State)) {
            return false;
        }
        ProductLifecycleFlowContract$State productLifecycleFlowContract$State = (ProductLifecycleFlowContract$State) obj2;
        return Intrinsics.f(this.f81205a, productLifecycleFlowContract$State.f81205a) && Intrinsics.f(this.f81206b, productLifecycleFlowContract$State.f81206b);
    }

    public final int hashCode() {
        String str = this.f81205a;
        return this.f81206b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81205a);
        Iterator itV = p.a.v(this.f81206b, dest);
        while (itV.hasNext()) {
            ((Interaction) itV.next()).writeToParcel(dest, i);
        }
    }

    public ProductLifecycleFlowContract$State(String str, List interactions) {
        Intrinsics.checkNotNullParameter(interactions, "interactions");
        this.f81205a = str;
        this.f81206b = interactions;
    }

    public ProductLifecycleFlowContract$State(int i) {
        this(null, f0.f322471a);
    }
}
