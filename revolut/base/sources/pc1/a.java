package pc1;

import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.payment.CardReaderPaymentScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.payment.CardReaderPaymentScreenContract$InputData;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements gd1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t53.a f234779a;

    public a(t53.a tipsInteractor) {
        Intrinsics.checkNotNullParameter(tipsInteractor, "tipsInteractor");
        this.f234779a = tipsInteractor;
    }

    public static void a(yji.l lVar, dj0.d dVar, dj0.d dVar2, ArrayList arrayList, String str, Function1 function1) {
        yji.l.g2(lVar, new CardReaderPaymentScreen(new CardReaderPaymentScreenContract$InputData(dVar, dVar2, arrayList, str)), null, new js7.c(12, function1), 1);
    }
}
