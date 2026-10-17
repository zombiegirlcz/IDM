package lnb;

import com.revolut.feature.retail.savings.impl.documents.presentation.open_document.SavingsDocumentLauncherFlowContract$InputData;
import hnb.d;
import kotlin.jvm.internal.Intrinsics;
import lk4.g;
import lk7.m;
import oki.h;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements j {
    public final SavingsDocumentLauncherFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f197138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f197139q;

    public b(SavingsDocumentLauncherFlowContract$InputData inputData, d navigationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        this.o = inputData;
        this.f197138p = navigationProvider;
        this.f197139q = d8l.d.a(this, new m(28));
    }

    @Override // yki.j
    public final void M0() {
        l2(new kze.h(this, null, 28), new g(this, 15));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f197139q;
    }
}
