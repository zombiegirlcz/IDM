package rde;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreenContract$InputData;
import java.util.Set;
import r7d.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InboundSwiftTransferStatusScreenContract$InputData f253415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f253416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f253417c;
    public final o d;
    public final o e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f253418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f253419h;
    public final e4m.e i;

    public c(h hVar, InboundSwiftTransferStatusScreenContract$InputData inboundSwiftTransferStatusScreenContract$InputData) {
        this.f253415a = inboundSwiftTransferStatusScreenContract$InputData;
        int i = 3;
        this.f253416b = new o(hVar, this, 2, i);
        this.f253417c = new o(hVar, this, 3, i);
        this.d = new o(hVar, this, 4, i);
        this.e = new o(hVar, this, 5, i);
        this.f = new o(hVar, this, 6, i);
        this.f253418g = new o(hVar, this, 7, i);
        this.f253419h = e4m.b.b(new o(hVar, this, 1, i));
        this.i = e4m.b.b(new o(hVar, this, 0, i));
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
