package com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.promo;

import com.revolut.feature.acquiring.card_reader.ui.impl.R$layout;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.promo.CardReaderPromoScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseScreen;
import jki.h;
import jki.k;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sji.b;
import tb1.a;
import te0.w;
import ue0.e;
import whc.t;
import xb1.l;
import xb1.p;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/screen/promo/CardReaderPromoScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ljki/k;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Ltb1/a;", "", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderPromoScreen extends BaseScreen<k, IOData$EmptyInput, a> {
    public final int M;
    public final Object N;
    public final Object O;

    public CardReaderPromoScreen() {
        super(IOData$EmptyInput.f98299a);
        this.M = R$layout.screen_card_reader_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: rc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderPromoScreen f253186b;

            {
                this.f253186b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                p pVarG;
                b60.a aVar;
                switch (i) {
                    case 0:
                        try {
                            phm.a aVar2 = (phm.a) e.j(this.f253186b.m2()).a().get(qb1.a.class);
                            aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                        } catch (Exception unused) {
                            pVarG = xb1.b.Companion.g();
                        }
                        if (aVar == null) {
                            throw new IllegalStateException("Api " + qb1.a.class + " is not found");
                        }
                        pVarG = (p) aVar.b();
                        p pVar = pVarG.f303958g;
                        l lVar = new l();
                        int i2 = 29;
                        lVar.f303944a = e4m.b.b(new t(pVar, lVar, 1, i2));
                        lVar.f303945b = e4m.b.b(new t(pVar, lVar, 0, i2));
                        return lVar;
                    default:
                        return (tb1.b) ((l) this.f253186b.N.getValue()).f303945b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: rc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderPromoScreen f253186b;

            {
                this.f253186b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                p pVarG;
                b60.a aVar;
                switch (i2) {
                    case 0:
                        try {
                            phm.a aVar2 = (phm.a) e.j(this.f253186b.m2()).a().get(qb1.a.class);
                            aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                        } catch (Exception unused) {
                            pVarG = xb1.b.Companion.g();
                        }
                        if (aVar == null) {
                            throw new IllegalStateException("Api " + qb1.a.class + " is not found");
                        }
                        pVarG = (p) aVar.b();
                        p pVar = pVarG.f303958g;
                        l lVar = new l();
                        int i22 = 29;
                        lVar.f303944a = e4m.b.b(new t(pVar, lVar, 1, i22));
                        lVar.f303945b = e4m.b.b(new t(pVar, lVar, 0, i22));
                        return lVar;
                    default:
                        return (tb1.b) ((l) this.f253186b.N.getValue()).f303945b.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (tb1.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }
}
