package y3f;

import com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n3f.c0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f310717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TradingTransactionsFilter f310718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f310719y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(v vVar, TradingTransactionsFilter tradingTransactionsFilter, String str, long j2, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.u = i2;
        this.f310717w = vVar;
        this.f310718x = tradingTransactionsFilter;
        this.f310719y = str;
        this.z = j2;
        this.A = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f310717w, this.f310718x, this.f310719y, this.z, this.A, continuation, 0);
            default:
                return new p(this.f310717w, this.f310718x, this.f310719y, this.z, this.A, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    j3f.f fVar = this.f310717w.e;
                    this.v = 1;
                    fVar.getClass();
                    obj2 = fVar.f(j3f.f.a(this.f310718x, this.f310719y, this.z, this.A, false), this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Iterable iterable = (Iterable) obj2;
                arrayList = new ArrayList(w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList.add(u3f.d.h((c0) it8.next()));
                }
                return arrayList;
            default:
                Object arrayList2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    j3f.f fVar2 = this.f310717w.e;
                    this.v = 1;
                    fVar2.getClass();
                    obj2 = fVar2.f(j3f.f.b(this.f310718x, this.f310719y, this.z, this.A), this);
                    if (obj2 != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Iterable iterable2 = (Iterable) obj2;
                arrayList2 = new ArrayList(w.t(iterable2, 10));
                Iterator it9 = iterable2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(u3f.d.h((c0) it9.next()));
                }
                return arrayList2;
        }
    }
}
