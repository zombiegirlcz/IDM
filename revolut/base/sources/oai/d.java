package oai;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.CollectCitizenshipFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollectCitizenshipFlowContract$InputData f223670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f223672c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public d(i0 i0Var, CollectCitizenshipFlowContract$InputData collectCitizenshipFlowContract$InputData) {
        this.f223671b = i0Var;
        this.f223670a = collectCitizenshipFlowContract$InputData;
        int i = 11;
        this.d = e4m.b.b(new o41.b(i0Var, this, 2, i));
        this.e = e4m.b.b(new o41.b(i0Var, this, 1, i));
        this.f = e4m.b.b(new o41.b(i0Var, this, 0, i));
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
