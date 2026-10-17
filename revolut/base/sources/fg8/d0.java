package fg8;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f134918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f134919c;

    public /* synthetic */ d0(g0 g0Var, String str, int i) {
        this.f134917a = i;
        this.f134918b = g0Var;
        this.f134919c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f134917a) {
            case 0:
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                return pd.b.n(skm.p0.f264003c, new dp4.p(27, this.f134918b, naviCommand, this.f134919c, (Continuation) null));
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return pd.b.n(skm.p0.f264003c, new etj.l(this.f134918b, this.f134919c, (Continuation) null, 19));
        }
    }
}
