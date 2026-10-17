package qcl;

import com.google.gson.reflect.TypeToken;
import hcl.p0;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n {
    public static List a(String str) {
        if (str == null) {
            return null;
        }
        kg.o oVarA = zbl.a.a();
        Type type = new TypeToken<List<? extends p0>>() { // from class: com.revolut.shared.feature.wealth.domain.impl.data.database.typeconverters.InstrumentTagTypeConverter$fromJsonToInstrumentTagEmbeddedEntity$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }
}
