package iqh;

import com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker.ScreenerFilterOptionsPickerScreen;
import ip0.w10;
import ip0.wk;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ScreenerFilterOptionsPickerScreen f167857w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ScreenerFilterOptionsPickerScreen screenerFilterOptionsPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f167857w = screenerFilterOptionsPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f167857w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f167857w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((yph.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((zph.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ScreenerFilterOptionsPickerScreen screenerFilterOptionsPickerScreen = this.f167857w;
        switch (i) {
            case 0:
                yph.i parcel = (yph.i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) screenerFilterOptionsPickerScreen.e3();
                oVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                oVar.H2(oVar.o, new w10(parcel, 26));
                break;
            default:
                zph.i iVar = (zph.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE3 = screenerFilterOptionsPickerScreen.e3();
                List values = iVar.f324306a;
                zph.b selectionState = iVar.f324307b;
                o oVar2 = (o) hVarE3;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(values, "values");
                Intrinsics.checkNotNullParameter(selectionState, "selectionState");
                oVar2.H2(oVar2.o, new wk(selectionState, values, 18));
                break;
        }
        return Unit.f186387a;
    }
}
