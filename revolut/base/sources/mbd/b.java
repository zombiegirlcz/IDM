package mbd;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lcd.d;
import lcd.e;
import lcd.f;
import lcd.i;
import ncd.j;
import pcd.g0;
import pcd.j0;
import pcd.o;
import pcd.s;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static i a(s vault) {
        d dVar;
        f fVar;
        ZonedDateTime zonedDateTimeM;
        lcd.a aVar;
        d dVar2;
        lcd.b bVar;
        lcd.b bVar2;
        e eVar;
        Intrinsics.checkNotNullParameter(vault, "vault");
        pcd.a aVarI = vault.i();
        g0 g0Var = vault.f234885h;
        String str = vault.f234882b;
        if (str == null) {
            str = vault.f234881a;
        }
        String str2 = str;
        String pocketId = g0Var.getPocketId();
        String str3 = vault.f234881a;
        String str4 = g0Var.f234859a;
        int i = a.f[vault.f234883c.ordinal()];
        if (i == 1) {
            dVar = d.ACTIVE;
        } else if (i == 2) {
            dVar = d.PENDING_ACTIVATION;
        } else if (i == 3) {
            dVar = d.CREATED;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = d.CLOSED;
        }
        j0 j0Var = vault.d;
        if (j0Var != null) {
            int i2 = a.f204199g[j0Var.f234868a.ordinal()];
            if (i2 == 1) {
                eVar = e.AWAITING_CUSTOMER;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = e.AWAITING_VERIFICATION;
            }
            fVar = new f(eVar, j0Var.f234869b);
        } else {
            fVar = null;
        }
        String str5 = aVarI.f234842b;
        ZonedDateTime zonedDateTimeG = jli.b.g(vault.i);
        f fVar2 = fVar;
        long j2 = vault.f234884g;
        Long lValueOf = Long.valueOf(j2);
        if (j2 == 0) {
            lValueOf = null;
        }
        dj0.d dVar3 = lValueOf != null ? new dj0.d(lValueOf.longValue(), aVarI.k) : null;
        Long l2 = vault.f234887l;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
            zonedDateTimeM = pu7.a.M(jLongValue, zoneIdSystemDefault);
        } else {
            zonedDateTimeM = null;
        }
        dj0.d dVar4 = aVarI.d;
        String str6 = vault.f;
        int i3 = a.f204200h[vault.f234889n.ordinal()];
        if (i3 == 1) {
            aVar = lcd.a.PERSONAL;
        } else if (i3 == 2) {
            aVar = lcd.a.PERSONAL_JOINT;
        } else if (i3 == 3) {
            aVar = lcd.a.YOUTH;
        } else if (i3 == 4) {
            aVar = lcd.a.TEEN;
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = lcd.a.UNKNOWN;
        }
        j jVar = aVarI.e;
        String str7 = vault.o;
        o oVar = vault.f234890p;
        if (oVar != null) {
            int i5 = a.i[oVar.ordinal()];
            dVar2 = dVar;
            if (i5 == 1) {
                bVar2 = lcd.b.AWAITING_TAX_INFORMATION;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2 = null;
            }
            bVar = bVar2;
        } else {
            dVar2 = dVar;
            bVar = null;
        }
        return new i(str2, pocketId, str3, str4, dVar2, fVar2, str5, zonedDateTimeG, dVar3, zonedDateTimeM, dVar4, str6, aVar, jVar, str7, bVar, aVarI.f234844g, aVarI.f234845h, aVarI.i, aVarI.f234846j);
    }
}
