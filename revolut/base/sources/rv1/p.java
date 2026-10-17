package rv1;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.AliasType;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f257670w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, Continuation continuation) {
        super(2, continuation);
        this.f257670w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.f257670w, continuation);
        pVar.v = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((av1.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        av1.d dVar = (av1.d) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        final int i2 = 1;
        final r rVar = this.f257670w;
        if (i == 0) {
            yhm.o.b(obj2);
            vw1.b bVar = rVar.f257672a;
            this.v = dVar;
            this.u = 1;
            obj2 = ((uy1.j) bVar).g(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ArrayList arrayListE0 = d0.E0(dVar.f9874b, (Collection) obj2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayListE0) {
            if (Intrinsics.f(((Alias) obj3).f61880c, AliasStatus.ACTIVE.f61885b)) {
                arrayList.add(obj3);
            } else {
                arrayList2.add(obj3);
            }
        }
        final int i3 = 0;
        return new av1.h(dVar.f9873a, d0.P0(arrayList, new oh3.e(rVar, dVar, 22)), d0.P0(arrayList2, cim.b.a(new Function1() { // from class: rv1.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                int i5;
                Alias alias = (Alias) obj4;
                switch (i3) {
                    case 0:
                        AliasStatus aliasStatus = alias.f61880c;
                        rVar.getClass();
                        if (Intrinsics.f(aliasStatus, AliasStatus.AVAILABLE.f61886b)) {
                            i5 = 1;
                        } else if (Intrinsics.f(aliasStatus, AliasStatus.PENDING.f61890b)) {
                            i5 = 2;
                        } else if (Intrinsics.f(aliasStatus, AliasStatus.DISABLED.f61888b)) {
                            i5 = 3;
                        } else if (aliasStatus instanceof AliasStatus.OCCUPIED) {
                            i5 = 4;
                        } else if (Intrinsics.f(aliasStatus, AliasStatus.BLOCKED.f61887b)) {
                            i5 = 5;
                        } else {
                            if (!Intrinsics.f(aliasStatus, AliasStatus.ACTIVE.f61885b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i5 = 6;
                        }
                        return Integer.valueOf(i5);
                    default:
                        AliasType aliasType = alias.f61878a;
                        rVar.getClass();
                        return Integer.valueOf(r.d(aliasType));
                }
            }
        }, new Function1() { // from class: rv1.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                int i5;
                Alias alias = (Alias) obj4;
                switch (i2) {
                    case 0:
                        AliasStatus aliasStatus = alias.f61880c;
                        rVar.getClass();
                        if (Intrinsics.f(aliasStatus, AliasStatus.AVAILABLE.f61886b)) {
                            i5 = 1;
                        } else if (Intrinsics.f(aliasStatus, AliasStatus.PENDING.f61890b)) {
                            i5 = 2;
                        } else if (Intrinsics.f(aliasStatus, AliasStatus.DISABLED.f61888b)) {
                            i5 = 3;
                        } else if (aliasStatus instanceof AliasStatus.OCCUPIED) {
                            i5 = 4;
                        } else if (Intrinsics.f(aliasStatus, AliasStatus.BLOCKED.f61887b)) {
                            i5 = 5;
                        } else {
                            if (!Intrinsics.f(aliasStatus, AliasStatus.ACTIVE.f61885b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i5 = 6;
                        }
                        return Integer.valueOf(i5);
                    default:
                        AliasType aliasType = alias.f61878a;
                        rVar.getClass();
                        return Integer.valueOf(r.d(aliasType));
                }
            }
        })));
    }
}
