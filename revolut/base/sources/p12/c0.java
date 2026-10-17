package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class c0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRecipientDetailsContract$InputData f231626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f231627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231628c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public c0(v vVar, ApmRecipientDetailsContract$InputData apmRecipientDetailsContract$InputData) {
        this.f231627b = vVar;
        this.f231626a = apmRecipientDetailsContract$InputData;
        int i = 28;
        this.f231628c = e4m.b.b(new ove.w(vVar, this, 1, i));
        this.d = e4m.b.b(new ove.w(vVar, this, 0, i));
        this.e = e4m.b.b(new ove.w(vVar, this, 3, i));
        this.f = e4m.b.b(new ove.w(vVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
