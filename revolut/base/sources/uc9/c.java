package uc9;

import android.app.Activity;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.onboarding.impl.revolut_card_ready.screen.RevolutCardReadyScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import u45.w0;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutCardReadyScreenContract$InputData f279008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f279009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f279010c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f279011g;

    public c(b bVar, a aVar, ViewController viewController, RevolutCardReadyScreenContract$InputData revolutCardReadyScreenContract$InputData, Activity activity) {
        this.f279010c = bVar;
        this.f279008a = revolutCardReadyScreenContract$InputData;
        this.f279009b = activity;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.e = e4m.b.b(new w0(bVar, this, 1, i));
        this.f = e4m.b.b(new w0(bVar, this, 2, i));
        this.f279011g = e4m.b.b(new w0(bVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
