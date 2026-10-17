package y67;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreenContract$InputData;
import java.util.Set;
import xsl.q;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DirectDebitFormScreenContract$InputData f311210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f311211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f311212c;

    public b(d dVar, DirectDebitFormScreenContract$InputData directDebitFormScreenContract$InputData) {
        this.f311210a = directDebitFormScreenContract$InputData;
        int i = 7;
        this.f311211b = e4m.b.b(new q(dVar, this, 1, i));
        this.f311212c = e4m.b.b(new q(dVar, this, 0, i));
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
