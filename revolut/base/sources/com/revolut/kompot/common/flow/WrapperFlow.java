package com.revolut.kompot.common.flow;

import aii.r;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/common/flow/WrapperFlow;", "Laii/r;", "Out", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyki/f;", "<init>", "()V", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WrapperFlow<Out extends r> extends ViewController<Out> implements f {
    public final int K = R$layout.base_flow_container;

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }
}
