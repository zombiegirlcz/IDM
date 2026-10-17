package o35;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f221694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f221695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f221696c;

    public e(dj0.d maxLoanAmount, dj0.d minLoanAmount, boolean z) {
        Intrinsics.checkNotNullParameter(maxLoanAmount, "maxLoanAmount");
        Intrinsics.checkNotNullParameter(minLoanAmount, "minLoanAmount");
        this.f221694a = maxLoanAmount;
        this.f221695b = minLoanAmount;
        this.f221696c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f221694a, eVar.f221694a) && Intrinsics.f(this.f221695b, eVar.f221695b) && this.f221696c == eVar.f221696c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221696c) + v7.c(this.f221694a.hashCode() * 31, 31, this.f221695b);
    }
}
