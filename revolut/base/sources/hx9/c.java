package hx9;

import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.junior_core.api.JuniorCoreApi$Toggles;
import com.revolut.feature.payments.api.PaymentsToggles$ShowIncomingBankTransfer;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import jq9.d;
import jq9.e;
import jq9.f;
import jq9.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.c0;
import org.joda.time.DateTime;
import tof.a3;
import tof.c3;
import tof.e3;
import tof.n3;
import tof.p3;
import tof.r3;
import tof.u1;
import tof.y6;
import tof.z6;
import ux9.g;
import ux9.j;
import ux9.m;
import ux9.p;
import ux9.q;
import ux9.r;
import ux9.s;
import ux9.t;
import v61.l;
import v61.o;
import zm3.i;
import zm3.k;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f156416a;

    public c(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f156416a = featureToggleInteractor;
    }

    public static p a(i contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        DateTime dateTimeF = contact.f();
        if (dateTimeF != null) {
            return new p(contact, new h(dateTimeF));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static j b(c cVar, oq9.i groupBill) {
        Intrinsics.checkNotNullParameter(groupBill, "groupBill");
        return new j(groupBill.e(), new d(groupBill));
    }

    public static m c(c cVar, c0 groupSettlement) {
        Intrinsics.checkNotNullParameter(groupSettlement, "groupSettlement");
        return new m(groupSettlement.e(), new e(groupSettlement));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2 A[PHI: r1
      0x00e2: PHI (r1v17 com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty$Apm) = 
      (r1v16 com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty$Apm)
      (r1v21 com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty$Apm)
     binds: [B:42:0x00d1, B:47:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0114 A[PHI: r1
      0x0114: PHI (r1v6 com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty$BankBeneficiary) = 
      (r1v5 com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty$BankBeneficiary)
      (r1v11 com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty$BankBeneficiary)
     binds: [B:59:0x0103, B:64:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ux9.t d(hx9.c r16, com.revolut.domain.models.moneyrequest.MoneyRequest r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hx9.c.d(hx9.c, com.revolut.domain.models.moneyrequest.MoneyRequest, java.lang.String):ux9.t");
    }

    public static t e(c cVar, TransferLinkDetails.Active paymentLink) {
        k kVar;
        Intrinsics.checkNotNullParameter(paymentLink, "paymentLink");
        v61.p pVarJ = paymentLink.J();
        o f60361n = paymentLink.getF60361n();
        if (pVarJ == null) {
            if (f60361n == null) {
                return null;
            }
            String name = f60361n.getName();
            v61.m mVar = f60361n instanceof v61.m ? (v61.m) f60361n : null;
            String strB3 = mVar != null ? mVar.b3() : null;
            l lVar = f60361n instanceof l ? (l) f60361n : null;
            return new q(name, strB3, lVar != null ? lVar.b3() : null, new jq9.i(paymentLink));
        }
        if (((jte.d) cVar.f156416a).c(JuniorCoreApi$Toggles.PaymentsWithAllJunior.f76895c)) {
            int i = b.f156415a[pVarJ.c().ordinal()];
            if (i == 1) {
                kVar = k.INDIVIDUAL;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar = k.JUNIOR;
            }
            strName = kVar.name();
        }
        return new s(null, pVarJ.getCode(), pVarJ.N0(), pVarJ.getLegalName(), pVarJ.getFirstName(), pVarJ.getLastName(), pVarJ.b().f297794a, strName, pVarJ.a(), new jq9.i(paymentLink));
    }

    public static t f(c cVar, MessageItem messageItem, String userCode) {
        Intrinsics.checkNotNullParameter(messageItem, "messageItem");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        if (messageItem.getF79534g()) {
            return new ux9.l(messageItem.getF(), new f(messageItem));
        }
        if (Intrinsics.f(messageItem.getE().getF79529a(), userCode) && !Intrinsics.f(messageItem.getF(), userCode)) {
            return new ux9.o(messageItem.getF(), new f(messageItem));
        }
        if (!Intrinsics.f(messageItem.getF(), userCode) || Intrinsics.f(messageItem.getE().getF79529a(), userCode)) {
            return null;
        }
        return new ux9.o(messageItem.getE().getF79529a(), new f(messageItem));
    }

    public static t g(c cVar, a3 transaction) {
        u1 u1VarT;
        String id10;
        String name;
        String id11;
        String strA;
        do3.b bVarA;
        do3.b bVarA2;
        String strA2;
        String strA3;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.d() != null) {
            tof.k kVarD = transaction.d();
            if (kVarD != null) {
                return new ux9.a(kVarD.getId(), new jq9.j(transaction));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (transaction.y() == y6.CRYPTO_WITHDRAWAL) {
            r3 r3VarN = transaction.n();
            if (r3VarN != null && (strA3 = r3VarN.a()) != null) {
                return new ux9.h(strA3, new jq9.j(transaction));
            }
        } else if (k71.k.y0(transaction)) {
            p3 p3VarM = transaction.m();
            if (p3VarM != null && (strA2 = p3VarM.a()) != null) {
                return new ux9.i(strA2, new jq9.j(transaction));
            }
        } else {
            if (k71.k.K0(transaction)) {
                n3 n3VarI = transaction.i();
                String id12 = n3VarI != null ? n3VarI.getId() : null;
                if (id12 != null) {
                    return new ux9.f(id12, new jq9.j(transaction));
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            if (transaction.u() != null) {
                z6 z6VarU = transaction.u();
                String code = z6VarU != null ? z6VarU.getCode() : null;
                z6 z6VarU2 = transaction.u();
                String strN0 = z6VarU2 != null ? z6VarU2.N0() : null;
                z6 z6VarU3 = transaction.u();
                String phone = z6VarU3 != null ? z6VarU3.getPhone() : null;
                z6 z6VarU4 = transaction.u();
                String legalName = z6VarU4 != null ? z6VarU4.getLegalName() : null;
                z6 z6VarU5 = transaction.u();
                String firstName = z6VarU5 != null ? z6VarU5.getFirstName() : null;
                z6 z6VarU6 = transaction.u();
                String lastName = z6VarU6 != null ? z6VarU6.getLastName() : null;
                z6 z6VarU7 = transaction.u();
                String country = z6VarU7 != null ? z6VarU7.getCountry() : null;
                z6 z6VarU8 = transaction.u();
                if (z6VarU8 == null || (bVarA2 = z6VarU8.a()) == null) {
                    bVarA2 = do3.b.FULL;
                }
                do3.b bVar = bVarA2;
                z6 z6VarU9 = transaction.u();
                String strB = z6VarU9 != null ? z6VarU9.b() : null;
                z6 z6VarU10 = transaction.u();
                return new s(phone, code, strN0, legalName, firstName, lastName, country, z6VarU10 != null ? z6VarU10.d() : null, strB, bVar, new jq9.j(transaction));
            }
            if (transaction.w() != null) {
                z6 z6VarW = transaction.w();
                String code2 = z6VarW != null ? z6VarW.getCode() : null;
                z6 z6VarW2 = transaction.w();
                String strN02 = z6VarW2 != null ? z6VarW2.N0() : null;
                z6 z6VarW3 = transaction.w();
                String phone2 = z6VarW3 != null ? z6VarW3.getPhone() : null;
                z6 z6VarW4 = transaction.w();
                String legalName2 = z6VarW4 != null ? z6VarW4.getLegalName() : null;
                z6 z6VarW5 = transaction.w();
                String firstName2 = z6VarW5 != null ? z6VarW5.getFirstName() : null;
                z6 z6VarW6 = transaction.w();
                String lastName2 = z6VarW6 != null ? z6VarW6.getLastName() : null;
                z6 z6VarW7 = transaction.w();
                String country2 = z6VarW7 != null ? z6VarW7.getCountry() : null;
                z6 z6VarW8 = transaction.w();
                if (z6VarW8 == null || (bVarA = z6VarW8.a()) == null) {
                    bVarA = do3.b.FULL;
                }
                do3.b bVar2 = bVarA;
                z6 z6VarW9 = transaction.w();
                String strB2 = z6VarW9 != null ? z6VarW9.b() : null;
                z6 z6VarW10 = transaction.w();
                return new s(phone2, code2, strN02, legalName2, firstName2, lastName2, country2, z6VarW10 != null ? z6VarW10.d() : null, strB2, bVar2, new jq9.j(transaction));
            }
            e3 e3VarB = transaction.x().b();
            if ((e3VarB != null ? e3VarB.a() : null) != null) {
                e3 e3VarB2 = transaction.x().b();
                if (e3VarB2 != null && (strA = e3VarB2.a()) != null) {
                    return new ux9.e(new ux9.b(strA), new jq9.j(transaction));
                }
            } else {
                e3 e3VarB3 = transaction.x().b();
                if ((e3VarB3 != null ? e3VarB3.getId() : null) != null) {
                    e3 e3VarB4 = transaction.x().b();
                    if (e3VarB4 != null && (id11 = e3VarB4.getId()) != null) {
                        return new ux9.e(new ux9.b(id11), new jq9.j(transaction));
                    }
                } else if (!((jte.d) cVar.f156416a).c(PaymentsToggles$ShowIncomingBankTransfer.f79165c) || transaction.l() == null) {
                    e3 e3VarB5 = transaction.x().b();
                    if ((e3VarB5 != null ? e3VarB5.getName() : null) != null) {
                        e3 e3VarB6 = transaction.x().b();
                        if (e3VarB6 != null && (name = e3VarB6.getName()) != null) {
                            e3 e3VarB7 = transaction.x().b();
                            String phone3 = e3VarB7 != null ? e3VarB7.getPhone() : null;
                            e3 e3VarB8 = transaction.x().b();
                            return new q(name, phone3, e3VarB8 != null ? e3VarB8.getEmail() : null, new jq9.j(transaction));
                        }
                    } else {
                        c3 c3VarA = transaction.x().a();
                        if ((c3VarA != null ? c3VarA.getId() : null) != null) {
                            c3 c3VarA2 = transaction.x().a();
                            if (c3VarA2 != null && (id10 = c3VarA2.getId()) != null) {
                                return new ux9.a(id10, new jq9.j(transaction));
                            }
                        } else if (transaction.e() != null) {
                            String strE = transaction.e();
                            if (strE != null) {
                                return new r(strE, new jq9.j(transaction));
                            }
                        } else if (transaction.t() != null && (u1VarT = transaction.t()) != null) {
                            return new g(u1VarT.getId(), new jq9.j(transaction));
                        }
                    }
                } else {
                    String strL = transaction.l();
                    if (strL != null) {
                        return new ux9.e(new ux9.c(strL), new jq9.j(transaction));
                    }
                }
            }
        }
        return null;
    }
}
