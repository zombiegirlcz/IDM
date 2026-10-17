package com.revolut.feature.address.common.api.flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/FieldMode;", "Landroid/os/Parcelable;", "Hidden", "NotEditable", "Editable", "Lcom/revolut/feature/address/common/api/flow/FieldMode$Editable;", "Lcom/revolut/feature/address/common/api/flow/FieldMode$Hidden;", "Lcom/revolut/feature/address/common/api/flow/FieldMode$NotEditable;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FieldMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/FieldMode$Editable;", "Lcom/revolut/feature/address/common/api/flow/FieldMode;", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Editable implements FieldMode {

        @NotNull
        public static final Parcelable.Creator<Editable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f60953a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Editable(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Editable[i];
            }
        }

        public Editable() {
            this(true);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Editable) && this.f60953a == ((Editable) obj2).f60953a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f60953a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f60953a ? 1 : 0);
        }

        public Editable(boolean z) {
            this.f60953a = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/FieldMode$Hidden;", "Lcom/revolut/feature/address/common/api/flow/FieldMode;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Hidden implements FieldMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Hidden f60954a = new Hidden();

        @NotNull
        public static final Parcelable.Creator<Hidden> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Hidden.f60954a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Hidden[i];
            }
        }

        private Hidden() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Hidden);
        }

        public final int hashCode() {
            return 786995474;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/FieldMode$NotEditable;", "Lcom/revolut/feature/address/common/api/flow/FieldMode;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotEditable implements FieldMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotEditable f60955a = new NotEditable();

        @NotNull
        public static final Parcelable.Creator<NotEditable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotEditable.f60955a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotEditable[i];
            }
        }

        private NotEditable() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof NotEditable);
        }

        public final int hashCode() {
            return -964730897;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
