package com.revolut.feature.stories;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.stories.navigation.StoriesFeatureConfig;
import com.revolut.retail.core.navigation.ModalFragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z9h.n;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/stories/StoriesContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "framework_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoriesContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoriesContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f88747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModalFragmentNavigateCommand f88748c;
    public final NaviCommand d;
    public final NaviCommand e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f88749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f88750h;
    public final AnalyticsProduct i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StoriesFeatureConfig.AnalyticsData f88751j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(StoriesContract$Configuration.class, parcel, arrayList2, iE, 1);
                }
                arrayList = arrayList2;
            }
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(StoriesContract$Configuration.class.getClassLoader());
            ModalFragmentNavigateCommand modalFragmentNavigateCommand = (ModalFragmentNavigateCommand) parcel.readParcelable(StoriesContract$Configuration.class.getClassLoader());
            NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(StoriesContract$Configuration.class.getClassLoader());
            NaviCommand naviCommand3 = (NaviCommand) parcel.readParcelable(StoriesContract$Configuration.class.getClassLoader());
            String string = parcel.readString();
            return new StoriesContract$Configuration(arrayList, naviCommand, modalFragmentNavigateCommand, naviCommand2, naviCommand3, string, parcel.readInt() != 0, parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(StoriesContract$Configuration.class.getClassLoader()), (StoriesFeatureConfig.AnalyticsData) parcel.readParcelable(StoriesContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoriesContract$Configuration[i];
        }
    }

    public StoriesContract$Configuration(List list, NaviCommand naviCommand, ModalFragmentNavigateCommand modalFragmentNavigateCommand, NaviCommand naviCommand2, NaviCommand closeNaviCommand, String str, boolean z, boolean z3, AnalyticsProduct analyticsProduct, StoriesFeatureConfig.AnalyticsData analyticsData) {
        Intrinsics.checkNotNullParameter(closeNaviCommand, "closeNaviCommand");
        this.f88746a = list;
        this.f88747b = naviCommand;
        this.f88748c = modalFragmentNavigateCommand;
        this.d = naviCommand2;
        this.e = closeNaviCommand;
        this.f = str;
        this.f88749g = z;
        this.f88750h = z3;
        this.i = analyticsProduct;
        this.f88751j = analyticsData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoriesContract$Configuration)) {
            return false;
        }
        StoriesContract$Configuration storiesContract$Configuration = (StoriesContract$Configuration) obj2;
        return Intrinsics.f(this.f88746a, storiesContract$Configuration.f88746a) && Intrinsics.f(this.f88747b, storiesContract$Configuration.f88747b) && Intrinsics.f(this.f88748c, storiesContract$Configuration.f88748c) && Intrinsics.f(this.d, storiesContract$Configuration.d) && Intrinsics.f(this.e, storiesContract$Configuration.e) && Intrinsics.f(this.f, storiesContract$Configuration.f) && this.f88749g == storiesContract$Configuration.f88749g && this.f88750h == storiesContract$Configuration.f88750h && Intrinsics.f(this.i, storiesContract$Configuration.i) && Intrinsics.f(this.f88751j, storiesContract$Configuration.f88751j);
    }

    public final int hashCode() {
        List list = this.f88746a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        NaviCommand naviCommand = this.f88747b;
        int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        ModalFragmentNavigateCommand modalFragmentNavigateCommand = this.f88748c;
        int iHashCode3 = (iHashCode2 + (modalFragmentNavigateCommand == null ? 0 : modalFragmentNavigateCommand.hashCode())) * 31;
        NaviCommand naviCommand2 = this.d;
        int iA = n.a(this.e, (iHashCode3 + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31, 31);
        String str = this.f;
        int iC = j6.a.c(j6.a.c((iA + (str == null ? 0 : str.hashCode())) * 961, 31, this.f88749g), 31, this.f88750h);
        AnalyticsProduct analyticsProduct = this.i;
        int iHashCode4 = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        StoriesFeatureConfig.AnalyticsData analyticsData = this.f88751j;
        return iHashCode4 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List list = this.f88746a;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        dest.writeParcelable(this.f88747b, i);
        dest.writeParcelable(this.f88748c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeParcelable(null, i);
        dest.writeInt(this.f88749g ? 1 : 0);
        dest.writeInt(this.f88750h ? 1 : 0);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f88751j, i);
    }
}
