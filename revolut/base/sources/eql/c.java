package eql;

import android.content.Intent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends yji.d implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f128490c;

    public c(i modelExtension) {
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        this.f128490c = modelExtension;
    }

    @Override // yji.d
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        if (i == 1998) {
            j jVar = (j) this.f128490c;
            if (jVar.f128507n.a()) {
                ug0.e eVarA = jVar.f128506m.a(intent);
                if (eVarA instanceof ug0.a) {
                    jVar.d3(new eqd.h(3));
                    return;
                }
                if (eVarA instanceof ug0.b) {
                    jVar.d3(new eq4.g((ug0.b) eVarA, 6));
                } else if (eVarA instanceof ug0.d) {
                    jVar.d3(new eq4.g((ug0.d) eVarA, 7));
                } else if (!(eVarA instanceof ug0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }
}
