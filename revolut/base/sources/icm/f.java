package icm;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mmm.m f160322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c[] f160323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f160324c;

    static {
        mmm.m.Companion.getClass();
        f160322a = mmm.l.c(":");
        c cVar = new c(c.f160310h, "");
        mmm.m mVar = c.e;
        c cVar2 = new c(mVar, "GET");
        c cVar3 = new c(mVar, "POST");
        mmm.m mVar2 = c.f;
        c cVar4 = new c(mVar2, "/");
        c cVar5 = new c(mVar2, "/index.html");
        mmm.m mVar3 = c.f160309g;
        c cVar6 = new c(mVar3, "http");
        c cVar7 = new c(mVar3, "https");
        mmm.m mVar4 = c.d;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(mVar4, "200"), new c(mVar4, "204"), new c(mVar4, "206"), new c(mVar4, "304"), new c(mVar4, "400"), new c(mVar4, "404"), new c(mVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f160323b = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(cVarArr[i].f160311a)) {
                linkedHashMap.put(cVarArr[i].f160311a, Integer.valueOf(i));
            }
        }
        f160324c = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(mmm.m mVar) throws IOException {
        int iD = mVar.d();
        for (int i = 0; i < iD; i++) {
            byte bK = mVar.k(i);
            if (bK >= 65 && bK <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(mVar.v()));
            }
        }
    }
}
