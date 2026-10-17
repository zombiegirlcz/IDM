package lm3;

import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.contacts.impl.ui_kompot.add_contact.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            kgm.i iVar = aVar2.f66020q;
            this.u = 1;
            obj2 = iVar.l(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        vm3.c phoneInfo = (vm3.c) obj2;
        if (phoneInfo == null) {
            throw new IllegalStateException("Failed to retrieve phone info");
        }
        pm3.b bVar = aVar2.f66019p;
        AddContactInputData.Prefill prefill = aVar2.o.f65972a.getF65975a();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(prefill, "prefill");
        Intrinsics.checkNotNullParameter(phoneInfo, "phoneInfo");
        if (Intrinsics.f(prefill, AddContactInputData.Prefill.None.f65978a) || (prefill instanceof AddContactInputData.Prefill.Email)) {
            pair = new Pair(phoneInfo, "");
        } else {
            if (!(prefill instanceof AddContactInputData.Prefill.Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((AddContactInputData.Prefill.Phone) prefill).f65979a;
            z80.b bVar2 = bVar.f237472a;
            fj0.c cVarM = bVar2.m(str, phoneInfo.f290524a.f297794a);
            if (cVarM != null) {
                int i2 = cVarM.f135519a;
                wi0.b bVarD = bVar2.d(i2);
                fj0.b.Companion.getClass();
                Serializable serializableA = fj0.a.a(i2);
                m.Companion companion = yhm.m.INSTANCE;
                if (serializableA instanceof yhm.n) {
                    serializableA = null;
                }
                fj0.b bVar3 = (fj0.b) serializableA;
                vm3.c cVar = bVar3 != null ? new vm3.c(bVar3.f135518a, bVarD) : null;
                if (cVar != null) {
                    phoneInfo = cVar;
                }
                pair = new Pair(phoneInfo, cVarM.f135520b);
            } else {
                pair = new Pair(phoneInfo, str);
            }
        }
        aVar2.H2(aVar2.f66025x, new llh.j((vm3.c) pair.f186385a, (String) pair.f186386b, 2));
        return Unit.f186387a;
    }
}
