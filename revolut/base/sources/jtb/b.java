package jtb;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import dy0.n0;
import kbb.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f178470a;

    public b(q tabControllersProvider) {
        Intrinsics.checkNotNullParameter(tabControllersProvider, "tabControllersProvider");
        this.f178470a = tabControllersProvider;
    }

    public final n0 a(MainScreenTab tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        return this.f178470a.a(tab2).b();
    }
}
