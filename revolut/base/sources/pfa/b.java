package pfa;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f235544b;

    public /* synthetic */ b(i iVar, int i) {
        this.f235543a = i;
        this.f235544b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f235543a) {
            case 0:
                NaviCommand it8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f235544b.getClass();
                return com.revolut.retail.core.navigation.a.c(i.b(null), it8);
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return this.f235544b.f.a();
        }
    }
}
