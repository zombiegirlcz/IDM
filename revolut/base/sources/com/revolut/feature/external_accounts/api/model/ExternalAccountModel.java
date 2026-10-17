package com.revolut.feature.external_accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/ExternalAccountModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalAccountModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExternalAccountModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72212c;
    public final String d;
    public final b e;
    public final ArrayList f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new ExternalAccountModel(string, string2, string3, string4, bVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalAccountModel[i];
        }
    }

    public ExternalAccountModel(String externalId, String name, String accountNumber, String type, b currency, ArrayList alternateCurrencies) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(alternateCurrencies, "alternateCurrencies");
        this.f72210a = externalId;
        this.f72211b = name;
        this.f72212c = accountNumber;
        this.d = type;
        this.e = currency;
        this.f = alternateCurrencies;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExternalAccountModel)) {
            return false;
        }
        ExternalAccountModel externalAccountModel = (ExternalAccountModel) obj2;
        return Intrinsics.f(this.f72210a, externalAccountModel.f72210a) && Intrinsics.f(this.f72211b, externalAccountModel.f72211b) && Intrinsics.f(this.f72212c, externalAccountModel.f72212c) && Intrinsics.f(this.d, externalAccountModel.d) && Intrinsics.f(this.e, externalAccountModel.e) && this.f.equals(externalAccountModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + l.j(this.e, p.a.c(p.a.c(p.a.c(this.f72210a.hashCode() * 31, 31, this.f72211b), 31, this.f72212c), 31, this.d), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72210a);
        dest.writeString(this.f72211b);
        dest.writeString(this.f72212c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
    }
}
