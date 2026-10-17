package t90;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q90.m4;
import xl2.c0;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e84.e f268940a;

    public g(e84.e screensMappersProvider) {
        Intrinsics.checkNotNullParameter(screensMappersProvider, "screensMappersProvider");
        this.f268940a = screensMappersProvider;
    }

    public final BackendFlow a(q90.i flow) {
        String str;
        String strB;
        Intrinsics.checkNotNullParameter(flow, "flow");
        List<m4> listH = flow.getViews();
        ArrayList arrayList = new ArrayList(w.t(listH, 10));
        for (m4 m4Var : listH) {
            arrayList.add(this.f268940a.e(m4Var).a(m4Var));
        }
        String strG = flow.getVersion();
        String strC = flow.getId();
        String strD = flow.getName();
        String strF = flow.getState();
        c0 c0Var = (!Intrinsics.f(strF, "INCOMPLETE") && Intrinsics.f(strF, "COMPLETE")) ? c0.COMPLETE : c0.INCOMPLETE;
        c0 c0Var2 = c0Var;
        String strB2 = flow.getCurrentViewId();
        if (strB2 != null) {
            str = strB2;
        } else {
            m4 m4Var2 = (m4) d0.d0(flow.getViews());
            if (m4Var2 != null) {
                strB2 = m4Var2.getF63342a();
                str = strB2;
            } else {
                str = null;
            }
        }
        String strB3 = flow.getCurrentViewId();
        if (strB3 == null) {
            m4 m4Var3 = (m4) d0.d0(flow.getViews());
            strB = m4Var3 != null ? m4Var3.getF63342a() : null;
        } else {
            strB = strB3;
        }
        Map mapE = flow.getParameters();
        if (mapE == null) {
            mapE = r0.g();
        }
        Map map = mapE;
        Map mapA = flow.getAttributes();
        if (mapA == null) {
            mapA = r0.g();
        }
        return new BackendFlow(c0Var2, strC, strD, strG, arrayList, str, strB, map, mapA);
    }

    public final q90.i b(BackendFlow flow) {
        String str;
        Intrinsics.checkNotNullParameter(flow, "flow");
        List<BackendScreen> e = flow.getE();
        ArrayList arrayList = new ArrayList(w.t(e, 10));
        for (BackendScreen backendScreen : e) {
            arrayList.add(this.f268940a.d(backendScreen).b(backendScreen));
        }
        String f63265c = flow.getF63265c();
        String f63264b = flow.getF63264b();
        String d = flow.getD();
        int i = f.f268939a[flow.getF63263a().ordinal()];
        if (i == 1) {
            str = "INCOMPLETE";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "COMPLETE";
        }
        return new q90.i(f63264b, d, str, f63265c, arrayList, flow.getF63266g(), flow.getF63267h(), flow.getI());
    }
}
