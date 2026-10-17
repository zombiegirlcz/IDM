package jc1;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreenContract$InputData;
import efm.r;
import java.util.List;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ma1.t;
import ma1.u;
import nii.c0;
import nii.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends bji.b implements c {

    @NotNull
    public static final g Companion = new g();
    public final CardReaderConnectingScreenContract$InputData u;
    public final da1.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u f172698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xc1.d f172699x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, CardReaderConnectingScreenContract$InputData inputData, da1.d connectionInteractor, u pairingInteractor, xc1.d stickyActionExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(connectionInteractor, "connectionInteractor");
        Intrinsics.checkNotNullParameter(pairingInteractor, "pairingInteractor");
        Intrinsics.checkNotNullParameter(stickyActionExtension, "stickyActionExtension");
        this.u = inputData;
        this.v = connectionInteractor;
        this.f172698w = pairingInteractor;
        this.f172699x = stickyActionExtension;
    }

    public final void B2(String str) {
        zii.i.t(this, z2(new y0(null, new c0(new TextLocalisedClause(R$string.merchant_card_reader_flow_connecting_card_reader_title, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, true, null, false, false, null, 1902), false, 5)), null, null, 15);
    }

    public final void C2() {
        CardReaderDevice cardReader = this.u.f60650a;
        t tVar = (t) this.v;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(cardReader, "cardReader");
        r rVarDefer = r.defer(new m1i.t(tVar, cardReader, 2));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        zii.i.E0(this, rVarDefer, new d(this, 2), null, 14);
    }

    @Override // yji.l
    public final void I1() {
        C2();
    }

    @Override // bji.b
    public final r y2() {
        r rVarJust = r.just(j.f175191a);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
