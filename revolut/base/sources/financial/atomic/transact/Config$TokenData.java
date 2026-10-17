package financial.atomic.transact;

import ch.qos.logback.core.CoreConstants;
import dam.f;
import dam.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import qlm.b0;
import qlm.e;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"financial/atomic/transact/Config$TokenData", "", "Companion", "$serializer", "transact_release"}, k = 1, mv = {1, 8, 0})
@g
public final /* data */ class Config$TokenData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final KSerializer[] f135500x = {null, new e(Config$TaskData$$serializer.INSTANCE), new b0("financial.atomic.transact.Config.Product", dam.g.values()), null, null, null, null, new b0("financial.atomic.transact.Config.Language", f.values()), null, null, null, null, null, null, null, null, null, new e(v1.f247718a), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dam.g f135502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dam.g f135503c;
    public final h d;
    public final List e;
    public final dam.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f135504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Config$Distribution f135505h;
    public final Config$Deeplink i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Config$Theme f135506j;
    public final f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f135507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final JSONObject f135508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Config$Search f135509n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Config$Experiments f135510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Config$Customer f135511q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f135512r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Config$Platform f135513s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f135514t;
    public final String u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f135515w;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfinancial/atomic/transact/Config$TokenData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lfinancial/atomic/transact/Config$TokenData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Config$TokenData$$serializer.INSTANCE;
        }
    }

    public Config$TokenData(int i, String str, List list, dam.g gVar, String str2, Config$Distribution config$Distribution, Config$Deeplink config$Deeplink, Config$Theme config$Theme, f fVar, String str3, JSONObject jSONObject, Config$Search config$Search, Config$Experiments config$Experiments, Config$Customer config$Customer, Boolean bool, Config$Platform config$Platform, String str4, String str5, List list2, String str6) {
        String lowerCase;
        String lowerCase2;
        if (16385 != (i & 16385)) {
            j1.f(Config$TokenData$$serializer.INSTANCE.getDescriptor(), i, 16385);
            throw null;
        }
        this.f135501a = str;
        dam.g gVar2 = dam.g.NONE;
        this.f135502b = gVar2;
        this.f135503c = gVar2;
        h hVar = h.NONE;
        this.d = hVar;
        if ((i & 2) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 4) == 0) {
            this.f = null;
        } else {
            this.f = gVar;
        }
        if ((i & 8) == 0) {
            this.f135504g = null;
        } else {
            this.f135504g = str2;
        }
        if ((i & 16) == 0) {
            this.f135505h = null;
        } else {
            this.f135505h = config$Distribution;
        }
        if ((i & 32) == 0) {
            this.i = null;
        } else {
            this.i = config$Deeplink;
        }
        if ((i & 64) == 0) {
            this.f135506j = null;
        } else {
            this.f135506j = config$Theme;
        }
        if ((i & 128) == 0) {
            this.k = null;
        } else {
            this.k = fVar;
        }
        if ((i & 256) == 0) {
            this.f135507l = null;
        } else {
            this.f135507l = str3;
        }
        if ((i & 512) == 0) {
            this.f135508m = null;
        } else {
            this.f135508m = jSONObject;
        }
        if ((i & 1024) == 0) {
            this.f135509n = null;
        } else {
            this.f135509n = config$Search;
        }
        this.o = null;
        if ((i & 2048) == 0) {
            this.f135510p = null;
        } else {
            this.f135510p = config$Experiments;
        }
        if ((i & 4096) == 0) {
            this.f135511q = null;
        } else {
            this.f135511q = config$Customer;
        }
        if ((i & 8192) == 0) {
            this.f135512r = null;
        } else {
            this.f135512r = bool;
        }
        this.f135513s = config$Platform;
        if ((32768 & i) == 0) {
            lowerCase = "NONE".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase = str4;
        }
        this.f135514t = lowerCase;
        if ((65536 & i) == 0) {
            lowerCase2 = "NONE".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase2 = str5;
        }
        this.u = lowerCase2;
        if ((131072 & i) == 0) {
            this.v = null;
        } else {
            this.v = list2;
        }
        this.f135515w = (i & 262144) == 0 ? hVar.f112563a : str6;
        String strName = gVar2.name();
        Locale locale = Locale.ROOT;
        String lowerCase3 = strName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f135514t = lowerCase3;
        String strName2 = gVar2.name();
        if (strName2 != null) {
            String lowerCase4 = strName2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase4 != null) {
                lowerCase3 = lowerCase4;
            }
        }
        this.u = lowerCase3;
        this.f135515w = hVar.f112563a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Config$TokenData)) {
            return false;
        }
        Config$TokenData config$TokenData = (Config$TokenData) obj2;
        return Intrinsics.f(this.f135501a, config$TokenData.f135501a) && this.f135502b == config$TokenData.f135502b && this.f135503c == config$TokenData.f135503c && this.d == config$TokenData.d && Intrinsics.f(this.e, config$TokenData.e) && this.f == config$TokenData.f && Intrinsics.f(this.f135504g, config$TokenData.f135504g) && Intrinsics.f(this.f135505h, config$TokenData.f135505h) && Intrinsics.f(this.i, config$TokenData.i) && Intrinsics.f(this.f135506j, config$TokenData.f135506j) && this.k == config$TokenData.k && Intrinsics.f(this.f135507l, config$TokenData.f135507l) && Intrinsics.f(this.f135508m, config$TokenData.f135508m) && Intrinsics.f(this.f135509n, config$TokenData.f135509n) && Intrinsics.f(this.o, config$TokenData.o) && Intrinsics.f(this.f135510p, config$TokenData.f135510p) && Intrinsics.f(this.f135511q, config$TokenData.f135511q) && Intrinsics.f(this.f135512r, config$TokenData.f135512r) && Intrinsics.f(this.f135513s, config$TokenData.f135513s);
    }

    public final int hashCode() {
        int i;
        int iHashCode = (this.f135502b.hashCode() + (this.f135501a.hashCode() * 31)) * 31;
        dam.g gVar = this.f135503c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31;
        List list = this.e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        dam.g gVar2 = this.f;
        int iHashCode4 = (iHashCode3 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
        String str = this.f135504g;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Config$Distribution config$Distribution = this.f135505h;
        int iHashCode6 = (iHashCode5 + (config$Distribution == null ? 0 : config$Distribution.hashCode())) * 31;
        Config$Deeplink config$Deeplink = this.i;
        int iHashCode7 = (iHashCode6 + (config$Deeplink == null ? 0 : config$Deeplink.hashCode())) * 31;
        Config$Theme config$Theme = this.f135506j;
        int iHashCode8 = (iHashCode7 + (config$Theme == null ? 0 : config$Theme.hashCode())) * 31;
        f fVar = this.k;
        int iHashCode9 = (iHashCode8 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str2 = this.f135507l;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        JSONObject jSONObject = this.f135508m;
        int iHashCode11 = (iHashCode10 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        Config$Search config$Search = this.f135509n;
        if (config$Search == null) {
            i = 0;
        } else {
            config$Search.hashCode();
            i = 32;
        }
        int i2 = (iHashCode11 + i) * 31;
        List list2 = this.o;
        int iHashCode12 = (i2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Config$Experiments config$Experiments = this.f135510p;
        int iHashCode13 = (iHashCode12 + (config$Experiments == null ? 0 : config$Experiments.hashCode())) * 31;
        Config$Customer config$Customer = this.f135511q;
        int iHashCode14 = (iHashCode13 + (config$Customer == null ? 0 : config$Customer.hashCode())) * 31;
        Boolean bool = this.f135512r;
        return this.f135513s.hashCode() + ((iHashCode14 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TokenData(publicToken=" + this.f135501a + ", product=" + this.f135502b + ", operation=" + this.f135503c + ", scope=" + this.d + ", tasks=" + this.e + ", additionalProduct=" + this.f + ", linkedAccount=" + this.f135504g + ", distribution=" + this.f135505h + ", deeplink=" + this.i + ", theme=" + this.f135506j + ", language=" + this.k + ", sessionContext=" + this.f135507l + ", metadata=" + this.f135508m + ", search=" + this.f135509n + ", handoff=" + this.o + ", experiments=" + this.f135510p + ", customer=" + this.f135511q + ", inSdk=" + this.f135512r + ", platform=" + this.f135513s + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Config$TokenData(String publicToken, dam.g product, h scope, ArrayList arrayList, dam.g gVar, String str, Config$Distribution config$Distribution, Config$Deeplink config$Deeplink, Config$Theme config$Theme, f fVar, String str2, JSONObject jSONObject, Config$Search config$Search, List list, Config$Experiments config$Experiments, Config$Customer config$Customer, Config$Platform platform) {
        Boolean bool = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(publicToken, "publicToken");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.f135501a = publicToken;
        this.f135502b = product;
        this.f135503c = null;
        this.d = scope;
        this.e = arrayList;
        this.f = gVar;
        this.f135504g = str;
        this.f135505h = config$Distribution;
        this.i = config$Deeplink;
        this.f135506j = config$Theme;
        this.k = fVar;
        this.f135507l = str2;
        this.f135508m = jSONObject;
        this.f135509n = config$Search;
        this.o = list;
        this.f135510p = config$Experiments;
        this.f135511q = config$Customer;
        this.f135512r = bool;
        this.f135513s = platform;
        Locale locale = Locale.ROOT;
        String lowerCase = "NONE".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f135514t = lowerCase;
        String lowerCase2 = "NONE".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.u = lowerCase2;
        this.f135515w = h.NONE.f112563a;
        String lowerCase3 = product.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f135514t = lowerCase3;
        this.u = lowerCase3;
        this.f135515w = scope.f112563a;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((dam.e) it8.next()).f112557a);
            }
            this.v = arrayList2;
        }
    }
}
