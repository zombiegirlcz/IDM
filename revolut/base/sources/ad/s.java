package ad;

import java.nio.charset.Charset;
import md.f2;
import md.g2;
import md.i2;
import md.j2;
import md.k2;
import md.l2;
import md.w1;
import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3212a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static l2 a(g2 g2Var) {
        i2 i2VarY = l2.y();
        int iA = g2Var.A();
        i2VarY.e();
        l2.v((l2) i2VarY.f49436b, iA);
        for (f2 f2Var : g2Var.z()) {
            j2 j2VarA = k2.A();
            String strA = f2Var.z().A();
            j2VarA.e();
            k2.v((k2) j2VarA.f49436b, strA);
            w1 w1VarC = f2Var.C();
            j2VarA.e();
            k2.x((k2) j2VarA.f49436b, w1VarC);
            w2 w2VarB = f2Var.B();
            j2VarA.e();
            k2.w((k2) j2VarA.f49436b, w2VarB);
            int iA2 = f2Var.A();
            j2VarA.e();
            k2.y((k2) j2VarA.f49436b, iA2);
            k2 k2Var = (k2) j2VarA.a();
            i2VarY.e();
            l2.w((l2) i2VarY.f49436b, k2Var);
        }
        return (l2) i2VarY.a();
    }
}
