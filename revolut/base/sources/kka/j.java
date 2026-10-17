package kka;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.y;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ska.e f184567a;

    public j(ska.e productArticleConfigRepository) {
        Intrinsics.checkNotNullParameter(productArticleConfigRepository, "productArticleConfigRepository");
        this.f184567a = productArticleConfigRepository;
    }

    public final Object a(gim.i iVar) {
        ska.e eVar = this.f184567a;
        eVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar = eVar.e;
        Unit unit = Unit.f186387a;
        Object objX = q.x(mo3.a.g(new y(cVar.b(unit, loadingStrategy), new ie6.q(2, 12, null)), null, i.f184566a, 1), iVar);
        return objX == fim.a.COROUTINE_SUSPENDED ? objX : unit;
    }
}
