package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BooleanCondition;", "Lcom/revolut/feature/backend_flow/domain/models/Condition;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BooleanCondition extends Condition {

    @NotNull
    public static final Parcelable.Creator<BooleanCondition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63322b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BooleanCondition(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BooleanCondition[i];
        }
    }

    public BooleanCondition(String itemId, boolean z) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f63321a = itemId;
        this.f63322b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BooleanCondition)) {
            return false;
        }
        BooleanCondition booleanCondition = (BooleanCondition) obj2;
        return Intrinsics.f(this.f63321a, booleanCondition.f63321a) && this.f63322b == booleanCondition.f63322b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63322b) + (this.f63321a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63321a);
        dest.writeInt(this.f63322b ? 1 : 0);
    }
}
