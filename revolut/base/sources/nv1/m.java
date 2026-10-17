package nv1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements iw1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrebTransferNavigation$InputData.NewContact f219427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f219428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f219429c;

    public m(g gVar, s sVar, BrebTransferNavigation$InputData.NewContact newContact) {
        this.f219428b = gVar;
        this.f219427a = newContact;
        this.f219429c = e4m.b.b(new l(gVar, this));
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
