package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f124789h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f124790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f124791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[][] f124792c;
    public final List d;
    public final Boolean e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f124793g;

    static {
        oe.c cVar = new oe.c();
        cVar.f224499c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        cVar.d = Collections.EMPTY_LIST;
        f124789h = new d(cVar);
    }

    public d(oe.c cVar) {
        this.f124790a = (w) cVar.f224497a;
        this.f124791b = (Executor) cVar.f224498b;
        this.f124792c = (Object[][]) cVar.f224499c;
        this.d = (List) cVar.d;
        this.e = (Boolean) cVar.e;
        this.f = (Integer) cVar.f;
        this.f124793g = (Integer) cVar.f224500g;
    }

    public static oe.c b(d dVar) {
        oe.c cVar = new oe.c();
        cVar.f224497a = dVar.f124790a;
        cVar.f224498b = dVar.f124791b;
        cVar.f224499c = dVar.f124792c;
        cVar.d = dVar.d;
        cVar.e = dVar.e;
        cVar.f = dVar.f;
        cVar.f224500g = dVar.f124793g;
        return cVar;
    }

    public final Object a(c cVar) {
        Preconditions.checkNotNull(cVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f124792c;
            if (i >= objArr.length) {
                cVar.getClass();
                return null;
            }
            if (cVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final d c(c cVar, Object obj2) {
        Object[][] objArr;
        Preconditions.checkNotNull(cVar, "key");
        Preconditions.checkNotNull(obj2, "value");
        oe.c cVarB = b(this);
        int i = 0;
        while (true) {
            objArr = this.f124792c;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (cVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i == -1 ? 1 : 0), 2);
        cVarB.f224499c = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i == -1) {
            ((Object[][]) cVarB.f224499c)[objArr.length] = new Object[]{cVar, obj2};
        } else {
            ((Object[][]) cVarB.f224499c)[i] = new Object[]{cVar, obj2};
        }
        return new d(cVarB);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperAdd = MoreObjects.toStringHelper(this).add("deadline", this.f124790a).add("authority", (Object) null).add("callCredentials", (Object) null);
        Executor executor = this.f124791b;
        return toStringHelperAdd.add("executor", executor != null ? executor.getClass() : null).add("compressorName", (Object) null).add("customOptions", Arrays.deepToString(this.f124792c)).add("waitForReady", Boolean.TRUE.equals(this.e)).add("maxInboundMessageSize", this.f).add("maxOutboundMessageSize", this.f124793g).add("onReadyThreshold", (Object) null).add("streamTracerFactories", this.d).toString();
    }
}
