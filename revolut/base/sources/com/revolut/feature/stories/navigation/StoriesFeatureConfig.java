package com.revolut.feature.stories.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.stories.models.StoriesModel;
import com.revolut.retail.core.navigation.ModalFragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z9h.n;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/stories/navigation/StoriesFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Tutorial", "Story", "AnalyticsData", "ConfigurationParams", "Lcom/revolut/feature/stories/navigation/StoriesFeatureConfig$Story;", "Lcom/revolut/feature/stories/navigation/StoriesFeatureConfig$Tutorial;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoriesFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/navigation/StoriesFeatureConfig$AnalyticsData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnalyticsData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AnalyticsData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88846a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AnalyticsData(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsData[i];
            }
        }

        public AnalyticsData(String str) {
            this.f88846a = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF88846a() {
            return this.f88846a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AnalyticsData) && Intrinsics.f(this.f88846a, ((AnalyticsData) obj2).f88846a);
        }

        public final int hashCode() {
            String str = this.f88846a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88846a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/stories/navigation/StoriesFeatureConfig$ConfigurationParams;", "Landroid/os/Parcelable;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ConfigurationParams extends Parcelable {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/navigation/StoriesFeatureConfig$Story;", "Lcom/revolut/feature/stories/navigation/StoriesFeatureConfig;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Story extends StoriesFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Story> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f88847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NaviCommand f88848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ModalFragmentNavigateCommand f88849c;
        public final NaviCommand d;
        public final NaviCommand e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f88850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f88851h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AnalyticsProduct f88852j;
        public final AnalyticsData k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f88853l;

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
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(StoriesModel.CREATOR, parcel, arrayList2, iA, 1);
                    }
                    arrayList = arrayList2;
                }
                NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(Story.class.getClassLoader());
                ModalFragmentNavigateCommand modalFragmentNavigateCommand = (ModalFragmentNavigateCommand) parcel.readParcelable(Story.class.getClassLoader());
                NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(Story.class.getClassLoader());
                NaviCommand naviCommand3 = (NaviCommand) parcel.readParcelable(Story.class.getClassLoader());
                String string = parcel.readString();
                return new Story(arrayList, naviCommand, modalFragmentNavigateCommand, naviCommand2, naviCommand3, string, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(Story.class.getClassLoader()), parcel.readInt() != 0 ? AnalyticsData.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Story[i];
            }
        }

        public Story(ArrayList arrayList, NaviCommand naviCommand, ModalFragmentNavigateCommand modalFragmentNavigateCommand, NaviCommand naviCommand2, NaviCommand closeNaviCommand, String str, boolean z, boolean z3, boolean z4, AnalyticsProduct analyticsProduct, AnalyticsData analyticsData, boolean z6) {
            Intrinsics.checkNotNullParameter(closeNaviCommand, "closeNaviCommand");
            this.f88847a = arrayList;
            this.f88848b = naviCommand;
            this.f88849c = modalFragmentNavigateCommand;
            this.d = naviCommand2;
            this.e = closeNaviCommand;
            this.f = str;
            this.f88850g = z;
            this.f88851h = z3;
            this.i = z4;
            this.f88852j = analyticsProduct;
            this.k = analyticsData;
            this.f88853l = z6;
        }

        @Override // com.revolut.feature.stories.navigation.StoriesFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getE() {
            return this.f88853l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Story)) {
                return false;
            }
            Story story = (Story) obj2;
            return Intrinsics.f(this.f88847a, story.f88847a) && Intrinsics.f(this.f88848b, story.f88848b) && Intrinsics.f(this.f88849c, story.f88849c) && Intrinsics.f(this.d, story.d) && Intrinsics.f(this.e, story.e) && Intrinsics.f(this.f, story.f) && this.f88850g == story.f88850g && this.f88851h == story.f88851h && this.i == story.i && Intrinsics.f(this.f88852j, story.f88852j) && Intrinsics.f(this.k, story.k) && this.f88853l == story.f88853l;
        }

        public final int hashCode() {
            List list = this.f88847a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            NaviCommand naviCommand = this.f88848b;
            int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            ModalFragmentNavigateCommand modalFragmentNavigateCommand = this.f88849c;
            int iHashCode3 = (iHashCode2 + (modalFragmentNavigateCommand == null ? 0 : modalFragmentNavigateCommand.hashCode())) * 31;
            NaviCommand naviCommand2 = this.d;
            int iA = n.a(this.e, (iHashCode3 + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31, 31);
            String str = this.f;
            int iC = j6.a.c(j6.a.c(j6.a.c((iA + (str == null ? 0 : str.hashCode())) * 961, 31, this.f88850g), 31, this.f88851h), 31, this.i);
            AnalyticsProduct analyticsProduct = this.f88852j;
            int iHashCode4 = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            AnalyticsData analyticsData = this.k;
            return Boolean.hashCode(this.f88853l) + ((iHashCode4 + (analyticsData != null ? analyticsData.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List list = this.f88847a;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    ((StoriesModel) itQ.next()).writeToParcel(dest, i);
                }
            }
            dest.writeParcelable(this.f88848b, i);
            dest.writeParcelable(this.f88849c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeString(this.f);
            dest.writeParcelable(null, i);
            dest.writeInt(this.f88850g ? 1 : 0);
            dest.writeInt(this.f88851h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeParcelable(this.f88852j, i);
            AnalyticsData analyticsData = this.k;
            if (analyticsData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                analyticsData.writeToParcel(dest, i);
            }
            dest.writeInt(this.f88853l ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/navigation/StoriesFeatureConfig$Tutorial;", "Lcom/revolut/feature/stories/navigation/StoriesFeatureConfig;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tutorial extends StoriesFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Tutorial> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StoriesModel f88854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NaviCommand f88855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f88856c;
        public final NaviCommand d;
        public final boolean e;
        public final AnalyticsProduct f;

        /* JADX INFO: loaded from: classes7.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tutorial(StoriesModel.CREATOR.createFromParcel(parcel), (NaviCommand) parcel.readParcelable(Tutorial.class.getClassLoader()), (NaviCommand) parcel.readParcelable(Tutorial.class.getClassLoader()), (NaviCommand) parcel.readParcelable(Tutorial.class.getClassLoader()), parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(Tutorial.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tutorial[i];
            }
        }

        public Tutorial(StoriesModel story, NaviCommand naviCommand, NaviCommand naviCommand2, NaviCommand closeNaviCommand, boolean z, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(story, "story");
            Intrinsics.checkNotNullParameter(closeNaviCommand, "closeNaviCommand");
            this.f88854a = story;
            this.f88855b = naviCommand;
            this.f88856c = naviCommand2;
            this.d = closeNaviCommand;
            this.e = z;
            this.f = analyticsProduct;
        }

        @Override // com.revolut.feature.stories.navigation.StoriesFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Tutorial)) {
                return false;
            }
            Tutorial tutorial = (Tutorial) obj2;
            return Intrinsics.f(this.f88854a, tutorial.f88854a) && Intrinsics.f(this.f88855b, tutorial.f88855b) && Intrinsics.f(this.f88856c, tutorial.f88856c) && Intrinsics.f(this.d, tutorial.d) && this.e == tutorial.e && Intrinsics.f(this.f, tutorial.f);
        }

        public final int hashCode() {
            int iHashCode = this.f88854a.hashCode() * 31;
            NaviCommand naviCommand = this.f88855b;
            int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            NaviCommand naviCommand2 = this.f88856c;
            int iC = j6.a.c(n.a(this.d, (iHashCode2 + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31, 31), 31, this.e);
            AnalyticsProduct analyticsProduct = this.f;
            return iC + (analyticsProduct != null ? analyticsProduct.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f88854a.writeToParcel(dest, i);
            dest.writeParcelable(this.f88855b, i);
            dest.writeParcelable(this.f88856c, i);
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
        }
    }

    private StoriesFeatureConfig() {
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean getE();
}
