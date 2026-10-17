package uy1;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import f5j.r;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ f5j.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f284049w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f284050x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f5j.a aVar, String str, o oVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f284049w = str;
        this.f284050x = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f284049w, this.f284050x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a02.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        f5j.a aVar3 = this.v;
        Intrinsics.checkNotNullParameter(aVar3, "<this>");
        Map map = aVar3.u;
        String str = map != null ? (String) map.get("ALIAS_TYPE") : null;
        if (str != null) {
            a02.a[] aVarArrValues = a02.a.values();
            int length = aVarArrValues.length;
            for (int i2 = 0; i2 < length; i2++) {
                aVar = aVarArrValues[i2];
                if (a0.z(aVar.name(), str, true)) {
                    break;
                }
            }
            aVar = null;
        } else {
            aVar = null;
        }
        String strA = f5j.c.a(aVar3);
        if (aVar != null && strA != null) {
            String str2 = this.f284049w;
            ResolveAlias resolveAlias = new ResolveAlias(aVar, strA, str2 != null ? new ResolveAlias.ExpectedOverrides(str2) : null);
            this.u = 1;
            Object objA = this.f284050x.a(resolveAlias, this);
            return objA == aVar2 ? aVar2 : objA;
        }
        r rVar = aVar3.f132335l;
        Intrinsics.checkNotNullParameter(aVar3, "<this>");
        Map map2 = aVar3.u;
        String str3 = map2 != null ? (String) map2.get("ALIAS_TYPE") : null;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Trying to check Alias from beneficiary " + rVar + ", but required data is missing type = " + str3 + " value = " + f5j.c.a(aVar3));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        throw illegalArgumentException;
    }
}
