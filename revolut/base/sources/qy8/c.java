package qy8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc_documents_scan.ui.onfido.OnfidoScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements zy8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnfidoScreenContract$InputData f250253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f250254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f250255c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f250256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f250257h;

    public c(a aVar, b bVar, ViewController viewController, OnfidoScreenContract$InputData onfidoScreenContract$InputData) {
        this.f250253a = onfidoScreenContract$InputData;
        this.f250254b = viewController;
        this.f250255c = e4m.b.b(new qy7.f(aVar, this, 1, 1));
        this.d = e4m.b.b(new qy7.f(aVar, this, 2, 1));
        this.e = e4m.b.b(new qy7.f(aVar, this, 3, 1));
        this.f = e4m.b.b(new qy7.f(aVar, this, 4, 1));
        this.f250256g = e4m.b.b(new qy7.f(aVar, this, 5, 1));
        this.f250257h = e4m.b.b(new qy7.f(aVar, this, 0, 1));
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
