package com.revolut.feature.wealth.api.domain.model.collectionquote;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/collectionquote/CollectionQuoteParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollectionQuoteParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CollectionQuoteParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f95275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f95276c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CollectionQuoteParams(string, arrayList, (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollectionQuoteParams[i];
        }
    }

    public CollectionQuoteParams(String str, List currencies, d dVar, d dVar2) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f95274a = str;
        this.f95275b = currencies;
        this.f95276c = dVar;
        this.d = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CollectionQuoteParams)) {
            return false;
        }
        CollectionQuoteParams collectionQuoteParams = (CollectionQuoteParams) obj2;
        return Intrinsics.f(this.f95274a, collectionQuoteParams.f95274a) && Intrinsics.f(this.f95275b, collectionQuoteParams.f95275b) && Intrinsics.f(this.f95276c, collectionQuoteParams.f95276c) && Intrinsics.f(this.d, collectionQuoteParams.d);
    }

    public final int hashCode() {
        String str = this.f95274a;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f95275b);
        d dVar = this.f95276c;
        int iHashCode = (iD + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.d;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95274a);
        Iterator itV = p.a.v(this.f95275b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeSerializable(this.f95276c);
        dest.writeSerializable(this.d);
    }

    public /* synthetic */ CollectionQuoteParams(String str, List list, d dVar, int i) {
        this((i & 1) != 0 ? null : str, list, (d) null, dVar);
    }
}
