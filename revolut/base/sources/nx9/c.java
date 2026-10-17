package nx9;

import jq9.e;
import jq9.f;
import jq9.g;
import jq9.h;
import jq9.i;
import jq9.j;
import jq9.k;
import jq9.l;
import jq9.m;
import jq9.n;
import jq9.o;
import jq9.p;
import jq9.q;
import jq9.r;
import jq9.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final Pair a(jq9.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar instanceof jq9.c) {
            return new Pair(String.valueOf(((jq9.c) bVar).f177497a.getMillis()), a.NEW_GROUP);
        }
        if (bVar instanceof h) {
            return new Pair(String.valueOf(((h) bVar).f177502a.getMillis()), a.NEW_CONTACT);
        }
        if (bVar instanceof f) {
            return new Pair(((f) bVar).f177500a.f79531a, a.MESSAGE);
        }
        if (bVar instanceof g) {
            return new Pair(((g) bVar).f177501a.f60314a, a.MONEY_REQUEST);
        }
        if (bVar instanceof i) {
            return new Pair(((i) bVar).f177503a.f60354b, a.PAYMENT_LINK);
        }
        if (bVar instanceof j) {
            return new Pair(((j) bVar).f177504a.f272579a, a.TRANSACTION);
        }
        if (bVar instanceof jq9.d) {
            return new Pair(((jq9.d) bVar).f177498a.getId(), a.GROUP_BILL);
        }
        if (bVar instanceof e) {
            return new Pair(((e) bVar).f177499a.getId(), a.GROUP_SETTLEMENT);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final b b(k kVar, boolean z) {
        Pair pair;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Pair pairA = a(kVar.c());
        String str = (String) pairA.f186385a;
        a aVar = (a) pairA.f186386b;
        if (kVar instanceof m) {
            String str2 = z ? ((m) kVar).f177508b.f132330b : null;
            if (str2 == null) {
                str2 = ((m) kVar).f177508b.f132329a;
            }
            return new b(str2, d.BANK, str, aVar, 0, 0L);
        }
        if (kVar instanceof n) {
            return new b(((n) kVar).f177510b.f81495a.f81490a, d.CARD, str, aVar, 0, 0L);
        }
        if (kVar instanceof r) {
            return new b(((r) kVar).f177518b.f71059a, d.CRYPTO, str, aVar, 0, 0L);
        }
        if (!(kVar instanceof p)) {
            if (kVar instanceof s) {
                s sVar = (s) kVar;
                return new b(sVar.f177520b.f79285a, d.GROUP, str, aVar, sVar.d, sVar.e);
            }
            if (kVar instanceof o) {
                return new b(((o) kVar).f177512b.f13938a, d.CHARITY, str, aVar, 0, 0L);
            }
            if (kVar instanceof l) {
                l lVar = (l) kVar;
                return new b(lVar.f177506b.getF62134a().getF62112a(), d.APM_CONTACT, str, aVar, lVar.d, 0L);
            }
            if (!(kVar instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
            q qVar = (q) kVar;
            return new b(qVar.f177516b.f79060a, d.PAYMENT_COUNTERPARTY, str, aVar, qVar.d, 0L);
        }
        p pVar = (p) kVar;
        zm3.a aVar2 = pVar.f177514b;
        if (aVar2 instanceof zm3.l) {
            pair = new Pair(((zm3.l) aVar2).getCode(), d.CONTACT_CODE);
        } else if (aVar2 instanceof zm3.f) {
            pair = new Pair(((zm3.f) aVar2).f323345a, d.CONTACT_PHONE);
        } else if (aVar2 instanceof zm3.e) {
            pair = new Pair(((zm3.e) aVar2).f323340a, d.CONTACT_EMAIL);
        } else if (aVar2 instanceof zm3.o) {
            pair = new Pair(((zm3.o) aVar2).f323376a, d.CONTACT_PHONE);
        } else {
            if (!(aVar2 instanceof zm3.n)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(((zm3.n) aVar2).f323373a, d.CONTACT_EMAIL);
        }
        return new b((String) pair.f186385a, (d) pair.f186386b, str, aVar, pVar.d, pVar.e);
    }
}
