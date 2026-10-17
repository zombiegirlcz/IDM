package cf6;

import bf6.f;
import com.revolut.data.network.models.openbanking.mapper.ExternalInstitutionDtoMapperKt;
import com.revolut.feature.external_accounts.impl.repository.network.CrossBorderOpenBankingService;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import se6.h;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f23559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f23560x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f23560x = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b bVar = new b(this.f23560x, continuation, 0);
                bVar.f23559w = str;
                return bVar.invokeSuspend(Unit.f186387a);
            default:
                b bVar2 = new b(this.f23560x, continuation, 1);
                bVar2.f23559w = str;
                return bVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.f23559w;
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    CrossBorderOpenBankingService crossBorderOpenBankingService = this.f23560x.f23564a;
                    this.f23559w = null;
                    this.v = 1;
                    obj2 = crossBorderOpenBankingService.getBranches(str, this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                Iterable<ze6.b> iterable = (Iterable) obj2;
                arrayList = new ArrayList(w.t(iterable, 10));
                for (ze6.b dto : iterable) {
                    Intrinsics.checkNotNullParameter(dto, "dto");
                    arrayList.add(new h(dto.getId(), dto.getName(), ExternalInstitutionDtoMapperKt.toDomain(dto.getLogo())));
                }
                return arrayList;
            default:
                String str2 = this.f23559w;
                Object arrayList2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                e eVar = this.f23560x;
                if (i2 == 0) {
                    o.b(obj2);
                    CrossBorderOpenBankingService crossBorderOpenBankingService2 = eVar.f23564a;
                    this.f23559w = null;
                    this.v = 1;
                    obj2 = crossBorderOpenBankingService2.getCountryDepartments(str2, this);
                    if (obj2 != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                Iterable iterable2 = (Iterable) obj2;
                f fVar = eVar.d;
                arrayList2 = new ArrayList(w.t(iterable2, 10));
                Iterator it8 = iterable2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(fVar.a((ze6.c) it8.next()));
                }
                return arrayList2;
        }
    }
}
