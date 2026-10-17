package com.revolut.feature.credit.impl.ui.account.empty_states.events.actions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/empty_states/events/actions/EmptyStateActionParcel;", "Landroid/os/Parcelable;", "Discover", "Lcom/revolut/feature/credit/impl/ui/account/empty_states/events/actions/EmptyStateActionParcel$Discover;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EmptyStateActionParcel extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/empty_states/events/actions/EmptyStateActionParcel$Discover;", "Lcom/revolut/feature/credit/impl/ui/account/empty_states/events/actions/EmptyStateActionParcel;", "<init>", "()V", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Discover implements EmptyStateActionParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Discover f70054a = new Discover();

        @NotNull
        public static final Parcelable.Creator<Discover> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Discover.f70054a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Discover[i];
            }
        }

        private Discover() {
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
