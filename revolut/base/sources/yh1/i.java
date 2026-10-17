package yh1;

import com.revolut.feature.address.common.api.navigation.SelectAddressControllerDescriptor$InputData;
import java.util.Collections;
import java.util.Set;
import xsl.q;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1.l f313721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SelectAddressControllerDescriptor$InputData f313722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f313723c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public i(e eVar, SelectAddressControllerDescriptor$InputData selectAddressControllerDescriptor$InputData, sh1.l lVar) {
        this.f313721a = lVar;
        this.f313722b = selectAddressControllerDescriptor$InputData;
        int i = 26;
        this.f313723c = e4m.b.b(new q(eVar, this, 1, i));
        this.d = e4m.b.b(new q(eVar, this, 3, i));
        this.e = e4m.b.b(new q(eVar, this, 2, i));
        this.f = e4m.b.b(new q(eVar, this, 0, i));
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
