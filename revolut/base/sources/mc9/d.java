package mc9;

import com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements cli.j {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f204310c = new d(null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ESignatureProcess f204311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f204312b;

    public d(ESignatureProcess eSignatureProcess, boolean z) {
        this.f204311a = eSignatureProcess;
        this.f204312b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f204311a, dVar.f204311a) && this.f204312b == dVar.f204312b;
    }

    public final int hashCode() {
        ESignatureProcess eSignatureProcess = this.f204311a;
        return Boolean.hashCode(this.f204312b) + ((eSignatureProcess == null ? 0 : eSignatureProcess.hashCode()) * 31);
    }
}
