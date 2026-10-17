package com.revolut.feature.remote_stories.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.remote_stories.models.keys.RemoteStoriesKey;
import com.revolut.feature.remote_stories.models.params.RemoteStoryModelButtonParams;
import com.revolut.feature.remote_stories.models.params.RemoteStoryModelParams;
import com.revolut.feature.stories.navigation.StoriesFeatureConfig;
import com.revolut.retail.core.navigation.ModalFragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/remote_stories/impl/ui/RemoteStoriesContract$Config", "Landroid/os/Parcelable;", "<init>", "()V", "Deeplink", "Key", "Id", "Lcom/revolut/feature/remote_stories/impl/ui/RemoteStoriesContract$Config$Deeplink;", "Lcom/revolut/feature/remote_stories/impl/ui/RemoteStoriesContract$Config$Id;", "Lcom/revolut/feature/remote_stories/impl/ui/RemoteStoriesContract$Config$Key;", "feature_remote_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RemoteStoriesContract$Config implements Parcelable {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/remote_stories/impl/ui/RemoteStoriesContract$Config$Id;", "Lcom/revolut/feature/remote_stories/impl/ui/RemoteStoriesContract$Config;", "", "toString", "()Ljava/lang/String;", "feature_remote_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Id extends RemoteStoriesContract$Config {

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f81962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f81963c;
        public final sza.a d;
        public final NaviCommand e;
        public final RemoteStoryModelParams f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f81964g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f81965h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AnalyticsProduct f81966j;
        public final boolean k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                sza.a aVar;
                NaviCommand naviCommand;
                RemoteStoryModelParams remoteStoryModelParams;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(Id.class.getClassLoader());
                sza.a aVarValueOf = sza.a.valueOf(parcel.readString());
                NaviCommand naviCommand3 = (NaviCommand) parcel.readParcelable(Id.class.getClassLoader());
                RemoteStoryModelParams remoteStoryModelParams2 = (RemoteStoryModelParams) parcel.readParcelable(Id.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                    aVar = aVarValueOf;
                    naviCommand = naviCommand3;
                    remoteStoryModelParams = remoteStoryModelParams2;
                    z3 = true;
                } else {
                    z = true;
                    aVar = aVarValueOf;
                    naviCommand = naviCommand3;
                    remoteStoryModelParams = remoteStoryModelParams2;
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = z;
                } else {
                    z4 = z;
                    z = false;
                }
                return new Id(string, linkedHashMap, naviCommand2, aVar, naviCommand, remoteStoryModelParams, z3, z, parcel.readInt(), (AnalyticsProduct) parcel.readParcelable(Id.class.getClassLoader()), parcel.readInt() != 0 ? z4 : false);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Id[i];
            }
        }

        public Id(String storyId, Map substitutionData, NaviCommand naviCommand, sza.a setStoriesAsShownMode, NaviCommand naviCommand2, RemoteStoryModelParams remoteStoryModelParams, boolean z, boolean z3, int i, AnalyticsProduct analyticsProduct, boolean z4) {
            Intrinsics.checkNotNullParameter(storyId, "storyId");
            Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
            Intrinsics.checkNotNullParameter(setStoriesAsShownMode, "setStoriesAsShownMode");
            Intrinsics.checkNotNullParameter(remoteStoryModelParams, "remoteStoryModelParams");
            this.f81961a = storyId;
            this.f81962b = substitutionData;
            this.f81963c = naviCommand;
            this.d = setStoriesAsShownMode;
            this.e = naviCommand2;
            this.f = remoteStoryModelParams;
            this.f81964g = z;
            this.f81965h = z3;
            this.i = i;
            this.f81966j = analyticsProduct;
            this.k = z4;
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: a, reason: from getter */
        public final NaviCommand getF() {
            return this.e;
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF81971h() {
            return this.f81964g;
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getI() {
            return this.f81965h;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final NaviCommand getF81963c() {
            return this.f81963c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final sza.a getD() {
            return this.d;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Id)) {
                return false;
            }
            Id id10 = (Id) obj2;
            return Intrinsics.f(this.f81961a, id10.f81961a) && Intrinsics.f(this.f81962b, id10.f81962b) && Intrinsics.f(this.f81963c, id10.f81963c) && this.d == id10.d && Intrinsics.f(this.e, id10.e) && Intrinsics.f(this.f, id10.f) && this.f81964g == id10.f81964g && this.f81965h == id10.f81965h && this.i == id10.i && Intrinsics.f(this.f81966j, id10.f81966j) && this.k == id10.k;
        }

        public final int hashCode() {
            int iE = p.a.e(this.f81961a.hashCode() * 31, 31, this.f81962b);
            NaviCommand naviCommand = this.f81963c;
            int iHashCode = (this.d.hashCode() + ((iE + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31)) * 31;
            NaviCommand naviCommand2 = this.e;
            int iB = j6.a.b(this.i, j6.a.c(j6.a.c((this.f.hashCode() + ((iHashCode + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31)) * 31, 31, this.f81964g), 31, this.f81965h), 31);
            AnalyticsProduct analyticsProduct = this.f81966j;
            return Boolean.hashCode(this.k) + ((iB + (analyticsProduct != null ? analyticsProduct.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getK() {
            return this.f81966j;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getF81961a() {
            return this.f81961a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81961a);
            Iterator itZ = j6.a.z(this.f81962b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeParcelable(this.f81963c, i);
            dest.writeString(this.d.name());
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeInt(this.f81964g ? 1 : 0);
            dest.writeInt(this.f81965h ? 1 : 0);
            dest.writeInt(this.i);
            dest.writeParcelable(this.f81966j, i);
            dest.writeInt(this.k ? 1 : 0);
        }

        /* JADX INFO: renamed from: x9, reason: from getter */
        public final boolean getK() {
            return this.k;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/remote_stories/impl/ui/RemoteStoriesContract$Config$Key;", "Lcom/revolut/feature/remote_stories/impl/ui/RemoteStoriesContract$Config;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_remote_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Key extends RemoteStoriesContract$Config implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RemoteStoriesKey f81967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f81968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f81969c;
        public final ModalFragmentNavigateCommand d;
        public final sza.a e;
        public final NaviCommand f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final RemoteStoryModelParams f81970g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f81971h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f81972j;
        public final AnalyticsProduct k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final StoriesFeatureConfig.AnalyticsData f81973l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                RemoteStoriesKey remoteStoriesKey = (RemoteStoriesKey) j6.a.f(parcel, "parcel", Key.class);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Key(remoteStoriesKey, linkedHashMap, (NaviCommand) parcel.readParcelable(Key.class.getClassLoader()), (ModalFragmentNavigateCommand) parcel.readParcelable(Key.class.getClassLoader()), sza.a.valueOf(parcel.readString()), (NaviCommand) parcel.readParcelable(Key.class.getClassLoader()), (RemoteStoryModelParams) parcel.readParcelable(Key.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), (AnalyticsProduct) parcel.readParcelable(Key.class.getClassLoader()), (StoriesFeatureConfig.AnalyticsData) parcel.readParcelable(Key.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Key[i];
            }
        }

        public Key(RemoteStoriesKey key, Map substitutionData, NaviCommand naviCommand, ModalFragmentNavigateCommand modalFragmentNavigateCommand, sza.a setStoriesAsShownMode, NaviCommand naviCommand2, RemoteStoryModelParams remoteStoryModelParams, boolean z, boolean z3, int i, AnalyticsProduct analyticsProduct, StoriesFeatureConfig.AnalyticsData analyticsData) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
            Intrinsics.checkNotNullParameter(setStoriesAsShownMode, "setStoriesAsShownMode");
            Intrinsics.checkNotNullParameter(remoteStoryModelParams, "remoteStoryModelParams");
            this.f81967a = key;
            this.f81968b = substitutionData;
            this.f81969c = naviCommand;
            this.d = modalFragmentNavigateCommand;
            this.e = setStoriesAsShownMode;
            this.f = naviCommand2;
            this.f81970g = remoteStoryModelParams;
            this.f81971h = z;
            this.i = z3;
            this.f81972j = i;
            this.k = analyticsProduct;
            this.f81973l = analyticsData;
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: a, reason: from getter */
        public final NaviCommand getF() {
            return this.f;
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF81971h() {
            return this.f81971h;
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getI() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Key)) {
                return false;
            }
            Key key = (Key) obj2;
            return Intrinsics.f(this.f81967a, key.f81967a) && Intrinsics.f(this.f81968b, key.f81968b) && Intrinsics.f(this.f81969c, key.f81969c) && Intrinsics.f(this.d, key.d) && this.e == key.e && Intrinsics.f(this.f, key.f) && Intrinsics.f(this.f81970g, key.f81970g) && this.f81971h == key.f81971h && this.i == key.i && this.f81972j == key.f81972j && Intrinsics.f(this.k, key.k) && Intrinsics.f(this.f81973l, key.f81973l);
        }

        public final int hashCode() {
            int iE = p.a.e(this.f81967a.hashCode() * 31, 31, this.f81968b);
            NaviCommand naviCommand = this.f81969c;
            int iHashCode = (iE + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            ModalFragmentNavigateCommand modalFragmentNavigateCommand = this.d;
            int iHashCode2 = (this.e.hashCode() + ((iHashCode + (modalFragmentNavigateCommand == null ? 0 : modalFragmentNavigateCommand.hashCode())) * 31)) * 31;
            NaviCommand naviCommand2 = this.f;
            int iB = j6.a.b(this.f81972j, j6.a.c(j6.a.c((this.f81970g.hashCode() + ((iHashCode2 + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31)) * 31, 31, this.f81971h), 31, this.i), 31);
            AnalyticsProduct analyticsProduct = this.k;
            int iHashCode3 = (iB + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            StoriesFeatureConfig.AnalyticsData analyticsData = this.f81973l;
            return iHashCode3 + (analyticsData != null ? analyticsData.hashCode() : 0);
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getK() {
            return this.k;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81967a, i);
            Iterator itZ = j6.a.z(this.f81968b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeParcelable(this.f81969c, i);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f81970g, i);
            dest.writeInt(this.f81971h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.f81972j);
            dest.writeParcelable(this.k, i);
            dest.writeParcelable(this.f81973l, i);
        }
    }

    private RemoteStoriesContract$Config() {
    }

    /* JADX INFO: renamed from: a */
    public abstract NaviCommand getF();

    /* JADX INFO: renamed from: b */
    public abstract boolean getF81971h();

    /* JADX INFO: renamed from: c */
    public abstract boolean getI();

    /* JADX INFO: renamed from: i6 */
    public abstract AnalyticsProduct getK();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/remote_stories/impl/ui/RemoteStoriesContract$Config$Deeplink;", "Lcom/revolut/feature/remote_stories/impl/ui/RemoteStoriesContract$Config;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_remote_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink extends RemoteStoriesContract$Config implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f81957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RemoteStoryModelParams f81958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f81959c;
        public final boolean d;
        public final int e;
        public final NaviCommand f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AnalyticsProduct f81960g;

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink(parcel.createStringArrayList(), (RemoteStoryModelParams) parcel.readParcelable(Deeplink.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), (NaviCommand) parcel.readParcelable(Deeplink.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(Deeplink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(List deeplinks, RemoteStoryModelParams remoteStoryModelParams, boolean z, boolean z3, int i, NaviCommand naviCommand, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
            Intrinsics.checkNotNullParameter(remoteStoryModelParams, "remoteStoryModelParams");
            this.f81957a = deeplinks;
            this.f81958b = remoteStoryModelParams;
            this.f81959c = z;
            this.d = z3;
            this.e = i;
            this.f = naviCommand;
            this.f81960g = analyticsProduct;
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: a, reason: from getter */
        public final NaviCommand getF() {
            return this.f;
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF81971h() {
            return this.f81959c;
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getI() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Deeplink)) {
                return false;
            }
            Deeplink deeplink = (Deeplink) obj2;
            return Intrinsics.f(this.f81957a, deeplink.f81957a) && Intrinsics.f(this.f81958b, deeplink.f81958b) && this.f81959c == deeplink.f81959c && this.d == deeplink.d && this.e == deeplink.e && Intrinsics.f(this.f, deeplink.f) && Intrinsics.f(this.f81960g, deeplink.f81960g);
        }

        public final int hashCode() {
            int iB = j6.a.b(this.e, j6.a.c(j6.a.c((this.f81958b.hashCode() + (this.f81957a.hashCode() * 31)) * 31, 31, this.f81959c), 31, this.d), 31);
            NaviCommand naviCommand = this.f;
            int iHashCode = (iB + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            AnalyticsProduct analyticsProduct = this.f81960g;
            return iHashCode + (analyticsProduct != null ? analyticsProduct.hashCode() : 0);
        }

        @Override // com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config
        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getK() {
            return this.f81960g;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f81957a);
            dest.writeParcelable(this.f81958b, i);
            dest.writeInt(this.f81959c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f81960g, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Deeplink(List list, RemoteStoryModelParams remoteStoryModelParams, boolean z, boolean z3, int i, AnalyticsProduct analyticsProduct, int i2) {
            RemoteStoryModelButtonParams remoteStoryModelButtonParams = null;
            this(list, (i2 & 2) != 0 ? new RemoteStoryModelParams(remoteStoryModelButtonParams, remoteStoryModelButtonParams, false, 31) : remoteStoryModelParams, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? false : z3, i, (NaviCommand) null, (i2 & 64) != 0 ? null : analyticsProduct);
        }
    }
}
