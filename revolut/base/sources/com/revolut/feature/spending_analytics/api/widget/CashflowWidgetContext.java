package com.revolut.feature.spending_analytics.api.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/widget/CashflowWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "contextKey", "", "Lcom/revolut/feature/widgets/api/model/WidgetContextKey;", "analyticsAccount", "Lcom/revolut/retail/feature/api/AnalyticsAccount;", "<init>", "(Ljava/lang/String;Lcom/revolut/retail/feature/api/AnalyticsAccount;)V", "getContextKey", "()Ljava/lang/String;", "getAnalyticsAccount", "()Lcom/revolut/retail/feature/api/AnalyticsAccount;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashflowWidgetContext extends WidgetContext {

    @NotNull
    public static final Parcelable.Creator<CashflowWidgetContext> CREATOR = new a();

    @NotNull
    private final AnalyticsAccount analyticsAccount;

    @NotNull
    private final String contextKey;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashflowWidgetContext(parcel.readString(), (AnalyticsAccount) parcel.readParcelable(CashflowWidgetContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashflowWidgetContext[i];
        }
    }

    public CashflowWidgetContext(@NotNull String contextKey, @NotNull AnalyticsAccount analyticsAccount) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        this.contextKey = contextKey;
        this.analyticsAccount = analyticsAccount;
    }

    public static /* synthetic */ CashflowWidgetContext copy$default(CashflowWidgetContext cashflowWidgetContext, String str, AnalyticsAccount analyticsAccount, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = cashflowWidgetContext.contextKey;
        }
        if ((i & 2) != 0) {
            analyticsAccount = cashflowWidgetContext.analyticsAccount;
        }
        return cashflowWidgetContext.copy(str, analyticsAccount);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContextKey() {
        return this.contextKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AnalyticsAccount getAnalyticsAccount() {
        return this.analyticsAccount;
    }

    @NotNull
    public final CashflowWidgetContext copy(@NotNull String contextKey, @NotNull AnalyticsAccount analyticsAccount) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        return new CashflowWidgetContext(contextKey, analyticsAccount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashflowWidgetContext)) {
            return false;
        }
        CashflowWidgetContext cashflowWidgetContext = (CashflowWidgetContext) other;
        return Intrinsics.f(this.contextKey, cashflowWidgetContext.contextKey) && Intrinsics.f(this.analyticsAccount, cashflowWidgetContext.analyticsAccount);
    }

    @NotNull
    public final AnalyticsAccount getAnalyticsAccount() {
        return this.analyticsAccount;
    }

    @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
    @NotNull
    public String getContextKey() {
        return this.contextKey;
    }

    public int hashCode() {
        return this.analyticsAccount.hashCode() + (this.contextKey.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contextKey);
        dest.writeParcelable(this.analyticsAccount, flags);
    }
}
