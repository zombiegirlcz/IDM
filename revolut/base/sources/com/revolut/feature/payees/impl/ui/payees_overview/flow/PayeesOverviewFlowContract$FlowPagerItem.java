package com.revolut.feature.payees.impl.ui.payees_overview.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/payees/impl/ui/payees_overview/flow/PayeesOverviewFlowContract$FlowPagerItem", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "CurrentUser", "Junior", "Lcom/revolut/feature/payees/impl/ui/payees_overview/flow/PayeesOverviewFlowContract$FlowPagerItem$CurrentUser;", "Lcom/revolut/feature/payees/impl/ui/payees_overview/flow/PayeesOverviewFlowContract$FlowPagerItem$Junior;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayeesOverviewFlowContract$FlowPagerItem extends PagerItem {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/payees_overview/flow/PayeesOverviewFlowContract$FlowPagerItem$CurrentUser;", "Lcom/revolut/feature/payees/impl/ui/payees_overview/flow/PayeesOverviewFlowContract$FlowPagerItem;", "<init>", "()V", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CurrentUser implements PayeesOverviewFlowContract$FlowPagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CurrentUser f79005a = new CurrentUser();

        @NotNull
        public static final Parcelable.Creator<CurrentUser> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CurrentUser.f79005a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentUser[i];
            }
        }

        private CurrentUser() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF79006a() {
            return "CURRENT_USER_PAGE_ID";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/payees_overview/flow/PayeesOverviewFlowContract$FlowPagerItem$Junior;", "Lcom/revolut/feature/payees/impl/ui/payees_overview/flow/PayeesOverviewFlowContract$FlowPagerItem;", "", "toString", "()Ljava/lang/String;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior implements PayeesOverviewFlowContract$FlowPagerItem {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79007b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Junior(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        public Junior(String id10, String firstName) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            this.f79006a = id10;
            this.f79007b = firstName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Junior)) {
                return false;
            }
            Junior junior = (Junior) obj2;
            return Intrinsics.f(this.f79006a, junior.f79006a) && Intrinsics.f(this.f79007b, junior.f79007b);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF79006a() {
            return this.f79006a;
        }

        public final int hashCode() {
            return this.f79007b.hashCode() + (this.f79006a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79006a);
            dest.writeString(this.f79007b);
        }
    }
}
