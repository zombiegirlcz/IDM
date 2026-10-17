package com.revolut.feature.remote_stories.models.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.RoomDatabase;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.remote_stories.models.keys.RemoteStoriesKey;
import com.revolut.feature.remote_stories.models.params.RemoteStoryModelParams;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.ModalFragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/remote_stories/models/navigation/RemoteStoriesFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Companion", "a", "Deeplink", "Key", "Id", "sza/a", "AnalyticsData", "Lcom/revolut/feature/remote_stories/models/navigation/RemoteStoriesFeatureConfig$Deeplink;", "Lcom/revolut/feature/remote_stories/models/navigation/RemoteStoriesFeatureConfig$Id;", "Lcom/revolut/feature/remote_stories/models/navigation/RemoteStoriesFeatureConfig$Key;", "feature_remote_stories_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RemoteStoriesFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/remote_stories/models/navigation/RemoteStoriesFeatureConfig$AnalyticsData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_remote_stories_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnalyticsData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AnalyticsData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81990a;

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
            this.f81990a = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF81990a() {
            return this.f81990a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AnalyticsData) && Intrinsics.f(this.f81990a, ((AnalyticsData) obj2).f81990a);
        }

        public final int hashCode() {
            String str = this.f81990a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81990a);
        }
    }

    private RemoteStoriesFeatureConfig() {
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean getK();

    /* JADX INFO: renamed from: b */
    public abstract int getF82008j();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/remote_stories/models/navigation/RemoteStoriesFeatureConfig$Deeplink;", "Lcom/revolut/feature/remote_stories/models/navigation/RemoteStoriesFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_remote_stories_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink extends RemoteStoriesFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f81991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NaviCommand f81992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RemoteStoryModelParams f81993c;
        public final boolean d;
        public final boolean e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f81994g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AnalyticsProduct f81995h;

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(Deeplink.class.getClassLoader());
                RemoteStoryModelParams remoteStoryModelParamsCreateFromParcel = RemoteStoryModelParams.CREATOR.createFromParcel(parcel);
                boolean z4 = false;
                boolean z6 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                    z3 = true;
                } else {
                    z = false;
                    z3 = true;
                }
                int i = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                return new Deeplink(arrayListCreateStringArrayList, naviCommand, remoteStoryModelParamsCreateFromParcel, z6, z4, i, z, (AnalyticsProduct) parcel.readParcelable(Deeplink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(List deeplinks, NaviCommand naviCommand, RemoteStoryModelParams remoteStoryModelParams, boolean z, boolean z3, int i, boolean z4, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
            Intrinsics.checkNotNullParameter(remoteStoryModelParams, "remoteStoryModelParams");
            this.f81991a = deeplinks;
            this.f81992b = naviCommand;
            this.f81993c = remoteStoryModelParams;
            this.d = z;
            this.e = z3;
            this.f = i;
            this.f81994g = z4;
            this.f81995h = analyticsProduct;
        }

        @Override // com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getK() {
            return this.f81994g;
        }

        @Override // com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig
        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF82008j() {
            return this.f;
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
            return Intrinsics.f(this.f81991a, deeplink.f81991a) && Intrinsics.f(this.f81992b, deeplink.f81992b) && Intrinsics.f(this.f81993c, deeplink.f81993c) && this.d == deeplink.d && this.e == deeplink.e && this.f == deeplink.f && this.f81994g == deeplink.f81994g && Intrinsics.f(this.f81995h, deeplink.f81995h);
        }

        public final int hashCode() {
            int iHashCode = this.f81991a.hashCode() * 31;
            NaviCommand naviCommand = this.f81992b;
            int iC = j6.a.c(j6.a.b(this.f, j6.a.c(j6.a.c((this.f81993c.hashCode() + ((iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31), 31, this.f81994g);
            AnalyticsProduct analyticsProduct = this.f81995h;
            return iC + (analyticsProduct != null ? analyticsProduct.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f81991a);
            dest.writeParcelable(this.f81992b, i);
            this.f81993c.writeToParcel(dest, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f);
            dest.writeInt(this.f81994g ? 1 : 0);
            dest.writeParcelable(this.f81995h, i);
        }

        public /* synthetic */ Deeplink(List list) {
            this(list, null, new RemoteStoryModelParams(null, null, false, 31), true, false, RoomDatabase.MAX_BIND_PARAMETER_CNT, false, null);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/remote_stories/models/navigation/RemoteStoriesFeatureConfig$Id;", "Lcom/revolut/feature/remote_stories/models/navigation/RemoteStoriesFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_remote_stories_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Id extends RemoteStoriesFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f81997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f81998c;
        public final sza.a d;
        public final boolean e;
        public final NaviCommand f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final RemoteStoryModelParams f81999g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f82000h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f82001j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AnalyticsProduct f82002l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                sza.a aVar;
                boolean z3;
                boolean z4;
                NaviCommand naviCommand;
                RemoteStoryModelParams remoteStoryModelParams;
                boolean z6;
                boolean z11;
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
                if (parcel.readInt() != 0) {
                    z = true;
                    aVar = aVarValueOf;
                    z3 = true;
                } else {
                    z = true;
                    aVar = aVarValueOf;
                    z3 = false;
                }
                NaviCommand naviCommand3 = (NaviCommand) parcel.readParcelable(Id.class.getClassLoader());
                RemoteStoryModelParams remoteStoryModelParamsCreateFromParcel = RemoteStoryModelParams.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z4 = z;
                    naviCommand = naviCommand3;
                    remoteStoryModelParams = remoteStoryModelParamsCreateFromParcel;
                    z6 = z4;
                } else {
                    z4 = z;
                    naviCommand = naviCommand3;
                    remoteStoryModelParams = remoteStoryModelParamsCreateFromParcel;
                    z6 = false;
                }
                if (parcel.readInt() != 0) {
                    z11 = z4;
                } else {
                    z11 = z4;
                    z4 = false;
                }
                return new Id(string, linkedHashMap, naviCommand2, aVar, z3, naviCommand, remoteStoryModelParams, z6, z4, parcel.readInt(), parcel.readInt() != 0 ? z11 : false, (AnalyticsProduct) parcel.readParcelable(Id.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Id[i];
            }
        }

        public Id(String storyId, Map substitutionData, NaviCommand naviCommand, sza.a setStoriesAsShownMode, boolean z, NaviCommand naviCommand2, RemoteStoryModelParams remoteStoryModelParams, boolean z3, boolean z4, int i, boolean z6, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(storyId, "storyId");
            Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
            Intrinsics.checkNotNullParameter(setStoriesAsShownMode, "setStoriesAsShownMode");
            Intrinsics.checkNotNullParameter(remoteStoryModelParams, "remoteStoryModelParams");
            this.f81996a = storyId;
            this.f81997b = substitutionData;
            this.f81998c = naviCommand;
            this.d = setStoriesAsShownMode;
            this.e = z;
            this.f = naviCommand2;
            this.f81999g = remoteStoryModelParams;
            this.f82000h = z3;
            this.i = z4;
            this.f82001j = i;
            this.k = z6;
            this.f82002l = analyticsProduct;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        public final Map J() {
            return this.f81997b;
        }

        /* JADX INFO: renamed from: T, reason: from getter */
        public final boolean getF82000h() {
            return this.f82000h;
        }

        /* JADX INFO: renamed from: W, reason: from getter */
        public final boolean getI() {
            return this.i;
        }

        @Override // com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getK() {
            return this.k;
        }

        @Override // com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig
        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF82008j() {
            return this.f82001j;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final NaviCommand getF() {
            return this.f;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final NaviCommand getF81998c() {
            return this.f81998c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final RemoteStoryModelParams getF81999g() {
            return this.f81999g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Id)) {
                return false;
            }
            Id id10 = (Id) obj2;
            return Intrinsics.f(this.f81996a, id10.f81996a) && Intrinsics.f(this.f81997b, id10.f81997b) && Intrinsics.f(this.f81998c, id10.f81998c) && this.d == id10.d && this.e == id10.e && Intrinsics.f(this.f, id10.f) && Intrinsics.f(this.f81999g, id10.f81999g) && this.f82000h == id10.f82000h && this.i == id10.i && this.f82001j == id10.f82001j && this.k == id10.k && Intrinsics.f(this.f82002l, id10.f82002l);
        }

        public final int hashCode() {
            int iB = p.a.b(this.f81996a.hashCode() * 31, 31, this.f81997b);
            NaviCommand naviCommand = this.f81998c;
            int iC = j6.a.c((this.d.hashCode() + ((iB + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31)) * 31, 31, this.e);
            NaviCommand naviCommand2 = this.f;
            int iC2 = j6.a.c(j6.a.b(this.f82001j, j6.a.c(j6.a.c((this.f81999g.hashCode() + ((iC + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31)) * 31, 31, this.f82000h), 31, this.i), 31), 31, this.k);
            AnalyticsProduct analyticsProduct = this.f82002l;
            return iC2 + (analyticsProduct != null ? analyticsProduct.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getF82002l() {
            return this.f82002l;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final sza.a getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81996a);
            Iterator itT = o.t(this.f81997b, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeParcelable(this.f81998c, i);
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
            this.f81999g.writeToParcel(dest, i);
            dest.writeInt(this.f82000h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.f82001j);
            dest.writeInt(this.k ? 1 : 0);
            dest.writeParcelable(this.f82002l, i);
        }

        /* JADX INFO: renamed from: x9, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getF81996a() {
            return this.f81996a;
        }

        public /* synthetic */ Id(String str, RemoteStoryModelParams remoteStoryModelParams, boolean z, int i) {
            this(str, r0.g(), null, sza.a.NEVER, true, null, remoteStoryModelParams, true, z, i, false, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/remote_stories/models/navigation/RemoteStoriesFeatureConfig$Key;", "Lcom/revolut/feature/remote_stories/models/navigation/RemoteStoriesFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_remote_stories_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Key extends RemoteStoriesFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RemoteStoriesKey f82003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f82004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f82005c;
        public final ModalFragmentNavigateCommand d;
        public final sza.a e;
        public final NaviCommand f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final RemoteStoryModelParams f82006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f82007h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f82008j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AnalyticsProduct f82009l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AnalyticsData f82010m;

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
                return new Key(remoteStoriesKey, linkedHashMap, (NaviCommand) parcel.readParcelable(Key.class.getClassLoader()), (ModalFragmentNavigateCommand) parcel.readParcelable(Key.class.getClassLoader()), sza.a.valueOf(parcel.readString()), (NaviCommand) parcel.readParcelable(Key.class.getClassLoader()), RemoteStoryModelParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(Key.class.getClassLoader()), parcel.readInt() == 0 ? null : AnalyticsData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Key[i];
            }
        }

        public Key(RemoteStoriesKey key, Map substitutionData, NaviCommand naviCommand, ModalFragmentNavigateCommand modalFragmentNavigateCommand, sza.a setStoriesAsShownMode, NaviCommand naviCommand2, RemoteStoryModelParams remoteStoryModelParams, boolean z, boolean z3, int i, boolean z4, AnalyticsProduct analyticsProduct, AnalyticsData analyticsData) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
            Intrinsics.checkNotNullParameter(setStoriesAsShownMode, "setStoriesAsShownMode");
            Intrinsics.checkNotNullParameter(remoteStoryModelParams, "remoteStoryModelParams");
            this.f82003a = key;
            this.f82004b = substitutionData;
            this.f82005c = naviCommand;
            this.d = modalFragmentNavigateCommand;
            this.e = setStoriesAsShownMode;
            this.f = naviCommand2;
            this.f82006g = remoteStoryModelParams;
            this.f82007h = z;
            this.i = z3;
            this.f82008j = i;
            this.k = z4;
            this.f82009l = analyticsProduct;
            this.f82010m = analyticsData;
        }

        @Override // com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getK() {
            return this.k;
        }

        @Override // com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig
        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF82008j() {
            return this.f82008j;
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
            return Intrinsics.f(this.f82003a, key.f82003a) && Intrinsics.f(this.f82004b, key.f82004b) && Intrinsics.f(this.f82005c, key.f82005c) && Intrinsics.f(this.d, key.d) && this.e == key.e && Intrinsics.f(this.f, key.f) && Intrinsics.f(this.f82006g, key.f82006g) && this.f82007h == key.f82007h && this.i == key.i && this.f82008j == key.f82008j && this.k == key.k && Intrinsics.f(this.f82009l, key.f82009l) && Intrinsics.f(this.f82010m, key.f82010m);
        }

        public final int hashCode() {
            int iE = p.a.e(this.f82003a.hashCode() * 31, 31, this.f82004b);
            NaviCommand naviCommand = this.f82005c;
            int iHashCode = (iE + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            ModalFragmentNavigateCommand modalFragmentNavigateCommand = this.d;
            int iHashCode2 = (this.e.hashCode() + ((iHashCode + (modalFragmentNavigateCommand == null ? 0 : modalFragmentNavigateCommand.hashCode())) * 31)) * 31;
            NaviCommand naviCommand2 = this.f;
            int iC = j6.a.c(j6.a.b(this.f82008j, j6.a.c(j6.a.c((this.f82006g.hashCode() + ((iHashCode2 + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31)) * 31, 31, this.f82007h), 31, this.i), 31), 31, this.k);
            AnalyticsProduct analyticsProduct = this.f82009l;
            int iHashCode3 = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            AnalyticsData analyticsData = this.f82010m;
            return iHashCode3 + (analyticsData != null ? analyticsData.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82003a, i);
            Iterator itZ = j6.a.z(this.f82004b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeParcelable(this.f82005c, i);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
            dest.writeParcelable(this.f, i);
            this.f82006g.writeToParcel(dest, i);
            dest.writeInt(this.f82007h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.f82008j);
            dest.writeInt(this.k ? 1 : 0);
            dest.writeParcelable(this.f82009l, i);
            AnalyticsData analyticsData = this.f82010m;
            if (analyticsData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                analyticsData.writeToParcel(dest, i);
            }
        }

        public /* synthetic */ Key(RemoteStoriesKey remoteStoriesKey, Map map, FinishCommand finishCommand, sza.a aVar, NaviCommand naviCommand, RemoteStoryModelParams remoteStoryModelParams, int i, int i2) {
            this(remoteStoriesKey, (i2 & 2) != 0 ? r0.g() : map, (i2 & 4) != 0 ? null : finishCommand, null, (i2 & 16) != 0 ? sza.a.NEVER : aVar, (i2 & 32) != 0 ? null : naviCommand, (i2 & 64) != 0 ? new RemoteStoryModelParams(null, null, false, 31) : remoteStoryModelParams, (i2 & 128) != 0, false, (i2 & 512) != 0 ? 999 : i, (i2 & 1024) == 0, null, null);
        }
    }
}
