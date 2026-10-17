package qje;

import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$FlowState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements zje.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f246851b;

    public /* synthetic */ t(u uVar, int i) {
        this.f246850a = i;
        this.f246851b = uVar;
    }

    @Override // zje.b
    public final void c(Function1 transform) {
        switch (this.f246850a) {
            case 0:
                Intrinsics.checkNotNullParameter(transform, "transform");
                u uVar = this.f246851b;
                uVar.H2(uVar.f246855s, new js7.c(17, transform));
                break;
            default:
                Intrinsics.checkNotNullParameter(transform, "transform");
                u uVar2 = this.f246851b;
                uVar2.H2(uVar2.f246855s, new js7.c(18, transform));
                break;
        }
    }

    @Override // zje.b
    public final Object i() {
        switch (this.f246850a) {
            case 0:
                return ((TabCryptoFlowContract$FlowState) ((j2) this.f246851b.f246855s.f22677a).getValue()).f89789a;
            default:
                return ((TabCryptoFlowContract$FlowState) ((j2) this.f246851b.f246855s.f22677a).getValue()).f89790b;
        }
    }
}
