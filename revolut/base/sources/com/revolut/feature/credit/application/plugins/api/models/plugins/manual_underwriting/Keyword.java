package com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/Keyword;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Keyword implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Keyword> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jv3.a f66471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66472c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Keyword(parcel.readString(), jv3.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Keyword[i];
        }
    }

    public Keyword(String keyword, jv3.a matchType, String error) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(matchType, "matchType");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f66470a = keyword;
        this.f66471b = matchType;
        this.f66472c = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Keyword)) {
            return false;
        }
        Keyword keyword = (Keyword) obj2;
        return Intrinsics.f(this.f66470a, keyword.f66470a) && this.f66471b == keyword.f66471b && Intrinsics.f(this.f66472c, keyword.f66472c);
    }

    public final int hashCode() {
        return this.f66472c.hashCode() + ((this.f66471b.hashCode() + (this.f66470a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66470a);
        dest.writeString(this.f66471b.name());
        dest.writeString(this.f66472c);
    }
}
