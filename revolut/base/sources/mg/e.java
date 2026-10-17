package mg;

import com.google.gson.reflect.TypeToken;
import java.util.Date;

/* JADX INFO: loaded from: classes17.dex */
public class e implements kg.m0 {
    @Override // kg.m0
    public final kg.l0 a(kg.o oVar, TypeToken typeToken) {
        if (typeToken.getRawType() == Date.class) {
            return new h(g.f205074b, 2, 2);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
