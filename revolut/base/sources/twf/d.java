package twf;

import dec.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f275011a;

    public d(q paymentMethodsCommonMapper) {
        Intrinsics.checkNotNullParameter(paymentMethodsCommonMapper, "paymentMethodsCommonMapper");
        this.f275011a = paymentMethodsCommonMapper;
    }
}
