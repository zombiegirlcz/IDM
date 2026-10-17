package ecm;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Joiner f124897c = Joiner.on(CoreConstants.COMMA_CHAR);
    public static final y d = new y(o.f124848b, false, new y(new o(1), true, new y()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f124898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f124899b;

    public y(o oVar, boolean z, y yVar) {
        String strA = oVar.a();
        Preconditions.checkArgument(!strA.contains(","), "Comma is currently not allowed in message encoding");
        int size = yVar.f124898a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(yVar.f124898a.containsKey(oVar.a()) ? size : size + 1);
        for (x xVar : yVar.f124898a.values()) {
            String strA2 = xVar.f124892a.a();
            if (!strA2.equals(strA)) {
                linkedHashMap.put(strA2, new x(xVar.f124892a, xVar.f124893b));
            }
        }
        linkedHashMap.put(strA, new x(oVar, z));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f124898a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((x) entry.getValue()).f124893b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.f124899b = f124897c.join(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    public y() {
        this.f124898a = new LinkedHashMap(0);
        this.f124899b = new byte[0];
    }
}
