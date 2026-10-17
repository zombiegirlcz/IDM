package com.revolut.feature.user.checklist.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/user/checklist/api/UserChecklistSource;", "Landroid/os/Parcelable;", "SlotTiles", "Other", "Lcom/revolut/feature/user/checklist/api/UserChecklistSource$Other;", "Lcom/revolut/feature/user/checklist/api/UserChecklistSource$SlotTiles;", "feature_user_checklist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserChecklistSource extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user/checklist/api/UserChecklistSource$Other;", "Lcom/revolut/feature/user/checklist/api/UserChecklistSource;", "<init>", "()V", "feature_user_checklist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Other implements UserChecklistSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Other f94600a = new Other();

        @NotNull
        public static final Parcelable.Creator<Other> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Other.f94600a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Other[i];
            }
        }

        private Other() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user/checklist/api/UserChecklistSource$SlotTiles;", "Lcom/revolut/feature/user/checklist/api/UserChecklistSource;", "<init>", "()V", "feature_user_checklist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SlotTiles implements UserChecklistSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SlotTiles f94601a = new SlotTiles();

        @NotNull
        public static final Parcelable.Creator<SlotTiles> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SlotTiles.f94601a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SlotTiles[i];
            }
        }

        private SlotTiles() {
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
