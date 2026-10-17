package com.revolut.feature.learn.shared.api.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Home", "GlossaryHome", "CourseOverview", "Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig$CourseOverview;", "Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig$GlossaryHome;", "Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig$Home;", "feature_learn_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LearnKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig$CourseOverview;", "Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_learn_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CourseOverview extends LearnKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CourseOverview> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f77963g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final v f77964h;
        public final String i;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig$CourseOverview$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/e;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination extends InternalDestination<IOData$EmptyInput> implements KompotDestination, e {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f77965b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final v f77966c;
            public final String d;
            public final TransitionAnimation e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readString(), v.valueOf(parcel.readString()), parcel.readString(), (TransitionAnimation) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Destination(String courseId, v domain, String str, TransitionAnimation transitionAnimation) {
                super(IOData$EmptyInput.f98299a);
                Intrinsics.checkNotNullParameter(courseId, "courseId");
                Intrinsics.checkNotNullParameter(domain, "domain");
                this.f77965b = courseId;
                this.f77966c = domain;
                this.d = str;
                this.e = transitionAnimation;
            }

            @Override // aii.d0
            /* JADX INFO: renamed from: Y0, reason: from getter */
            public final TransitionAnimation getE() {
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
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f77965b, destination.f77965b) && this.f77966c == destination.f77966c && Intrinsics.f(this.d, destination.d) && Intrinsics.f(this.e, destination.e);
            }

            public final int hashCode() {
                int iHashCode = (this.f77966c.hashCode() + (this.f77965b.hashCode() * 31)) * 31;
                String str = this.d;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                TransitionAnimation transitionAnimation = this.e;
                return iHashCode2 + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f77965b);
                dest.writeString(this.f77966c.name());
                dest.writeString(this.d);
                dest.writeParcelable(this.e, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CourseOverview(parcel.readString(), v.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CourseOverview[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CourseOverview(String courseId, v domain, String str) {
            super(new Destination(courseId, domain, str, null));
            Intrinsics.checkNotNullParameter(courseId, "courseId");
            Intrinsics.checkNotNullParameter(domain, "domain");
            this.f77963g = courseId;
            this.f77964h = domain;
            this.i = str;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CourseOverview)) {
                return false;
            }
            CourseOverview courseOverview = (CourseOverview) obj2;
            return Intrinsics.f(this.f77963g, courseOverview.f77963g) && this.f77964h == courseOverview.f77964h && Intrinsics.f(this.i, courseOverview.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f77964h.hashCode() + (this.f77963g.hashCode() * 31)) * 31;
            String str = this.i;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77963g);
            dest.writeString(this.f77964h.name());
            dest.writeString(this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig$GlossaryHome;", "Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_learn_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GlossaryHome extends LearnKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<GlossaryHome> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final v f77967g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GlossaryHome(parcel.readInt() == 0 ? null : v.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GlossaryHome[i];
            }
        }

        public GlossaryHome() {
            this(null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GlossaryHome) && this.f77967g == ((GlossaryHome) obj2).f77967g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            v vVar = this.f77967g;
            if (vVar == null) {
                return 0;
            }
            return vVar.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            v vVar = this.f77967g;
            if (vVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(vVar.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig$GlossaryHome$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f77968a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readInt() == 0 ? null : v.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(v vVar) {
                this.f77968a = vVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final v getF77968a() {
                return this.f77968a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && this.f77968a == ((Destination) obj2).f77968a;
            }

            public final int hashCode() {
                v vVar = this.f77968a;
                if (vVar == null) {
                    return 0;
                }
                return vVar.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                v vVar = this.f77968a;
                if (vVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(vVar.name());
                }
            }

            public Destination() {
                this(null);
            }
        }

        public GlossaryHome(v vVar) {
            super(new Destination(vVar));
            this.f77967g = vVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig$Home;", "Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_learn_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends LearnKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final v f77969g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home(parcel.readInt() == 0 ? null : v.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home() {
            this(null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && this.f77969g == ((Home) obj2).f77969g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            v vVar = this.f77969g;
            if (vVar == null) {
                return 0;
            }
            return vVar.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            v vVar = this.f77969g;
            if (vVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(vVar.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/learn/shared/api/navigation/LearnKompotFeatureConfig$Home$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final v f77970a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(parcel.readInt() == 0 ? null : v.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(v vVar) {
                this.f77970a = vVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final v getF77970a() {
                return this.f77970a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && this.f77970a == ((Destination) obj2).f77970a;
            }

            public final int hashCode() {
                v vVar = this.f77970a;
                if (vVar == null) {
                    return 0;
                }
                return vVar.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                v vVar = this.f77970a;
                if (vVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(vVar.name());
                }
            }

            public Destination() {
                this(null);
            }
        }

        public Home(v vVar) {
            super(new Destination(vVar));
            this.f77969g = vVar;
        }
    }

    public LearnKompotFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 61);
    }
}
