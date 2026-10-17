package grl;

import com.revolut.tracking.v3.RawEvent;
import com.revolut.tracking.v3.RecordEventResponse;

/* JADX INFO: loaded from: classes13.dex */
public final class c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ecm.p1 f146070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ecm.c2 f146071b;

    private c7() {
    }

    public static ecm.p1 a() {
        ecm.p1 p1Var;
        ecm.p1 p1Var2 = f146070a;
        if (p1Var2 != null) {
            return p1Var2;
        }
        synchronized (c7.class) {
            try {
                p1Var = f146070a;
                if (p1Var == null) {
                    ecm.o1 o1Var = ecm.o1.UNARY;
                    String strA = ecm.p1.a("revolut.tracking.MobileTracker", "RecordRawEvent");
                    RawEvent defaultInstance = RawEvent.getDefaultInstance();
                    com.google.protobuf.d0 d0Var = kcm.c.f182755a;
                    ecm.p1 p1Var3 = new ecm.p1(o1Var, strA, new kcm.b(defaultInstance), new kcm.b(RecordEventResponse.getDefaultInstance()));
                    f146070a = p1Var3;
                    p1Var = p1Var3;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return p1Var;
    }
}
