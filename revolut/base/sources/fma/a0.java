package fma;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationSettingDetailsContract$InputData f136037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f136038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f136039c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f136040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f136041h;

    public a0(c0 c0Var, d0 d0Var, NotificationSettingDetailsContract$InputData notificationSettingDetailsContract$InputData) {
        this.f136038b = c0Var;
        this.f136039c = d0Var;
        this.f136037a = notificationSettingDetailsContract$InputData;
        this.d = e4m.b.b(new fa0.q(c0Var, this, 1, 22));
        this.e = e4m.b.b(new fa0.q(c0Var, this, 0, 22));
        this.f = e4m.b.b(new fa0.q(c0Var, this, 2, 22));
        this.f136040g = e4m.b.b(new fa0.q(c0Var, this, 4, 22));
        this.f136041h = e4m.b.b(new fa0.q(c0Var, this, 3, 22));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
