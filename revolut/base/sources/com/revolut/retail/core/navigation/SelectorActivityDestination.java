package com.revolut.retail.core.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/SelectorActivityDestination;", "Lcom/revolut/retail/core/navigation/ActivityDestination;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectorActivityDestination extends ActivityDestination {

    @NotNull
    public static final Parcelable.Creator<SelectorActivityDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98669b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectorActivityDestination(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectorActivityDestination[i];
        }
    }

    public SelectorActivityDestination(String action, String category) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f98668a = action;
        this.f98669b = category;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF98668a() {
        return this.f98668a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF98669b() {
        return this.f98669b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectorActivityDestination)) {
            return false;
        }
        SelectorActivityDestination selectorActivityDestination = (SelectorActivityDestination) obj2;
        return Intrinsics.f(this.f98668a, selectorActivityDestination.f98668a) && Intrinsics.f(this.f98669b, selectorActivityDestination.f98669b);
    }

    public final int hashCode() {
        return this.f98669b.hashCode() + (this.f98668a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98668a);
        dest.writeString(this.f98669b);
    }
}
