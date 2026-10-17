package wgd;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.crypto.impl.ui.settings.models.CryptoSpareChangeInfo;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import wnc.m;
import wph.n;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f297321b;

    public /* synthetic */ k(Data data, int i) {
        this.f297320a = i;
        this.f297321b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        soa.b bVar;
        Object next;
        switch (this.f297320a) {
            case 0:
                return g.a((g) obj2, null, this.f297321b, 1);
            case 1:
                ((wh4.c) obj2).getClass();
                Data screenContent = this.f297321b;
                Intrinsics.checkNotNullParameter(screenContent, "screenContent");
                return new wh4.c(screenContent);
            case 2:
                return wj8.h.a((wj8.h) obj2, this.f297321b, null, null, 6);
            case 3:
                return wjd.i.a((wjd.i) obj2, false, null, null, this.f297321b, 7);
            case 4:
                return wjd.i.a((wjd.i) obj2, false, this.f297321b, null, null, 13);
            case 5:
                return wje.g.a((wje.g) obj2, null, (CryptoSpareChangeInfo) this.f297321b.getContent(), false, null, null, false, false, false, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 6:
                wje.g gVar = (wje.g) obj2;
                Data data2 = this.f297321b;
                Intrinsics.h(data2);
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        Iterator it8 = ((List) content).iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (((soa.b) next).f264801a == soa.c.CRYPTOCURRENCY_VOLATILITY) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        bVar = (soa.b) next;
                    } else {
                        bVar = null;
                    }
                    data = new Data(bVar, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return wje.g.a(gVar, null, null, false, null, data, false, false, false, 239);
            case 7:
                return wkk.e.a((wkk.e) obj2, this.f297321b, null, 2);
            case 8:
                ((wl6.e) obj2).getClass();
                Data linkedAccountConsentDetails = this.f297321b;
                Intrinsics.checkNotNullParameter(linkedAccountConsentDetails, "linkedAccountConsentDetails");
                return new wl6.e(linkedAccountConsentDetails);
            case 9:
                return wl8.g.a((wl8.g) obj2, null, this.f297321b, null, null, null, 29);
            case 10:
                uih.g updateState = (uih.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Set remediationComplexBonds = (Set) this.f297321b.getContent();
                if (remediationComplexBonds == null) {
                    remediationComplexBonds = h0.f322473a;
                }
                updateState.getClass();
                Intrinsics.checkNotNullParameter(remediationComplexBonds, "remediationComplexBonds");
                return new uih.g(remediationComplexBonds);
            case 11:
                Data data3 = this.f297321b;
                Intrinsics.h(data3);
                ((wm1.c) obj2).getClass();
                Intrinsics.checkNotNullParameter(data3, "data");
                return new wm1.c(data3);
            case 12:
                ((wm9.g) obj2).getClass();
                Data payees = this.f297321b;
                Intrinsics.checkNotNullParameter(payees, "payees");
                return new wm9.g(payees);
            case 13:
                return wn7.f.a((wn7.f) obj2, this.f297321b, null, 2);
            case 14:
                return wn7.f.a((wn7.f) obj2, null, this.f297321b, 1);
            case 15:
                return wna.c.a((wna.c) obj2, null, this.f297321b, 5);
            case 16:
                Data data4 = this.f297321b;
                Intrinsics.h(data4);
                return wna.c.a((wna.c) obj2, data4, null, 6);
            case 17:
                return m.a((m) obj2, null, null, null, null, this.f297321b, null, null, LDSFile.EF_DG15_TAG);
            case 18:
                return m.a((m) obj2, this.f297321b, null, null, null, null, null, null, 126);
            case 19:
                return wo2.g.a((wo2.g) obj2, this.f297321b);
            case 20:
                ((wp4.g) obj2).getClass();
                Data model = this.f297321b;
                Intrinsics.checkNotNullParameter(model, "model");
                return new wp4.g(model);
            case 21:
                return n.a((n) obj2, null, null, null, this.f297321b, 15);
            case 22:
                ((wrb.c) obj2).getClass();
                return new wrb.c(this.f297321b);
            case 23:
                return new wrj.a(this.f297321b);
            case 24:
                ((wt4.e) obj2).getClass();
                Data content2 = this.f297321b;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new wt4.e(content2);
            case 25:
                ((wth.e) obj2).getClass();
                Data groups = this.f297321b;
                Intrinsics.checkNotNullParameter(groups, "groups");
                return new wth.e(groups);
            case 26:
                return wtk.h.a((wtk.h) obj2, null, null, null, this.f297321b, 7);
            case 27:
                return wtk.h.a((wtk.h) obj2, this.f297321b, null, null, null, 14);
            case 28:
                return wtk.h.a((wtk.h) obj2, null, this.f297321b, null, null, 13);
            default:
                return wug.d.a((wug.d) obj2, this.f297321b, null, null, 6);
        }
    }
}
