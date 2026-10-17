package com.revolut.feature.pix.impl.domain.error;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pix/impl/domain/error/PixError;", "", "Landroid/os/Parcelable;", "<init>", "()V", "InsufficientBalance", "Lcom/revolut/feature/pix/impl/domain/error/PixError$InsufficientBalance;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PixError extends Throwable implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/domain/error/PixError$InsufficientBalance;", "Lcom/revolut/feature/pix/impl/domain/error/PixError;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InsufficientBalance extends PixError {

        @NotNull
        public static final Parcelable.Creator<InsufficientBalance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f80538a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InsufficientBalance((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InsufficientBalance[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InsufficientBalance(d valueMissing) {
            super(0);
            Intrinsics.checkNotNullParameter(valueMissing, "valueMissing");
            this.f80538a = valueMissing;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InsufficientBalance) && Intrinsics.f(this.f80538a, ((InsufficientBalance) obj2).f80538a);
        }

        public final int hashCode() {
            return this.f80538a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80538a);
        }
    }

    public /* synthetic */ PixError(int i) {
        this();
    }

    private PixError() {
    }
}
