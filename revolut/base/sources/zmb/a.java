package zmb;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import sri.m;
import w4l.i;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f323435b;

    public /* synthetic */ a(f fVar, int i) {
        this.f323434a = i;
        this.f323435b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f323434a) {
            case 0:
                NaviCommand naviCommand = (NaviCommand) obj2;
                m mVar = this.f323435b.f323441a;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                return Unit.f186387a;
            default:
                s it8 = (s) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                pcd.a aVarA = opg.c.a(it8);
                String str = aVarA != null ? aVarA.f234844g : null;
                if (str != null && str.length() != 0) {
                    return nim.a.v(this.f323435b.f.j(str, i.f294643c), new zke.f(29));
                }
                od0.i.Companion.getClass();
                return zi0.c.i(od0.i.f224256b);
        }
    }
}
