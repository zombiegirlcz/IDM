package aqh;

import cli.y;
import com.revolut.feature.wealth_discovery.impl.screener.screens.filter_calibrator.ScreenerFilterCalibratorScreen;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ScreenerFilterCalibratorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ScreenerFilterCalibratorScreen screenerFilterCalibratorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = screenerFilterCalibratorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ScreenerFilterCalibratorScreen screenerFilterCalibratorScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVar = (v) ((h) screenerFilterCalibratorScreen.W.getValue());
                vVar.C2(new j(((i) ((j2) vVar.f8461s.f22677a).getValue()).f8438c));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVar2 = (v) ((h) screenerFilterCalibratorScreen.W.getValue());
                y yVar = vVar2.f8461s;
                List list = ((i) ((j2) yVar.f22677a).getValue()).f8438c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((ScreenerSelectedFilter) obj3).getF105167a() != ((i) ((j2) yVar.f22677a).getValue()).f8436a) {
                        arrayList.add(obj3);
                    }
                }
                vVar2.C2(new j(arrayList));
                break;
        }
        return Unit.f186387a;
    }
}
