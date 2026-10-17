package u6c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements f0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f277552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f277553c;
    public final boolean d;

    public e0(String str, List notAllowedReasons) {
        Intrinsics.checkNotNullParameter(notAllowedReasons, "notAllowedReasons");
        this.f277551a = str;
        this.f277552b = notAllowedReasons;
        this.f277553c = (notAllowedReasons.contains(d0.INSUFFICIENT_BALANCE) || notAllowedReasons.contains(d0.ADVANCED_STATE_ORDER)) ? false : true;
        this.d = notAllowedReasons.contains(d0.PAYMENT_METHOD_NOT_AVAILABLE);
    }

    @Override // u6c.f0
    public final boolean a() {
        return this.f277553c;
    }

    @Override // u6c.f0
    public final String b() {
        return this.f277551a;
    }

    @Override // u6c.f0
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f277551a, e0Var.f277551a) && Intrinsics.f(this.f277552b, e0Var.f277552b);
    }

    public final int hashCode() {
        String str = this.f277551a;
        return this.f277552b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
