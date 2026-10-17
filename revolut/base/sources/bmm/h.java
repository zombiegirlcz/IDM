package bmm;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e[] f16924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f16925b;

    static {
        e eVar = new e(e.i, "");
        mmm.m mVar = e.f;
        e eVar2 = new e(mVar, "GET");
        e eVar3 = new e(mVar, "POST");
        mmm.m mVar2 = e.f16899g;
        e eVar4 = new e(mVar2, "/");
        e eVar5 = new e(mVar2, "/index.html");
        mmm.m mVar3 = e.f16900h;
        e eVar6 = new e(mVar3, "http");
        e eVar7 = new e(mVar3, "https");
        mmm.m mVar4 = e.e;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, new e(mVar4, "200"), new e(mVar4, "204"), new e(mVar4, "206"), new e(mVar4, "304"), new e(mVar4, "400"), new e(mVar4, "404"), new e(mVar4, "500"), new e("accept-charset", ""), new e("accept-encoding", "gzip, deflate"), new e("accept-language", ""), new e("accept-ranges", ""), new e("accept", ""), new e("access-control-allow-origin", ""), new e("age", ""), new e("allow", ""), new e("authorization", ""), new e("cache-control", ""), new e("content-disposition", ""), new e("content-encoding", ""), new e("content-language", ""), new e("content-length", ""), new e("content-location", ""), new e("content-range", ""), new e("content-type", ""), new e("cookie", ""), new e("date", ""), new e("etag", ""), new e("expect", ""), new e("expires", ""), new e("from", ""), new e("host", ""), new e("if-match", ""), new e("if-modified-since", ""), new e("if-none-match", ""), new e("if-range", ""), new e("if-unmodified-since", ""), new e("last-modified", ""), new e("link", ""), new e("location", ""), new e("max-forwards", ""), new e("proxy-authenticate", ""), new e("proxy-authorization", ""), new e("range", ""), new e("referer", ""), new e("refresh", ""), new e("retry-after", ""), new e("server", ""), new e("set-cookie", ""), new e("strict-transport-security", ""), new e("transfer-encoding", ""), new e("user-agent", ""), new e("vary", ""), new e("via", ""), new e("www-authenticate", "")};
        f16924a = eVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(eVarArr[i].f16901a)) {
                linkedHashMap.put(eVarArr[i].f16901a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        f16925b = mapUnmodifiableMap;
    }

    public static void a(mmm.m name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int iD = name.d();
        for (int i = 0; i < iD; i++) {
            byte bK = name.k(i);
            if (65 <= bK && bK < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.v()));
            }
        }
    }
}
