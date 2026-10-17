package au0;

import android.widget.FrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class q2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f9325b;

    public /* synthetic */ q2(s2 s2Var, int i) {
        this.f9324a = i;
        this.f9325b = s2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9324a) {
            case 0:
                return (FrameLayout) this.f9325b.f9350a.findViewById(R$id.headerExtraContainer);
            case 1:
                s2 s2Var = this.f9325b;
                return new ix0.l0(s2Var.b(), zhm.v.k(new ix0.k0(new q2(s2Var, 2)), new ix0.k0(new q2(s2Var, 3))));
            case 2:
                return this.f9325b.i;
            default:
                return this.f9325b.k;
        }
    }
}
