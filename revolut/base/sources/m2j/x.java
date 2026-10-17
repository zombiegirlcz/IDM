package m2j;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f202093b;

    public /* synthetic */ x(a0 a0Var, int i) {
        this.f202092a = i;
        this.f202093b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202092a) {
            case 0:
                ejb.b savingsAccountInfo = (ejb.b) obj2;
                Intrinsics.checkNotNullParameter(savingsAccountInfo, "savingsAccountInfo");
                return new Pair(this.f202093b, savingsAccountInfo);
            case 1:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return new Pair(this.f202093b, bool);
            case 2:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                return new Pair(this.f202093b, bool2);
            default:
                List vaults = (List) obj2;
                Intrinsics.checkNotNullParameter(vaults, "vaults");
                return new Pair(this.f202093b, vaults);
        }
    }
}
