package bq5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingCheckResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a f17756w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i, com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f17756w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u0 u0Var = new u0(0, this.f17756w, continuation);
                u0Var.v = obj2;
                return u0Var;
            case 1:
                u0 u0Var2 = new u0(1, this.f17756w, continuation);
                u0Var2.v = obj2;
                return u0Var2;
            case 2:
                u0 u0Var3 = new u0(2, this.f17756w, continuation);
                u0Var3.v = obj2;
                return u0Var3;
            case 3:
                u0 u0Var4 = new u0(3, this.f17756w, continuation);
                u0Var4.v = obj2;
                return u0Var4;
            case 4:
                u0 u0Var5 = new u0(4, this.f17756w, continuation);
                u0Var5.v = obj2;
                return u0Var5;
            case 5:
                u0 u0Var6 = new u0(5, this.f17756w, continuation);
                u0Var6.v = obj2;
                return u0Var6;
            case 6:
                u0 u0Var7 = new u0(6, this.f17756w, continuation);
                u0Var7.v = obj2;
                return u0Var7;
            case 7:
                u0 u0Var8 = new u0(7, this.f17756w, continuation);
                u0Var8.v = obj2;
                return u0Var8;
            case 8:
                u0 u0Var9 = new u0(8, this.f17756w, continuation);
                u0Var9.v = obj2;
                return u0Var9;
            case 9:
                u0 u0Var10 = new u0(9, this.f17756w, continuation);
                u0Var10.v = obj2;
                return u0Var10;
            default:
                u0 u0Var11 = new u0(10, this.f17756w, continuation);
                u0Var11.v = obj2;
                return u0Var11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u0) create((kn5.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((u0) create((wk5.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((u0) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((u0) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((u0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((u0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((u0) create((vf0.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((u0) create((q0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((u0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u0) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        wk5.a aVar;
        int i = this.u;
        int i2 = 3;
        int i3 = 10;
        boolean z = false;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar2 = this.f17756w;
        switch (i) {
            case 0:
                kn5.f fVar = (kn5.f) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar2.H2(aVar2.C, new bhl.g(fVar, 27));
                break;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wk5.a aVar5 = (wk5.a) pair.f186385a;
                wk5.a aVar6 = (wk5.a) pair.f186386b;
                if (aVar6 == wk5.a.BITCOIN && aVar5 == (aVar = wk5.a.BITCOINCASH)) {
                    aVar6 = aVar;
                }
                aVar2.H2(aVar2.C, new bcj.i(aVar6, 2));
                break;
            case 2:
                wk5.a aVar7 = (wk5.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar2.H2(aVar2.C, new bcj.i(aVar7, i2));
                break;
            case 3:
                xi0.b bVar = (xi0.b) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar2.H2(aVar2.C, new a94.q(i3, bVar));
                break;
            case 4:
                z zVar = (z) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar2.H2(aVar2.C, new bhl.g(zVar, 28));
                break;
            case 5:
                Data data = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar2.H2(aVar2.C, new bmj.g(data, 3));
                break;
            case 6:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = (String) rVar.f314201a;
                String str2 = (String) rVar.f314202b;
                String str3 = (String) rVar.f314203c;
                com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar13 = this.f17756w;
                aVar13.H2(aVar13.C, new a5b.b(aVar13, str, str2, str3, 11));
                break;
            case 7:
                vf0.k kVar = (vf0.k) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kn5.f fVar2 = (kn5.f) kVar.f288454a;
                z zVar2 = (z) kVar.f288455b;
                CryptoAddressRecipientDetails cryptoAddressRecipientDetails = (CryptoAddressRecipientDetails) kVar.f288456c;
                Data data2 = (Data) kVar.d;
                String str4 = (String) kVar.e;
                if (fVar2.equals(kn5.c.f186000a) && cryptoAddressRecipientDetails != null && zVar2.c()) {
                    CryptoAddressHostingCheckResult cryptoAddressHostingCheckResult = (CryptoAddressHostingCheckResult) data2.getContent();
                    if ((!aVar2.o.f71222a.a(c0.HOSTING_DROPDOWN) || com.revolut.feature.crypto.withdraw.api.models.a.a(cryptoAddressHostingCheckResult) != null) && str4.length() <= 25) {
                        z = true;
                    }
                }
                aVar2.H2(aVar2.C, new a2g.p(z, 21));
                break;
            case 8:
                q0 q0Var = (q0) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar2.H2(aVar2.C, new bnj.n(aVar2, q0Var, i3));
                break;
            case 9:
                Data data3 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar2.H2(aVar2.C, new bmj.g(data3, 4));
                break;
            default:
                nii.n1 n1Var = (nii.n1) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof nii.m1) {
                    aVar2.C2(new g0("topic.withdrawing-cryptocurrencies", false));
                }
                break;
        }
        return Unit.f186387a;
    }
}
