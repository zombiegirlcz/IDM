package zud;

import akg.n;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l10.m;
import skm.e0;
import skm.p0;
import w4l.h;
import wvd.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f325439a;

    public a(b autoStakingInteractor) {
        Intrinsics.checkNotNullParameter(autoStakingInteractor, "autoStakingInteractor");
        this.f325439a = autoStakingInteractor;
    }

    public final n a(xi0.b token) {
        Intrinsics.checkNotNullParameter(token, "token");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        b bVar = this.f325439a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(bVar.d.b(Unit.f186387a, loadingStrategy), new vgc.b(23, token));
    }

    public final Object b(xi0.b bVar, boolean z, i iVar) throws Throwable {
        b bVar2 = this.f325439a;
        bVar2.getClass();
        m mVar = new m(bVar2, bVar, z, (Continuation) null, 29);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, mVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
