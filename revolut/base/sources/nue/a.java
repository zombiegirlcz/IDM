package nue;

import com.revolut.data.network.models.openbanking.mapper.ExternalInstitutionDtoMapperKt;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import java.util.concurrent.CopyOnWriteArrayList;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static TopupMethod.SuggestedMethod a(xue.c cVar) {
        Boolean steerDirectly = cVar.getSteerDirectly();
        boolean zBooleanValue = steerDirectly != null ? steerDirectly.booleanValue() : true;
        if (cVar.getPaymentType() == xue.b.OPEN_BANKING && cVar.getMethodType() == xue.a.STORED) {
            io3.b domain = null;
            String id10 = cVar.getId();
            if (id10 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Id should be present for OPEN_BANKING and STORED default method ");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return null;
            }
            String title = cVar.getTitle();
            String description = cVar.getDescription();
            ro3.a logo = cVar.getLogo();
            if (logo != null) {
                domain = ExternalInstitutionDtoMapperKt.toDomain(logo);
            }
            return new TopupMethod.SuggestedMethod.OpenbankingStoredMethod(id10, title, description, domain, u.c(cVar.getCurrencyCode()), null, zBooleanValue);
        }
        io3.b domain2 = null;
        xue.b paymentType = cVar.getPaymentType();
        xue.b bVar = xue.b.EASY_BANK_TRANSFER;
        if (paymentType == bVar && cVar.getMethodType() == xue.a.SUGGESTED) {
            String id11 = cVar.getId();
            if (id11 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Id should be present for EASY_BANK_TRANSFER and SUGGESTED default method ");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                return null;
            }
            String title2 = cVar.getTitle();
            String description2 = cVar.getDescription();
            ro3.a logo2 = cVar.getLogo();
            if (logo2 != null) {
                domain2 = ExternalInstitutionDtoMapperKt.toDomain(logo2);
            }
            return new TopupMethod.SuggestedMethod.OpenBankingInstitution(id11, title2, description2, domain2, u.c(cVar.getCurrencyCode()), null, zBooleanValue);
        }
        if (cVar.getPaymentType() == bVar && cVar.getMethodType() == xue.a.OTHER) {
            TopupMethodType topupMethodType = TopupMethodType.EASY_BANK_TRANSFER;
            String title3 = cVar.getTitle();
            String description3 = cVar.getDescription();
            ro3.a logo3 = cVar.getLogo();
            if (logo3 != null) {
                domain2 = ExternalInstitutionDtoMapperKt.toDomain(logo3);
            }
            return new TopupMethod.SuggestedMethod.OtherMethod(topupMethodType, title3, description3, domain2, u.c(cVar.getCurrencyCode()), null, zBooleanValue);
        }
        if (cVar.getPaymentType() == xue.b.PIX_SMART_TRANSFER && cVar.getMethodType() == xue.a.SUGGESTED) {
            String id12 = cVar.getId();
            if (id12 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Id should be present for PIX_SMART_TRANSFER and SUGGESTED default method ");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                return null;
            }
            String title4 = cVar.getTitle();
            String description4 = cVar.getDescription();
            ro3.a logo4 = cVar.getLogo();
            if (logo4 != null) {
                domain2 = ExternalInstitutionDtoMapperKt.toDomain(logo4);
            }
            return new TopupMethod.SuggestedMethod.PixSmartTransferInstitution(id12, title4, description4, domain2, u.c(cVar.getCurrencyCode()), null, zBooleanValue);
        }
        IllegalStateException illegalStateException4 = new IllegalStateException("None of the states defined in BE contract met for card steering suggested method id=" + cVar.getId() + ", paymentType=" + cVar.getPaymentType() + ", methodType=" + cVar.getMethodType());
        h0 h0Var4 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException4, h0Var4);
        return null;
    }
}
