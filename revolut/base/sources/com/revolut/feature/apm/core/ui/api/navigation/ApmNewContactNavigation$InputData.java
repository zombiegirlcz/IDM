package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import com.revolut.kompot.common.IOData$Input;
import hrf.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n02.b;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/ApmNewContactNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmNewContactNavigation$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ApmNewContactNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f62246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f62247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f62248c;
    public final Clause d;
    public final wi0.b e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f62249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f62250h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Class cls;
            wi0.b bVar;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = j6.a.e(ApmNewContactNavigation$InputData.class, parcel, arrayList, iE2, 1);
            }
            f fVarValueOf = f.valueOf(parcel.readString());
            Clause clause = (Clause) parcel.readParcelable(ApmNewContactNavigation$InputData.class.getClassLoader());
            wi0.b bVar2 = (wi0.b) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                cls = ApmNewContactNavigation$InputData.class;
                bVar = bVar2;
                z = true;
            } else {
                cls = ApmNewContactNavigation$InputData.class;
                bVar = bVar2;
                z = false;
            }
            int i2 = parcel.readInt();
            Class cls2 = cls;
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(cls2, parcel, arrayList2, iE, 1);
            }
            return new ApmNewContactNavigation$InputData(bVarValueOf, arrayList, fVarValueOf, clause, bVar, z, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmNewContactNavigation$InputData[i];
        }
    }

    public ApmNewContactNavigation$InputData(b contactKind, List tabs, f transferDirection, Clause title, wi0.b countryCode, boolean z, List menuItems, String str) {
        Intrinsics.checkNotNullParameter(contactKind, "contactKind");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f62246a = contactKind;
        this.f62247b = tabs;
        this.f62248c = transferDirection;
        this.d = title;
        this.e = countryCode;
        this.f = z;
        this.f62249g = menuItems;
        this.f62250h = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmNewContactNavigation$InputData)) {
            return false;
        }
        ApmNewContactNavigation$InputData apmNewContactNavigation$InputData = (ApmNewContactNavigation$InputData) obj2;
        return this.f62246a == apmNewContactNavigation$InputData.f62246a && Intrinsics.f(this.f62247b, apmNewContactNavigation$InputData.f62247b) && this.f62248c == apmNewContactNavigation$InputData.f62248c && Intrinsics.f(this.d, apmNewContactNavigation$InputData.d) && Intrinsics.f(this.e, apmNewContactNavigation$InputData.e) && this.f == apmNewContactNavigation$InputData.f && Intrinsics.f(this.f62249g, apmNewContactNavigation$InputData.f62249g) && Intrinsics.f(this.f62250h, apmNewContactNavigation$InputData.f62250h);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(p.a.c(p.a.a((this.f62248c.hashCode() + p.a.d(this.f62246a.hashCode() * 31, 31, this.f62247b)) * 31, 31, this.d), 31, this.e.f297794a), 31, this.f), 31, this.f62249g);
        String str = this.f62250h;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62246a.name());
        Iterator itV = p.a.v(this.f62247b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f62248c.name());
        dest.writeParcelable(this.d, i);
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
        Iterator itV2 = p.a.v(this.f62249g, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        dest.writeString(this.f62250h);
    }

    public ApmNewContactNavigation$InputData(b bVar, List list, f fVar, TextLocalisedClause textLocalisedClause, wi0.b bVar2, List list2, String str, int i) {
        this(bVar, (i & 2) != 0 ? u.c(ApmNewContactNavigation$Tab.PHONE.f62253b) : list, fVar, (Clause) textLocalisedClause, bVar2, false, (i & 64) != 0 ? f0.f322471a : list2, str);
    }
}
