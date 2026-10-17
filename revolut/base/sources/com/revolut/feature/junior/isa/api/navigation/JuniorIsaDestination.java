package com.revolut.feature.junior.isa.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "ChildDetailsDestination", "JISADetailsDestination", "JISAChildCreationDestination", "ChildDetailsConfirmationDestination", "JISANationalNumberDestination", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination$ChildDetailsConfirmationDestination;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination$ChildDetailsDestination;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination$JISAChildCreationDestination;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination$JISADetailsDestination;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination$JISANationalNumberDestination;", "feature_junior_isa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorIsaDestination extends KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination$ChildDetailsConfirmationDestination;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChildDetailsConfirmationDestination implements JuniorIsaDestination {

        @NotNull
        public static final Parcelable.Creator<ChildDetailsConfirmationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f76738b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChildDetailsConfirmationDestination(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChildDetailsConfirmationDestination[i];
            }
        }

        public ChildDetailsConfirmationDestination(String juniorRegId, boolean z) {
            Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
            this.f76737a = juniorRegId;
            this.f76738b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChildDetailsConfirmationDestination)) {
                return false;
            }
            ChildDetailsConfirmationDestination childDetailsConfirmationDestination = (ChildDetailsConfirmationDestination) obj2;
            return Intrinsics.f(this.f76737a, childDetailsConfirmationDestination.f76737a) && this.f76738b == childDetailsConfirmationDestination.f76738b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76738b) + (this.f76737a.hashCode() * 31);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1, reason: from getter */
        public final boolean getF76738b() {
            return this.f76738b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76737a);
            dest.writeInt(this.f76738b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination$ChildDetailsDestination;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChildDetailsDestination implements JuniorIsaDestination {

        @NotNull
        public static final Parcelable.Creator<ChildDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76739a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChildDetailsDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChildDetailsDestination[i];
            }
        }

        public ChildDetailsDestination(String juniorRegId) {
            Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
            this.f76739a = juniorRegId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChildDetailsDestination) && Intrinsics.f(this.f76739a, ((ChildDetailsDestination) obj2).f76739a);
        }

        public final int hashCode() {
            return this.f76739a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76739a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination$JISAChildCreationDestination;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JISAChildCreationDestination implements JuniorIsaDestination {

        @NotNull
        public static final Parcelable.Creator<JISAChildCreationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76740a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JISAChildCreationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JISAChildCreationDestination[i];
            }
        }

        public JISAChildCreationDestination(String str) {
            this.f76740a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JISAChildCreationDestination) && Intrinsics.f(this.f76740a, ((JISAChildCreationDestination) obj2).f76740a);
        }

        public final int hashCode() {
            String str = this.f76740a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76740a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination$JISADetailsDestination;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JISADetailsDestination implements JuniorIsaDestination {

        @NotNull
        public static final Parcelable.Creator<JISADetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76741a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JISADetailsDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JISADetailsDestination[i];
            }
        }

        public JISADetailsDestination(String juniorRegId) {
            Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
            this.f76741a = juniorRegId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JISADetailsDestination) && Intrinsics.f(this.f76741a, ((JISADetailsDestination) obj2).f76741a);
        }

        public final int hashCode() {
            return this.f76741a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76741a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination$JISANationalNumberDestination;", "Lcom/revolut/feature/junior/isa/api/navigation/JuniorIsaDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JISANationalNumberDestination implements JuniorIsaDestination {

        @NotNull
        public static final Parcelable.Creator<JISANationalNumberDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f76744c;
        public final s98.a d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JISANationalNumberDestination(parcel.readString(), parcel.readString(), (NaviCommand) parcel.readParcelable(JISANationalNumberDestination.class.getClassLoader()), s98.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JISANationalNumberDestination[i];
            }
        }

        public JISANationalNumberDestination(String juniorRegId, String juniorName, NaviCommand naviCommand, s98.a source) {
            Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
            Intrinsics.checkNotNullParameter(juniorName, "juniorName");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f76742a = juniorRegId;
            this.f76743b = juniorName;
            this.f76744c = naviCommand;
            this.d = source;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JISANationalNumberDestination)) {
                return false;
            }
            JISANationalNumberDestination jISANationalNumberDestination = (JISANationalNumberDestination) obj2;
            return Intrinsics.f(this.f76742a, jISANationalNumberDestination.f76742a) && Intrinsics.f(this.f76743b, jISANationalNumberDestination.f76743b) && Intrinsics.f(this.f76744c, jISANationalNumberDestination.f76744c) && this.d == jISANationalNumberDestination.d;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f76742a.hashCode() * 31, 31, this.f76743b);
            NaviCommand naviCommand = this.f76744c;
            return this.d.hashCode() + ((iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76742a);
            dest.writeString(this.f76743b);
            dest.writeParcelable(this.f76744c, i);
            dest.writeString(this.d.name());
        }
    }
}
