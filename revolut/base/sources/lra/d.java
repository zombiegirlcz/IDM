package lra;

import ecm.q;
import efm.d0;
import eli.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lqa.f;
import lr9.m;
import pfm.r;
import te0.w;
import ufm.i;
import ufm.n;
import xo8.u;
import xra.g;
import xra.h;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f199477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gqa.b f199478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f199479c;
    public final j d;

    public d(h cardOwnersRepository, gqa.b pushToCardStatusChecker, q addCardRepository, j twoFaErrorHandler) {
        Intrinsics.checkNotNullParameter(cardOwnersRepository, "cardOwnersRepository");
        Intrinsics.checkNotNullParameter(pushToCardStatusChecker, "pushToCardStatusChecker");
        Intrinsics.checkNotNullParameter(addCardRepository, "addCardRepository");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        this.f199477a = cardOwnersRepository;
        this.f199478b = pushToCardStatusChecker;
        this.f199479c = addCardRepository;
        this.d = twoFaErrorHandler;
    }

    public final r a(String cardOwnerId) {
        Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
        h hVar = this.f199477a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
        efm.b bVarDeleteCardOwner = hVar.f308312a.deleteCardOwner(cardOwnerId);
        d0 d0VarFirstOrError = m70.a.g(zi0.c.J(hVar.f308316h.e(Unit.f186387a, w4l.j.f294644c)), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        u uVar = new u(12, new xpe.c(hVar, cardOwnerId, 8));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, uVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        pfm.a aVarE = bVarDeleteCardOwner.e(aVar);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return w.g0(aVarE);
    }

    public final efm.r b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        h hVar = this.f199477a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        return hVar.i.f(id10, false);
    }

    public final sfm.b c() {
        sfm.b bVar = new sfm.b(this.f199478b.a(), new m(new b(this, 0), 5), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final n d(String cardOwnerId, fqa.j request) {
        Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
        Intrinsics.checkNotNullParameter(request, "request");
        h hVar = this.f199477a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
        Intrinsics.checkNotNullParameter(request, "request");
        d0<f> d0VarUpdateCardOwner = hVar.f308312a.updateCardOwner(cardOwnerId, mra.h.a(request));
        g gVar = g.f;
        x2l.a aVar = new x2l.a(14);
        d0VarUpdateCardOwner.getClass();
        i iVar = new i(new i(d0VarUpdateCardOwner, aVar, 1), new u(17, new xra.a(hVar, 5)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return w.i0(iVar);
    }
}
