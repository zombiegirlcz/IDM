package com.revolut.core.model.account;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/model/account/AccountId;", "Landroid/os/Parcelable;", "Personal", "Joint", "Lcom/revolut/core/model/account/AccountId$Joint;", "Lcom/revolut/core/model/account/AccountId$Personal;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountId extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/model/account/AccountId$Joint;", "Lcom/revolut/core/model/account/AccountId;", "", "toString", "()Ljava/lang/String;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint implements AccountId {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51413b;

        /* JADX INFO: loaded from: classes19.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(String id10, String walletId) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f51412a = id10;
            this.f51413b = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Joint)) {
                return false;
            }
            Joint joint = (Joint) obj2;
            return Intrinsics.f(this.f51412a, joint.f51412a) && Intrinsics.f(this.f51413b, joint.f51413b);
        }

        public final int hashCode() {
            return this.f51413b.hashCode() + (this.f51412a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51412a);
            dest.writeString(this.f51413b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/model/account/AccountId$Personal;", "Lcom/revolut/core/model/account/AccountId;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Personal implements AccountId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Personal f51414a = new Personal();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Personal.f51414a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        private Personal() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
