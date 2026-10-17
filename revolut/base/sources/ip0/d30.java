package ip0;

import com.revolut.core.ui_kit.models.ProfileCardModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d30 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n30 f163835b;

    public /* synthetic */ d30(n30 n30Var, int i) {
        this.f163834a = i;
        this.f163835b = n30Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f163834a) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                n30 n30Var = this.f163835b;
                return n30Var.f165451a instanceof ProfileCardModel.Error ? new j30(n30Var) : new g30(n30Var);
            default:
                aw0.w2 it8 = (aw0.w2) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new i30(it8, this.f163835b);
        }
    }
}
