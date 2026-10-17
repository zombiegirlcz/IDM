package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile q f49400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f49401c = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f49402a = Collections.EMPTY_MAP;

    public static q a() {
        q qVar;
        q qVar2 = f49400b;
        if (qVar2 != null) {
            return qVar2;
        }
        synchronized (q.class) {
            try {
                qVar = f49400b;
                if (qVar == null) {
                    Class cls = p.f49396a;
                    q qVar3 = null;
                    if (cls != null) {
                        try {
                            qVar3 = (q) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    qVar = qVar3 != null ? qVar3 : f49401c;
                    f49400b = qVar;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return qVar;
    }
}
