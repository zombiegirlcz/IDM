package gul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements e4i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i.a f146983a;

    public e0(l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f146983a = amountConverter;
    }

    @Override // e4i.a
    public final l4i.a e() {
        return this.f146983a;
    }
}
