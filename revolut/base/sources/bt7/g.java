package bt7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_credit.impl.ui.screen.documents.DocumentsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentsScreenContract$InputData f18419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f18420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f18421c;
    public final e4m.e d;

    public g(i iVar, j jVar, DocumentsScreenContract$InputData documentsScreenContract$InputData) {
        this.f18420b = iVar;
        this.f18419a = documentsScreenContract$InputData;
        int i = 1;
        this.f18421c = e4m.b.b(new e(iVar, this, 1, i));
        this.d = e4m.b.b(new e(iVar, this, 0, i));
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
