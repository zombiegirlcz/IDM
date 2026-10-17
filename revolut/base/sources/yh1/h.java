package yh1;

import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreenContract$InputData;
import java.util.Collections;
import java.util.Set;
import xsl.q;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FieldSearchScreenContract$InputData f313718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f313719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f313720c;

    public h(e eVar, c cVar, FieldSearchScreenContract$InputData fieldSearchScreenContract$InputData) {
        this.f313718a = fieldSearchScreenContract$InputData;
        int i = 25;
        this.f313719b = e4m.b.b(new q(eVar, this, 1, i));
        this.f313720c = e4m.b.b(new q(eVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
