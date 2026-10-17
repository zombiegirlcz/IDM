package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialogLink;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SuspiciousTransactionDialogLink implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SuspiciousTransactionDialogLink> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104977c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SuspiciousTransactionDialogLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SuspiciousTransactionDialogLink[i];
        }
    }

    public SuspiciousTransactionDialogLink(String icon, String title, String link) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f104975a = icon;
        this.f104976b = title;
        this.f104977c = link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SuspiciousTransactionDialogLink)) {
            return false;
        }
        SuspiciousTransactionDialogLink suspiciousTransactionDialogLink = (SuspiciousTransactionDialogLink) obj2;
        return Intrinsics.f(this.f104975a, suspiciousTransactionDialogLink.f104975a) && Intrinsics.f(this.f104976b, suspiciousTransactionDialogLink.f104976b) && Intrinsics.f(this.f104977c, suspiciousTransactionDialogLink.f104977c);
    }

    public final int hashCode() {
        return this.f104977c.hashCode() + p.a.c(this.f104975a.hashCode() * 31, 31, this.f104976b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104975a);
        dest.writeString(this.f104976b);
        dest.writeString(this.f104977c);
    }
}
