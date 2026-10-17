package ypg;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ryc.a f315877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f315878c;

    public /* synthetic */ j(ryc.a aVar, s sVar, int i) {
        this.f315876a = i;
        this.f315877b = aVar;
        this.f315878c = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        s sVar;
        Object next;
        String str;
        switch (this.f315876a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (!(error instanceof NoSuchElementException)) {
                    ufm.c cVarL = d0.l(error);
                    Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                    return cVarL;
                }
                z71.a aVar = (z71.a) this.f315877b.f258290b;
                xi0.a aVar2 = xi0.b.Companion;
                String currency = this.f315878c.getCurrency();
                aVar2.getClass();
                return z71.a.c(aVar, xi0.a.a(currency), null, 6);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                fo3.c cVar = (fo3.c) pair.f186385a;
                Iterator it8 = ((List) pair.f186386b).iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    sVar = this.f315878c;
                    if (zHasNext) {
                        next = it8.next();
                        io3.d dVar = (io3.d) next;
                        if (!Intrinsics.f(dVar.f163147c, sVar.getCurrency()) || dVar.e != io3.l.CURRENT) {
                        }
                    } else {
                        next = null;
                    }
                }
                io3.d dVar2 = (io3.d) next;
                if (dVar2 != null && (str = dVar2.f163145a) != null) {
                    ufm.b bVarM = d0.m(str);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                z71.a aVar3 = (z71.a) this.f315877b.f258290b;
                AccountId accountIdA = xpg.a.a(sVar, cVar);
                xi0.a aVar4 = xi0.b.Companion;
                String currency2 = sVar.getCurrency();
                aVar4.getClass();
                return z71.a.c(aVar3, xi0.a.a(currency2), accountIdA, 4);
        }
    }
}
