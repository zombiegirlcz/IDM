package i79;

import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.feature.notification_centre.impl.ui.inbox.LegacyInboxScreen;
import ip0.az;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LegacyInboxScreen f159216w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(LegacyInboxScreen legacyInboxScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f159216w = legacyInboxScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f159216w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f159216w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((az) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        int i = this.u;
        LegacyInboxScreen legacyInboxScreen = this.f159216w;
        switch (i) {
            case 0:
                az clickData = (az) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE3 = legacyInboxScreen.d();
                Intrinsics.h(clickData);
                k kVar = (k) hVarE3;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.f163509c;
                Continuation continuation = null;
                s69.d dVar = obj3 instanceof s69.d ? (s69.d) obj3 : null;
                if (dVar != null) {
                    ArrayList arrayList = dVar.f260164l;
                    int i2 = j.f159219a[clickData.f163508b.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            s69.e eVar = (s69.e) d0.e0(0, arrayList);
                            if (eVar != null) {
                                str = eVar.f260168c;
                            }
                            str2 = null;
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Intrinsics.checkNotNullParameter(dVar, "<this>");
                            s69.e eVar2 = (s69.e) d0.e0(1, arrayList);
                            if (eVar2 != null) {
                                str = eVar2.f260168c;
                            }
                            str2 = null;
                        }
                        kVar.l2(new hsd.c(kVar, dVar, str2, continuation, 15), new yi5.b(26));
                    } else {
                        str = dVar.f260163j;
                    }
                    str2 = str;
                    kVar.l2(new hsd.c(kVar, dVar, str2, continuation, 15), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                List items = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE32 = legacyInboxScreen.d();
                Intrinsics.h(items);
                k kVar2 = (k) hVarE32;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = items.iterator();
                while (true) {
                    Object[] objArr = 0;
                    if (!it8.hasNext()) {
                        if (!arrayList2.isEmpty()) {
                            kVar2.l2(new i44.a(kVar2, arrayList2, objArr == true ? 1 : 0, 8), new yi5.b(26));
                        }
                        return Unit.f186387a;
                    }
                    koi.j jVar = (koi.j) it8.next();
                    wh whVar = jVar instanceof wh ? (wh) jVar : null;
                    qv0.i iVar = whVar != null ? whVar.f54925b : null;
                    NotificationCentreItemDelegate.Model model = iVar instanceof NotificationCentreItemDelegate.Model ? (NotificationCentreItemDelegate.Model) iVar : null;
                    Object obj4 = model != null ? model.f52872l : null;
                    s69.d dVar2 = obj4 instanceof s69.d ? (s69.d) obj4 : null;
                    if (dVar2 != null) {
                        arrayList2.add(dVar2);
                    }
                }
                break;
        }
    }
}
