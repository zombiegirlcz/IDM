package jgd;

import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$ConverterHistory;
import i2l.e0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f173984w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(x xVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f173984w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f173984w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            default:
                s sVar2 = new s(this.f173984w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((SharedConverterScreenContract$ConverterHistory) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x xVar = this.f173984w;
        switch (i) {
            case 0:
                SharedConverterScreenContract$ConverterHistory sharedConverterScreenContract$ConverterHistory = (SharedConverterScreenContract$ConverterHistory) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new je2.d(xVar, sharedConverterScreenContract$ConverterHistory, 10));
                break;
            default:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new e0(xVar, list));
                break;
        }
        return Unit.f186387a;
    }
}
