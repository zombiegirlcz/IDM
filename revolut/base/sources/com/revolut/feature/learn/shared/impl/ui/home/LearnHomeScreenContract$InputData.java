package com.revolut.feature.learn.shared.impl.ui.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/learn/shared/impl/ui/home/LearnHomeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LearnHomeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LearnHomeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f78011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78013c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LearnHomeScreenContract$InputData(parcel.readInt() == 0 ? null : v.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LearnHomeScreenContract$InputData[i];
        }
    }

    public LearnHomeScreenContract$InputData(v vVar, boolean z, boolean z3) {
        this.f78011a = vVar;
        this.f78012b = z;
        this.f78013c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LearnHomeScreenContract$InputData)) {
            return false;
        }
        LearnHomeScreenContract$InputData learnHomeScreenContract$InputData = (LearnHomeScreenContract$InputData) obj2;
        return this.f78011a == learnHomeScreenContract$InputData.f78011a && this.f78012b == learnHomeScreenContract$InputData.f78012b && this.f78013c == learnHomeScreenContract$InputData.f78013c;
    }

    public final int hashCode() {
        v vVar = this.f78011a;
        return Boolean.hashCode(this.f78013c) + j6.a.c((vVar == null ? 0 : vVar.hashCode()) * 31, 31, this.f78012b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        v vVar = this.f78011a;
        if (vVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(vVar.name());
        }
        dest.writeInt(this.f78012b ? 1 : 0);
        dest.writeInt(this.f78013c ? 1 : 0);
    }

    public /* synthetic */ LearnHomeScreenContract$InputData(v vVar) {
        this(vVar, true, true);
    }
}
