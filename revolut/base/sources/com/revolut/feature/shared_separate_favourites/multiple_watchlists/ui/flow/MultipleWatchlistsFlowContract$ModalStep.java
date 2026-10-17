package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/flow/MultipleWatchlistsFlowContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddWatchlistModal", "EditWatchlists", "Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/flow/MultipleWatchlistsFlowContract$ModalStep$AddWatchlistModal;", "Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/flow/MultipleWatchlistsFlowContract$ModalStep$EditWatchlists;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MultipleWatchlistsFlowContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/flow/MultipleWatchlistsFlowContract$ModalStep$AddWatchlistModal;", "Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/flow/MultipleWatchlistsFlowContract$ModalStep;", "<init>", "()V", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddWatchlistModal implements MultipleWatchlistsFlowContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddWatchlistModal f86909a = new AddWatchlistModal();

        @NotNull
        public static final Parcelable.Creator<AddWatchlistModal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddWatchlistModal.f86909a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddWatchlistModal[i];
            }
        }

        private AddWatchlistModal() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/flow/MultipleWatchlistsFlowContract$ModalStep$EditWatchlists;", "Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/flow/MultipleWatchlistsFlowContract$ModalStep;", "<init>", "()V", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EditWatchlists implements MultipleWatchlistsFlowContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EditWatchlists f86910a = new EditWatchlists();

        @NotNull
        public static final Parcelable.Creator<EditWatchlists> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EditWatchlists.f86910a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditWatchlists[i];
            }
        }

        private EditWatchlists() {
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
