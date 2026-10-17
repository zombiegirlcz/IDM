package utb;

import android.os.MessageQueue;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import dy0.n0;
import dy0.o;
import kbb.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements MessageQueue.IdleHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev10_main_screen.impl.ui.slide.a f283067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainScreenTab f283068b;

    public /* synthetic */ b(com.revolut.feature.rev10_main_screen.impl.ui.slide.a aVar, MainScreenTab mainScreenTab) {
        this.f283067a = aVar;
        this.f283068b = mainScreenTab;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        jtb.b bVar = this.f283067a.u;
        bVar.getClass();
        q qVar = bVar.f178470a;
        MainScreenTab tab2 = this.f283068b;
        Intrinsics.checkNotNullParameter(tab2, "tab");
        n0 n0VarA = bVar.a(tab2);
        o direction = o.BOTTOM;
        if (n0VarA.a(direction, false) != null) {
            Intrinsics.checkNotNullParameter(tab2, "tab");
            Intrinsics.checkNotNullParameter(direction, "direction");
            qVar.a(tab2).a(direction, false);
        }
        o direction2 = o.RIGHT;
        if (n0VarA.a(direction2, false) != null) {
            Intrinsics.checkNotNullParameter(tab2, "tab");
            Intrinsics.checkNotNullParameter(direction2, "direction");
            qVar.a(tab2).a(direction2, false);
        }
        return false;
    }
}
