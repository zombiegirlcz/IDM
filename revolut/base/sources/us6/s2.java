package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.InvoiceRemindersScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceRemindersScreenContract$InputData f282747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282749c;
    public final e4m.e d;

    public s2(g2 g2Var, u2 u2Var, InvoiceRemindersScreenContract$InputData.DefaultInvoiceReminders defaultInvoiceReminders) {
        this.f282747a = defaultInvoiceReminders;
        int i = 0;
        this.f282748b = e4m.b.b(new r2(g2Var, this, 1, i));
        this.f282749c = e4m.b.b(new r2(g2Var, this, 0, i));
        this.d = e4m.b.b(new r2(g2Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f282749c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
