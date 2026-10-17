package com.revolut.core.ui_kit.models.badge;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/badge/WhiteCircleBadge;", "Lcom/revolut/core/ui_kit/models/badge/CircleIconBadge;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WhiteCircleBadge implements CircleIconBadge {

    @NotNull
    public static final Parcelable.Creator<WhiteCircleBadge> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw0.a f58071a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WhiteCircleBadge(dw0.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WhiteCircleBadge[i];
        }
    }

    public WhiteCircleBadge(dw0.a icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f58071a = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof WhiteCircleBadge) && this.f58071a == ((WhiteCircleBadge) obj2).f58071a;
    }

    @Override // com.revolut.core.ui_kit.models.badge.CircleIconBadge
    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public final dw0.a getF58071a() {
        return this.f58071a;
    }

    public final int hashCode() {
        return this.f58071a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f58071a.name());
    }
}
