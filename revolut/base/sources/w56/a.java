package w56;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.defi.remittances.impl.ui.send.review.DeFiSendReviewScreen;
import com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.d1;
import qlm.v1;
import w5b.c1;
import w5b.c6;
import w5b.e0;
import w5b.e3;
import w5b.e5;
import w5b.g2;
import w5b.h5;
import w5b.i1;
import w5b.k3;
import w5b.l4;
import w5b.n0;
import w5b.n5;
import w5b.p2;
import w5b.q3;
import w5b.q5;
import w5b.r1;
import w5b.r5;
import w5b.s2;
import w5b.t3;
import w5b.v;
import w5b.w3;
import w5b.y5;
import w5b.z0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294698a;

    public /* synthetic */ a(int i) {
        this.f294698a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f294698a) {
            case 0:
                KProperty[] kPropertyArr = DeFiSendReviewScreen.S;
                return new RowDelegate(null, null, 7);
            case 1:
                return new qlm.e(w5a.b.f294763a);
            case 2:
                return new qlm.e(ProviderBlock.INSTANCE.serializer());
            case 3:
                return new qlm.e(w5b.a.f294769a);
            case 4:
                return new qlm.e(w5b.m.f294917a);
            case 5:
                return new qlm.e(v.f295041a);
            case 6:
                return new qlm.e(w5b.p.f294970a);
            case 7:
                return new qlm.e(v1.f247718a);
            case 8:
                return new qlm.e(e0.f294818a);
            case 9:
                return new qlm.e(n0.f294931a);
            case 10:
                return new qlm.e(c1.f294793a);
            case 11:
                return new qlm.e(i1.f294873a);
            case 12:
                return new qlm.e(z0.f295087a);
            case 13:
                return new qlm.e(r1.f294994a);
            case 14:
                return new qlm.e(w5b.g.f294839a);
            case 15:
                return new qlm.e(g2.f294843a);
            case 16:
                return new qlm.e(p2.f294974a);
            case 17:
                return new qlm.e(s2.f295005a);
            case 18:
                return new qlm.e(e3.f294822a);
            case 19:
                return new qlm.e(q3.f294985a);
            case 20:
                return new qlm.e(t3.f295020a);
            case 21:
                return new qlm.e(k3.f294898a);
            case 22:
                return new qlm.e(w3.f295055a);
            case 23:
                return new qlm.e(l4.f294913a);
            case 24:
                return new qlm.e(h5.f294867a);
            case 25:
                return new qlm.e(e5.f294825a);
            case 26:
                return new d1("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsUpsellBannerDto.ParamDto.Unknown", q5.INSTANCE, new Annotation[0]);
            case 27:
                n5.g.Companion bVar = n5.g.INSTANCE;
                return new qlm.e(r5.Companion.serializer());
            case 28:
                return new qlm.e(y5.f295086a);
            default:
                return new qlm.e(c6.f294799a);
        }
    }
}
