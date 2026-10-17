package unc;

import com.revolut.data.model.Data;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$DomainState;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f281416b;

    public /* synthetic */ y(Data data, int i) {
        this.f281415a = i;
        this.f281416b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        ArrayList arrayList;
        switch (this.f281415a) {
            case 0:
                return PortfolioSpareChangeScreenContract$DomainState.a((PortfolioSpareChangeScreenContract$DomainState) obj2, this.f281416b, null, null, null, null, null, 62);
            case 1:
                return PortfolioSpareChangeScreenContract$DomainState.a((PortfolioSpareChangeScreenContract$DomainState) obj2, null, null, null, this.f281416b, null, null, 55);
            case 2:
                return PortfolioSpareChangeScreenContract$DomainState.a((PortfolioSpareChangeScreenContract$DomainState) obj2, null, null, null, null, this.f281416b, null, 47);
            case 3:
                ((uob.g) obj2).getClass();
                Data contentData = this.f281416b;
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                return new uob.g(contentData);
            case 4:
                ((upe.g) obj2).getClass();
                Data taxResidencies = this.f281416b;
                Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
                return new upe.g(taxResidencies);
            case 5:
                Data limitsData = this.f281416b;
                Intrinsics.h(limitsData);
                ((uq5.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(limitsData, "limitsData");
                return new uq5.d(limitsData);
            case 6:
                return uqh.z.a((uqh.z) obj2, null, null, null, null, null, null, false, null, this.f281416b, null, 767);
            case 7:
                return uqh.z.a((uqh.z) obj2, null, null, null, null, null, null, false, this.f281416b, null, null, 895);
            case 8:
                return uqh.z.a((uqh.z) obj2, null, this.f281416b, null, null, null, null, false, null, null, null, 1021);
            case 9:
                Data data2 = this.f281416b;
                uqh.z zVar = (uqh.z) obj2;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        List<g0h.a> list = (List) content;
                        arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (g0h.a aVar : list) {
                            arrayList.add(new p5d.b(aVar.f139493b.a(), zi0.c.N(aVar.f139493b), null));
                        }
                    } else {
                        arrayList = null;
                    }
                    data = new Data(arrayList, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return uqh.z.a(zVar, null, null, data2, null, null, null, false, null, null, data, 507);
            case 10:
                return uqh.z.a((uqh.z) obj2, null, null, null, this.f281416b, null, null, false, null, null, null, 1015);
            case 11:
                ((ur7.c) obj2).getClass();
                Data documentGroups = this.f281416b;
                Intrinsics.checkNotNullParameter(documentGroups, "documentGroups");
                return new ur7.c(documentGroups);
            case 12:
                ((us4.h) obj2).getClass();
                Data content2 = this.f281416b;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new us4.h(content2);
            case 13:
                return uu6.h.a((uu6.h) obj2, this.f281416b, false, null, false, null, 30);
            case 14:
                return uu6.h.a((uu6.h) obj2, null, false, this.f281416b, false, null, 27);
            case 15:
                return uu6.h.a((uu6.h) obj2, null, false, null, false, this.f281416b, 15);
            case 16:
                return uv1.l.a((uv1.l) obj2, this.f281416b, null, null, null, null, 30);
            case 17:
                uv1.l lVar = (uv1.l) obj2;
                return uv1.l.a(lVar, null, uv1.k.a(lVar.f283280b, false, this.f281416b, 1), null, null, null, 29);
            case 18:
                return uv1.l.a((uv1.l) obj2, null, null, this.f281416b, null, null, 27);
            case 19:
                return uv1.l.a((uv1.l) obj2, null, null, null, this.f281416b, null, 23);
            case 20:
                return uv1.l.a((uv1.l) obj2, null, null, null, null, this.f281416b, 15);
            case 21:
                return uv6.g.a((uv6.g) obj2, this.f281416b, null, null, 6);
            case 22:
                return uv6.g.a((uv6.g) obj2, null, this.f281416b, null, 5);
            case 23:
                Data data3 = this.f281416b;
                Intrinsics.h(data3);
                return uv6.g.a((uv6.g) obj2, null, null, data3, 3);
            case 24:
                Data cardOtpDataList = this.f281416b;
                Intrinsics.h(cardOtpDataList);
                ((uw2.j) obj2).getClass();
                Intrinsics.checkNotNullParameter(cardOtpDataList, "cardOtpDataList");
                return new uw2.j(cardOtpDataList);
            case 25:
                Data data4 = this.f281416b;
                Intrinsics.h(data4);
                return uwi.k.a((uwi.k) obj2, data4, null, null, null, 14);
            case 26:
                Data data5 = this.f281416b;
                Intrinsics.h(data5);
                return uwi.k.a((uwi.k) obj2, null, null, data5, null, 11);
            case 27:
                return ux6.j.a((ux6.j) obj2, this.f281416b, null, false, false, false, 30);
            case 28:
                return uxe.m.a((uxe.m) obj2, this.f281416b, null, 2);
            default:
                ((uy6.d) obj2).getClass();
                Data invoiceSettingsData = this.f281416b;
                Intrinsics.checkNotNullParameter(invoiceSettingsData, "invoiceSettingsData");
                return new uy6.d(invoiceSettingsData);
        }
    }
}
