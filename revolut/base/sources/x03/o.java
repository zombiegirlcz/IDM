package x03;

import com.revolut.core.model.account.AccountId;
import h93.f0;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z03.c f301478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f301479c;
    public final /* synthetic */ AccountId d;

    public /* synthetic */ o(z03.c cVar, f0 f0Var, AccountId accountId, int i) {
        this.f301477a = i;
        this.f301478b = cVar;
        this.f301479c = f0Var;
        this.d = accountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        od0.i it8 = (od0.i) obj2;
        switch (this.f301477a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                final e93.f fVar = (e93.f) it8.f224257a;
                final z03.c cVar = this.f301478b;
                cVar.getClass();
                final f0 card = this.f301479c;
                Intrinsics.checkNotNullParameter(card, "card");
                final AccountId accountId = this.d;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                final int i = 0;
                ufm.c cVar2 = new ufm.c(new Callable() { // from class: z03.b
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i) {
                            case 0:
                                e93.f fVar2 = fVar;
                                return cVar.a(card, accountId, wy2.d.DAMAGED, fVar2).a();
                            default:
                                e93.f fVar3 = fVar;
                                return cVar.a(card, accountId, wy2.d.NEVER_RECEIVED, fVar3).a();
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                return cVar2;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                final e93.f fVar2 = (e93.f) it8.f224257a;
                final z03.c cVar3 = this.f301478b;
                cVar3.getClass();
                final f0 card2 = this.f301479c;
                Intrinsics.checkNotNullParameter(card2, "card");
                final AccountId accountId2 = this.d;
                Intrinsics.checkNotNullParameter(accountId2, "accountId");
                final int i2 = 1;
                ufm.c cVar4 = new ufm.c(new Callable() { // from class: z03.b
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i2) {
                            case 0:
                                e93.f fVar22 = fVar2;
                                return cVar3.a(card2, accountId2, wy2.d.DAMAGED, fVar22).a();
                            default:
                                e93.f fVar3 = fVar2;
                                return cVar3.a(card2, accountId2, wy2.d.NEVER_RECEIVED, fVar3).a();
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(cVar4, "fromCallable(...)");
                return cVar4;
        }
    }
}
