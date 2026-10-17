package s8d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.card.HelpWithCardScreenContract$Input;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wli.x;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends jki.g implements jki.h {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ie.a f260977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f260978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HelpWithCardScreenContract$Input f260979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f260980s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, ie.a cardsTroubleshooterInteractor, x deeplinkHandler, HelpWithCardScreenContract$Input input) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cardsTroubleshooterInteractor, "cardsTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f260977p = cardsTroubleshooterInteractor;
        this.f260978q = deeplinkHandler;
        this.f260979r = input;
        this.f260980s = new e(new Data(f0.f322471a, null, false, 6, null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, new wa3.d(this.f260977p.d(false, this.f260979r instanceof HelpWithCardScreenContract$Input.ViewPin), 0), null, new s56.i(this, null, 14), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f260980s;
    }

    public final void y2(Object obj2, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "CARDS_EMPTY_ITEM_ID")) {
            if (this.f260978q.y1("revolut://app/cards/order-selection/skip_cards")) {
                n2(new s64.a(this, null, 6), new whi.b(6));
                return;
            }
            return;
        }
        if (this.f260977p.f(itemId)) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            HelpWithCardScreenContract$Input helpWithCardScreenContract$Input = this.f260979r;
            if (helpWithCardScreenContract$Input instanceof HelpWithCardScreenContract$Input.HelpWithCard) {
                v2(new f(str));
            } else {
                if (!(helpWithCardScreenContract$Input instanceof HelpWithCardScreenContract$Input.ViewPin)) {
                    throw new NoWhenBranchMatchedException();
                }
                v2(new g(str));
            }
        }
    }
}
