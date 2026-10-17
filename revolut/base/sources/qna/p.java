package qna;

import com.revolut.data.model.Data;
import h93.f0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import tof.i7;
import w19.g;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f247923b;

    public /* synthetic */ p(Data data, int i) {
        this.f247922a = i;
        this.f247923b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        w19.f fVar;
        switch (this.f247922a) {
            case 0:
                return f.a((f) obj2, null, (Boolean) this.f247923b.getContent(), null, null, null, null, false, ISO781611.SMT_TAG);
            case 1:
                return jlc.r.a((jlc.r) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f247923b, 16383);
            case 2:
                return jlc.r.a((jlc.r) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f247923b, null, 24575);
            case 3:
                return qp7.i.a((qp7.i) obj2, this.f247923b, null, 2);
            case 4:
                return qpd.f.a((qpd.f) obj2, null, (i7) this.f247923b.getContent(), null, 5);
            case 5:
                return qpd.f.a((qpd.f) obj2, this.f247923b, null, null, 6);
            case 6:
                return qph.m.a((qph.m) obj2, null, null, null, null, null, this.f247923b, null, 95);
            case 7:
                return qph.m.a((qph.m) obj2, null, null, null, null, null, null, this.f247923b, 63);
            case 8:
                return qph.m.a((qph.m) obj2, null, null, null, null, this.f247923b, null, null, LDSFile.EF_DG15_TAG);
            case 9:
                return qph.m.a((qph.m) obj2, null, this.f247923b, null, null, null, null, null, ISO781611.SMT_TAG);
            case 10:
                return qph.m.a((qph.m) obj2, null, null, null, this.f247923b, null, null, null, LDSFile.EF_SOD_TAG);
            case 11:
                ((qq4.c) obj2).getClass();
                Data cardsData = this.f247923b;
                Intrinsics.checkNotNullParameter(cardsData, "cardsData");
                return new qq4.c(cardsData);
            case 12:
                ((qq6.e) obj2).getClass();
                Data limit = this.f247923b;
                Intrinsics.checkNotNullParameter(limit, "limit");
                return new qq6.e(limit);
            case 13:
                ((qqe.d) obj2).getClass();
                Data teenProfile = this.f247923b;
                Intrinsics.checkNotNullParameter(teenProfile, "teenProfile");
                return new qqe.d(teenProfile);
            case 14:
                return qu4.i.a((qu4.i) obj2, null, null, false, this.f247923b, null, null, false, false, null, null, null, 2039);
            case 15:
                return qv4.g.a((qv4.g) obj2, null, this.f247923b, 1);
            case 16:
                qw2.k kVar = (qw2.k) obj2;
                Data designConfig = this.f247923b;
                Intrinsics.h(designConfig);
                f0 card = kVar.f249752a;
                boolean z = kVar.f249753b;
                o5l.g screenDensity = kVar.d;
                Intrinsics.checkNotNullParameter(card, "card");
                Intrinsics.checkNotNullParameter(designConfig, "designConfig");
                Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
                return new qw2.k(card, z, designConfig, screenDensity);
            case 17:
                return qwd.m.a((qwd.m) obj2, 0L, null, null, false, null, this.f247923b, null, null, 895);
            case 18:
                qwf.o updateState = (qwf.o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return qwf.o.a(updateState, 0L, null, null, null, null, this.f247923b, null, null, 895);
            case 19:
                return qwf.o.a((qwf.o) obj2, 0L, null, null, null, null, null, this.f247923b, null, 767);
            case 20:
                return qzb.e.a((qzb.e) obj2, null, this.f247923b, 1);
            case 21:
                Data data2 = this.f247923b;
                qzb.e eVar = (qzb.e) obj2;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        w19.g gVar = (w19.g) content;
                        if (gVar instanceof w19.h) {
                            fVar = ((w19.h) gVar).f293811b;
                            data = new Data(fVar, data2.getError(), data2.getLoading());
                        } else {
                            if (!(gVar instanceof g.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fVar = null;
                            data = new Data(fVar, data2.getError(), data2.getLoading());
                        }
                    } else {
                        fVar = null;
                        data = new Data(fVar, data2.getError(), data2.getLoading());
                    }
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return qzb.e.a(eVar, data, null, 2);
            case 22:
                ((r07.d) obj2).getClass();
                Data taxProfilesSummary = this.f247923b;
                Intrinsics.checkNotNullParameter(taxProfilesSummary, "taxProfilesSummary");
                return new r07.d(taxProfilesSummary);
            case 23:
                return r0a.i.a((r0a.i) obj2, this.f247923b, null, null, null, null, null, 126);
            case 24:
                return r0a.i.a((r0a.i) obj2, null, null, null, null, null, this.f247923b, 95);
            case 25:
                r0f.f fVar2 = (r0f.f) obj2;
                Data mcyTransferReview = this.f247923b;
                boolean z3 = mcyTransferReview.getContent() != null;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(mcyTransferReview, "mcyTransferReview");
                return new r0f.f(mcyTransferReview, z3);
            case 26:
                ((r15.h) obj2).getClass();
                Data configuration = this.f247923b;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new r15.h(configuration);
            case 27:
                return this.f247923b;
            case 28:
                ((r37.e) obj2).getClass();
                Data taxTypeInfo = this.f247923b;
                Intrinsics.checkNotNullParameter(taxTypeInfo, "taxTypeInfo");
                return new r37.e(taxTypeInfo);
            default:
                return r3b.i.c((r3b.i) obj2, null, this.f247923b, null, null, null, null, null, null, null, null, 2045);
        }
    }
}
