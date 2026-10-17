package com.revolut.feature.external_accounts.models.open_banking_brazil;

import android.os.Parcel;
import android.os.Parcelable;
import io3.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/models/open_banking_brazil/ThirdPartyBrazil;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThirdPartyBrazil implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ThirdPartyBrazil> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f73115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73116b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ThirdPartyBrazil((b) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThirdPartyBrazil[i];
        }
    }

    public ThirdPartyBrazil(b bVar, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f73115a = bVar;
        this.f73116b = title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThirdPartyBrazil)) {
            return false;
        }
        ThirdPartyBrazil thirdPartyBrazil = (ThirdPartyBrazil) obj2;
        return Intrinsics.f(this.f73115a, thirdPartyBrazil.f73115a) && Intrinsics.f(this.f73116b, thirdPartyBrazil.f73116b);
    }

    public final int hashCode() {
        b bVar = this.f73115a;
        return this.f73116b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f73115a);
        dest.writeString(this.f73116b);
    }
}
