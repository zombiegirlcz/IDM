package oi9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.PreferredScheduleControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreferredScheduleControllerContract$InputData f225567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f225568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225569c;

    public u(f fVar, s sVar, PreferredScheduleControllerContract$InputData preferredScheduleControllerContract$InputData) {
        this.f225567a = preferredScheduleControllerContract$InputData;
        int i = 13;
        this.f225568b = e4m.b.b(new a(fVar, this, 1, i));
        this.f225569c = e4m.b.b(new a(fVar, this, 0, i));
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
