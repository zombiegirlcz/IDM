package bek;

import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.pod_nominees.impl.data.network.PodNomineesService;
import gim.i;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ Address A;
    public final /* synthetic */ g B;
    public final /* synthetic */ String C;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ LocalDate f14867y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, String str2, LocalDate localDate, String str3, Address address, g gVar, String str4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14865w = str;
        this.f14866x = str2;
        this.f14867y = localDate;
        this.z = str3;
        this.A = address;
        this.B = gVar;
        this.C = str4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f14865w, this.f14866x, this.f14867y, this.z, this.A, this.B, this.C, continuation, 0);
            default:
                return new f(this.f14865w, this.f14866x, this.f14867y, this.z, this.A, this.B, this.C, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                g gVar = this.B;
                if (i == 0) {
                    o.b(obj2);
                    String string = this.f14867y.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    Address address = this.A;
                    fek.c cVar = new fek.c(this.f14865w, this.f14866x, string, this.z, address != null ? oo3.a.d(address) : null);
                    PodNomineesService podNomineesService = gVar.f14868a;
                    this.v = 1;
                    obj2 = podNomineesService.addPodNominees(this.C, cVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Iterable iterable = (Iterable) obj2;
                ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList.add(eek.a.b((fek.b) it8.next()));
                }
                w4l.f fVar = gVar.f14870c;
                Unit unit = Unit.f186387a;
                fVar.j(unit, arrayList);
                return unit;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                g gVar2 = this.B;
                if (i2 == 0) {
                    o.b(obj2);
                    String string2 = this.f14867y.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Address address2 = this.A;
                    fek.c cVar2 = new fek.c(this.f14865w, this.f14866x, string2, this.z, address2 != null ? oo3.a.d(address2) : null);
                    PodNomineesService podNomineesService2 = gVar2.f14868a;
                    this.v = 1;
                    obj2 = podNomineesService2.editPodNominees(this.C, cVar2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Iterable iterable2 = (Iterable) obj2;
                ArrayList arrayList2 = new ArrayList(w.t(iterable2, 10));
                Iterator it9 = iterable2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(eek.a.b((fek.b) it9.next()));
                }
                w4l.f fVar2 = gVar2.f14870c;
                Unit unit2 = Unit.f186387a;
                fVar2.j(unit2, arrayList2);
                return unit2;
        }
    }
}
