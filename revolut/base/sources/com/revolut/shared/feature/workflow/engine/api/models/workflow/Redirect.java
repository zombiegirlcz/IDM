package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Redirect;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Redirect implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Redirect> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105640b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Redirect(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Redirect[i];
        }
    }

    public Redirect(String action, String uri2) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.f105639a = action;
        this.f105640b = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Redirect)) {
            return false;
        }
        Redirect redirect = (Redirect) obj2;
        return Intrinsics.f(this.f105639a, redirect.f105639a) && Intrinsics.f(this.f105640b, redirect.f105640b);
    }

    public final int hashCode() {
        return this.f105640b.hashCode() + (this.f105639a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105639a);
        dest.writeString(this.f105640b);
    }
}
