package xck;

import java.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f304142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f304143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f304144c;
    public final String d;
    public final String e;
    public final String f;

    public b(ArrayList rewards, ArrayList additionalRewards, Instant revealAt, String planName, String faqId, String termsUrl) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(additionalRewards, "additionalRewards");
        Intrinsics.checkNotNullParameter(revealAt, "revealAt");
        Intrinsics.checkNotNullParameter(planName, "planName");
        Intrinsics.checkNotNullParameter(faqId, "faqId");
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        this.f304142a = rewards;
        this.f304143b = additionalRewards;
        this.f304144c = revealAt;
        this.d = planName;
        this.e = faqId;
        this.f = termsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f304142a.equals(bVar.f304142a) && this.f304143b.equals(bVar.f304143b) && Intrinsics.f(this.f304144c, bVar.f304144c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(r6.b.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f304143b, this.f304142a.hashCode() * 31, 31), 31, this.f304144c), 31, this.d), 31, this.e);
    }
}
