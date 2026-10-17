package j6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import i2l.e0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl3.a f171798a;

    public c(fl3.a contactsRepository) {
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        this.f171798a = contactsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j6k.b a(com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty.Revolut r3, java.util.Map r4) {
        /*
            java.lang.String r0 = r3.getE()
            r1 = 0
            if (r0 == 0) goto L18
            boolean r2 = kotlin.text.d0.W(r0)
            if (r2 == 0) goto Le
            r0 = r1
        Le:
            if (r0 == 0) goto L18
            java.lang.Object r0 = r4.get(r0)
            zm3.g r0 = (zm3.g) r0
            if (r0 != 0) goto L30
        L18:
            java.lang.String r0 = r3.getF60344b()
            if (r0 == 0) goto L2f
            boolean r2 = kotlin.text.d0.W(r0)
            if (r2 == 0) goto L25
            r0 = r1
        L25:
            if (r0 == 0) goto L2f
            java.lang.Object r4 = r4.get(r0)
            r0 = r4
            zm3.g r0 = (zm3.g) r0
            goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 == 0) goto L3e
            java.lang.String r4 = r0.getFirstName()
            if (r4 == 0) goto L3e
            boolean r2 = kotlin.text.d0.W(r4)
            if (r2 == 0) goto L3f
        L3e:
            r4 = r1
        L3f:
            if (r0 == 0) goto L4f
            java.lang.String r0 = r0.getLastName()
            if (r0 == 0) goto L4f
            boolean r2 = kotlin.text.d0.W(r0)
            if (r2 == 0) goto L4e
            goto L4f
        L4e:
            r1 = r0
        L4f:
            if (r4 != 0) goto L62
            if (r1 == 0) goto L54
            goto L62
        L54:
            j6k.b r4 = new j6k.b
            java.lang.String r0 = r3.getF60347h()
            java.lang.String r3 = r3.getI()
            r4.<init>(r0, r3)
            return r4
        L62:
            j6k.b r3 = new j6k.b
            r3.<init>(r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j6k.c.a(com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty$Revolut, java.util.Map):j6k.b");
    }

    public static MoneyRequest b(MoneyRequest moneyRequest, Map map) {
        if (!Intrinsics.f(moneyRequest.getF60316c(), MoneyRequestChannel.Revolut.f60334b)) {
            return moneyRequest;
        }
        MoneyRequestCounterParty k = moneyRequest.getK();
        MoneyRequestCounterParty.Revolut revolut = k instanceof MoneyRequestCounterParty.Revolut ? (MoneyRequestCounterParty.Revolut) k : null;
        MoneyRequestCounterParty f60320l = moneyRequest.getF60320l();
        MoneyRequestCounterParty.Revolut revolut2 = f60320l instanceof MoneyRequestCounterParty.Revolut ? (MoneyRequestCounterParty.Revolut) f60320l : null;
        if (moneyRequest.getF60322n() == MoneyRequestDirection.OUTGOING && revolut != null) {
            b bVarA = a(revolut, map);
            return MoneyRequest.a(moneyRequest, null, MoneyRequestCounterParty.Revolut.a(revolut, bVarA.a(), bVarA.b()), null, 261119);
        }
        if (moneyRequest.getF60322n() != MoneyRequestDirection.INCOMING || revolut2 == null) {
            return moneyRequest;
        }
        b bVarA2 = a(revolut2, map);
        return MoneyRequest.a(moneyRequest, null, null, MoneyRequestCounterParty.Revolut.a(revolut2, bVarA2.a(), bVarA2.b()), 260095);
    }

    public final ufm.i c(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        ufm.i iVar = new ufm.i(((sl3.k) this.f171798a).d(), new j4e.c(13, new iyi.i(this, moneyRequest)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.i d(List moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        ufm.i iVar = new ufm.i(((sl3.k) this.f171798a).d(), new j4e.c(14, new e0(moneyRequest, this)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
