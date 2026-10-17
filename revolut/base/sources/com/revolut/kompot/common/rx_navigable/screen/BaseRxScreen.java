package com.revolut.kompot.common.rx_navigable.screen;

import aii.r;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.navigable.screen.BaseScreen;
import ifm.b;
import jki.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxScreen;", "Ljki/m;", "UI_STATE", "Lcom/revolut/kompot/common/IOData$Input;", "INPUT_DATA", "Laii/r;", "OUTPUT_DATA", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class BaseRxScreen<UI_STATE extends m, INPUT_DATA extends IOData$Input, OUTPUT_DATA extends r> extends BaseScreen<UI_STATE, INPUT_DATA, OUTPUT_DATA> {
    public final b M;
    public final b N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRxScreen(IOData$Input inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = new b();
        this.N = new b();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void X2() {
        this.N.d();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public void Y2() {
        this.M.d();
    }
}
