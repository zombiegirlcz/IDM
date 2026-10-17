package dam;

import android.os.Build;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import financial.atomic.transact.Config$Customer;
import financial.atomic.transact.Config$Deeplink;
import financial.atomic.transact.Config$Distribution;
import financial.atomic.transact.Config$Experiments;
import financial.atomic.transact.Config$Platform;
import financial.atomic.transact.Config$Search;
import financial.atomic.transact.Config$Task;
import financial.atomic.transact.Config$TaskData;
import financial.atomic.transact.Config$Theme;
import financial.atomic.transact.Config$TokenData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlinx.serialization.json.Json;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f112565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f112566c;
    public final List d;
    public final String e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Config$Distribution f112567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Config$Theme f112568h;
    public final Config$Deeplink i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final JSONObject f112569j;
    public final f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Config$Search f112570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f112571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Config$Experiments f112572n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f112573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h f112574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f112575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f112576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Config$Customer f112577t;
    public final String u;
    public final Config$TokenData v;

    public i(String str, g gVar, d dVar, List list, String str2, g gVar2, Config$Distribution config$Distribution, Config$Theme config$Theme, Config$Deeplink config$Deeplink, JSONObject jSONObject, f fVar, Config$Search config$Search, List list2, Config$Experiments config$Experiments, boolean z, boolean z3, h hVar, String str3, String str4, Config$Customer config$Customer) {
        String lowerCase;
        String strName;
        this.f112564a = str;
        this.f112565b = gVar;
        this.f112566c = dVar;
        this.d = list;
        this.e = str2;
        this.f = gVar2;
        this.f112567g = config$Distribution;
        this.f112568h = config$Theme;
        this.i = config$Deeplink;
        this.f112569j = jSONObject;
        this.k = fVar;
        this.f112570l = config$Search;
        this.f112571m = list2;
        this.f112572n = config$Experiments;
        this.o = z;
        this.f112573p = z3;
        this.f112574q = hVar;
        this.f112575r = str3;
        this.f112576s = str4;
        this.f112577t = config$Customer;
        this.u = str4;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                Config$Task config$Task = (Config$Task) it8.next();
                String strName2 = config$Task.f135491a.name();
                Locale locale = Locale.ROOT;
                String lowerCase2 = strName2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                Config$Distribution config$Distribution2 = config$Task.f135492b;
                g gVar3 = config$Task.f135493c;
                if (gVar3 == null || (strName = gVar3.name()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = strName.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                arrayList2.add(new Config$TaskData(lowerCase2, config$Distribution2, lowerCase, config$Task.d));
            }
            arrayList = arrayList2;
        }
        g gVar4 = this.f;
        String str5 = this.e;
        Config$Distribution config$Distribution3 = this.f112567g;
        Config$Deeplink config$Deeplink2 = this.i;
        Config$Theme config$Theme2 = this.f112568h;
        f fVar2 = this.k;
        String str6 = this.f112575r;
        JSONObject jSONObject2 = this.f112569j;
        Config$Search config$Search2 = this.f112570l;
        List list3 = this.f112571m;
        Config$Experiments config$Experiments2 = this.f112572n;
        Config$Customer config$Customer2 = this.f112577t;
        int i = Build.VERSION.SDK_INT;
        this.v = new Config$TokenData(str, gVar, hVar, arrayList, gVar4, str5, config$Distribution3, config$Deeplink2, config$Theme2, fVar2, str6, jSONObject2, config$Search2, list3, config$Experiments2, config$Customer2, new Config$Platform(String.valueOf(i), String.valueOf(i)));
    }

    public static i a(i iVar, Config$Theme config$Theme) {
        String publicToken = iVar.f112564a;
        g product = iVar.f112565b;
        d environment = iVar.f112566c;
        List list = iVar.d;
        String str = iVar.e;
        g gVar = iVar.f;
        Config$Distribution config$Distribution = iVar.f112567g;
        Config$Deeplink config$Deeplink = iVar.i;
        JSONObject jSONObject = iVar.f112569j;
        f fVar = iVar.k;
        Config$Search config$Search = iVar.f112570l;
        List list2 = iVar.f112571m;
        Config$Experiments config$Experiments = iVar.f112572n;
        boolean z = iVar.o;
        boolean z3 = iVar.f112573p;
        h scope = iVar.f112574q;
        String str2 = iVar.f112575r;
        String str3 = iVar.f112576s;
        Config$Customer config$Customer = iVar.f112577t;
        Intrinsics.checkNotNullParameter(publicToken, "publicToken");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new i(publicToken, product, environment, list, str, gVar, config$Distribution, config$Theme, config$Deeplink, jSONObject, fVar, config$Search, list2, config$Experiments, z, z3, scope, str2, str3, config$Customer);
    }

    public final String b() {
        String str = this.u;
        if (str != null) {
            return str;
        }
        rlm.b bVar = Json.d;
        String strC = bVar.c(jh.d.v(bVar.f187949b, o0.b(Config$TokenData.class)), this.v);
        Intrinsics.checkNotNullParameter(strC, "<this>");
        byte[] bytes = strC.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        Intrinsics.checkNotNullParameter(bytes, "<this>");
        byte[] bArrEncode = Base64.encode(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(this, flags)");
        return a0.u(bArrEncode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f112564a, iVar.f112564a) && this.f112565b == iVar.f112565b && this.f112566c == iVar.f112566c && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && this.f == iVar.f && Intrinsics.f(this.f112567g, iVar.f112567g) && Intrinsics.f(this.f112568h, iVar.f112568h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f112569j, iVar.f112569j) && this.k == iVar.k && Intrinsics.f(this.f112570l, iVar.f112570l) && Intrinsics.f(this.f112571m, iVar.f112571m) && Intrinsics.f(this.f112572n, iVar.f112572n) && this.o == iVar.o && this.f112573p == iVar.f112573p && this.f112574q == iVar.f112574q && Intrinsics.f(this.f112575r, iVar.f112575r) && Intrinsics.f(this.f112576s, iVar.f112576s) && Intrinsics.f(this.f112577t, iVar.f112577t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [int] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int hashCode() {
        int i;
        int iHashCode = (this.f112566c.hashCode() + ((this.f112565b.hashCode() + (this.f112564a.hashCode() * 31)) * 961)) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.f;
        int iHashCode4 = (iHashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Config$Distribution config$Distribution = this.f112567g;
        int iHashCode5 = (iHashCode4 + (config$Distribution == null ? 0 : config$Distribution.hashCode())) * 31;
        Config$Theme config$Theme = this.f112568h;
        int iHashCode6 = (iHashCode5 + (config$Theme == null ? 0 : config$Theme.hashCode())) * 31;
        Config$Deeplink config$Deeplink = this.i;
        int iHashCode7 = (iHashCode6 + (config$Deeplink == null ? 0 : config$Deeplink.hashCode())) * 31;
        JSONObject jSONObject = this.f112569j;
        int iHashCode8 = (iHashCode7 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        f fVar = this.k;
        int iHashCode9 = (iHashCode8 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Config$Search config$Search = this.f112570l;
        if (config$Search == null) {
            i = 0;
        } else {
            config$Search.hashCode();
            i = 32;
        }
        int i2 = (iHashCode9 + i) * 31;
        List list2 = this.f112571m;
        int iHashCode10 = (i2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Config$Experiments config$Experiments = this.f112572n;
        int iHashCode11 = (iHashCode10 + (config$Experiments == null ? 0 : config$Experiments.hashCode())) * 31;
        boolean z = this.o;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        int i3 = (iHashCode11 + r3) * 31;
        boolean z3 = this.f112573p;
        int iHashCode12 = (this.f112574q.hashCode() + ((i3 + (z3 ? 1 : z3)) * 961)) * 31;
        String str2 = this.f112575r;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f112576s;
        int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Config$Customer config$Customer = this.f112577t;
        return iHashCode14 + (config$Customer != null ? config$Customer.hashCode() : 0);
    }

    public final String toString() {
        return "Config(publicToken=" + this.f112564a + ", product=" + this.f112565b + ", operation=null, environment=" + this.f112566c + ", tasks=" + this.d + ", linkedAccount=" + this.e + ", additionalProduct=" + this.f + ", distribution=" + this.f112567g + ", theme=" + this.f112568h + ", deeplink=" + this.i + ", metadata=" + this.f112569j + ", language=" + this.k + ", search=" + this.f112570l + ", handoff=" + this.f112571m + ", experiments=" + this.f112572n + ", nativeAuthentication=" + this.o + ", clearCookies=" + this.f112573p + ", webContentsDebuggingEnabled=false, scope=" + this.f112574q + ", sessionContext=" + this.f112575r + ", token=" + this.f112576s + ", customer=" + this.f112577t + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ i(String str, g gVar, d dVar, List list, boolean z, h hVar, String str2, int i) {
        this(str, gVar, dVar, (i & 16) != 0 ? null : list, null, null, null, null, null, null, null, null, null, null, true, z, (i & 262144) != 0 ? h.NONE : hVar, null, (i & PKIFailureInfo.badCertTemplate) != 0 ? null : str2, null);
    }
}
