package com.revolut.feature.junior_progression.impl.ui.prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kk8.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_progression/impl/ui/prompt/JuniorProgressionFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_progression_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorProgressionFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JuniorProgressionFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorProgressionPromptStage f77152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f77154c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            JuniorProgressionPromptStage juniorProgressionPromptStage = (JuniorProgressionPromptStage) j6.a.f(parcel, "parcel", JuniorProgressionFlowContract$State.class);
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(p.valueOf(parcel.readString()), parcel.readSerializable());
            }
            return new JuniorProgressionFlowContract$State(juniorProgressionPromptStage, i, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorProgressionFlowContract$State[i];
        }
    }

    public JuniorProgressionFlowContract$State(JuniorProgressionPromptStage stage, int i, Map featuresReloadingStatuses) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(featuresReloadingStatuses, "featuresReloadingStatuses");
        this.f77152a = stage;
        this.f77153b = i;
        this.f77154c = featuresReloadingStatuses;
    }

    public static JuniorProgressionFlowContract$State a(JuniorProgressionFlowContract$State juniorProgressionFlowContract$State, JuniorProgressionPromptStage stage, int i, Map featuresReloadingStatuses, int i2) {
        if ((i2 & 1) != 0) {
            stage = juniorProgressionFlowContract$State.f77152a;
        }
        if ((i2 & 2) != 0) {
            i = juniorProgressionFlowContract$State.f77153b;
        }
        if ((i2 & 4) != 0) {
            featuresReloadingStatuses = juniorProgressionFlowContract$State.f77154c;
        }
        juniorProgressionFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(stage, "stage");
        Intrinsics.checkNotNullParameter(featuresReloadingStatuses, "featuresReloadingStatuses");
        return new JuniorProgressionFlowContract$State(stage, i, featuresReloadingStatuses);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorProgressionFlowContract$State)) {
            return false;
        }
        JuniorProgressionFlowContract$State juniorProgressionFlowContract$State = (JuniorProgressionFlowContract$State) obj2;
        return Intrinsics.f(this.f77152a, juniorProgressionFlowContract$State.f77152a) && this.f77153b == juniorProgressionFlowContract$State.f77153b && Intrinsics.f(this.f77154c, juniorProgressionFlowContract$State.f77154c);
    }

    public final int hashCode() {
        return this.f77154c.hashCode() + j6.a.b(this.f77153b, this.f77152a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77152a, i);
        dest.writeInt(this.f77153b);
        Iterator itZ = j6.a.z(this.f77154c, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString(((p) entry.getKey()).name());
            dest.writeSerializable((Serializable) entry.getValue());
        }
    }
}
