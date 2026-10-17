package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class en0 implements ic1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f28206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj f28207b;

    public en0(Function0 workflowIdProvider, gj documentBundle) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(documentBundle, "documentBundle");
        this.f28206a = workflowIdProvider;
        this.f28207b = documentBundle;
    }

    @Override // com.fourthline.orca.internal.ic1
    public /* bridge */ h10 a(ny nyVar) {
        return super.a(nyVar);
    }

    @Override // com.fourthline.orca.internal.ic1
    public h10 a() {
        List listC = zhm.u.c(rc1.i);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            i10 i10VarA = hj.a(this.f28207b, (String) this.f28206a.invoke(), (rc1) it8.next());
            if (i10VarA != null) {
                arrayList.add(i10VarA);
            }
        }
        return new h10(listC, arrayList, null, null, 12, null);
    }
}
