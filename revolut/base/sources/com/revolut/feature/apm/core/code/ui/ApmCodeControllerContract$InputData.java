package com.revolut.feature.apm.core.code.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.core.code.data.ApmCodeData;
import com.revolut.kompot.common.IOData$Input;
import ip0.ab;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/code/ui/ApmCodeControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmCodeControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ApmCodeControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab f61834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmCodeControllerContract$CodeDescriptor f61835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmCodeData f61836c;
    public final Clause d;
    public final boolean e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmCodeControllerContract$InputData(ab.valueOf(parcel.readString()), (ApmCodeControllerContract$CodeDescriptor) parcel.readParcelable(ApmCodeControllerContract$InputData.class.getClassLoader()), (ApmCodeData) parcel.readParcelable(ApmCodeControllerContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(ApmCodeControllerContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmCodeControllerContract$InputData[i];
        }
    }

    public ApmCodeControllerContract$InputData(ab codeInputMode, ApmCodeControllerContract$CodeDescriptor descriptor, ApmCodeData taskData, Clause clause, boolean z, String str) {
        Intrinsics.checkNotNullParameter(codeInputMode, "codeInputMode");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(taskData, "taskData");
        this.f61834a = codeInputMode;
        this.f61835b = descriptor;
        this.f61836c = taskData;
        this.d = clause;
        this.e = z;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmCodeControllerContract$InputData)) {
            return false;
        }
        ApmCodeControllerContract$InputData apmCodeControllerContract$InputData = (ApmCodeControllerContract$InputData) obj2;
        return this.f61834a == apmCodeControllerContract$InputData.f61834a && Intrinsics.f(this.f61835b, apmCodeControllerContract$InputData.f61835b) && Intrinsics.f(this.f61836c, apmCodeControllerContract$InputData.f61836c) && Intrinsics.f(this.d, apmCodeControllerContract$InputData.d) && this.e == apmCodeControllerContract$InputData.e && Intrinsics.f(this.f, apmCodeControllerContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f61836c.hashCode() + ((this.f61835b.hashCode() + (this.f61834a.hashCode() * 31)) * 31)) * 31;
        Clause clause = this.d;
        int iC = j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61834a.name());
        dest.writeParcelable(this.f61835b, i);
        dest.writeParcelable(this.f61836c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
    }

    public /* synthetic */ ApmCodeControllerContract$InputData(ab abVar, ApmCodeControllerContract$CodeDescriptor apmCodeControllerContract$CodeDescriptor, ApmCodeData apmCodeData, String str, int i) {
        this(abVar, apmCodeControllerContract$CodeDescriptor, apmCodeData, null, (i & 16) != 0, (i & 32) != 0 ? null : str);
    }
}
