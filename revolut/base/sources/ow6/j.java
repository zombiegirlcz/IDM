package ow6;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.screen.FreelancerPluginAuthScreenContract$InputData;
import et6.y2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements f {

    @NotNull
    public static final h Companion = new h();
    public final i4b.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y2 f230314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FreelancerPluginAuthScreenContract$InputData f230315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f230316r;

    public j(i4b.f freelancerPartnerInteractor, y2 freelancerPromptInteractor, FreelancerPluginAuthScreenContract$InputData inputData, k stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerPartnerInteractor, "freelancerPartnerInteractor");
        Intrinsics.checkNotNullParameter(freelancerPromptInteractor, "freelancerPromptInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerPartnerInteractor;
        this.f230314p = freelancerPromptInteractor;
        this.f230315q = inputData;
        this.f230316r = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f230316r;
    }
}
