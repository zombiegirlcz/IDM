package pr4;

import java.util.List;
import org.joda.time.DateTime;
import tof.fc;
import tof.g8;
import tof.h8;
import tof.i7;
import tof.q7;
import tof.qb;
import tof.s9;
import tof.u8;
import tof.v6;
import tof.v8;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d {
    public static final q7 a(vl4.a aVar) {
        i7.c cVar = i7.Companion;
        g8 g8Var = new g8(new DateTime(aVar.f290244c.toInstant().toEpochMilli()));
        h8 h8Var = new h8(new DateTime(aVar.d.toInstant().toEpochMilli()));
        u8 u8Var = new u8(new DateTime(aVar.f290242a.toInstant().toEpochMilli()));
        v8 v8Var = new v8(new DateTime(aVar.f290243b.toInstant().toEpochMilli()), true);
        v6[] v6VarArr = {v6.COMPLETED};
        cVar.getClass();
        qb qbVarC = i7.c.c(v6VarArr);
        List list = aVar.e;
        return i7.c.a(g8Var, h8Var, u8Var, v8Var, qbVarC, !list.isEmpty() ? fc.b(new s9(d0.i1(list))) : null);
    }
}
