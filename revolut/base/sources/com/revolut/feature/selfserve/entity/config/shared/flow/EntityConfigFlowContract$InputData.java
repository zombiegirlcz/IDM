package com.revolut.feature.selfserve.entity.config.shared.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/selfserve/entity/config/shared/flow/EntityConfigFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Params", "ScreenContent", "Lcom/revolut/feature/selfserve/entity/config/shared/flow/EntityConfigFlowContract$InputData$Params;", "Lcom/revolut/feature/selfserve/entity/config/shared/flow/EntityConfigFlowContract$InputData$ScreenContent;", "feature_selfserve_entity_config_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EntityConfigFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/entity/config/shared/flow/EntityConfigFlowContract$InputData$Params;", "Lcom/revolut/feature/selfserve/entity/config/shared/flow/EntityConfigFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_entity_config_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params extends EntityConfigFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Params> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f85823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EntityConfigRepository$Params f85824b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Params((EntityConfigRepository$Params) parcel.readParcelable(Params.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Params[i];
            }
        }

        public Params(EntityConfigRepository$Params params, boolean z) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f85823a = z;
            this.f85824b = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Params)) {
                return false;
            }
            Params params = (Params) obj2;
            return this.f85823a == params.f85823a && Intrinsics.f(this.f85824b, params.f85824b);
        }

        public final int hashCode() {
            return this.f85824b.hashCode() + (Boolean.hashCode(this.f85823a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f85823a ? 1 : 0);
            dest.writeParcelable(this.f85824b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/entity/config/shared/flow/EntityConfigFlowContract$InputData$ScreenContent;", "Lcom/revolut/feature/selfserve/entity/config/shared/flow/EntityConfigFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_entity_config_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScreenContent extends EntityConfigFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ScreenContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f85825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FincrimeHomeScreen$V2 f85826b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScreenContent((FincrimeHomeScreen$V2) parcel.readParcelable(ScreenContent.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScreenContent[i];
            }
        }

        public ScreenContent(FincrimeHomeScreen$V2 screen, boolean z) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.f85825a = z;
            this.f85826b = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ScreenContent)) {
                return false;
            }
            ScreenContent screenContent = (ScreenContent) obj2;
            return this.f85825a == screenContent.f85825a && Intrinsics.f(this.f85826b, screenContent.f85826b);
        }

        public final int hashCode() {
            return this.f85826b.hashCode() + (Boolean.hashCode(this.f85825a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f85825a ? 1 : 0);
            dest.writeParcelable(this.f85826b, i);
        }
    }
}
