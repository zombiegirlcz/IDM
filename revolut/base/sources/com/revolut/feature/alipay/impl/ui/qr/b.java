package com.revolut.feature.alipay.impl.ui.qr;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.alipay.impl.ui.qr.AlipayPlusQrFlowContract$Page;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.q3;
import vk1.h;
import vk1.l;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements n {
    @Override // cli.n
    public final o c(j jVar) {
        Clause clause;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<AlipayPlusQrFlowContract$Page> list = domainState.f289850a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (AlipayPlusQrFlowContract$Page alipayPlusQrFlowContract$Page : list) {
            String d = alipayPlusQrFlowContract$Page.getD();
            if (alipayPlusQrFlowContract$Page.equals(AlipayPlusQrFlowContract$Page.Scanner.f61071a)) {
                clause = domainState.f289852c;
            } else {
                if (!alipayPlusQrFlowContract$Page.equals(AlipayPlusQrFlowContract$Page.ShowCode.f61072a)) {
                    throw new NoWhenBranchMatchedException();
                }
                clause = domainState.d;
            }
            arrayList.add(new q3(clause, d));
        }
        String str = domainState.f289851b;
        if (str == null) {
            str = "";
        }
        return new l(str, arrayList, domainState.e);
    }
}
