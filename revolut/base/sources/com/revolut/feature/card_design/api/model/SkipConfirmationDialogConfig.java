package com.revolut.feature.card_design.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/api/model/SkipConfirmationDialogConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SkipConfirmationDialogConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SkipConfirmationDialogConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f64595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f64596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f64597c;
    public final Clause d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SkipConfirmationDialogConfig((Clause) parcel.readParcelable(SkipConfirmationDialogConfig.class.getClassLoader()), (Clause) parcel.readParcelable(SkipConfirmationDialogConfig.class.getClassLoader()), (Clause) parcel.readParcelable(SkipConfirmationDialogConfig.class.getClassLoader()), (Clause) parcel.readParcelable(SkipConfirmationDialogConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SkipConfirmationDialogConfig[i];
        }
    }

    public SkipConfirmationDialogConfig(Clause title, Clause description, Clause cancelButtonText, Clause skipButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        Intrinsics.checkNotNullParameter(skipButtonText, "skipButtonText");
        this.f64595a = title;
        this.f64596b = description;
        this.f64597c = cancelButtonText;
        this.d = skipButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SkipConfirmationDialogConfig)) {
            return false;
        }
        SkipConfirmationDialogConfig skipConfirmationDialogConfig = (SkipConfirmationDialogConfig) obj2;
        return Intrinsics.f(this.f64595a, skipConfirmationDialogConfig.f64595a) && Intrinsics.f(this.f64596b, skipConfirmationDialogConfig.f64596b) && Intrinsics.f(this.f64597c, skipConfirmationDialogConfig.f64597c) && Intrinsics.f(this.d, skipConfirmationDialogConfig.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(p.a.a(this.f64595a.hashCode() * 31, 31, this.f64596b), 31, this.f64597c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64595a, i);
        dest.writeParcelable(this.f64596b, i);
        dest.writeParcelable(this.f64597c, i);
        dest.writeParcelable(this.d, i);
    }
}
