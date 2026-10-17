package akl;

import com.revolut.sso.api.models.ConsentedClient;
import com.revolut.sso.impl.network.services.UserInfoService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jkl.u0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f5990w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(e1 e1Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f5990w = e1Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new a1(this.f5990w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new a1(this.f5990w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                kotlinx.coroutines.d dVar = skm.p0.f264003c;
                akb.s sVar = new akb.s(this.f5990w, null, 3);
                this.v = 1;
                Object objJ = skm.e0.J(dVar, sVar, this);
                return objJ == aVar ? aVar : objJ;
            default:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    UserInfoService userInfoService = this.f5990w.f6003a;
                    this.v = 1;
                    obj2 = userInfoService.getUserConsents(this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Iterable<jkl.u0> iterable = (Iterable) obj2;
                arrayList = new ArrayList(zhm.w.t(iterable, 10));
                for (jkl.u0 u0Var : iterable) {
                    Intrinsics.checkNotNullParameter(u0Var, "<this>");
                    String value = u0Var.getId();
                    Intrinsics.checkNotNullParameter(value, "value");
                    String name = u0Var.getName();
                    List consents = u0Var.getConsents();
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(consents, 10));
                    Iterator it8 = consents.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(yjl.l.a((u0.b) it8.next()));
                    }
                    arrayList.add(new ConsentedClient(value, name, arrayList2, u0Var.getCreatedAt(), u0Var.getLastUsedAt(), u0Var.getIconUri()));
                }
                return arrayList;
        }
    }
}
