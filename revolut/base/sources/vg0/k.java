package vg0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f288702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f288703c;
    public final ArrayList d;
    public final int e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f288704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f288705h;

    public k(String challenge, i rp, j user, ArrayList pubKeyCredParams, int i, ArrayList excludeCredentials, a attestation, e authenticatorSelection) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(rp, "rp");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(pubKeyCredParams, "pubKeyCredParams");
        Intrinsics.checkNotNullParameter(excludeCredentials, "excludeCredentials");
        Intrinsics.checkNotNullParameter(attestation, "attestation");
        Intrinsics.checkNotNullParameter(authenticatorSelection, "authenticatorSelection");
        this.f288701a = challenge;
        this.f288702b = rp;
        this.f288703c = user;
        this.d = pubKeyCredParams;
        this.e = i;
        this.f = excludeCredentials;
        this.f288704g = attestation;
        this.f288705h = authenticatorSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f288701a, kVar.f288701a) && this.f288702b.equals(kVar.f288702b) && this.f288703c.equals(kVar.f288703c) && this.d.equals(kVar.d) && this.e == kVar.e && this.f.equals(kVar.f) && this.f288704g == kVar.f288704g && this.f288705h.equals(kVar.f288705h);
    }

    public final int hashCode() {
        return this.f288705h.hashCode() + ((this.f288704g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, j6.a.b(this.e, com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f288703c.hashCode() + ((this.f288702b.hashCode() + (this.f288701a.hashCode() * 31)) * 31)) * 31, 31), 31), 31)) * 31);
    }
}
