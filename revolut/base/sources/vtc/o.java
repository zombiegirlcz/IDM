package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.lost_card.LostCardControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LostCardControllerContract$InputData f292035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f292036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f292037c;

    public o(t tVar, u uVar, LostCardControllerContract$InputData lostCardControllerContract$InputData) {
        this.f292036b = tVar;
        this.f292035a = lostCardControllerContract$InputData;
        this.f292037c = e4m.b.b(new n(tVar, this, 0));
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
