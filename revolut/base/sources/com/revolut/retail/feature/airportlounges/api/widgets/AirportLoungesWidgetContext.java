package com.revolut.retail.feature.airportlounges.api.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/widgets/AirportLoungesWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "contextKey", "", "Lcom/revolut/feature/widgets/api/model/WidgetContextKey;", "<init>", "(Ljava/lang/String;)V", "getContextKey", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesWidgetContext extends WidgetContext {

    @NotNull
    public static final Parcelable.Creator<AirportLoungesWidgetContext> CREATOR = new a();

    @NotNull
    private final String contextKey;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungesWidgetContext(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungesWidgetContext[i];
        }
    }

    public AirportLoungesWidgetContext(@NotNull String contextKey) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        this.contextKey = contextKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
    @NotNull
    public String getContextKey() {
        return this.contextKey;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contextKey);
    }
}
