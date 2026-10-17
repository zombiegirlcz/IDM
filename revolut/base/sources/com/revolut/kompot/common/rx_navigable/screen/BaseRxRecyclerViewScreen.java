package com.revolut.kompot.common.rx_navigable.screen;

import a31.o;
import aii.r;
import bi2.g;
import bjg.c;
import bji.a;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ifm.b;
import jki.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y4l.e;
import yhm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxRecyclerViewScreen;", "Ljki/n;", "UI_STATE", "Lcom/revolut/kompot/common/IOData$Input;", "INPUT_DATA", "Laii/r;", "OUTPUT_DATA", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class BaseRxRecyclerViewScreen<UI_STATE extends n, INPUT_DATA extends IOData$Input, OUTPUT_DATA extends r> extends BaseRecyclerViewScreen<UI_STATE, INPUT_DATA, OUTPUT_DATA> {
    public static final /* synthetic */ int W = 0;
    public final b U;
    public final b V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRxRecyclerViewScreen(IOData$Input inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = new b();
        this.V = new b();
    }

    public static void g3(BaseRxRecyclerViewScreen baseRxRecyclerViewScreen, efm.r rVar, Function1 onNext) {
        c onError = new c(2);
        g onComplete = new g(10);
        c onSubscribe = new c(3);
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        e.Companion.getClass();
        ifm.c cVarSubscribe = rVar.observeOn(e.a.a()).doOnSubscribe(new bjg.d(1, new c(4))).subscribe(new o(2, onNext), new bjg.d(2, onError), new a(onComplete), new bjg.d(3, onSubscribe));
        baseRxRecyclerViewScreen.U.a(cVarSubscribe);
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "apply(...)");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void X2() {
        this.V.d();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public void Y2() {
        this.U.d();
        super.Y2();
    }
}
