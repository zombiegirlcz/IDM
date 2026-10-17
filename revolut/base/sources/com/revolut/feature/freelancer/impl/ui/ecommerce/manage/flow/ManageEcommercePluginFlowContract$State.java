package com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/ecommerce/manage/flow/ManageEcommercePluginFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManageEcommercePluginFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ManageEcommercePluginFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f73792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f73793b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = d.e(ManageEcommercePluginFlowContract$State.class, parcel, linkedHashSet, iE2, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
            while (iE != i2) {
                iE = d.e(ManageEcommercePluginFlowContract$State.class, parcel, linkedHashSet2, iE, 1);
            }
            return new ManageEcommercePluginFlowContract$State(linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManageEcommercePluginFlowContract$State[i];
        }
    }

    public ManageEcommercePluginFlowContract$State() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManageEcommercePluginFlowContract$State)) {
            return false;
        }
        ManageEcommercePluginFlowContract$State manageEcommercePluginFlowContract$State = (ManageEcommercePluginFlowContract$State) obj2;
        return Intrinsics.f(this.f73792a, manageEcommercePluginFlowContract$State.f73792a) && Intrinsics.f(this.f73793b, manageEcommercePluginFlowContract$State.f73793b);
    }

    public final int hashCode() {
        return this.f73793b.hashCode() + (this.f73792a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f73792a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = n.v(this.f73793b, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }

    public ManageEcommercePluginFlowContract$State(Set enabledPlugins, Set installedPlugins) {
        Intrinsics.checkNotNullParameter(enabledPlugins, "enabledPlugins");
        Intrinsics.checkNotNullParameter(installedPlugins, "installedPlugins");
        this.f73792a = enabledPlugins;
        this.f73793b = installedPlugins;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ManageEcommercePluginFlowContract$State(int i) {
        h0 h0Var = h0.f322473a;
        this(h0Var, h0Var);
    }
}
