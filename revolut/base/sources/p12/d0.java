package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class d0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c12.z f231634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmRecipientListInputData f231635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231636c;
    public final e4m.e d;
    public final e4m.e e;

    public d0(v vVar, ApmRecipientListInputData apmRecipientListInputData, c12.z zVar) {
        this.f231634a = zVar;
        this.f231635b = apmRecipientListInputData;
        int i = 29;
        this.f231636c = e4m.b.b(new ove.w(vVar, this, 0, i));
        this.d = e4m.b.b(new ove.w(vVar, this, 2, i));
        this.e = e4m.b.b(new ove.w(vVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f231636c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
