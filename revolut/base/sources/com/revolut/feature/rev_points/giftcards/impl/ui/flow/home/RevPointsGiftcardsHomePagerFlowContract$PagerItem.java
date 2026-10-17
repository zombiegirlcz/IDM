package com.revolut.feature.rev_points.giftcards.impl.ui.flow.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"com/revolut/feature/rev_points/giftcards/impl/ui/flow/home/RevPointsGiftcardsHomePagerFlowContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Landroid/os/Parcelable;", "<init>", "()V", "Discover", "MyCards", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/home/RevPointsGiftcardsHomePagerFlowContract$PagerItem$Discover;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/home/RevPointsGiftcardsHomePagerFlowContract$PagerItem$MyCards;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsGiftcardsHomePagerFlowContract$PagerItem implements FixedIdPagerItem, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/home/RevPointsGiftcardsHomePagerFlowContract$PagerItem$MyCards;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/home/RevPointsGiftcardsHomePagerFlowContract$PagerItem;", "<init>", "()V", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MyCards extends RevPointsGiftcardsHomePagerFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MyCards f83676a = new MyCards();

        @NotNull
        public static final Parcelable.Creator<MyCards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MyCards.f83676a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MyCards[i];
            }
        }

        private MyCards() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private RevPointsGiftcardsHomePagerFlowContract$PagerItem() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/home/RevPointsGiftcardsHomePagerFlowContract$PagerItem$Discover;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/flow/home/RevPointsGiftcardsHomePagerFlowContract$PagerItem;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Discover extends RevPointsGiftcardsHomePagerFlowContract$PagerItem {

        @NotNull
        public static final Parcelable.Creator<Discover> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f83675a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Discover(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Discover[i];
            }
        }

        public Discover(boolean z) {
            this.f83675a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Discover) && this.f83675a == ((Discover) obj2).f83675a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83675a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f83675a ? 1 : 0);
        }

        public Discover() {
            this(false);
        }
    }
}
