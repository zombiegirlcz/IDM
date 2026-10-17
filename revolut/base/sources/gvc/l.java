package gvc;

import cli.y;
import cuc.z;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.secure_account.a f147135w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.security_hub.impl.ui.secure_account.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f147135w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f147135w, continuation, 0);
            default:
                return new l(this.f147135w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.security_hub.impl.ui.secure_account.a aVar = this.f147135w;
        switch (i) {
            case 0:
                y yVar = aVar.f85635t;
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    ArrayList arrayListU = p.a.u(obj2);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry : ((g) ((j2) yVar.f22677a).getValue()).f.entrySet()) {
                        String str = (String) entry.getKey();
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            arrayListU.add(str);
                        } else {
                            arrayList3.add(str);
                        }
                    }
                    for (Map.Entry entry2 : ((g) ((j2) yVar.f22677a).getValue()).e.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (((Boolean) entry2.getValue()).booleanValue()) {
                            arrayList.add(str2);
                        } else {
                            arrayList4.add(str2);
                        }
                    }
                    for (Map.Entry entry3 : ((g) ((j2) yVar.f22677a).getValue()).f147128g.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        if (((Boolean) entry3.getValue()).booleanValue()) {
                            arrayList2.add(str3);
                        }
                    }
                    wtc.j jVar = aVar.f85632q;
                    ytc.a aVar2 = new ytc.a(arrayListU, arrayList, arrayList2, arrayList3, arrayList4);
                    this.v = 1;
                    z zVar = (z) jVar.f299874a;
                    zVar.getClass();
                    cn0.d dVar = new cn0.d(zVar, aVar2, (Continuation) null, 11);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, dVar, this);
                    Object obj4 = fim.a.COROUTINE_SUSPENDED;
                    if (objJ != obj4) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj4) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    l lVar = new l(aVar, continuation, 0);
                    this.v = 1;
                    if (ue8.c.f0(aVar, lVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
