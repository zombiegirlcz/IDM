package mak;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import j7a.j;
import kl.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lrk.h;
import m08.i;
import m3j.l;
import ma1.v;
import te0.s;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final iak.b f204048j;
    public final l k;

    public d(iak.b presentationModel, l beneficiaryDetailsViewMapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(beneficiaryDetailsViewMapper, "beneficiaryDetailsViewMapper");
        this.f204048j = presentationModel;
        this.k = beneficiaryDetailsViewMapper;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        b view = (b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        r map = ((iak.a) this.f204048j.f160044a).w0().c(s.f270018a).map(new v(11, new h(1, this.k, y2j.c.class, "mapToDetailsItems", "mapToDetailsItems(Lcom/revolut/retail/feature/beneficiary/models/Beneficiary;)Ljava/util/List;", 0, 18))).map(new v(12, new m9l.d(21)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        h hVar = new h(1, view, b.class, "setItems", "setItems(Ljava/util/List;)V", 0, 19);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = map.onErrorResumeNext(new c0(new i(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.s(25, hVar), new a08.s(25, this.i), new j(9, function0J));
        w.j0(this.f239031a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
