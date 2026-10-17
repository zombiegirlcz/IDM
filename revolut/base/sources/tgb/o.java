package tgb;

import java.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do3.g f271155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f271156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f271157c;
    public final g d;
    public final ArrayList e;
    public final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f271158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f271159h;
    public final boolean i;

    public o(do3.g status, boolean z, Instant instant, g header, ArrayList rewards, m mVar, h optIn, n termsAndConditions, boolean z3) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(optIn, "optIn");
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        this.f271155a = status;
        this.f271156b = z;
        this.f271157c = instant;
        this.d = header;
        this.e = rewards;
        this.f = mVar;
        this.f271158g = optIn;
        this.f271159h = termsAndConditions;
        this.i = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f271155a == oVar.f271155a && this.f271156b == oVar.f271156b && Intrinsics.f(this.f271157c, oVar.f271157c) && this.d.equals(oVar.d) && this.e.equals(oVar.e) && Intrinsics.f(this.f, oVar.f) && this.f271158g.equals(oVar.f271158g) && this.f271159h.equals(oVar.f271159h) && this.i == oVar.i;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f271155a.hashCode() * 31, 31, this.f271156b);
        Instant instant = this.f271157c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + ((iC + (instant == null ? 0 : instant.hashCode())) * 31)) * 31, 31);
        m mVar = this.f;
        return Boolean.hashCode(this.i) + ((this.f271159h.hashCode() + ((this.f271158g.hashCode() + ((iB + (mVar != null ? mVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
