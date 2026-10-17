package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1e.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreExclusivesHeroTile;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreExclusivesHeroTile implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreExclusivesHeroTile> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f88508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88509c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StoreExclusivesOfferContext f88510g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            n nVarValueOf = n.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreGenericBadge.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new StoreExclusivesHeroTile(string, nVarValueOf, string2, string3, string4, arrayList, (StoreExclusivesOfferContext) parcel.readParcelable(StoreExclusivesHeroTile.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreExclusivesHeroTile[i];
        }
    }

    public StoreExclusivesHeroTile(String id10, n style, String backgroundImageUrl, String str, String str2, ArrayList arrayList, StoreExclusivesOfferContext storeExclusivesOfferContext) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        this.f88507a = id10;
        this.f88508b = style;
        this.f88509c = backgroundImageUrl;
        this.d = str;
        this.e = str2;
        this.f = arrayList;
        this.f88510g = storeExclusivesOfferContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreExclusivesHeroTile)) {
            return false;
        }
        StoreExclusivesHeroTile storeExclusivesHeroTile = (StoreExclusivesHeroTile) obj2;
        return Intrinsics.f(this.f88507a, storeExclusivesHeroTile.f88507a) && this.f88508b == storeExclusivesHeroTile.f88508b && Intrinsics.f(this.f88509c, storeExclusivesHeroTile.f88509c) && Intrinsics.f(this.d, storeExclusivesHeroTile.d) && Intrinsics.f(this.e, storeExclusivesHeroTile.e) && Intrinsics.f(this.f, storeExclusivesHeroTile.f) && Intrinsics.f(this.f88510g, storeExclusivesHeroTile.f88510g);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f88508b.hashCode() + (this.f88507a.hashCode() * 31)) * 31, 31, this.f88509c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        StoreExclusivesOfferContext storeExclusivesOfferContext = this.f88510g;
        return iHashCode3 + (storeExclusivesOfferContext != null ? storeExclusivesOfferContext.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88507a);
        dest.writeString(this.f88508b.name());
        dest.writeString(this.f88509c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((StoreGenericBadge) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeParcelable(this.f88510g, i);
    }
}
