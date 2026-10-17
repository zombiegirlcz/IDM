package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.InvoiceEmailMessageScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282465a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvoiceEmailMessageScreenContract$InputData f282466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282467c;
    public final e4m.e d;
    public final e4m.e e;

    public b3(g2 g2Var, h2 h2Var, InvoiceEmailMessageScreenContract$InputData invoiceEmailMessageScreenContract$InputData) {
        this.f282466b = invoiceEmailMessageScreenContract$InputData;
        int i = 2;
        this.f282467c = e4m.b.b(new r2(g2Var, this, 1, i));
        this.d = e4m.b.b(new r2(g2Var, this, 0, i));
        this.e = e4m.b.b(new r2(g2Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f282465a) {
        }
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f282465a) {
        }
        return ImmutableSet.of();
    }

    public b3(g2 g2Var, u2 u2Var, InvoiceEmailMessageScreenContract$InputData invoiceEmailMessageScreenContract$InputData) {
        this.f282466b = invoiceEmailMessageScreenContract$InputData;
        int i = 1;
        this.f282467c = e4m.b.b(new r2(g2Var, this, 1, i));
        this.d = e4m.b.b(new r2(g2Var, this, 0, i));
        this.e = e4m.b.b(new r2(g2Var, this, 2, i));
    }
}
