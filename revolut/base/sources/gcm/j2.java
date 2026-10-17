package gcm;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes22.dex */
public abstract class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f142688a = Logger.getLogger(j2.class.getName());

    public static Object a(String str) {
        Logger logger = f142688a;
        qg.a aVar = new qg.a(new StringReader(str));
        try {
            Object objB = b(aVar);
            try {
                return objB;
            } catch (IOException e) {
                return objB;
            }
        } finally {
            try {
                aVar.close();
            } catch (IOException e2) {
                logger.log(Level.WARNING, "Failed to close", (Throwable) e2);
            }
        }
    }

    public static Object b(qg.a aVar) throws IOException {
        Preconditions.checkState(aVar.n(), "unexpected end of JSON");
        switch (i2.f142679a[aVar.A().ordinal()]) {
            case 1:
                aVar.d();
                ArrayList arrayList = new ArrayList();
                while (aVar.n()) {
                    arrayList.add(b(aVar));
                }
                Preconditions.checkState(aVar.A() == qg.b.END_ARRAY, "Bad token: " + aVar.l(false));
                aVar.i();
                return Collections.unmodifiableList(arrayList);
            case 2:
                aVar.f();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (aVar.n()) {
                    linkedHashMap.put(aVar.u(), b(aVar));
                }
                Preconditions.checkState(aVar.A() == qg.b.END_OBJECT, "Bad token: " + aVar.l(false));
                aVar.j();
                return Collections.unmodifiableMap(linkedHashMap);
            case 3:
                return aVar.y();
            case 4:
                return Double.valueOf(aVar.r());
            case 5:
                return Boolean.valueOf(aVar.q());
            case 6:
                aVar.w();
                return null;
            default:
                throw new IllegalStateException("Bad token: " + aVar.l(false));
        }
    }
}
