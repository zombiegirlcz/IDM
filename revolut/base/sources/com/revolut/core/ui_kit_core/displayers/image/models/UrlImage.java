package com.revolut.core.ui_kit_core.displayers.image.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import ehe.n;
import ez0.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import yhm.j;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0005\u0007\b\t\n\u000bJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lgz0/c;", "", "toString", "()Ljava/lang/String;", "Companion", "ez0/h", "CustomHeaders", "SimpleCustomHeaders", "LazyCustomHeaders", "a", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UrlImage implements Image, gz0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlImageDrawable f60019c;
    public final long d;
    public final long e;
    public final CustomHeaders f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f60020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f60021h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Image f60022j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f60023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f60024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageTransformations f60025n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f60026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f60027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f60028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Clause f60029s;

    @NotNull
    public static final Parcelable.Creator<UrlImage> CREATOR = new b();

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImage$CustomHeaders;", "Landroid/os/Parcelable;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface CustomHeaders extends Parcelable {
        /* JADX INFO: renamed from: getHeaders */
        Map getF60033a();
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImage$LazyCustomHeaders;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImage$CustomHeaders;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LazyCustomHeaders implements CustomHeaders {

        @NotNull
        public static final Parcelable.Creator<LazyCustomHeaders> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function0 f60030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f60031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Lazy f60032c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LazyCustomHeaders(parcel.readString(), new euf.a(17));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LazyCustomHeaders[i];
            }
        }

        public LazyCustomHeaders(String providerKey, Function0 provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(providerKey, "providerKey");
            this.f60030a = provider;
            this.f60031b = providerKey;
            this.f60032c = j.b(provider);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 instanceof LazyCustomHeaders) {
                return Intrinsics.f(this.f60031b, ((LazyCustomHeaders) obj2).f60031b);
            }
            return false;
        }

        @Override // com.revolut.core.ui_kit_core.displayers.image.models.UrlImage.CustomHeaders
        /* JADX INFO: renamed from: getHeaders */
        public final Map getF60033a() {
            return (Map) this.f60032c.getValue();
        }

        public final int hashCode() {
            return this.f60031b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60031b);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImage$SimpleCustomHeaders;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UrlImage$CustomHeaders;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SimpleCustomHeaders implements CustomHeaders {

        @NotNull
        public static final Parcelable.Creator<SimpleCustomHeaders> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f60033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f60034b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iA = 0;
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                while (iA != i2) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new SimpleCustomHeaders(linkedHashSet, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SimpleCustomHeaders[i];
            }
        }

        public SimpleCustomHeaders(Set headersIgnoreOnEquals, Map headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(headersIgnoreOnEquals, "headersIgnoreOnEquals");
            this.f60033a = headers;
            this.f60034b = headersIgnoreOnEquals;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SimpleCustomHeaders)) {
                return false;
            }
            Map map = this.f60033a;
            Set set = this.f60034b;
            SimpleCustomHeaders simpleCustomHeaders = (SimpleCustomHeaders) obj2;
            return Intrinsics.f(r0.m(map, set), r0.m(simpleCustomHeaders.f60033a, set)) && Intrinsics.f(set, simpleCustomHeaders.f60034b);
        }

        @Override // com.revolut.core.ui_kit_core.displayers.image.models.UrlImage.CustomHeaders
        /* JADX INFO: renamed from: getHeaders, reason: from getter */
        public final Map getF60033a() {
            return this.f60033a;
        }

        public final int hashCode() {
            Set set = this.f60034b;
            return set.hashCode() + (r0.m(this.f60033a, set).hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itZ = j6.a.z(this.f60033a, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            Iterator itV = n.v(this.f60034b, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Integer num;
            Integer num2;
            h hVar;
            Image image;
            boolean z;
            Integer numValueOf;
            boolean z3;
            boolean z4;
            Class cls;
            Object objCreateFromParcel;
            Class cls2;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            UrlImageDrawable urlImageDrawable = (UrlImageDrawable) parcel.readParcelable(UrlImage.class.getClassLoader());
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            CustomHeaders customHeaders = (CustomHeaders) parcel.readParcelable(UrlImage.class.getClassLoader());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            h hVarValueOf = parcel.readInt() == 0 ? null : h.valueOf(parcel.readString());
            Image image2 = (Image) parcel.readParcelable(UrlImage.class.getClassLoader());
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                num = null;
                num2 = numValueOf3;
                hVar = hVarValueOf;
                image = image2;
                z = true;
            } else {
                num = null;
                num2 = numValueOf3;
                hVar = hVarValueOf;
                image = image2;
                z = false;
            }
            if (parcel.readInt() != 0) {
                numValueOf = num;
                z3 = true;
            } else {
                numValueOf = num;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = false;
                z11 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() == 0) {
                cls = UrlImage.class;
                objCreateFromParcel = numValueOf;
            } else {
                cls = UrlImage.class;
                objCreateFromParcel = ImageTransformations.CREATOR.createFromParcel(parcel);
            }
            ImageTransformations imageTransformations = (ImageTransformations) objCreateFromParcel;
            Integer numValueOf4 = parcel.readInt() == 0 ? numValueOf : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                cls2 = cls;
                z6 = true;
            } else {
                cls2 = cls;
                z6 = z4;
            }
            return new UrlImage(string, string2, urlImageDrawable, j2, j3, customHeaders, numValueOf2, num2, hVar, image, z, z3, z11, imageTransformations, numValueOf4, numValueOf, z6, parcel.readInt() == 0 ? z4 : true, (Clause) parcel.readParcelable(cls2.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UrlImage[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlImage(String url2, String str, Integer num, Integer num2, long j2, CustomHeaders customHeaders, Integer num3, Integer num4, h hVar, Image image, boolean z, ImageTransformations imageTransformations, Integer num5, Integer num6, boolean z3, boolean z4, int i) {
        String urlDark = (i & 2) != 0 ? url2 : str;
        Integer num7 = (i & 4) != 0 ? null : num;
        Integer num8 = (i & 8) != 0 ? null : num2;
        long j3 = (i & 16) != 0 ? 0L : j2;
        long j5 = (i & 32) == 0 ? 7L : 0L;
        CustomHeaders customHeaders2 = (i & 64) != 0 ? null : customHeaders;
        Integer num9 = (i & 128) != 0 ? null : num3;
        Integer num10 = (i & 256) != 0 ? null : num4;
        h hVar2 = (i & 512) != 0 ? null : hVar;
        Image image2 = (i & 1024) != 0 ? null : image;
        boolean z6 = true;
        if ((i & 2048) != 0) {
            z6 = false;
        }
        boolean z11 = (i & 4096) != 0 ? false : z;
        ImageTransformations imageTransformations2 = (i & 16384) != 0 ? null : imageTransformations;
        Integer num11 = (32768 & i) != 0 ? null : num5;
        Integer num12 = (65536 & i) != 0 ? null : num6;
        boolean z12 = (131072 & i) != 0 ? false : z3;
        boolean z29 = (i & 262144) != 0 ? true : z4;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(urlDark, "urlDark");
        this(url2, urlDark, num7 != null ? new UrlImageDrawable.ResDrawable(num7.intValue(), num8) : null, j3, j5, customHeaders2, num9, num10, hVar2, image2, z6, z11, imageTransformations2, num11, num12, z12, z29, (Clause) null, 262144);
    }

    public static UrlImage a(UrlImage urlImage, String str, String str2, UrlImageDrawable urlImageDrawable, Integer num, ImageTransformations imageTransformations, int i) {
        String url2 = (i & 1) != 0 ? urlImage.f60017a : str;
        String urlDark = (i & 2) != 0 ? urlImage.f60018b : str2;
        UrlImageDrawable urlImageDrawable2 = (i & 4) != 0 ? urlImage.f60019c : urlImageDrawable;
        long j2 = urlImage.d;
        long j3 = urlImage.e;
        CustomHeaders customHeaders = urlImage.f;
        Integer num2 = urlImage.f60020g;
        Integer num3 = (i & 128) != 0 ? urlImage.f60021h : num;
        h hVar = urlImage.i;
        Image image = urlImage.f60022j;
        boolean z = urlImage.k;
        boolean z3 = urlImage.f60023l;
        boolean z4 = urlImage.f60024m;
        ImageTransformations imageTransformations2 = (i & 8192) != 0 ? urlImage.f60025n : imageTransformations;
        Integer num4 = urlImage.o;
        Integer num5 = urlImage.f60026p;
        boolean z6 = (i & 65536) != 0 ? urlImage.f60027q : true;
        boolean z11 = (i & 131072) != 0 ? urlImage.f60028r : false;
        Clause clause = urlImage.f60029s;
        urlImage.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(urlDark, "urlDark");
        return new UrlImage(url2, urlDark, urlImageDrawable2, j2, j3, customHeaders, num2, num3, hVar, image, z, z3, z4, imageTransformations2, num4, num5, z6, z11, clause);
    }

    @Override // gz0.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ImageTransformations getF59849c() {
        return this.f60025n;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UrlImage)) {
            return false;
        }
        UrlImage urlImage = (UrlImage) obj2;
        return Intrinsics.f(this.f60017a, urlImage.f60017a) && Intrinsics.f(this.f60018b, urlImage.f60018b) && Intrinsics.f(this.f60019c, urlImage.f60019c) && this.d == urlImage.d && this.e == urlImage.e && Intrinsics.f(this.f, urlImage.f) && Intrinsics.f(this.f60020g, urlImage.f60020g) && Intrinsics.f(this.f60021h, urlImage.f60021h) && this.i == urlImage.i && Intrinsics.f(this.f60022j, urlImage.f60022j) && this.k == urlImage.k && this.f60023l == urlImage.f60023l && this.f60024m == urlImage.f60024m && Intrinsics.f(this.f60025n, urlImage.f60025n) && Intrinsics.f(this.o, urlImage.o) && Intrinsics.f(this.f60026p, urlImage.f60026p) && this.f60027q == urlImage.f60027q && this.f60028r == urlImage.f60028r && Intrinsics.f(this.f60029s, urlImage.f60029s);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getE() {
        return this.f60029s;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f60017a.hashCode() * 31, 31, this.f60018b);
        UrlImageDrawable urlImageDrawable = this.f60019c;
        int iC2 = d.c(d.c((iC + (urlImageDrawable == null ? 0 : urlImageDrawable.hashCode())) * 31, 31, this.d), 31, this.e);
        CustomHeaders customHeaders = this.f;
        int iHashCode = (iC2 + (customHeaders == null ? 0 : customHeaders.hashCode())) * 31;
        Integer num = this.f60020g;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f60021h;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        h hVar = this.i;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Image image = this.f60022j;
        int iC3 = j6.a.c(j6.a.c(j6.a.c((iHashCode4 + (image == null ? 0 : image.hashCode())) * 31, 31, this.k), 31, this.f60023l), 31, this.f60024m);
        ImageTransformations imageTransformations = this.f60025n;
        int iHashCode5 = (iC3 + (imageTransformations == null ? 0 : imageTransformations.hashCode())) * 31;
        Integer num3 = this.o;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f60026p;
        int iC4 = j6.a.c(j6.a.c((iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.f60027q), 31, this.f60028r);
        Clause clause = this.f60029s;
        return iC4 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60017a);
        dest.writeString(this.f60018b);
        dest.writeParcelable(this.f60019c, i);
        dest.writeLong(this.d);
        dest.writeLong(this.e);
        dest.writeParcelable(this.f, i);
        Integer num = this.f60020g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f60021h;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        h hVar = this.i;
        if (hVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(hVar.name());
        }
        dest.writeParcelable(this.f60022j, i);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeInt(this.f60023l ? 1 : 0);
        dest.writeInt(this.f60024m ? 1 : 0);
        ImageTransformations imageTransformations = this.f60025n;
        if (imageTransformations == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageTransformations.writeToParcel(dest, i);
        }
        Integer num3 = this.o;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
        Integer num4 = this.f60026p;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num4);
        }
        dest.writeInt(this.f60027q ? 1 : 0);
        dest.writeInt(this.f60028r ? 1 : 0);
        dest.writeParcelable(this.f60029s, i);
    }

    public UrlImage(String url2, String urlDark, UrlImageDrawable urlImageDrawable, long j2, long j3, CustomHeaders customHeaders, Integer num, Integer num2, h hVar, Image image, boolean z, boolean z3, boolean z4, ImageTransformations imageTransformations, Integer num3, Integer num4, boolean z6, boolean z11, Clause clause) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(urlDark, "urlDark");
        this.f60017a = url2;
        this.f60018b = urlDark;
        this.f60019c = urlImageDrawable;
        this.d = j2;
        this.e = j3;
        this.f = customHeaders;
        this.f60020g = num;
        this.f60021h = num2;
        this.i = hVar;
        this.f60022j = image;
        this.k = z;
        this.f60023l = z3;
        this.f60024m = z4;
        this.f60025n = imageTransformations;
        this.o = num3;
        this.f60026p = num4;
        this.f60027q = z6;
        this.f60028r = z11;
        this.f60029s = clause;
    }

    public /* synthetic */ UrlImage(String str, String str2, UrlImageDrawable urlImageDrawable, long j2, long j3, CustomHeaders customHeaders, Integer num, Integer num2, h hVar, Image image, boolean z, boolean z3, ImageTransformations imageTransformations, Integer num3, Integer num4, boolean z4, boolean z6, Clause clause, int i) {
        this(str, (i & 2) != 0 ? str : str2, urlImageDrawable, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? null : customHeaders, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : hVar, (i & 512) != 0 ? null : image, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? false : z3, false, (i & 8192) != 0 ? null : imageTransformations, (i & 16384) != 0 ? null : num3, (32768 & i) != 0 ? null : num4, (65536 & i) != 0 ? false : z4, (131072 & i) != 0 ? true : z6, (i & 262144) != 0 ? null : clause);
    }
}
