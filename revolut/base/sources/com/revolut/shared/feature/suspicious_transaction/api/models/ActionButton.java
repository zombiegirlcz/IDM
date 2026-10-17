package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/ActionButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "gal/a", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActionButton implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActionButton> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gal.a f104900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Action f104902c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActionButton(gal.a.valueOf(parcel.readString()), parcel.readString(), (Action) parcel.readParcelable(ActionButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionButton[i];
        }
    }

    public ActionButton(gal.a type, String title, Action action) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f104900a = type;
        this.f104901b = title;
        this.f104902c = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActionButton)) {
            return false;
        }
        ActionButton actionButton = (ActionButton) obj2;
        return this.f104900a == actionButton.f104900a && Intrinsics.f(this.f104901b, actionButton.f104901b) && Intrinsics.f(this.f104902c, actionButton.f104902c);
    }

    public final int hashCode() {
        return this.f104902c.hashCode() + p.a.c(this.f104900a.hashCode() * 31, 31, this.f104901b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104900a.name());
        dest.writeString(this.f104901b);
        dest.writeParcelable(this.f104902c, i);
    }
}
