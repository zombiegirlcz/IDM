package com.revolut.core.backend_flow.impl.internal_flow;

import com.revolut.core.backend_flow.impl.internal_flow.InternalBackendFlowContract$Step;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.flow.BackStackEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nkm.t;
import nkm.y;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {
    public static final ArrayList a(BackendFlow backendFlow) {
        Intrinsics.checkNotNullParameter(backendFlow, "<this>");
        List listI0 = d0.I0(y.J(y.m(t.g(ta6.a.r(backendFlow), new la0.a(backendFlow, 0)), 1)));
        ArrayList arrayList = new ArrayList(w.t(listI0, 10));
        Iterator it8 = listI0.iterator();
        while (it8.hasNext()) {
            arrayList.add(new BackStackEntry(new InternalBackendFlowContract$Step.Screen(((BackendScreen) it8.next()).getId()), TransitionAnimation.SLIDE_END_TO_START.f98395a));
        }
        return arrayList;
    }
}
