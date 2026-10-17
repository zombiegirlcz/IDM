package com.revolut.data.database.models.openbanking.mapper;

import com.revolut.data.database.models.openbanking.AuRegionConsentEntity;
import com.revolut.data.database.models.openbanking.ConsentAccountEntity;
import com.revolut.data.database.models.openbanking.ConsentEntity;
import com.revolut.domain.models.openbanking.AmendmentType;
import com.revolut.domain.models.openbanking.ConsentAccount;
import com.revolut.domain.models.openbanking.ConsentAccountType;
import com.revolut.domain.models.openbanking.ConsentType;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.domain.models.openbanking.PermissionType;
import com.revolut.domain.models.openbanking.ThirdParty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import rd0.c;
import rd0.d;
import w21.a;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0006*\u00020\u0007\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0007*\u00020\u0006¨\u0006\b"}, d2 = {"toEntity", "Lcom/revolut/data/database/models/openbanking/ConsentEntity;", "Lcom/revolut/domain/models/openbanking/OpenBankingConsent$Default;", "isActive", "", "toDomain", "Lcom/revolut/data/database/models/openbanking/AuRegionConsentEntity;", "Lcom/revolut/domain/models/openbanking/OpenBankingConsent$Australia;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ConsentEntityMapperKt {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public static final OpenBankingConsent.Default toDomain(@NotNull ConsentEntity consentEntity) {
        Intrinsics.checkNotNullParameter(consentEntity, "<this>");
        String id10 = consentEntity.getId();
        ConsentType consentType = (ConsentType) u1.u(consentEntity.getType(), a.f293917c);
        DateTime expiryDate = consentEntity.getExpiryDate();
        List<String> permissions = consentEntity.getPermissions();
        ArrayList arrayList = new ArrayList(w.t(permissions, 10));
        Iterator<T> it8 = permissions.iterator();
        while (it8.hasNext()) {
            arrayList.add((PermissionType) u1.u((String) it8.next(), a.e));
        }
        List<ConsentAccountEntity> accountNumbers = consentEntity.getAccountNumbers();
        ArrayList arrayList2 = new ArrayList(w.t(accountNumbers, 10));
        for (ConsentAccountEntity consentAccountEntity : accountNumbers) {
            arrayList2.add(new ConsentAccount((ConsentAccountType) u1.u(consentAccountEntity.getType(), a.f293915a), consentAccountEntity.getBranchCode(), consentAccountEntity.getAccountNumber()));
        }
        return new OpenBankingConsent.Default(id10, consentType, expiryDate, arrayList, new ThirdParty(consentEntity.getThirdPartyId(), consentEntity.getThirdPartyName(), consentEntity.getThirdPartyLogoUrl()), arrayList2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public static final ConsentEntity toEntity(@NotNull OpenBankingConsent.Default r112, boolean z) {
        Intrinsics.checkNotNullParameter(r112, "<this>");
        String str = r112.f60382a;
        String strG = u1.g(r112.f60383b, a.f293917c);
        DateTime dateTime = r112.f60384c;
        List list = r112.d;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(u1.g((PermissionType) it8.next(), a.e));
        }
        List<ConsentAccount> list2 = r112.f;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (ConsentAccount consentAccount : list2) {
            arrayList2.add(new ConsentAccountEntity(u1.g(consentAccount.f60369a, a.f293915a), consentAccount.f60370b, consentAccount.f60371c));
        }
        ThirdParty thirdParty = r112.e;
        return new ConsentEntity(str, strG, dateTime, arrayList, arrayList2, thirdParty.f60404a, thirdParty.f60405b, thirdParty.f60406c, z);
    }

    public static /* synthetic */ ConsentEntity toEntity$default(OpenBankingConsent.Default r06, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toEntity(r06, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    public static final OpenBankingConsent.Australia toDomain(@NotNull AuRegionConsentEntity auRegionConsentEntity) {
        ?? arrayList;
        Object objA;
        Intrinsics.checkNotNullParameter(auRegionConsentEntity, "<this>");
        try {
            String id10 = auRegionConsentEntity.getId();
            ConsentType consentType = (ConsentType) u1.u(auRegionConsentEntity.getType(), a.f293917c);
            DateTime dateTime = auRegionConsentEntity.getExpiryDate() != null ? new DateTime(auRegionConsentEntity.getExpiryDate().longValue(), DateTimeZone.UTC) : null;
            List<String> permissions = auRegionConsentEntity.getPermissions();
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = permissions.iterator();
            while (it8.hasNext()) {
                PermissionType permissionType = (PermissionType) u1.v((String) it8.next(), a.e);
                if (permissionType != null) {
                    arrayList2.add(permissionType);
                }
            }
            ThirdParty thirdParty = new ThirdParty(auRegionConsentEntity.getThirdPartyId(), auRegionConsentEntity.getThirdPartyName(), auRegionConsentEntity.getThirdPartyLogoUrl());
            OpenBankingConsent.Australia.ConsentState consentStateValueOf = OpenBankingConsent.Australia.ConsentState.valueOf(auRegionConsentEntity.getState());
            Long authorisedDate = auRegionConsentEntity.getAuthorisedDate();
            DateTime dateTime2 = authorisedDate != null ? new DateTime(authorisedDate.longValue(), DateTimeZone.UTC) : null;
            DateTime dateTime3 = auRegionConsentEntity.getRevokedDate() != null ? new DateTime(auRegionConsentEntity.getRevokedDate().longValue(), DateTimeZone.UTC) : null;
            List<String> pockets = auRegionConsentEntity.getPockets();
            if (pockets == null) {
                pockets = f0.f322471a;
            }
            List<String> list = pockets;
            List<String> loans = auRegionConsentEntity.getLoans();
            if (loans == null) {
                loans = f0.f322471a;
            }
            List<String> list2 = loans;
            Long amendedDate = auRegionConsentEntity.getAmendedDate();
            DateTime dateTime4 = amendedDate != null ? new DateTime(amendedDate.longValue(), DateTimeZone.UTC) : null;
            List<String> amendedData = auRegionConsentEntity.getAmendedData();
            if (amendedData != null) {
                arrayList = new ArrayList();
                for (String str : amendedData) {
                    try {
                        m.Companion companion = m.INSTANCE;
                        objA = AmendmentType.valueOf(str);
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        objA = o.a(th10);
                    }
                    if (objA instanceof n) {
                        objA = null;
                    }
                    AmendmentType amendmentType = (AmendmentType) objA;
                    if (amendmentType != null) {
                        arrayList.add(amendmentType);
                    }
                }
            } else {
                arrayList = f0.f322471a;
            }
            return new OpenBankingConsent.Australia(id10, consentType, dateTime, arrayList2, thirdParty, consentStateValueOf, dateTime2, dateTime3, list, list2, dateTime4, arrayList);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, e, h0Var);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @NotNull
    public static final AuRegionConsentEntity toEntity(@NotNull OpenBankingConsent.Australia australia) {
        Intrinsics.checkNotNullParameter(australia, "<this>");
        String str = australia.f60375a;
        String strG = u1.g(australia.f60376b, a.f293917c);
        String string = australia.f.toString();
        DateTime dateTime = australia.f60378g;
        Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
        DateTime dateTime2 = australia.f60377c;
        Long lValueOf2 = dateTime2 != null ? Long.valueOf(dateTime2.getMillis()) : null;
        DateTime dateTime3 = australia.f60379h;
        Long lValueOf3 = dateTime3 != null ? Long.valueOf(dateTime3.getMillis()) : null;
        ArrayList arrayList = australia.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(u1.g((PermissionType) it8.next(), a.e));
        }
        ThirdParty thirdParty = australia.e;
        String str2 = thirdParty.f60404a;
        String str3 = thirdParty.f60405b;
        String str4 = thirdParty.f60406c;
        List list = australia.i;
        List list2 = australia.f60380j;
        DateTime dateTime4 = australia.k;
        Long lValueOf4 = dateTime4 != null ? Long.valueOf(dateTime4.getMillis()) : null;
        List list3 = australia.f60381l;
        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            arrayList3.add(((AmendmentType) it9.next()).name());
        }
        return new AuRegionConsentEntity(str, strG, string, lValueOf, lValueOf2, lValueOf3, arrayList2, str2, str3, str4, list, list2, lValueOf4, !arrayList3.isEmpty() ? arrayList3 : null);
    }
}
