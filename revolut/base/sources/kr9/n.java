package kr9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.groups.impl.ui_new.share_group_qr.GroupQrScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupQrScreenContract$InputData f188776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f188777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f188778c;

    public n(l lVar, GroupQrScreenContract$InputData groupQrScreenContract$InputData) {
        this.f188776a = groupQrScreenContract$InputData;
        int i = 0;
        this.f188777b = e4m.b.b(new m(lVar, this, 1, i));
        this.f188778c = e4m.b.b(new m(lVar, this, 0, i));
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
