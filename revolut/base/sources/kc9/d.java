package kc9;

import com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements cli.j {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f182670b = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ESignatureProcess f182671a;

    public d(ESignatureProcess eSignatureProcess) {
        this.f182671a = eSignatureProcess;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f182671a, ((d) obj2).f182671a);
    }

    public final int hashCode() {
        ESignatureProcess eSignatureProcess = this.f182671a;
        if (eSignatureProcess == null) {
            return 0;
        }
        return eSignatureProcess.hashCode();
    }
}
