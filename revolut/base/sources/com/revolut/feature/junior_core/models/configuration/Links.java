package com.revolut.feature.junior_core.models.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_core/models/configuration/Links;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Links implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Links> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76908c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Links(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Links[i];
        }
    }

    public Links(String cardholderTerms, String privacyStatement, String str, String dataProtectionTerms) {
        Intrinsics.checkNotNullParameter(cardholderTerms, "cardholderTerms");
        Intrinsics.checkNotNullParameter(privacyStatement, "privacyStatement");
        Intrinsics.checkNotNullParameter(dataProtectionTerms, "dataProtectionTerms");
        this.f76906a = cardholderTerms;
        this.f76907b = privacyStatement;
        this.f76908c = str;
        this.d = dataProtectionTerms;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Links)) {
            return false;
        }
        Links links = (Links) obj2;
        return Intrinsics.f(this.f76906a, links.f76906a) && Intrinsics.f(this.f76907b, links.f76907b) && Intrinsics.f(this.f76908c, links.f76908c) && Intrinsics.f(this.d, links.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f76906a.hashCode() * 31, 31, this.f76907b);
        String str = this.f76908c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76906a);
        dest.writeString(this.f76907b);
        dest.writeString(this.f76908c);
        dest.writeString(this.d);
    }
}
