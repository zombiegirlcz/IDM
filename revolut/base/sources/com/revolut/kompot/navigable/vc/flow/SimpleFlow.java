package com.revolut.kompot.navigable.vc.flow;

import aii.r;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import qji.b;
import te0.w;
import xki.a;
import xki.e;
import y99.c;
import yki.f;
import yki.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/kompot/navigable/vc/flow/SimpleFlow;", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Step", "Laii/r;", "Output", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyki/f;", "<init>", "()V", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SimpleFlow<Step extends FlowStep, Output extends r> extends ViewController<Output> implements f {
    public final Object K = w.y0(new c(this, 20));
    public final a L = a.f306815a;

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return this.L;
    }

    public abstract k d3();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}
