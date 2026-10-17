package com.revolut.feature.freelancer_widgets.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/revolut/feature/freelancer_widgets/api/FreelancerWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "contextKey", "", "accountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContextKey", "()Ljava/lang/String;", "getAccountId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature_freelancer_widgets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerWidgetContext extends WidgetContext {

    @NotNull
    public static final Parcelable.Creator<FreelancerWidgetContext> CREATOR = new a();

    @NotNull
    private final String accountId;

    @NotNull
    private final String contextKey;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerWidgetContext(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerWidgetContext[i];
        }
    }

    public FreelancerWidgetContext(@NotNull String contextKey, @NotNull String accountId) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.contextKey = contextKey;
        this.accountId = accountId;
    }

    public static /* synthetic */ FreelancerWidgetContext copy$default(FreelancerWidgetContext freelancerWidgetContext, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = freelancerWidgetContext.contextKey;
        }
        if ((i & 2) != 0) {
            str2 = freelancerWidgetContext.accountId;
        }
        return freelancerWidgetContext.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContextKey() {
        return this.contextKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final FreelancerWidgetContext copy(@NotNull String contextKey, @NotNull String accountId) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new FreelancerWidgetContext(contextKey, accountId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreelancerWidgetContext)) {
            return false;
        }
        FreelancerWidgetContext freelancerWidgetContext = (FreelancerWidgetContext) other;
        return Intrinsics.f(this.contextKey, freelancerWidgetContext.contextKey) && Intrinsics.f(this.accountId, freelancerWidgetContext.accountId);
    }

    @NotNull
    public final String getAccountId() {
        return this.accountId;
    }

    @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
    @NotNull
    /* JADX INFO: renamed from: getContextKey */
    public String getF76166a() {
        return this.contextKey;
    }

    public int hashCode() {
        return this.accountId.hashCode() + (this.contextKey.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contextKey);
        dest.writeString(this.accountId);
    }
}
