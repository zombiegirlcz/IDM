package ue7;

import ipa.j;
import ipa.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.b1;
import skm.e0;
import skm.p0;
import u83.f;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements hpa.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe7.d f279312a;

    public e(xe7.d incentiveExperimentRepository) {
        Intrinsics.checkNotNullParameter(incentiveExperimentRepository, "incentiveExperimentRepository");
        this.f279312a = incentiveExperimentRepository;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Intrinsics.f(k.b(message), "incentive_experiments")) {
            return false;
        }
        e0.C(b1.f263958a, p0.f264003c, null, new f(this, null, 7), 2);
        return true;
    }
}
