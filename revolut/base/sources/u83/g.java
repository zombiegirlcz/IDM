package u83;

import cli.n;
import cli.y;
import com.revolut.feature.card_screen.impl.prompts.location_security.AskLocationSecurityPromptScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends oki.h implements h {
    public final l93.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y80.a f278101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f278102q;

    public g(n stateMapper, AskLocationSecurityPromptScreenContract$InputData inputData, l93.f revolutCardsInteractor, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.o = revolutCardsInteractor;
        this.f278101p = permissionProvider;
        this.f278102q = mra.d.b(this, new i(inputData.f65512a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f278102q;
    }
}
