package com.fourthline.orca.internal;

import android.view.Window;
import androidx.content.NavHostController;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class t80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NavHostController f33248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Window f33249b;

    public static final class a implements o80, ukm.j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ ukm.j0 f33250a;

        public a(CoroutineScope coroutineScope, q70 q70Var) {
            this.f33250a = zc.a(coroutineScope, q70Var);
        }

        @Override // com.fourthline.orca.internal.o80, ukm.j0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(q80 element) {
            Intrinsics.checkNotNullParameter(element, "element");
            return this.f33250a.offer(element);
        }

        @Override // com.fourthline.orca.internal.o80, ukm.j0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object mo3647trySendJP2dKIU(q80 element) {
            Intrinsics.checkNotNullParameter(element, "element");
            return this.f33250a.mo3647trySendJP2dKIU(element);
        }

        @Override // com.fourthline.orca.internal.o80, ukm.j0
        public boolean close(Throwable th10) {
            return this.f33250a.close(th10);
        }

        @Override // com.fourthline.orca.internal.o80, ukm.j0
        public flm.e getOnSend() {
            return this.f33250a.getOnSend();
        }

        @Override // com.fourthline.orca.internal.o80, ukm.j0
        public void invokeOnClose(Function1 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.f33250a.invokeOnClose(handler);
        }

        @Override // com.fourthline.orca.internal.o80, ukm.j0
        public boolean isClosedForSend() {
            return this.f33250a.isClosedForSend();
        }

        @Override // com.fourthline.orca.internal.o80, ukm.j0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object send(q80 q80Var, Continuation continuation) {
            return this.f33250a.send(q80Var, continuation);
        }
    }

    public t80(NavHostController navHostController, Window window) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Intrinsics.checkNotNullParameter(window, "window");
        this.f33248a = navHostController;
        this.f33249b = window;
    }

    public final NavHostController a() {
        return this.f33248a;
    }

    public final r71 b() {
        return new s71(this.f33249b);
    }

    public final z80 a(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        return new r40(navHostController);
    }

    public final q70 a(r70 repository, fh0 orcaDestroyer, z80 navigator, r71 systemBarsController, k80 navigationAnalytics) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(systemBarsController, "systemBarsController");
        Intrinsics.checkNotNullParameter(navigationAnalytics, "navigationAnalytics");
        return new q70(repository, orcaDestroyer, navigator, systemBarsController, navigationAnalytics);
    }

    public final o80 a(q70 mainCoordinator, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(mainCoordinator, "mainCoordinator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new a(coroutineScope, mainCoordinator);
    }
}
