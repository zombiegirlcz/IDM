package qwj;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o0j.c;
import o0j.d;
import o0j.e;
import o0j.f;
import o0j.g;
import o0j.h;
import o0j.i;
import o0j.j;
import o0j.k;
import o0j.m;
import o0j.n;
import o0j.o;
import org.joda.time.LocalDate;
import rwj.b;
import rwj.c;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final ArrayList a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ArrayList arrayList = new ArrayList();
        if (cVar.getAddress() != null) {
            arrayList.add(new d(cVar.getAddressRef(), to3.a.a(cVar.getAddress())));
        }
        if (cVar.getFirstName() != null || cVar.getLastName() != null || cVar.getMiddleName() != null || cVar.getNativeFirstName() != null || cVar.getNativeLastName() != null || cVar.getFirstSurname() != null || cVar.getSecondSurname() != null) {
            String firstName = cVar.getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            arrayList.add(new j(firstName, cVar.getMiddleName(), cVar.getLastName(), cVar.getNativeFirstName(), cVar.getNativeLastName(), cVar.getFirstSurname(), cVar.getSecondSurname()));
        }
        if (cVar.getBirthDate() != null) {
            LocalDate localDate = LocalDate.parse(cVar.getBirthDate());
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            arrayList.add(new g(localDate));
        }
        if (cVar.getEmail() != null) {
            arrayList.add(new h(cVar.getEmail()));
        }
        if (cVar.getPurposeOfAccount() != null) {
            arrayList.add(new n(cVar.getPurposeOfAccount()));
        }
        if (cVar.getAlias() != null) {
            arrayList.add(new e(cVar.getAlias()));
        }
        if (cVar.getOccupation() != null) {
            arrayList.add(new k(cVar.getOccupation()));
        }
        if (cVar.getSsn() != null || cVar.getItin() != null) {
            arrayList.add(new c.m(cVar.getSsn(), cVar.getItin()));
        }
        if (cVar.getSkipActivationReady() != null) {
            arrayList.add(c.a.f221216a);
        }
        if (cVar.getSkipUsIdCode() != null) {
            arrayList.add(c.n.f221229a);
        }
        if (cVar.getContacts() != null) {
            arrayList.add(new f(cVar.getContacts().getPhoneNumbers()));
        }
        if (cVar.getSkipDocumentKyc() != null) {
            arrayList.add(c.h.f221223a);
        }
        if (cVar.getSkipCitizenship() != null) {
            arrayList.add(c.e.f221220a);
        }
        if (cVar.getSkipAddressVerificationKyc() != null) {
            arrayList.add(c.b.f221217a);
        }
        if (cVar.getSkipMarketingConsent() != null) {
            arrayList.add(c.j.f221225a);
        }
        if (cVar.getUsername() != null) {
            arrayList.add(new o(cVar.getUsername()));
        }
        Boolean politicallyExposedPersonDeclaration = cVar.getPoliticallyExposedPersonDeclaration();
        if (politicallyExposedPersonDeclaration != null) {
            arrayList.add(new m(politicallyExposedPersonDeclaration.booleanValue()));
        }
        b monthlyIncomeAmount = cVar.getMonthlyIncomeAmount();
        if (monthlyIncomeAmount != null) {
            Intrinsics.checkNotNullParameter(monthlyIncomeAmount, "<this>");
            long amount = monthlyIncomeAmount.getAmount();
            xi0.a aVar = xi0.b.Companion;
            String currency = monthlyIncomeAmount.getCurrency();
            aVar.getClass();
            arrayList.add(new i(new dj0.d(amount, xi0.a.a(currency))));
        }
        Boolean skipDocumentId = cVar.getSkipDocumentId();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.f(skipDocumentId, bool)) {
            arrayList.add(c.g.f221222a);
        }
        if (Intrinsics.f(cVar.getSkipProfileDetails(), bool)) {
            arrayList.add(c.l.f221226a);
        }
        if (Intrinsics.f(cVar.getSkipContactsSync(), bool)) {
            arrayList.add(c.f.f221221a);
        }
        if (Intrinsics.f(cVar.getSkipAiCallsConsent(), bool)) {
            arrayList.add(c.C1228c.f221218a);
        }
        if (Intrinsics.f(cVar.getSkipAnalyticsEventTrackingConsent(), bool)) {
            arrayList.add(c.d.f221219a);
        }
        if (Intrinsics.f(cVar.getSkipJuniorGraduationAccountLinked(), bool)) {
            arrayList.add(c.i.f221224a);
        }
        return arrayList;
    }
}
