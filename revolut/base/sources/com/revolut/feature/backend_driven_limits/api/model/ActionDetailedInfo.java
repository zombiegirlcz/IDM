package com.revolut.feature.backend_driven_limits.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_driven_limits/api/model/ActionDetailedInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_backend_driven_limits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActionDetailedInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActionDetailedInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f63194c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ActionDetailedInfoItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ActionDetailedInfo(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionDetailedInfo[i];
        }
    }

    public ActionDetailedInfo(String title, String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f63192a = title;
        this.f63193b = str;
        this.f63194c = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActionDetailedInfo)) {
            return false;
        }
        ActionDetailedInfo actionDetailedInfo = (ActionDetailedInfo) obj2;
        return Intrinsics.f(this.f63192a, actionDetailedInfo.f63192a) && Intrinsics.f(this.f63193b, actionDetailedInfo.f63193b) && this.f63194c.equals(actionDetailedInfo.f63194c);
    }

    public final int hashCode() {
        int iHashCode = this.f63192a.hashCode() * 31;
        String str = this.f63193b;
        return this.f63194c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63192a);
        dest.writeString(this.f63193b);
        Iterator itY = j6.a.y(this.f63194c, dest);
        while (itY.hasNext()) {
            ((ActionDetailedInfoItem) itY.next()).writeToParcel(dest, i);
        }
    }
}
