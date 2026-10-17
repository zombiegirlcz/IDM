package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/SelectedTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectedTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SelectedTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f63606c;
    public final long d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectedTransaction(parcel.readString(), parcel.readString(), (dj0.d) parcel.readSerializable(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectedTransaction[i];
        }
    }

    public SelectedTransaction(String id10, String description, dj0.d amount, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f63604a = id10;
        this.f63605b = description;
        this.f63606c = amount;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectedTransaction)) {
            return false;
        }
        SelectedTransaction selectedTransaction = (SelectedTransaction) obj2;
        return Intrinsics.f(this.f63604a, selectedTransaction.f63604a) && Intrinsics.f(this.f63605b, selectedTransaction.f63605b) && Intrinsics.f(this.f63606c, selectedTransaction.f63606c) && this.d == selectedTransaction.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + v7.c(p.a.c(this.f63604a.hashCode() * 31, 31, this.f63605b), 31, this.f63606c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63604a);
        dest.writeString(this.f63605b);
        dest.writeSerializable(this.f63606c);
        dest.writeLong(this.d);
    }
}
