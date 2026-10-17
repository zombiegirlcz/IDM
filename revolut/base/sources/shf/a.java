package shf;

import com.revolut.core.model.account.AccountId;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import njf.j;
import skm.p0;
import sqd.h0;
import te0.w;
import tif.g;
import tj9.d;
import tjf.l0;
import tof.i7;
import ufm.b;
import zhm.f0;
import zi0.c;
import zsc.h;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    static r a(a aVar, i7 customFilter, String searchQuery, int i, h hVar, AccountId.Joint joint, int i2) {
        r rVarB;
        Continuation continuation = null;
        if ((i2 & 8) != 0) {
            hVar = null;
        }
        AccountId accountId = joint;
        if ((i2 & 16) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        r remoteObservable = c.j(f0.f322471a);
        l0 l0Var = (l0) aVar;
        nhf.a aVar2 = l0Var.e;
        Intrinsics.checkNotNullParameter(customFilter, "customFilter");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        if (accountId instanceof AccountId.Personal) {
            rVarB = ((j) aVar2).f();
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarB = ((j) aVar2).b(accountId);
        }
        r rVar = rVarB;
        b bVarO0 = w.o0(p0.f264003c, new h0(l0Var, continuation, 29));
        tid.a aVar3 = new tid.a(new b6.a(l0Var, customFilter, searchQuery, i, hVar, remoteObservable), 24);
        int i3 = 2;
        sfm.b bVar = new sfm.b(bVarO0, aVar3, i3);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        r rVarCombineLatest = r.combineLatest(bVar, rVar, new tid.a(new d(i3), 25));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        r rVarPublish = rVarCombineLatest.publish(new tid.a(new g(11), 26));
        Intrinsics.checkNotNullExpressionValue(rVarPublish, "publish(...)");
        return rVarPublish;
    }
}
