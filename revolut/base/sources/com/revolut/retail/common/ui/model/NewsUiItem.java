package com.revolut.retail.common.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementNewsItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.ArrayList;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import v01.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/common/ui/model/NewsUiItem;", "Lkoi/j;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewsUiItem implements j, Parcelable {

    @NotNull
    public static final Parcelable.Creator<NewsUiItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98599c;
    public final String d;
    public final Image e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f98600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f98601h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f98602j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Instant f98603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Instant f98604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f98605n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f98606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Float f98607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Parcelable f98608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AnalyticsContext f98609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f98610t;
    public final Image u;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Float f;
            Float fValueOf;
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Image image = (Image) parcel.readParcelable(NewsUiItem.class.getClassLoader());
            String string5 = parcel.readString();
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                f = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                f = null;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                fValueOf = f;
                z = true;
            } else {
                fValueOf = f;
                z = false;
            }
            Instant instant = (Instant) parcel.readSerializable();
            Instant instant2 = (Instant) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z4 = false;
            }
            Object objValueOf = parcel.readInt() == 0 ? fValueOf : Integer.valueOf(parcel.readInt());
            b bVar = (b) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            return new NewsUiItem(string, string2, string3, string4, image, string5, charSequence, string6, numValueOf, arrayListCreateStringArrayList, z, instant, instant2, z4, objValueOf, bVar, fValueOf, parcel.readParcelable(NewsUiItem.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(NewsUiItem.class.getClassLoader()), parcel.readInt() != 0 ? z3 : false, (Image) parcel.readParcelable(NewsUiItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewsUiItem[i];
        }
    }

    public NewsUiItem(String id10, String str, String str2, String str3, Image image, String title, CharSequence charSequence, String str4, Integer num, List list, boolean z, Instant instant, Instant instant2, boolean z3, Integer num2, b bVar, Float f, Parcelable parcelable, AnalyticsContext analyticsContext, boolean z4, Image image2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f98597a = id10;
        this.f98598b = str;
        this.f98599c = str2;
        this.d = str3;
        this.e = image;
        this.f = title;
        this.f98600g = charSequence;
        this.f98601h = str4;
        this.i = num;
        this.f98602j = list;
        this.k = z;
        this.f98603l = instant;
        this.f98604m = instant2;
        this.f98605n = z3;
        this.o = num2;
        this.f98606p = bVar;
        this.f98607q = f;
        this.f98608r = parcelable;
        this.f98609s = analyticsContext;
        this.f98610t = z4;
        this.u = image2;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF98597a() {
        return this.f98597a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NewsUiItem)) {
            return false;
        }
        NewsUiItem newsUiItem = (NewsUiItem) obj2;
        return Intrinsics.f(this.f98597a, newsUiItem.f98597a) && Intrinsics.f(this.f98598b, newsUiItem.f98598b) && Intrinsics.f(this.f98599c, newsUiItem.f98599c) && Intrinsics.f(this.d, newsUiItem.d) && Intrinsics.f(this.e, newsUiItem.e) && Intrinsics.f(this.f, newsUiItem.f) && Intrinsics.f(this.f98600g, newsUiItem.f98600g) && Intrinsics.f(this.f98601h, newsUiItem.f98601h) && Intrinsics.f(this.i, newsUiItem.i) && Intrinsics.f(this.f98602j, newsUiItem.f98602j) && this.k == newsUiItem.k && Intrinsics.f(this.f98603l, newsUiItem.f98603l) && Intrinsics.f(this.f98604m, newsUiItem.f98604m) && this.f98605n == newsUiItem.f98605n && Intrinsics.f(this.o, newsUiItem.o) && Intrinsics.f(this.f98606p, newsUiItem.f98606p) && Intrinsics.f(this.f98607q, newsUiItem.f98607q) && Intrinsics.f(this.f98608r, newsUiItem.f98608r) && Intrinsics.f(this.f98609s, newsUiItem.f98609s) && this.f98610t == newsUiItem.f98610t && Intrinsics.f(this.u, newsUiItem.u);
    }

    public final int hashCode() {
        int iHashCode = this.f98597a.hashCode() * 31;
        String str = this.f98598b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98599c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image = this.e;
        int iC = p.a.c((iHashCode4 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f);
        CharSequence charSequence = this.f98600g;
        int iHashCode5 = (iC + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str4 = this.f98601h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f98602j;
        int iC2 = j6.a.c((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31, 31, this.k);
        Instant instant = this.f98603l;
        int iHashCode8 = (iC2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f98604m;
        int iC3 = j6.a.c((iHashCode8 + (instant2 == null ? 0 : instant2.hashCode())) * 31, 31, this.f98605n);
        Integer num2 = this.o;
        int iHashCode9 = (iC3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        b bVar = this.f98606p;
        int iHashCode10 = (iHashCode9 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Float f = this.f98607q;
        int iHashCode11 = (iHashCode10 + (f == null ? 0 : f.hashCode())) * 31;
        Parcelable parcelable = this.f98608r;
        int iHashCode12 = (iHashCode11 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f98609s;
        int iC4 = j6.a.c((iHashCode12 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31, this.f98610t);
        Image image2 = this.u;
        return iC4 + (image2 != null ? image2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98597a);
        dest.writeString(this.f98598b);
        dest.writeString(this.f98599c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        TextUtils.writeToParcel(this.f98600g, dest, i);
        dest.writeString(this.f98601h);
        Integer num = this.i;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeStringList(this.f98602j);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeSerializable(this.f98603l);
        dest.writeSerializable(this.f98604m);
        dest.writeInt(this.f98605n ? 1 : 0);
        Integer num2 = this.o;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeSerializable(this.f98606p);
        Float f = this.f98607q;
        if (f == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f);
        }
        dest.writeParcelable(this.f98608r, i);
        dest.writeParcelable(this.f98609s, i);
        dest.writeInt(this.f98610t ? 1 : 0);
        dest.writeParcelable(this.u, i);
    }

    public /* synthetic */ NewsUiItem(String str, String str2, String str3, String str4, UrlImage urlImage, String str5, CharSequence charSequence, String str6, Integer num, List list, boolean z, Instant instant, Instant instant2, boolean z3, ChaosManagementNewsItem chaosManagementNewsItem, AnalyticsContext analyticsContext, boolean z4, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : urlImage, str5, (i & 64) != 0 ? null : charSequence, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : instant, (i & 4096) != 0 ? null : instant2, (i & 8192) != 0 ? true : z3, null, null, null, (131072 & i) != 0 ? null : chaosManagementNewsItem, (262144 & i) != 0 ? null : analyticsContext, (i & 524288) != 0 ? false : z4, null);
    }
}
