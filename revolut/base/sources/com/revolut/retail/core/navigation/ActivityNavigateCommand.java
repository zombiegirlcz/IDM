package com.revolut.retail.core.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/ActivityNavigateCommand;", "Lcom/revolut/retail/core/navigation/NaviCommand;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class ActivityNavigateCommand extends NaviCommand {

    @NotNull
    public static final Parcelable.Creator<ActivityNavigateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityDestination f98618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f98619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f98620c;
    public final Integer d;
    public final int e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f98621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f98622h;
    public final ActivityAnimation i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f98623j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ActivityDestination activityDestination = (ActivityDestination) j6.a.f(parcel, "parcel", ActivityNavigateCommand.class);
            Parcelable parcelable = parcel.readParcelable(ActivityNavigateCommand.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(ActivityNavigateCommand.class.getClassLoader()));
                }
            }
            return new ActivityNavigateCommand(activityDestination, parcelable, linkedHashMap, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (ActivityAnimation) parcel.readParcelable(ActivityNavigateCommand.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActivityNavigateCommand[i];
        }
    }

    public ActivityNavigateCommand(ActivityDestination destination, Parcelable parcelable, Map map, Integer num, int i, String str, Integer num2, Integer num3, ActivityAnimation activityAnimation, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f98618a = destination;
        this.f98619b = parcelable;
        this.f98620c = map;
        this.d = num;
        this.e = i;
        this.f = str;
        this.f98621g = num2;
        this.f98622h = num3;
        this.i = activityAnimation;
        this.f98623j = z;
    }

    public static ActivityNavigateCommand a(ActivityNavigateCommand activityNavigateCommand, LinkedHashMap linkedHashMap, int i, int i2) {
        ActivityDestination destination = activityNavigateCommand.f98618a;
        Parcelable parcelable = activityNavigateCommand.f98619b;
        Map map = linkedHashMap;
        if ((i2 & 4) != 0) {
            map = activityNavigateCommand.f98620c;
        }
        Map map2 = map;
        Integer num = (i2 & 8) != 0 ? activityNavigateCommand.d : 10001;
        if ((i2 & 16) != 0) {
            i = activityNavigateCommand.e;
        }
        String str = activityNavigateCommand.f;
        Integer num2 = activityNavigateCommand.f98621g;
        Integer num3 = activityNavigateCommand.f98622h;
        ActivityAnimation activityAnimation = activityNavigateCommand.i;
        boolean z = activityNavigateCommand.f98623j;
        activityNavigateCommand.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new ActivityNavigateCommand(destination, parcelable, map2, num, i, str, num2, num3, activityAnimation, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActivityNavigateCommand)) {
            return false;
        }
        ActivityNavigateCommand activityNavigateCommand = (ActivityNavigateCommand) obj2;
        return Intrinsics.f(this.f98618a, activityNavigateCommand.f98618a) && Intrinsics.f(this.f98619b, activityNavigateCommand.f98619b) && Intrinsics.f(this.f98620c, activityNavigateCommand.f98620c) && Intrinsics.f(this.d, activityNavigateCommand.d) && this.e == activityNavigateCommand.e && Intrinsics.f(this.f, activityNavigateCommand.f) && Intrinsics.f(this.f98621g, activityNavigateCommand.f98621g) && Intrinsics.f(this.f98622h, activityNavigateCommand.f98622h) && Intrinsics.f(this.i, activityNavigateCommand.i) && this.f98623j == activityNavigateCommand.f98623j;
    }

    public final int hashCode() {
        int iHashCode = this.f98618a.hashCode() * 31;
        Parcelable parcelable = this.f98619b;
        int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        Map map = this.f98620c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.d;
        int iB = j6.a.b(this.e, (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.f;
        int iHashCode4 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f98621g;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f98622h;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ActivityAnimation activityAnimation = this.i;
        return Boolean.hashCode(this.f98623j) + ((iHashCode6 + (activityAnimation != null ? activityAnimation.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98618a, i);
        dest.writeParcelable(this.f98619b, i);
        Map map = this.f98620c;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator itV = l.v(dest, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.e);
        dest.writeString(this.f);
        Integer num2 = this.f98621g;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        Integer num3 = this.f98622h;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
        dest.writeParcelable(this.i, i);
        dest.writeInt(this.f98623j ? 1 : 0);
    }

    public /* synthetic */ ActivityNavigateCommand(ActivityDestination activityDestination, Parcelable parcelable, Map map, Integer num, int i, String str, Integer num2, Integer num3, ActivityAnimation activityAnimation, boolean z, int i2) {
        this(activityDestination, (i2 & 2) != 0 ? null : parcelable, (i2 & 4) != 0 ? r0.g() : map, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : num3, (i2 & 256) != 0 ? null : activityAnimation, (i2 & 512) != 0 ? false : z);
    }
}
