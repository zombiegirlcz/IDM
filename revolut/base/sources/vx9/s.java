package vx9;

import efm.d0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lra.d f292884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx9.a f292885b;

    public s(lra.d cardOwnersInteractor, kx9.a recentsDao) {
        Intrinsics.checkNotNullParameter(cardOwnersInteractor, "cardOwnersInteractor");
        Intrinsics.checkNotNullParameter(recentsDao, "recentsDao");
        this.f292884a = cardOwnersInteractor;
        this.f292885b = recentsDao;
    }

    @Override // vx9.t
    public final efm.b a(List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        d0 d0VarFirstOrError = m70.a.g(this.f292884a.c(), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        pfm.a aVar = new pfm.a(ue0.e.F(d0VarFirstOrError, f0.f322471a), new vx5.m(new vrl.n(transactions, this, 15), 25), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
