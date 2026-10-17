package com.revolut.feature.home_feed.impl.widgets.scheduled_payments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cd7.m;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B'\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/revolut/feature/home_feed/impl/widgets/scheduled_payments/ScheduledPaymentsWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "", "Lcom/revolut/feature/widgets/api/model/WidgetContextKey;", "contextKey", "Lcd7/m;", "accountType", "Lcom/revolut/feature/home_feed/impl/widgets/scheduled_payments/ScheduledPaymentsEntryPoint;", "entryPoint", "<init>", "(Ljava/lang/String;Lcd7/m;Lcom/revolut/feature/home_feed/impl/widgets/scheduled_payments/ScheduledPaymentsEntryPoint;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getContextKey", "()Ljava/lang/String;", "Lcd7/m;", "getAccountType", "()Lcd7/m;", "Lcom/revolut/feature/home_feed/impl/widgets/scheduled_payments/ScheduledPaymentsEntryPoint;", "getEntryPoint", "()Lcom/revolut/feature/home_feed/impl/widgets/scheduled_payments/ScheduledPaymentsEntryPoint;", "feature_home_feed_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScheduledPaymentsWidgetContext extends WidgetContext {

    @NotNull
    public static final Parcelable.Creator<ScheduledPaymentsWidgetContext> CREATOR = new a();

    @NotNull
    private final m accountType;

    @NotNull
    private final String contextKey;
    private final ScheduledPaymentsEntryPoint entryPoint;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScheduledPaymentsWidgetContext(parcel.readString(), m.valueOf(parcel.readString()), (ScheduledPaymentsEntryPoint) parcel.readParcelable(ScheduledPaymentsWidgetContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScheduledPaymentsWidgetContext[i];
        }
    }

    public ScheduledPaymentsWidgetContext(@NotNull String contextKey, @NotNull m accountType, ScheduledPaymentsEntryPoint scheduledPaymentsEntryPoint) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.contextKey = contextKey;
        this.accountType = accountType;
        this.entryPoint = scheduledPaymentsEntryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final m getAccountType() {
        return this.accountType;
    }

    @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
    @NotNull
    public String getContextKey() {
        return this.contextKey;
    }

    public final ScheduledPaymentsEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contextKey);
        dest.writeString(this.accountType.name());
        dest.writeParcelable(this.entryPoint, flags);
    }

    public /* synthetic */ ScheduledPaymentsWidgetContext(String str, m mVar, ScheduledPaymentsEntryPoint scheduledPaymentsEntryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, mVar, (i & 4) != 0 ? null : scheduledPaymentsEntryPoint);
    }
}
