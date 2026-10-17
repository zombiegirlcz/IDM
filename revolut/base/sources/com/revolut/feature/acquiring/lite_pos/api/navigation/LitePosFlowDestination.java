package com.revolut.feature.acquiring.lite_pos.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/navigation/LitePosFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "<init>", "()V", "LitePos", "LitePosBridge", "CatalogueSinglePick", "Lcom/revolut/feature/acquiring/lite_pos/api/navigation/LitePosFlowDestination$CatalogueSinglePick;", "Lcom/revolut/feature/acquiring/lite_pos/api/navigation/LitePosFlowDestination$LitePos;", "Lcom/revolut/feature/acquiring/lite_pos/api/navigation/LitePosFlowDestination$LitePosBridge;", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LitePosFlowDestination extends InternalDestination<IOData$EmptyInput> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/navigation/LitePosFlowDestination$CatalogueSinglePick;", "Lcom/revolut/feature/acquiring/lite_pos/api/navigation/LitePosFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CatalogueSinglePick extends LitePosFlowDestination implements KompotDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CatalogueSinglePick f60698b = new CatalogueSinglePick(0);

        @NotNull
        public static final Parcelable.Creator<CatalogueSinglePick> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CatalogueSinglePick.f60698b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CatalogueSinglePick[i];
            }
        }

        private CatalogueSinglePick() {
            super(0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/navigation/LitePosFlowDestination$LitePos;", "Lcom/revolut/feature/acquiring/lite_pos/api/navigation/LitePosFlowDestination;", "<init>", "()V", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LitePos extends LitePosFlowDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final LitePos f60699b = new LitePos(0);

        @NotNull
        public static final Parcelable.Creator<LitePos> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LitePos.f60699b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LitePos[i];
            }
        }

        private LitePos() {
            super(0);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/navigation/LitePosFlowDestination$LitePosBridge;", "Lcom/revolut/feature/acquiring/lite_pos/api/navigation/LitePosFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LitePosBridge extends LitePosFlowDestination implements KompotDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final LitePosBridge f60700b = new LitePosBridge(0);

        @NotNull
        public static final Parcelable.Creator<LitePosBridge> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LitePosBridge.f60700b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LitePosBridge[i];
            }
        }

        private LitePosBridge() {
            super(0);
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

    public /* synthetic */ LitePosFlowDestination(int i) {
        this();
    }

    private LitePosFlowDestination() {
        super(IOData$EmptyInput.f98299a);
    }
}
