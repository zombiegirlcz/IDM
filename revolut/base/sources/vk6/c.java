package vk6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.PseFlowContract$InputData;
import e4m.e;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PseFlowContract$InputData f289867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f289868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f289869c = this;
    public final e d;
    public final e e;

    public c(b bVar, PseFlowContract$InputData pseFlowContract$InputData) {
        this.f289868b = bVar;
        this.f289867a = pseFlowContract$InputData;
        int i = 22;
        this.d = e4m.b.b(new r2(bVar, this, 1, i));
        this.e = e4m.b.b(new r2(bVar, this, 0, i));
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
