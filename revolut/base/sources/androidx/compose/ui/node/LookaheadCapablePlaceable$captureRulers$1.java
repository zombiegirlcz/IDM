package androidx.compose.ui.node;

import androidx.compose.ui.layout.RulerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class LookaheadCapablePlaceable$captureRulers$1 extends u implements Function0<Unit> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-unit-IntOffset$-positionOnScreen$0, reason: not valid java name */
    final /* synthetic */ long f61$$v$c$androidxcomposeuiunitIntOffset$positionOnScreen$0;

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-unit-IntSize$-size$0, reason: not valid java name */
    final /* synthetic */ long f62$$v$c$androidxcomposeuiunitIntSize$size$0;
    final /* synthetic */ PlaceableResult $placeableResult;
    final /* synthetic */ LookaheadCapablePlaceable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadCapablePlaceable$captureRulers$1(LookaheadCapablePlaceable lookaheadCapablePlaceable, long j2, long j3, PlaceableResult placeableResult) {
        super(0);
        this.this$0 = lookaheadCapablePlaceable;
        this.f61$$v$c$androidxcomposeuiunitIntOffset$positionOnScreen$0 = j2;
        this.f62$$v$c$androidxcomposeuiunitIntSize$size$0 = j3;
        this.$placeableResult = placeableResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2657invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m2657invoke() {
        this.this$0.getRulerScope().setCoordinatesAccessed(false);
        this.this$0.getRulerScope().m2655setPositionOnScreengyyYBs(this.f61$$v$c$androidxcomposeuiunitIntOffset$positionOnScreen$0);
        this.this$0.getRulerScope().m2656setSizeozmzZPI(this.f62$$v$c$androidxcomposeuiunitIntSize$size$0);
        Function1<RulerScope, Unit> rulers = this.$placeableResult.getResult().getRulers();
        if (rulers != null) {
            rulers.invoke(this.this$0.getRulerScope());
        }
    }
}
