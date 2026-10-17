package com.revolut.feature.credit.application.plugins.api.models.common.prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.core.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/common/prompt/CreditPromptAnalyticsConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditPromptAnalyticsConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditPromptAnalyticsConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f66330c;
    public final int d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditPromptAnalyticsConfiguration(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditPromptAnalyticsConfiguration[i];
        }
    }

    public CreditPromptAnalyticsConfiguration() {
        this(0, 0, 0, 0, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditPromptAnalyticsConfiguration)) {
            return false;
        }
        CreditPromptAnalyticsConfiguration creditPromptAnalyticsConfiguration = (CreditPromptAnalyticsConfiguration) obj2;
        return this.f66328a == creditPromptAnalyticsConfiguration.f66328a && this.f66329b == creditPromptAnalyticsConfiguration.f66329b && this.f66330c == creditPromptAnalyticsConfiguration.f66330c && this.d == creditPromptAnalyticsConfiguration.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f66330c, j6.a.b(this.f66329b, Integer.hashCode(this.f66328a) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f66328a);
        dest.writeInt(this.f66329b);
        dest.writeInt(this.f66330c);
        dest.writeInt(this.d);
    }

    public CreditPromptAnalyticsConfiguration(int i, int i2, int i3, int i5) {
        this.f66328a = i;
        this.f66329b = i2;
        this.f66330c = i3;
        this.d = i5;
    }

    public /* synthetic */ CreditPromptAnalyticsConfiguration(int i, int i2, int i3, int i5, int i6) {
        this((i6 & 1) != 0 ? R$string.credit_prompt_title : i, (i6 & 2) != 0 ? R$string.credit_prompt_description : i2, (i6 & 4) != 0 ? R$string.credit_prompt_primary_button : i3, (i6 & 8) != 0 ? R$string.credit_prompt_secondary_button : i5);
    }
}
