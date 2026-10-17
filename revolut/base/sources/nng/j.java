package nng;

import com.google.common.collect.ImmutableSet;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PepFlowControllerDescriptor$InputData f217657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f217658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f217659c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j(p pVar, PepFlowControllerDescriptor$InputData pepFlowControllerDescriptor$InputData) {
        this.f217658b = pVar;
        this.f217657a = pepFlowControllerDescriptor$InputData;
        int i = 13;
        this.d = e4m.b.b(new nk7.k(pVar, this, 1, i));
        this.e = e4m.b.b(new nk7.k(pVar, this, 0, i));
        this.f = e4m.b.b(new nk7.k(pVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
