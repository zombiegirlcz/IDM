package p7c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.impl.ui.nativetopup.RevolutPayTopUpScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayTopUpScreenContract$InputData f233731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f233732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233733c;

    public v(r rVar, RevolutPayTopUpScreenContract$InputData revolutPayTopUpScreenContract$InputData) {
        this.f233731a = revolutPayTopUpScreenContract$InputData;
        int i = 23;
        this.f233732b = e4m.b.b(new p12.f0(rVar, this, 1, i));
        this.f233733c = e4m.b.b(new p12.f0(rVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
