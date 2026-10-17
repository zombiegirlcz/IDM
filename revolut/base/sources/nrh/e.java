package nrh;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import gim.i;
import iuf.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n14.k;
import nii.f;
import nii.g;
import nii.h;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.wealth_protection.sso.impl.ui.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f218648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f218649x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f218650y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.wealth_protection.sso.impl.ui.a aVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f218648w = str;
        this.f218649x = str2;
        this.f218650y = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f218648w, this.f218649x, this.f218650y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.wealth_protection.sso.impl.ui.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.wealth_protection.sso.impl.ui.a aVar3 = this.v;
        if (i == 0) {
            o.b(obj2);
            lic.a aVar4 = new lic.a(aVar3, 4);
            y yVar = new y(aVar3, 12);
            d dVar = new d(aVar3, this.f218648w, this.f218649x, this.f218650y, null);
            this.u = 1;
            obj2 = k.V(aVar3, null, aVar4, yVar, dVar, this, 1);
            aVar = aVar3;
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            aVar = aVar3;
        }
        h hVar = (h) obj2;
        if (hVar instanceof f) {
            aVar.I2();
            return Unit.f186387a;
        }
        if (hVar instanceof g) {
            return aVar.C1(new BridgeDestination(aVar.f96321t.d));
        }
        throw new NoWhenBranchMatchedException();
    }
}
