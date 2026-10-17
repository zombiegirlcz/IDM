package com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_allowance/impl/ui/screen/allowance_pager/JuniorAllowancePagerScreenContract$AllowancePage", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "", "toString", "()Ljava/lang/String;", "feature_junior_allowance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAllowancePagerScreenContract$AllowancePage implements PagerItem {

    @NotNull
    public static final Parcelable.Creator<JuniorAllowancePagerScreenContract$AllowancePage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76838b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorAllowancePagerScreenContract$AllowancePage(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorAllowancePagerScreenContract$AllowancePage[i];
        }
    }

    public JuniorAllowancePagerScreenContract$AllowancePage(String standingOrderId, String originatorRegisteredIdentityId) {
        Intrinsics.checkNotNullParameter(standingOrderId, "standingOrderId");
        Intrinsics.checkNotNullParameter(originatorRegisteredIdentityId, "originatorRegisteredIdentityId");
        this.f76837a = standingOrderId;
        this.f76838b = originatorRegisteredIdentityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorAllowancePagerScreenContract$AllowancePage)) {
            return false;
        }
        JuniorAllowancePagerScreenContract$AllowancePage juniorAllowancePagerScreenContract$AllowancePage = (JuniorAllowancePagerScreenContract$AllowancePage) obj2;
        return Intrinsics.f(this.f76837a, juniorAllowancePagerScreenContract$AllowancePage.f76837a) && Intrinsics.f(this.f76838b, juniorAllowancePagerScreenContract$AllowancePage.f76838b);
    }

    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF76837a() {
        return this.f76837a;
    }

    public final int hashCode() {
        return this.f76838b.hashCode() + (this.f76837a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76837a);
        dest.writeString(this.f76838b);
    }
}
