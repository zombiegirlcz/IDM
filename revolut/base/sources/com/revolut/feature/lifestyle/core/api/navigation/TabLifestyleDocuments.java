package com.revolut.feature.lifestyle.core.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/lifestyle/core/api/navigation/TabLifestyleDocuments;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_lifestyle_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TabLifestyleDocuments implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TabLifestyleDocuments f78060a = new TabLifestyleDocuments();

    @NotNull
    public static final Parcelable.Creator<TabLifestyleDocuments> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return TabLifestyleDocuments.f78060a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TabLifestyleDocuments[i];
        }
    }

    private TabLifestyleDocuments() {
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
