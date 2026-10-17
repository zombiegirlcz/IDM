package b77;

import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.z0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.giro.impl.ui.form.b f12930b;

    public /* synthetic */ l(com.revolut.feature.giro.impl.ui.form.b bVar, int i) {
        this.f12929a = i;
        this.f12930b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12929a) {
            case 0:
                h oldState = (h) obj2;
                Intrinsics.checkNotNullParameter(oldState, "oldState");
                d77.a aVar = this.f12930b.f74549q;
                FormState formState = oldState.f12923b;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(formState, "formState");
                String str = formState.f74554b;
                String str2 = (d0.W(str) || str.length() > 24 || !aVar.f111829a.canEncode(str)) ? "ID_CONSUMER_ID" : null;
                LocalDate localDate = formState.d;
                String str3 = (localDate == null || formState.f74555c.isBefore(localDate)) ? null : "ID_END_DATE";
                dj0.d dVar = formState.e;
                return h.a(oldState, null, z0.i(str2, str3, (dVar == null || dVar.f115082a >= 0) ? null : "ID_SINGLE_TRANSACTION_LIMIT"), 3);
            default:
                dm1.d result = (dm1.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dm1.c) {
                    com.revolut.feature.giro.impl.ui.form.b bVar = this.f12930b;
                    bVar.H2(bVar.f74552t, new m(result, 0));
                }
                return Unit.f186387a;
        }
    }
}
