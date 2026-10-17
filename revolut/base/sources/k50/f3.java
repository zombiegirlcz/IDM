package k50;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181063a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j4 f181064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Data f181065c;

    public /* synthetic */ f3(Data data, j4 j4Var) {
        this.f181065c = data;
        this.f181064b = j4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h0 h0VarA;
        int i = this.f181063a;
        j4 j4Var = this.f181064b;
        switch (i) {
            case 0:
                h0 h0Var = (h0) obj2;
                Data data = this.f181065c;
                if (data.getContent() != null) {
                    p2 p2Var = j4.Companion;
                    h0VarA = j4Var.f3(h0Var, data);
                } else {
                    h0VarA = h0.a(h0Var, null, data, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435453);
                }
                return j4Var.S.c3(j4.K2(j4Var, j4.J2(j4Var, h0VarA)));
            default:
                h0 update = (h0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                p2 p2Var2 = j4.Companion;
                return j4.K2(j4Var, j4.J2(j4Var, j4Var.f3(update, this.f181065c)));
        }
    }

    public /* synthetic */ f3(j4 j4Var, Data data) {
        this.f181064b = j4Var;
        this.f181065c = data;
    }
}
