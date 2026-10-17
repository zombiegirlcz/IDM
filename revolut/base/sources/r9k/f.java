package r9k;

import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import j9k.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oim.o;
import zhm.c0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements o {
    public /* synthetic */ e7l.f A;
    public final /* synthetic */ k B;
    public final /* synthetic */ PeerToPeerRecipient C;
    public final /* synthetic */ TransferFlowType D;
    public final /* synthetic */ hrf.f E;
    public ArrayList u;
    public Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f252742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ dj0.d f252743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Data f252744y;
    public /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, PeerToPeerRecipient peerToPeerRecipient, TransferFlowType transferFlowType, hrf.f fVar, Continuation continuation) {
        super(5, continuation);
        this.B = kVar;
        this.C = peerToPeerRecipient;
        this.D = transferFlowType;
        this.E = fVar;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        TransferFlowType transferFlowType = this.D;
        hrf.f fVar = this.E;
        f fVar2 = new f(this.B, this.C, transferFlowType, fVar, (Continuation) obj6);
        fVar2.f252743x = (dj0.d) obj2;
        fVar2.f252744y = (Data) obj3;
        fVar2.z = (List) obj4;
        fVar2.A = (e7l.f) obj5;
        return fVar2.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Map map;
        ArrayList arrayList;
        dj0.d dVar = this.f252743x;
        Data data = this.f252744y;
        List list = this.z;
        e7l.f fVar = this.A;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f252742w;
        if (i == 0) {
            yhm.o.b(obj2);
            Intrinsics.h(list);
            ArrayList arrayListN = c0.N(list, WalletLimit.CounterLimit.class);
            map = fVar.W0;
            j9k.d dVar2 = this.B.f252753a;
            this.f252743x = dVar;
            this.f252744y = data;
            this.z = null;
            this.A = null;
            this.u = arrayListN;
            this.v = map;
            this.f252742w = 1;
            Object objF = ((p) dVar2).f(this.C, this.D, this.E, null, this);
            if (objF == aVar) {
                return aVar;
            }
            arrayList = arrayListN;
            obj2 = objF;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = this.v;
            arrayList = this.u;
            yhm.o.b(obj2);
        }
        return new d(arrayList, dVar, data, (Set) obj2, map);
    }
}
