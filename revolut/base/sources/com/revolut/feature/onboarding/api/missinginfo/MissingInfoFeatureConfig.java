package com.revolut.feature.onboarding.api.missinginfo;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/missinginfo/MissingInfoFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MissingInfoFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<MissingInfoFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f78176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f78177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f78178c;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(m89.a.valueOf(parcel.readString()));
            }
            return new MissingInfoFeatureConfig(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (NaviCommand) parcel.readParcelable(MissingInfoFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MissingInfoFeatureConfig[i];
        }
    }

    public MissingInfoFeatureConfig(List steps, Integer num, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f78176a = steps;
        this.f78177b = num;
        this.f78178c = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MissingInfoFeatureConfig)) {
            return false;
        }
        MissingInfoFeatureConfig missingInfoFeatureConfig = (MissingInfoFeatureConfig) obj2;
        return Intrinsics.f(this.f78176a, missingInfoFeatureConfig.f78176a) && Intrinsics.f(this.f78177b, missingInfoFeatureConfig.f78177b) && Intrinsics.f(this.f78178c, missingInfoFeatureConfig.f78178c);
    }

    public final int hashCode() {
        int iHashCode = this.f78176a.hashCode() * 31;
        Integer num = this.f78177b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        NaviCommand naviCommand = this.f78178c;
        return iHashCode2 + (naviCommand != null ? naviCommand.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f78176a, dest);
        while (itV.hasNext()) {
            dest.writeString(((m89.a) itV.next()).name());
        }
        Integer num = this.f78177b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.f78178c, i);
    }

    public /* synthetic */ MissingInfoFeatureConfig(List list, int i) {
        this(list, (i & 2) != 0 ? null : 8361, null);
    }
}
