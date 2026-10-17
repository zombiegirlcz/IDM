package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/models/QrDelegatedEvidence;", "Lcom/revolut/sso/api/models/Evidence;", "secret", "", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrDelegatedEvidence implements Evidence {

    @NotNull
    public static final Parcelable.Creator<QrDelegatedEvidence> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105970a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new QrDelegatedEvidence(v7.t(parcel, "parcel", "secret"));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QrDelegatedEvidence[i];
        }
    }

    public /* synthetic */ QrDelegatedEvidence(String str) {
        this.f105970a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof QrDelegatedEvidence) {
            return Intrinsics.f(this.f105970a, ((QrDelegatedEvidence) obj2).f105970a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f105970a.hashCode();
    }

    public final String toString() {
        return p.a.p("QrDelegatedEvidence(secret=", this.f105970a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105970a);
    }
}
