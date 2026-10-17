package iqh;

import cli.y;
import com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker.ScreenerFilterOptionsPickerScreen;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ScreenerFilterOptionsPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ScreenerFilterOptionsPickerScreen screenerFilterOptionsPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = screenerFilterOptionsPickerScreen;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ScreenerFilterOptionsPickerScreen screenerFilterOptionsPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) screenerFilterOptionsPickerScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) screenerFilterOptionsPickerScreen.e3();
                y yVar = oVar.o;
                Set set = ((i) ((j2) yVar.f22677a).getValue()).f167859b;
                j2 j2Var = (j2) yVar.f22677a;
                oVar.C2(!Intrinsics.f(set, ((i) j2Var.getValue()).f167860c) ? new k(new ScreenerSelectedFilter.Options(((i) j2Var.getValue()).f167858a.f96154a, d0.d1(((i) j2Var.getValue()).f167859b))) : j.f167861a);
                break;
        }
        return Unit.f186387a;
    }
}
