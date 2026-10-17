package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Landroidx/compose/ui/node/PlaceableResult;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1 extends u implements Function1<PlaceableResult, Unit> {
    public static final LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1 INSTANCE = new LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1();

    public LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((PlaceableResult) obj2);
        return Unit.f186387a;
    }

    public final void invoke(PlaceableResult placeableResult) {
        if (placeableResult.isValidOwnerScope()) {
            placeableResult.getPlaceable().captureRulersIfNeeded(placeableResult);
        }
    }
}
