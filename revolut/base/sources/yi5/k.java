package yi5;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f314256b;

    public /* synthetic */ k(l lVar, int i) {
        this.f314255a = i;
        this.f314256b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        NaviCommand it8 = (NaviCommand) obj2;
        switch (this.f314255a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f314256b.b(u0.b(it8));
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f314256b.b(u0.b(it8));
        }
    }
}
