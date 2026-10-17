package com.revolut.feature.debug_tools.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.toggles.models.FeatureDefinition;
import com.revolut.feature.toggles.models.LocalFeatureState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/debug_tools/api/LocalFeature;", "", "SimulateNetworkDelay", "FailingBackend", "FutureVersionHeader", "Lcom/revolut/feature/debug_tools/api/LocalFeature$FailingBackend;", "Lcom/revolut/feature/debug_tools/api/LocalFeature$FutureVersionHeader;", "Lcom/revolut/feature/debug_tools/api/LocalFeature$SimulateNetworkDelay;", "feature_debug_tools_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class LocalFeature implements FeatureDefinition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalFeatureState.Binary f71624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71625b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/debug_tools/api/LocalFeature$FailingBackend;", "Lcom/revolut/feature/debug_tools/api/LocalFeature;", "<init>", "()V", "feature_debug_tools_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FailingBackend extends LocalFeature {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FailingBackend f71626c = new FailingBackend();

        @NotNull
        public static final Parcelable.Creator<FailingBackend> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FailingBackend.f71626c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FailingBackend[i];
            }
        }

        private FailingBackend() {
            super(new LocalFeatureState.Binary(false), "Simulate failing backend (500)", false);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/debug_tools/api/LocalFeature$FutureVersionHeader;", "Lcom/revolut/feature/debug_tools/api/LocalFeature;", "<init>", "()V", "feature_debug_tools_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FutureVersionHeader extends LocalFeature {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FutureVersionHeader f71627c = new FutureVersionHeader();

        @NotNull
        public static final Parcelable.Creator<FutureVersionHeader> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FutureVersionHeader.f71627c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FutureVersionHeader[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private FutureVersionHeader() {
            super(new LocalFeatureState.Binary(false), "App version 100 in header", true);
            od0.a aVar = od0.a.f224253a;
            od0.a.e();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/debug_tools/api/LocalFeature$SimulateNetworkDelay;", "Lcom/revolut/feature/debug_tools/api/LocalFeature;", "<init>", "()V", "feature_debug_tools_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SimulateNetworkDelay extends LocalFeature {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SimulateNetworkDelay f71628c = new SimulateNetworkDelay();

        @NotNull
        public static final Parcelable.Creator<SimulateNetworkDelay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SimulateNetworkDelay.f71628c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SimulateNetworkDelay[i];
            }
        }

        private SimulateNetworkDelay() {
            super(new LocalFeatureState.Binary(false), "Simulate network delay (3s)", false);
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

    public LocalFeature(LocalFeatureState.Binary binary, String str, boolean z) {
        this.f71624a = binary;
        this.f71625b = z;
    }

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    /* JADX INFO: renamed from: T3, reason: from getter */
    public final boolean getF71625b() {
        return this.f71625b;
    }

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final Experiment q8() {
        return null;
    }

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final LocalFeatureState s5() {
        return this.f71624a;
    }
}
