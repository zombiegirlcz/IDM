package qq8;

import io3.d;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import pcd.f0;
import pcd.g0;
import pcd.h0;
import pcd.j0;
import pcd.l0;
import pcd.o;
import pcd.p;
import pcd.s;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f248500a;

    public a(n walletInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                this.f248500a = walletInteractor;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                this.f248500a = walletInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                this.f248500a = walletInteractor;
                break;
        }
    }

    public static s a(s sVar, Map map) {
        g0 g0Var = sVar.f234885h;
        if (g0Var instanceof f0) {
            p pVar = ((f0) g0Var).d;
            d dVar = (d) map.get(pVar.f234875a);
            if (dVar != null) {
                Long l2 = dVar.u;
                long jLongValue = l2 != null ? l2.longValue() : 0L;
                Long l3 = pVar.f;
                if ((l3 != null ? l3.longValue() : 0L) < jLongValue) {
                    long j2 = dVar.i;
                    String id10 = pVar.f234875a;
                    String str = pVar.f234876b;
                    String name = pVar.f234877c;
                    String currency = pVar.d;
                    Long l4 = pVar.f;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    p pocketInfo = new p(id10, str, name, currency, j2, l4);
                    Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
                    f0 vaultOrigin = new f0(pocketInfo);
                    String id11 = sVar.f234881a;
                    String str2 = sVar.f234882b;
                    h0 state = sVar.f234883c;
                    j0 j0Var = sVar.d;
                    l0 type = sVar.e;
                    String ownerId = sVar.f;
                    long j3 = sVar.f234884g;
                    DateTime createdDate = sVar.i;
                    String str3 = sVar.f234886j;
                    List list = sVar.k;
                    Long l5 = sVar.f234887l;
                    List list2 = sVar.f234888m;
                    pcd.b accountType = sVar.f234889n;
                    String str4 = sVar.o;
                    o oVar = sVar.f234890p;
                    DateTime dateTime = sVar.f234891q;
                    Intrinsics.checkNotNullParameter(id11, "id");
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(type, "type");
                    Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                    Intrinsics.checkNotNullParameter(vaultOrigin, "vaultOrigin");
                    Intrinsics.checkNotNullParameter(createdDate, "createdDate");
                    Intrinsics.checkNotNullParameter(accountType, "accountType");
                    return new s(id11, str2, state, j0Var, type, ownerId, j3, vaultOrigin, createdDate, str3, list, l5, list2, accountType, str4, oVar, dateTime);
                }
            }
        }
        return sVar;
    }
}
