package rvf;

import com.revolut.core.error.data.model.ServerError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import nii.y0;
import nii.z;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable p0 = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        i iVar = (i) this.receiver;
        v60.e eVar = iVar.f257778n;
        j60.a.v(iVar.o, false, null, 3);
        ServerError serverErrorA = iVar.f257777m.a(p0);
        v60.d dVarB = ((ao0.a) eVar).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
        if (dVarB == null) {
            dVarB = new v60.b();
        }
        n.j2(iVar, iVar.L2(new y0("ERROR_DIALOG_ID", new z(ofm.q.O(dVarB), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, 7);
        return Boolean.TRUE;
    }
}
