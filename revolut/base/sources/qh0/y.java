package qh0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class y {

    @NotNull
    public static final l Companion = new l();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f246424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f246425c;
    public final List d;
    public final int e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f246426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f246427h;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        i = new Lazy[]{null, null, null, yhm.j.c(kVar, new qba.c(26)), null, yhm.j.c(kVar, new qba.c(27)), yhm.j.c(kVar, new qba.c(28)), null};
    }

    public /* synthetic */ y(int i2, String str, u uVar, x xVar, List list, int i3, List list2, c cVar, k kVar) {
        if (255 != (i2 & 255)) {
            j1.f(a.f246388a.getDescriptor(), i2, 255);
            throw null;
        }
        this.f246423a = str;
        this.f246424b = uVar;
        this.f246425c = xVar;
        this.d = list;
        this.e = i3;
        this.f = list2;
        this.f246426g = cVar;
        this.f246427h = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f246423a, yVar.f246423a) && Intrinsics.f(this.f246424b, yVar.f246424b) && Intrinsics.f(this.f246425c, yVar.f246425c) && Intrinsics.f(this.d, yVar.d) && this.e == yVar.e && Intrinsics.f(this.f, yVar.f) && this.f246426g == yVar.f246426g && Intrinsics.f(this.f246427h, yVar.f246427h);
    }

    public final int hashCode() {
        return this.f246427h.hashCode() + ((this.f246426g.hashCode() + p.a.d(j6.a.b(this.e, p.a.d((this.f246425c.hashCode() + ((this.f246424b.hashCode() + (this.f246423a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31), 31, this.f)) * 31);
    }

    public y(String challenge, u rp, x user, ArrayList pubKeyCredParams, int i2, ArrayList excludeCredentials, c attestation, k authenticatorSelection) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(rp, "rp");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(pubKeyCredParams, "pubKeyCredParams");
        Intrinsics.checkNotNullParameter(excludeCredentials, "excludeCredentials");
        Intrinsics.checkNotNullParameter(attestation, "attestation");
        Intrinsics.checkNotNullParameter(authenticatorSelection, "authenticatorSelection");
        this.f246423a = challenge;
        this.f246424b = rp;
        this.f246425c = user;
        this.d = pubKeyCredParams;
        this.e = i2;
        this.f = excludeCredentials;
        this.f246426g = attestation;
        this.f246427h = authenticatorSelection;
    }
}
