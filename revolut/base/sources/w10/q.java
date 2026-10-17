package w10;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.UUID;
import kg.u;
import kg.w;
import kg.x;
import kotlin.jvm.internal.Intrinsics;
import v20.a2;
import v20.b2;
import v20.c2;
import v20.d2;
import v20.e2;
import v20.f2;
import v20.g2;
import v20.h2;
import v20.i2;
import v20.j2;
import v20.k2;
import v20.m1;
import v20.n1;
import v20.o1;
import v20.p1;
import v20.q1;
import v20.r1;
import v20.s1;
import v20.t1;
import v20.u1;
import v20.v1;
import v20.w1;
import v20.x1;
import v20.y1;
import v20.z1;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements kg.t {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kg.t
    public final Object deserialize(u json, Type type, kg.s sVar) throws Throwable {
        String strF;
        Intrinsics.checkNotNullParameter(json, "json");
        json.getClass();
        if (json instanceof w) {
            w wVarC = json.c();
            u uVarI = wVarC.i("type");
            String strF2 = uVarI != null ? uVarI.f() : null;
            if (!Intrinsics.f(strF2, "deleted")) {
                throw new JsonParseException(j6.a.q("Unknown service message status type: ", strF2));
            }
            u uVarI2 = wVarC.i("messageId");
            if (uVarI2 == null || (strF = uVarI2.f()) == null) {
                throw new JsonParseException("Missing messageId for Deleted status");
            }
            UUID uuidFromString = UUID.fromString(strF);
            Intrinsics.h(uuidFromString);
            return new u1(uuidFromString);
        }
        if (!(json instanceof x)) {
            throw new JsonParseException("Invalid service message status format");
        }
        String strF3 = json.f();
        if (strF3 != null) {
            switch (strF3.hashCode()) {
                case -2056114370:
                    if (strF3.equals("snoozed")) {
                        return g2.f285418a;
                    }
                    break;
                case -1357520532:
                    if (strF3.equals("closed")) {
                        return s1.f285560a;
                    }
                    break;
                case -1010579351:
                    if (strF3.equals("opened")) {
                        return a2.f285331a;
                    }
                    break;
                case -988476804:
                    if (strF3.equals("pickup")) {
                        return c2.f285356a;
                    }
                    break;
                case -682587753:
                    if (strF3.equals("pending")) {
                        return b2.f285338a;
                    }
                    break;
                case -535605866:
                    if (strF3.equals("callInitialized")) {
                        return o1.f285500a;
                    }
                    break;
                case -455138212:
                    if (strF3.equals("reopened")) {
                        return e2.f285372a;
                    }
                    break;
                case -427732083:
                    if (strF3.equals("transcriptReady")) {
                        return h2.f285427a;
                    }
                    break;
                case -408934084:
                    if (strF3.equals("callRequestOfferCommunicated")) {
                        return q1.f285526a;
                    }
                    break;
                case -369881650:
                    if (strF3.equals("assigned")) {
                        return m1.f285470a;
                    }
                    break;
                case -344313211:
                    if (strF3.equals("unsnoozed")) {
                        return j2.f285445a;
                    }
                    break;
                case -341328904:
                    if (strF3.equals("resolved")) {
                        return f2.f285402a;
                    }
                    break;
                case -307319303:
                    if (strF3.equals("contentUploaded")) {
                        return t1.f285571a;
                    }
                    break;
                case -234430277:
                    if (strF3.equals("updated")) {
                        return k2.f285454a;
                    }
                    break;
                case -155741355:
                    if (strF3.equals("inboxUpdated")) {
                        return y1.f285613a;
                    }
                    break;
                case -123173735:
                    if (strF3.equals("canceled")) {
                        return p1.f285521a;
                    }
                    break;
                case 108285828:
                    if (strF3.equals("rated")) {
                        return d2.f285362a;
                    }
                    break;
                case 709191053:
                    if (strF3.equals("callCompleted")) {
                        return n1.f285487a;
                    }
                    break;
                case 1234020052:
                    if (strF3.equals("initialized")) {
                        return z1.f285617a;
                    }
                    break;
                case 1238742130:
                    if (strF3.equals("escalated")) {
                        return w1.f285592a;
                    }
                    break;
                case 1550463001:
                    if (strF3.equals("deleted")) {
                        hx7.e.n(new JsonParseException("Deleted status in old format without messageId - data corrupted"));
                        return new i2(strF3);
                    }
                    break;
                case 1925736384:
                    if (strF3.equals("dropped")) {
                        return v1.f285582a;
                    }
                    break;
                case 1984337987:
                    if (strF3.equals("callStarted")) {
                        return r1.f285539a;
                    }
                    break;
                case 2100926828:
                    if (strF3.equals("escalatedToLiveAgent")) {
                        return x1.f285604a;
                    }
                    break;
            }
        }
        Intrinsics.h(strF3);
        return new i2(strF3);
    }
}
