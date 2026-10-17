package com.revolut.feature.support.impl.transfer_tracker.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tde.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/Step;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Step implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Step> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Action f89374c;
    public final q d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Step(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), q.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Step[i];
        }
    }

    public Step(String title, String content, Action action, q icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f89372a = title;
        this.f89373b = content;
        this.f89374c = action;
        this.d = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Step)) {
            return false;
        }
        Step step = (Step) obj2;
        return Intrinsics.f(this.f89372a, step.f89372a) && Intrinsics.f(this.f89373b, step.f89373b) && Intrinsics.f(this.f89374c, step.f89374c) && this.d == step.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f89372a.hashCode() * 31, 31, this.f89373b);
        Action action = this.f89374c;
        return this.d.hashCode() + ((iC + (action == null ? 0 : action.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89372a);
        dest.writeString(this.f89373b);
        Action action = this.f89374c;
        if (action == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            action.writeToParcel(dest, i);
        }
        dest.writeString(this.d.name());
    }
}
