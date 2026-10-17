package dmc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.robo.impl.ui.screen.acknowledgement.AgreementsScreenContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AgreementsScreenContract$Input f115930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f115931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f115932c;
    public final e4m.e d;

    public d(r rVar, i iVar, AgreementsScreenContract$Input agreementsScreenContract$Input) {
        this.f115931b = rVar;
        this.f115930a = agreementsScreenContract$Input;
        int i = 16;
        this.f115932c = e4m.b.b(new db1.f(rVar, this, 1, i));
        this.d = e4m.b.b(new db1.f(rVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
