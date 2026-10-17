package com.revolut.feature.transaction.troubleshooter.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/api/domain/models/TroubleshooterAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_troubleshooter_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TroubleshooterAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TroubleshooterAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91848c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TroubleshooterAction(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TroubleshooterAction[i];
        }
    }

    public TroubleshooterAction(String key, String title, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f91846a = key;
        this.f91847b = title;
        this.f91848c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TroubleshooterAction)) {
            return false;
        }
        TroubleshooterAction troubleshooterAction = (TroubleshooterAction) obj2;
        return Intrinsics.f(this.f91846a, troubleshooterAction.f91846a) && Intrinsics.f(this.f91847b, troubleshooterAction.f91847b) && Intrinsics.f(this.f91848c, troubleshooterAction.f91848c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f91846a.hashCode() * 31, 31, this.f91847b);
        String str = this.f91848c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91846a);
        dest.writeString(this.f91847b);
        dest.writeString(this.f91848c);
    }
}
