package b1b;

import a31.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.text.d0;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f11770w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f11770w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f11770w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f11770w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        boolean zJ;
        int i = this.u;
        k kVar = this.f11770w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kVar.H2(kVar.f11776s, new ak7.g(str, 21));
                break;
            default:
                String str2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Object obj3 = d0.W(str2) ? (List) kVar.f11774q.getValue() : f0.f322471a;
                if (d0.W(str2)) {
                    list = (List) kVar.f11775r.getValue();
                } else {
                    EnumEntries enumEntriesB = d1b.c.b();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : enumEntriesB) {
                        d1b.c cVar = (d1b.c) obj4;
                        if (!cVar.getVolumeBased() || kVar.o.f82070b) {
                            String displayName = cVar.getDisplayName();
                            if (displayName == null) {
                                displayName = cVar.getValue();
                            }
                            zJ = d0.J(displayName, str2, true);
                        } else {
                            zJ = false;
                        }
                        if (zJ) {
                            arrayList.add(obj4);
                        }
                    }
                    list = arrayList;
                }
                kVar.H2(kVar.f11776s, new m(obj3, 29, list, kVar));
                break;
        }
        return Unit.f186387a;
    }
}
