package kjl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$InputData;
import java.util.Set;
import jqa.h;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalEntryFlowContract$InputData f184483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseFlow f184484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f184485c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public b(c cVar, BaseFlow baseFlow, ExternalEntryFlowContract$InputData externalEntryFlowContract$InputData) {
        this.f184485c = cVar;
        this.f184483a = externalEntryFlowContract$InputData;
        this.f184484b = baseFlow;
        int i = 22;
        this.d = e4m.b.b(new h(cVar, this, 1, i));
        this.e = e4m.b.b(new h(cVar, this, 2, i));
        this.f = e4m.b.b(new h(cVar, this, 0, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
