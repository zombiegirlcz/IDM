package xr2;

import kotlin.jvm.internal.Intrinsics;
import kr2.e;
import tof.aa;
import tof.cc;
import tof.fa;
import tof.h9;
import tof.i7;
import tof.ia;
import tof.ja;
import tof.na;
import tof.q7;
import tof.y6;
import tof.y7;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements nr2.a {
    public final q7 a(e blockedMerchant, String str) {
        Intrinsics.checkNotNullParameter(blockedMerchant, "blockedMerchant");
        i7.c cVar = i7.Companion;
        y7 y7Var = new y7(blockedMerchant.f188643a);
        ia iaVar = new ia(blockedMerchant.f188647h);
        ja jaVar = new ja(blockedMerchant.f188645c);
        String str2 = blockedMerchant.f188646g;
        fa faVar = str2 != null ? new fa(str2) : null;
        cVar.getClass();
        return i7.c.a(i7.c.b(y7Var, iaVar, jaVar, faVar), new cc(u.c(y6.CARD_PAYMENT)), new h9(true), str != null ? new aa(str) : new na(i7.a0.f272807a));
    }
}
