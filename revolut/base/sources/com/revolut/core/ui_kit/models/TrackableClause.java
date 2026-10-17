package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.l3;
import com.revolut.core.ui_kit.models.ResourceId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/TrackableClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/l3;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class TrackableClause implements Clause, l3 {

    @NotNull
    public static final Parcelable.Creator<TrackableClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceId f57983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f57984b;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrackableClause((ResourceId) parcel.readParcelable(TrackableClause.class.getClassLoader()), (Clause) parcel.readParcelable(TrackableClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TrackableClause[i];
        }
    }

    public TrackableClause(ResourceId resourceId, Clause clause) {
        this.f57983a = resourceId;
        this.f57984b = clause;
    }

    @Override // aw0.l3
    public final Clause a(Clause delegate) {
        Intrinsics.checkNotNullParameter(delegate, "newDelegate");
        ResourceId trackableResId = this.f57983a;
        Intrinsics.checkNotNullParameter(trackableResId, "trackableResId");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new TrackableClause(trackableResId, delegate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TrackableClause)) {
            return false;
        }
        TrackableClause trackableClause = (TrackableClause) obj2;
        return Intrinsics.f(this.f57983a, trackableClause.f57983a) && Intrinsics.f(this.f57984b, trackableClause.f57984b);
    }

    @Override // aw0.l3
    /* JADX INFO: renamed from: getDelegate, reason: from getter */
    public final Clause getF57984b() {
        return this.f57984b;
    }

    public final int hashCode() {
        return this.f57984b.hashCode() + (this.f57983a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57983a, i);
        dest.writeParcelable(this.f57984b, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackableClause(Clause delegate, int i) {
        this(new ResourceId.IntResourceId(i), delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackableClause(TextClause delegate, String trackableResKey) {
        this(new ResourceId.StringResourceId(trackableResKey), delegate);
        Intrinsics.checkNotNullParameter(trackableResKey, "trackableResKey");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
