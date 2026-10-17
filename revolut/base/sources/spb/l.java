package spb;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f264938b;

    public /* synthetic */ l(m mVar, int i) {
        this.f264937a = i;
        this.f264938b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        NaviCommand it8 = (NaviCommand) obj2;
        switch (this.f264937a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f264938b.i.a(it8);
    }
}
