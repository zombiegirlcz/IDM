package sq5;

import cli.y;
import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.d0;
import vkm.j2;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f265013w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f265013w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f265013w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f265013w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((pd5.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        int i = this.u;
        q qVar = this.f265013w;
        switch (i) {
            case 0:
                y yVar = qVar.f265017s;
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean zW = d0.W(str);
                qVar.H2(yVar, new ard.t(str, !zW, !zW ? q.I2(qVar, ((c) ((j2) yVar.f22677a).getValue()).f265001b, str) : f0.f322471a, !zW ? q.I2(qVar, ((c) ((j2) yVar.f22677a).getValue()).f265002c, str) : f0.f322471a, 27));
                break;
            default:
                CryptoAddressHostingPickerContract$InputData cryptoAddressHostingPickerContract$InputData = qVar.f265014p;
                g gVar = qVar.o;
                pd5.d dVar = (pd5.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                Ref$ObjectRef ref$ObjectRefW = p.a.w(obj2);
                List list = (List) dVar.f235099h.f235101a.get(CryptoAddressHostingProviderType.WALLET);
                ArrayList arrayList2 = null;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((t) gVar).g((pd5.a) it8.next(), CryptoAddressHostingProviderType.WALLET));
                    }
                } else {
                    arrayList = null;
                }
                ref$ObjectRefW.f186409a = arrayList;
                if (arrayList != null && cryptoAddressHostingPickerContract$InputData.f71312a) {
                    ref$ObjectRefW.f186409a = ue0.e.J(((t) gVar).a(CryptoAddressHostingProviderType.WALLET), (List) ref$ObjectRefW.f186409a);
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                List list3 = (List) dVar.f235099h.f235101a.get(CryptoAddressHostingProviderType.EXCHANGE);
                if (list3 != null) {
                    List list4 = list3;
                    arrayList2 = new ArrayList(w.t(list4, 10));
                    Iterator it9 = list4.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(((t) gVar).g((pd5.a) it9.next(), CryptoAddressHostingProviderType.EXCHANGE));
                    }
                }
                ref$ObjectRef.f186409a = arrayList2;
                if (arrayList2 != null && cryptoAddressHostingPickerContract$InputData.f71312a) {
                    ref$ObjectRef.f186409a = ue0.e.J(((t) gVar).a(CryptoAddressHostingProviderType.EXCHANGE), (List) ref$ObjectRef.f186409a);
                }
                qVar.H2(qVar.f265017s, new ay0.b(ref$ObjectRefW, ref$ObjectRef, 1));
                break;
        }
        return Unit.f186387a;
    }
}
