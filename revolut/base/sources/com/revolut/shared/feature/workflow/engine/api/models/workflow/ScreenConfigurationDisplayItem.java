package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/ScreenConfigurationDisplayItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenConfigurationDisplayItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScreenConfigurationDisplayItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Avatar f105642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105643c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreenConfigurationDisplayItem(parcel.readString(), (Avatar) parcel.readParcelable(ScreenConfigurationDisplayItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenConfigurationDisplayItem[i];
        }
    }

    public ScreenConfigurationDisplayItem(String type, Avatar avatar, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f105641a = type;
        this.f105642b = avatar;
        this.f105643c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenConfigurationDisplayItem)) {
            return false;
        }
        ScreenConfigurationDisplayItem screenConfigurationDisplayItem = (ScreenConfigurationDisplayItem) obj2;
        return Intrinsics.f(this.f105641a, screenConfigurationDisplayItem.f105641a) && Intrinsics.f(this.f105642b, screenConfigurationDisplayItem.f105642b) && Intrinsics.f(this.f105643c, screenConfigurationDisplayItem.f105643c) && Intrinsics.f(this.d, screenConfigurationDisplayItem.d) && Intrinsics.f(this.e, screenConfigurationDisplayItem.e);
    }

    public final int hashCode() {
        int iHashCode = this.f105641a.hashCode() * 31;
        Avatar avatar = this.f105642b;
        int iHashCode2 = (iHashCode + (avatar == null ? 0 : avatar.hashCode())) * 31;
        String str = this.f105643c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105641a);
        dest.writeParcelable(this.f105642b, i);
        dest.writeString(this.f105643c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
