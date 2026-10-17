package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/AutoPayPromptScreenConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoPayPromptScreenConfig extends ScreenConfig {

    @NotNull
    public static final Parcelable.Creator<AutoPayPromptScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f66334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f66335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f66336c;
    public final Clause d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoPayPromptScreenConfig((Clause) parcel.readParcelable(AutoPayPromptScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(AutoPayPromptScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(AutoPayPromptScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(AutoPayPromptScreenConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoPayPromptScreenConfig[i];
        }
    }

    public AutoPayPromptScreenConfig(Clause title, Clause description, Clause primaryActionLabel, Clause secondaryActionLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
        Intrinsics.checkNotNullParameter(secondaryActionLabel, "secondaryActionLabel");
        this.f66334a = title;
        this.f66335b = description;
        this.f66336c = primaryActionLabel;
        this.d = secondaryActionLabel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AutoPayPromptScreenConfig)) {
            return false;
        }
        AutoPayPromptScreenConfig autoPayPromptScreenConfig = (AutoPayPromptScreenConfig) obj2;
        return Intrinsics.f(this.f66334a, autoPayPromptScreenConfig.f66334a) && Intrinsics.f(this.f66335b, autoPayPromptScreenConfig.f66335b) && Intrinsics.f(this.f66336c, autoPayPromptScreenConfig.f66336c) && Intrinsics.f(this.d, autoPayPromptScreenConfig.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(p.a.a(this.f66334a.hashCode() * 31, 31, this.f66335b), 31, this.f66336c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66334a, i);
        dest.writeParcelable(this.f66335b, i);
        dest.writeParcelable(this.f66336c, i);
        dest.writeParcelable(this.d, i);
    }
}
