package me7;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ApplicableDocuments;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mhd.n;
import mk5.m;
import mlk.v;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import v30.s;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f204626b;

    public /* synthetic */ h(Data data, int i) {
        this.f204625a = i;
        this.f204626b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f204625a) {
            case 0:
                c cVar = (c) obj2;
                s pricingPlan = (s) this.f204626b.getContent();
                if (pricingPlan == null) {
                    pricingPlan = s.NONE;
                }
                cVar.getClass();
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                return new c(pricingPlan);
            case 1:
                return mg2.d.a((mg2.d) obj2, this.f204626b, null, 2);
            case 2:
                return mg2.d.a((mg2.d) obj2, this.f204626b, null, 2);
            case 3:
                mg7.j update = (mg7.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                Data contentData = this.f204626b;
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                return new mg7.j(contentData);
            case 4:
                return n.a((n) obj2, null, null, this.f204626b, null, null, false, null, 123);
            case 5:
                return n.a((n) obj2, null, null, null, null, null, false, this.f204626b, 63);
            case 6:
                return n.a((n) obj2, this.f204626b, null, null, null, null, false, null, 126);
            case 7:
                rfd.e update2 = (rfd.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                Data watchlistData = this.f204626b;
                Intrinsics.checkNotNullParameter(watchlistData, "watchlistData");
                return new rfd.e(watchlistData);
            case 8:
                ((rfd.e) obj2).getClass();
                Data watchlistData2 = this.f204626b;
                Intrinsics.checkNotNullParameter(watchlistData2, "watchlistData");
                return new rfd.e(watchlistData2);
            case 9:
                return mj6.g.a((mj6.g) obj2, this.f204626b, null, 2);
            case 10:
                Data data = this.f204626b;
                Intrinsics.h(data);
                return m.a((m) obj2, null, null, data, null, false, 123);
            case 11:
                return m.a((m) obj2, null, null, null, this.f204626b, false, LDSFile.EF_DG15_TAG);
            case 12:
                return mle.h.a((mle.h) obj2, null, false, null, null, null, this.f204626b, 31);
            case 13:
                return mle.h.a((mle.h) obj2, this.f204626b, false, null, null, null, null, 62);
            case 14:
                return mle.h.a((mle.h) obj2, null, false, null, this.f204626b, null, null, 55);
            case 15:
                return mle.h.a((mle.h) obj2, null, false, this.f204626b, null, null, null, 59);
            case 16:
                return v.a((v) obj2, this.f204626b, null, null, null, null, ISO781611.SMT_TAG);
            case 17:
                return v.a((v) obj2, null, this.f204626b, null, null, null, 123);
            case 18:
                return v.a((v) obj2, null, null, null, null, this.f204626b, 95);
            case 19:
                Data data2 = this.f204626b;
                Intrinsics.h(data2);
                return v.a((v) obj2, null, null, data2, null, null, LDSFile.EF_SOD_TAG);
            case 20:
                Data data3 = this.f204626b;
                Intrinsics.h(data3);
                return v.a((v) obj2, null, null, data3, null, null, LDSFile.EF_SOD_TAG);
            case 21:
                return mp7.h.a((mp7.h) obj2, this.f204626b, null, null, null, 14);
            case 22:
                return mq4.g.a((mq4.g) obj2, this.f204626b, null, null, null, 29);
            case 23:
                return mq5.c.a((mq5.c) obj2, this.f204626b);
            case 24:
                ((mr4.b) obj2).getClass();
                Data content = this.f204626b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new mr4.b(content);
            case 25:
                return mrc.a.a((mrc.a) obj2, this.f204626b, null, 2);
            case 26:
                return mrc.a.a((mrc.a) obj2, null, this.f204626b, 1);
            case 27:
                ((mtc.d) obj2).getClass();
                Data device = this.f204626b;
                Intrinsics.checkNotNullParameter(device, "device");
                return new mtc.d(device);
            case 28:
                mth.i iVar = (mth.i) obj2;
                Data data4 = this.f204626b;
                ApplicableDocuments applicableDocuments = (ApplicableDocuments) data4.getContent();
                return mth.i.a(iVar, null, data4, applicableDocuments != null ? z92.f.h(applicableDocuments) : null, 1);
            default:
                return mtl.a.a((mtl.a) obj2, null, this.f204626b, null, null, null, null, 61);
        }
    }

    public /* synthetic */ h(Data data, com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar) {
        this.f204625a = 28;
        this.f204626b = data;
    }
}
