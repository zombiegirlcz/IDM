package com.revolut.feature.card_order_new.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/BackConfirmationDialog;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackConfirmationDialog implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BackConfirmationDialog> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f64930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f64931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f64932c;
    public final Clause d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackConfirmationDialog((Clause) parcel.readParcelable(BackConfirmationDialog.class.getClassLoader()), (Clause) parcel.readParcelable(BackConfirmationDialog.class.getClassLoader()), (Clause) parcel.readParcelable(BackConfirmationDialog.class.getClassLoader()), (Clause) parcel.readParcelable(BackConfirmationDialog.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackConfirmationDialog[i];
        }
    }

    public BackConfirmationDialog(Clause title, Clause description, Clause confirmButtonText, Clause cancelButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        this.f64930a = title;
        this.f64931b = description;
        this.f64932c = confirmButtonText;
        this.d = cancelButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackConfirmationDialog)) {
            return false;
        }
        BackConfirmationDialog backConfirmationDialog = (BackConfirmationDialog) obj2;
        return Intrinsics.f(this.f64930a, backConfirmationDialog.f64930a) && Intrinsics.f(this.f64931b, backConfirmationDialog.f64931b) && Intrinsics.f(this.f64932c, backConfirmationDialog.f64932c) && Intrinsics.f(this.d, backConfirmationDialog.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(p.a.a(this.f64930a.hashCode() * 31, 31, this.f64931b), 31, this.f64932c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64930a, i);
        dest.writeParcelable(this.f64931b, i);
        dest.writeParcelable(this.f64932c, i);
        dest.writeParcelable(this.d, i);
    }
}
