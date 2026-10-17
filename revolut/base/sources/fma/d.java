package fma;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.profile.impl.ui.details.email.check_inbox.CheckInboxScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckInboxScreenContract$InputData f136081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f136082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f136083c;

    public d(h hVar, i iVar, CheckInboxScreenContract$InputData checkInboxScreenContract$InputData) {
        this.f136081a = checkInboxScreenContract$InputData;
        int i = 17;
        this.f136082b = e4m.b.b(new fa0.q(hVar, this, 1, i));
        this.f136083c = e4m.b.b(new fa0.q(hVar, this, 0, i));
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
