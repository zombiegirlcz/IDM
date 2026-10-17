package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/ConfirmationPromptScreenConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConfirmationPromptScreenConfig extends ScreenConfig {

    @NotNull
    public static final Parcelable.Creator<ConfirmationPromptScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f66341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f66342b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfirmationPromptScreenConfig((Clause) parcel.readParcelable(ConfirmationPromptScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(ConfirmationPromptScreenConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConfirmationPromptScreenConfig[i];
        }
    }

    public ConfirmationPromptScreenConfig(Clause title, Clause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f66341a = title;
        this.f66342b = subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConfirmationPromptScreenConfig)) {
            return false;
        }
        ConfirmationPromptScreenConfig confirmationPromptScreenConfig = (ConfirmationPromptScreenConfig) obj2;
        return Intrinsics.f(this.f66341a, confirmationPromptScreenConfig.f66341a) && Intrinsics.f(this.f66342b, confirmationPromptScreenConfig.f66342b);
    }

    public final int hashCode() {
        return this.f66342b.hashCode() + (this.f66341a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66341a, i);
        dest.writeParcelable(this.f66342b, i);
    }
}
