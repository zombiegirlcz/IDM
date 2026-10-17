package o6d;

import com.revolut.feature.shared.branding.api.PaymentLinkPreviewScreenProvider$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkPreviewScreenProvider$InputData f222566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f222567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f222568c;

    public h(f fVar, PaymentLinkPreviewScreenProvider$InputData paymentLinkPreviewScreenProvider$InputData) {
        this.f222566a = paymentLinkPreviewScreenProvider$InputData;
        int i = 25;
        this.f222567b = e4m.b.b(new nk7.e(this, 1, i));
        this.f222568c = e4m.b.b(new nk7.e(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
