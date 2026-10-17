package vg0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f288684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f288685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f288686c;

    public e(b authenticatorAttachment, d residentKey, c0 userVerification) {
        Intrinsics.checkNotNullParameter(authenticatorAttachment, "authenticatorAttachment");
        Intrinsics.checkNotNullParameter(residentKey, "residentKey");
        Intrinsics.checkNotNullParameter(userVerification, "userVerification");
        this.f288684a = authenticatorAttachment;
        this.f288685b = residentKey;
        this.f288686c = userVerification;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f288684a == eVar.f288684a && this.f288685b == eVar.f288685b && this.f288686c == eVar.f288686c;
    }

    public final int hashCode() {
        return this.f288686c.hashCode() + ((this.f288685b.hashCode() + j6.a.c(this.f288684a.hashCode() * 31, 31, true)) * 31);
    }
}
