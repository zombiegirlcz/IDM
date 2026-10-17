package com.revolut.feature.credit.health.api.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/api/widget/CreditHealthWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditHealthWidgetContext extends WidgetContext {

    @NotNull
    public static final Parcelable.Creator<CreditHealthWidgetContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69956a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditHealthWidgetContext(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditHealthWidgetContext[i];
        }
    }

    public CreditHealthWidgetContext(String contextKey) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        this.f69956a = contextKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CreditHealthWidgetContext) && Intrinsics.f(this.f69956a, ((CreditHealthWidgetContext) obj2).f69956a);
    }

    @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
    /* JADX INFO: renamed from: getContextKey, reason: from getter */
    public final String getF69956a() {
        return this.f69956a;
    }

    public final int hashCode() {
        return this.f69956a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69956a);
    }
}
