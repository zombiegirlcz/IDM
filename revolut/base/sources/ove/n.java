package ove;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.topup_screen.api.descriptor.GooglePayFlowDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayFlowDescriptor$InputData f230096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f230097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f230098c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f230099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f230100h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f230101j;

    public n(t tVar, ViewController viewController, GooglePayFlowDescriptor$InputData googlePayFlowDescriptor$InputData) {
        this.f230097b = tVar;
        this.f230096a = googlePayFlowDescriptor$InputData;
        this.f230098c = e4m.b.b(new oi9.a(tVar, this, 1, 27));
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new oi9.a(tVar, this, 3, 27));
        this.f = e4m.b.b(new oi9.a(tVar, this, 5, 27));
        this.f230099g = e4m.b.b(new oi9.a(tVar, this, 4, 27));
        this.f230100h = e4m.b.b(new oi9.a(tVar, this, 2, 27));
        this.i = e4m.b.b(new oi9.a(tVar, this, 6, 27));
        this.f230101j = e4m.b.b(new oi9.a(tVar, this, 0, 27));
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
