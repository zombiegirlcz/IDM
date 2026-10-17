package com.revolut.feature.wealth.api.ui.delegates.mosttraded.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/delegates/mosttraded/widget/MostTradedFeedWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "contextKey", "", "<init>", "(Ljava/lang/String;)V", "getContextKey", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MostTradedFeedWidgetContext extends WidgetContext {

    @NotNull
    public static final Parcelable.Creator<MostTradedFeedWidgetContext> CREATOR = new a();

    @NotNull
    private final String contextKey;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MostTradedFeedWidgetContext(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MostTradedFeedWidgetContext[i];
        }
    }

    public MostTradedFeedWidgetContext(@NotNull String contextKey) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        this.contextKey = contextKey;
    }

    public static /* synthetic */ MostTradedFeedWidgetContext copy$default(MostTradedFeedWidgetContext mostTradedFeedWidgetContext, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = mostTradedFeedWidgetContext.contextKey;
        }
        return mostTradedFeedWidgetContext.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContextKey() {
        return this.contextKey;
    }

    @NotNull
    public final MostTradedFeedWidgetContext copy(@NotNull String contextKey) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        return new MostTradedFeedWidgetContext(contextKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MostTradedFeedWidgetContext) && Intrinsics.f(this.contextKey, ((MostTradedFeedWidgetContext) other).contextKey);
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
