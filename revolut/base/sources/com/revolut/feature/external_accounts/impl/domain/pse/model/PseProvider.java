package com.revolut.feature.external_accounts.impl.domain.pse.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/pse/model/PseProvider;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PseProvider implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PseProvider> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72420c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PseProvider(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PseProvider[i];
        }
    }

    public PseProvider(String id10, String name, String logo, String code) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f72418a = id10;
        this.f72419b = name;
        this.f72420c = logo;
        this.d = code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PseProvider)) {
            return false;
        }
        PseProvider pseProvider = (PseProvider) obj2;
        return Intrinsics.f(this.f72418a, pseProvider.f72418a) && Intrinsics.f(this.f72419b, pseProvider.f72419b) && Intrinsics.f(this.f72420c, pseProvider.f72420c) && Intrinsics.f(this.d, pseProvider.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f72418a.hashCode() * 31, 31, this.f72419b), 31, this.f72420c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72418a);
        dest.writeString(this.f72419b);
        dest.writeString(this.f72420c);
        dest.writeString(this.d);
    }
}
