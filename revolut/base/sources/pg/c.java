package pg;

import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;
import kg.l0;
import kg.m0;
import kg.o;

/* JADX INFO: loaded from: classes.dex */
public class c implements m0 {
    @Override // kg.m0
    public final l0 a(o oVar, TypeToken typeToken) {
        if (typeToken.getRawType() == Timestamp.class) {
            return new d(oVar.h(Date.class));
        }
        return null;
    }
}
