package com.revolut.feature.separate_favourites.api.alerts.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o1d.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/separate_favourites/api/alerts/widget/AlertsWidgetContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AlertsWidgetContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlertsWidgetContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f86005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f86006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86007c;
    public final AssetIdWithSymbol d;
    public final int e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f86008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f86009h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f86010j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f86011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f86012m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Class cls;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(AlertsWidgetContext.class, parcel, linkedHashSet2, iE, 1);
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i2 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i2);
                int iE2 = 0;
                while (iE2 != i2) {
                    iE2 = d.e(AlertsWidgetContext.class, parcel, linkedHashSet, iE2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                cls = AlertsWidgetContext.class;
                z = true;
            } else {
                cls = AlertsWidgetContext.class;
                z = false;
            }
            AssetIdWithSymbol assetIdWithSymbol = (AssetIdWithSymbol) parcel.readParcelable(cls.getClassLoader());
            int i3 = parcel.readInt();
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            String string = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList.add(mgd.d.valueOf(parcel.readString()));
            }
            return new AlertsWidgetContext(linkedHashSet2, linkedHashSet, z, assetIdWithSymbol, i3, z3, z4, string, arrayList, f.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AlertsWidgetContext[i];
        }
    }

    public AlertsWidgetContext(Set assetsToShow, Set set, boolean z, AssetIdWithSymbol assetIdWithSymbol, int i, boolean z3, boolean z4, String str, List alertStates, f seeAllLabelPolicy, boolean z6, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(assetsToShow, "assetsToShow");
        Intrinsics.checkNotNullParameter(alertStates, "alertStates");
        Intrinsics.checkNotNullParameter(seeAllLabelPolicy, "seeAllLabelPolicy");
        this.f86005a = assetsToShow;
        this.f86006b = set;
        this.f86007c = z;
        this.d = assetIdWithSymbol;
        this.e = i;
        this.f = z3;
        this.f86008g = z4;
        this.f86009h = str;
        this.i = alertStates;
        this.f86010j = seeAllLabelPolicy;
        this.k = z6;
        this.f86011l = z11;
        this.f86012m = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AlertsWidgetContext)) {
            return false;
        }
        AlertsWidgetContext alertsWidgetContext = (AlertsWidgetContext) obj2;
        return Intrinsics.f(this.f86005a, alertsWidgetContext.f86005a) && Intrinsics.f(this.f86006b, alertsWidgetContext.f86006b) && this.f86007c == alertsWidgetContext.f86007c && Intrinsics.f(this.d, alertsWidgetContext.d) && this.e == alertsWidgetContext.e && this.f == alertsWidgetContext.f && this.f86008g == alertsWidgetContext.f86008g && Intrinsics.f(this.f86009h, alertsWidgetContext.f86009h) && Intrinsics.f(this.i, alertsWidgetContext.i) && this.f86010j == alertsWidgetContext.f86010j && this.k == alertsWidgetContext.k && this.f86011l == alertsWidgetContext.f86011l && this.f86012m == alertsWidgetContext.f86012m;
    }

    public final int hashCode() {
        int iHashCode = this.f86005a.hashCode() * 31;
        Set set = this.f86006b;
        int iC = j6.a.c((iHashCode + (set == null ? 0 : set.hashCode())) * 31, 31, this.f86007c);
        AssetIdWithSymbol assetIdWithSymbol = this.d;
        int iC2 = j6.a.c(j6.a.c(j6.a.b(this.e, (iC + (assetIdWithSymbol == null ? 0 : assetIdWithSymbol.hashCode())) * 31, 31), 31, this.f), 31, this.f86008g);
        String str = this.f86009h;
        return Boolean.hashCode(this.f86012m) + j6.a.c(j6.a.c((this.f86010j.hashCode() + p.a.d((iC2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.i)) * 31, 31, this.k), 31, this.f86011l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f86005a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Set set = this.f86006b;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        dest.writeInt(this.f86007c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f86008g ? 1 : 0);
        dest.writeString(this.f86009h);
        Iterator itV2 = p.a.v(this.i, dest);
        while (itV2.hasNext()) {
            dest.writeString(((mgd.d) itV2.next()).name());
        }
        dest.writeString(this.f86010j.name());
        dest.writeInt(this.k ? 1 : 0);
        dest.writeInt(this.f86011l ? 1 : 0);
        dest.writeInt(this.f86012m ? 1 : 0);
    }

    public /* synthetic */ AlertsWidgetContext(Set set, Set set2, AssetIdWithSymbol assetIdWithSymbol, String str, List list, f fVar, int i) {
        this(set, (i & 2) != 0 ? null : set2, (i & 4) == 0, (i & 8) != 0 ? null : assetIdWithSymbol, (i & 16) != 0 ? 3 : 2, false, (i & 64) == 0, (i & 128) != 0 ? null : str, list, (i & 512) != 0 ? f.ALWAYS : fVar, (i & 1024) != 0, (i & 2048) != 0, (i & 4096) == 0);
    }
}
