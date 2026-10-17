package eql;

import android.content.Intent;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends yji.d implements hjl.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hjl.e f128508c;

    public k(hjl.e modelExtension) {
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f128508c = modelExtension;
    }

    @Override // yji.d
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        c0 c0Var = (c0) this.f128508c;
        if (c0Var.f128497t.a() && i == 1998) {
            ug0.e eVarA = c0Var.f128496s.a(intent);
            if (eVarA instanceof ug0.a) {
                return;
            }
            if (eVarA instanceof ug0.b) {
                Exception exc2 = ((ug0.b) eVarA).f279915a;
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, exc2, h0Var);
                c0Var.L2(((jol.c) c0Var.f128491m).e("GENERIC_ERROR"));
                return;
            }
            if (eVarA instanceof ug0.d) {
                c0Var.h3(true, hjl.c.GOOGLE, new v(c0Var, ((ug0.d) eVarA).f279918b, null));
            } else if (!eVarA.equals(ug0.c.f279916a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
