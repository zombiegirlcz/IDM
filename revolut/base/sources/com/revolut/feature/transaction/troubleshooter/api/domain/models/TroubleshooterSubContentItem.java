package com.revolut.feature.transaction.troubleshooter.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/api/domain/models/TroubleshooterSubContentItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_troubleshooter_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TroubleshooterSubContentItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TroubleshooterSubContentItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TroubleshooterAction f91853c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TroubleshooterSubContentItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TroubleshooterAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TroubleshooterSubContentItem[i];
        }
    }

    public TroubleshooterSubContentItem(String title, String content, TroubleshooterAction troubleshooterAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f91851a = title;
        this.f91852b = content;
        this.f91853c = troubleshooterAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TroubleshooterSubContentItem)) {
            return false;
        }
        TroubleshooterSubContentItem troubleshooterSubContentItem = (TroubleshooterSubContentItem) obj2;
        return Intrinsics.f(this.f91851a, troubleshooterSubContentItem.f91851a) && Intrinsics.f(this.f91852b, troubleshooterSubContentItem.f91852b) && Intrinsics.f(this.f91853c, troubleshooterSubContentItem.f91853c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f91851a.hashCode() * 31, 31, this.f91852b);
        TroubleshooterAction troubleshooterAction = this.f91853c;
        return iC + (troubleshooterAction == null ? 0 : troubleshooterAction.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91851a);
        dest.writeString(this.f91852b);
        TroubleshooterAction troubleshooterAction = this.f91853c;
        if (troubleshooterAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            troubleshooterAction.writeToParcel(dest, i);
        }
    }
}
