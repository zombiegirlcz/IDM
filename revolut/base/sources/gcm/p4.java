package gcm;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class p4 extends ecm.b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f142828a = p1.d("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", true);

    @Override // ecm.s0
    public final ecm.a1 a(ecm.u0 u0Var) {
        return f142828a ? new j4(u0Var) : new o4(u0Var);
    }

    @Override // ecm.b1
    public final String b() {
        return "pick_first";
    }

    @Override // ecm.b1
    public final ecm.s1 c(Map map) {
        try {
            Boolean boolB = k2.b("shuffleAddressList", map);
            return new ecm.s1(f142828a ? new f4(boolB) : new m4(boolB));
        } catch (RuntimeException e) {
            return new ecm.s1(ecm.g2.f124807m.f(e).g("Failed parsing configuration for pick_first"));
        }
    }
}
