package com.revolut.retail.feature.marketnews.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rzj.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsArticle;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthNewsArticle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WealthNewsArticle> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f101799c;
    public final String d;
    public final DateTime e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f101800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f101801h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f101802j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthNewsArticle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), g.valueOf(parcel.readString()), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthNewsArticle[i];
        }
    }

    public WealthNewsArticle(String id10, String title, String imageUrl, String str, DateTime publishedDate, String source, Integer num, g assetType, List relatedSymbols, List relatedCurrencies) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(publishedDate, "publishedDate");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(relatedSymbols, "relatedSymbols");
        Intrinsics.checkNotNullParameter(relatedCurrencies, "relatedCurrencies");
        this.f101797a = id10;
        this.f101798b = title;
        this.f101799c = imageUrl;
        this.d = str;
        this.e = publishedDate;
        this.f = source;
        this.f101800g = num;
        this.f101801h = assetType;
        this.i = relatedSymbols;
        this.f101802j = relatedCurrencies;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthNewsArticle)) {
            return false;
        }
        WealthNewsArticle wealthNewsArticle = (WealthNewsArticle) obj2;
        return Intrinsics.f(this.f101797a, wealthNewsArticle.f101797a) && Intrinsics.f(this.f101798b, wealthNewsArticle.f101798b) && Intrinsics.f(this.f101799c, wealthNewsArticle.f101799c) && Intrinsics.f(this.d, wealthNewsArticle.d) && Intrinsics.f(this.e, wealthNewsArticle.e) && Intrinsics.f(this.f, wealthNewsArticle.f) && Intrinsics.f(this.f101800g, wealthNewsArticle.f101800g) && this.f101801h == wealthNewsArticle.f101801h && Intrinsics.f(this.i, wealthNewsArticle.i) && Intrinsics.f(this.f101802j, wealthNewsArticle.f101802j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f101797a.hashCode() * 31, 31, this.f101798b), 31, this.f101799c);
        String str = this.d;
        int iC2 = p.a.c(b.f(this.e, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f);
        Integer num = this.f101800g;
        return this.f101802j.hashCode() + p.a.d((this.f101801h.hashCode() + ((iC2 + (num != null ? num.hashCode() : 0)) * 31)) * 31, 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101797a);
        dest.writeString(this.f101798b);
        dest.writeString(this.f101799c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f);
        Integer num = this.f101800g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeString(this.f101801h.name());
        dest.writeStringList(this.i);
        dest.writeStringList(this.f101802j);
    }
}
