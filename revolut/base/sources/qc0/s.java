package qc0;

import com.revolut.feature.backend_flow.domain.models.DateInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.SignatureInputItem;
import com.revolut.feature.backend_flow.domain.models.TextInputItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244482a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f244483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f244484c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ s(String str, j0 j0Var, boolean z) {
        this.f244483b = str;
        this.f244484c = j0Var;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FormScreen it8 = (FormScreen) obj2;
        switch (this.f244482a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f244484c.f244449q.c(it8, this.f244483b, Boolean.valueOf(this.d));
            default:
                Intrinsics.checkNotNullParameter(it8, "screen");
                String str = this.f244483b;
                InputItem inputItemO = foh.i.o(it8, str);
                boolean z = inputItemO instanceof TextInputItem;
                j0 j0Var = this.f244484c;
                boolean z3 = this.d;
                return z ? j0Var.k.c(it8, str, new aa0.d1(z3)) : inputItemO instanceof SignatureInputItem ? j0Var.f244445l.c(it8, str, new aa0.d1(z3)) : inputItemO instanceof DateInputItem ? j0Var.f244450r.c(it8, str, new aa0.n0(z3)) : it8;
        }
    }

    public /* synthetic */ s(j0 j0Var, String str, boolean z) {
        this.f244484c = j0Var;
        this.f244483b = str;
        this.d = z;
    }
}
