package com.revolut.shared.feature.workflow.engine.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$DocumentSelection$UndefinedCitizenship", "", "<init>", "()V", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MobileScreenParams$DocumentSelection$UndefinedCitizenship implements MobileScreenParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MobileScreenParams$DocumentSelection$UndefinedCitizenship f105427a = new MobileScreenParams$DocumentSelection$UndefinedCitizenship();

    @NotNull
    public static final Parcelable.Creator<MobileScreenParams$DocumentSelection$UndefinedCitizenship> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return MobileScreenParams$DocumentSelection$UndefinedCitizenship.f105427a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MobileScreenParams$DocumentSelection$UndefinedCitizenship[i];
        }
    }

    private MobileScreenParams$DocumentSelection$UndefinedCitizenship() {
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
