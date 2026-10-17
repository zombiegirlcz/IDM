package cie;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d f24499b;

    public /* synthetic */ l0(com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, int i) {
        this.f24498a = i;
        this.f24499b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24498a) {
            case 0:
                mii.k kVar = new mii.k("SUCCESS_COPY_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, 28);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = this.f24499b;
                yji.l.b1(dVar, dVar.X1(kVar), null, null, 7);
                return Unit.f186387a;
            case 1:
                return this.f24499b.i0.B(new cge.g(18));
            default:
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar2 = this.f24499b;
                return dVar2.i0.B(new cge.g(dVar2, 19));
        }
    }
}
