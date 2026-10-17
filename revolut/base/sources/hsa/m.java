package hsa;

import a3e.u;
import cli.y;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.impl.ui.edit_card_owner.EditCardOwnerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends oki.h implements j {
    public final lra.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f4h.a f155025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f155026q;

    public m(EditCardOwnerScreenContract$InputData inputData, lra.d interactor, f4h.a changeDelegate, u stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(changeDelegate, "changeDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f155025p = changeDelegate;
        CardOwner cardOwner = inputData.f81610a;
        String str = cardOwner.f81491b;
        String str2 = cardOwner.f81492c;
        String str3 = cardOwner.e;
        this.f155026q = mra.d.b(this, new e(cardOwner, str, str2, str3 == null ? "" : str3, changeDelegate.t(str, str2, str3 == null ? "" : str3)), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f155026q;
    }
}
