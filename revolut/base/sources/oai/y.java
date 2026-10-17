package oai;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_retail_user_declarations.purpose.PurposeOfAccountFlowInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PurposeOfAccountFlowInputData f223786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f223788c = this;
    public final e4m.e d;

    public y(i0 i0Var, PurposeOfAccountFlowInputData purposeOfAccountFlowInputData) {
        this.f223787b = i0Var;
        this.f223786a = purposeOfAccountFlowInputData;
        this.d = e4m.b.b(new v(i0Var, this, 1));
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
