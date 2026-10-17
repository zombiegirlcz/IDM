package com.revolut.retail.feature.api.travel_trips.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fR\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/revolut/retail/feature/api/travel_trips/widget/TripItineraryWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "contextKey", "", "Lcom/revolut/feature/widgets/api/model/WidgetContextKey;", "<init>", "(Ljava/lang/String;)V", "getContextKey", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature_travel_trips_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TripItineraryWidgetContext extends WidgetContext {

    @NotNull
    public static final Parcelable.Creator<TripItineraryWidgetContext> CREATOR = new a();

    @NotNull
    private final String contextKey;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TripItineraryWidgetContext(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TripItineraryWidgetContext[i];
        }
    }

    public TripItineraryWidgetContext(@NotNull String contextKey) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        this.contextKey = contextKey;
    }

    public static /* synthetic */ TripItineraryWidgetContext copy$default(TripItineraryWidgetContext tripItineraryWidgetContext, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = tripItineraryWidgetContext.contextKey;
        }
        return tripItineraryWidgetContext.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContextKey() {
        return this.contextKey;
    }

    @NotNull
    public final TripItineraryWidgetContext copy(@NotNull String contextKey) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        return new TripItineraryWidgetContext(contextKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TripItineraryWidgetContext) && Intrinsics.f(this.contextKey, ((TripItineraryWidgetContext) other).contextKey);
    }

    @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
    @NotNull
    public String getContextKey() {
        return this.contextKey;
    }

    public int hashCode() {
        return this.contextKey.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contextKey);
    }
}
