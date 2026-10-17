package cuc;

import com.revolut.feature.security_hub.api.models.DigitizedCards;
import com.revolut.feature.security_hub.api.models.DigitizedCardsFlags;
import com.revolut.feature.security_hub.api.models.Enrollment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.feature.security_hub.api.models.DigitizedCard a(auc.g r18) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cuc.a.a(auc.g):com.revolut.feature.security_hub.api.models.DigitizedCard");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static DigitizedCards b(auc.h hVar) {
        ?? arrayList;
        ?? arrayList2;
        auc.i flags;
        List pendingEnrollments;
        qtc.f fVar;
        List digitizedCards;
        if (hVar == null || (digitizedCards = hVar.getDigitizedCards()) == null) {
            arrayList = zhm.f0.f322471a;
        } else {
            List list = digitizedCards;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(a((auc.g) it8.next()));
            }
        }
        Boolean addNewCardsToC2P = null;
        if (hVar == null || (pendingEnrollments = hVar.getPendingEnrollments()) == null) {
            arrayList2 = zhm.f0.f322471a;
        } else {
            List<auc.j> list2 = pendingEnrollments;
            arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (auc.j jVar : list2) {
                String id10 = jVar.getId();
                String cardId = jVar.getCardId();
                String tokenRequestor = jVar.getTokenRequestor();
                qtc.f[] fVarArrValues = qtc.f.values();
                int length = fVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        fVar = null;
                        break;
                    }
                    fVar = fVarArrValues[i];
                    if (kotlin.text.a0.z(fVar.name(), tokenRequestor, true)) {
                        break;
                    }
                    i++;
                }
                if (fVar == null) {
                    fVar = qtc.f.UNKNOWN;
                }
                arrayList2.add(new Enrollment(id10, cardId, fVar, jVar.getCreatedAt()));
            }
        }
        if (hVar != null && (flags = hVar.getFlags()) != null) {
            addNewCardsToC2P = flags.getAddNewCardsToC2P();
        }
        return new DigitizedCards(arrayList, arrayList2, new DigitizedCardsFlags(addNewCardsToC2P));
    }
}
