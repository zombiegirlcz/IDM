package pl3;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.contacts.impl.GsonHolder;
import java.lang.reflect.Type;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static ll3.a a(String str) {
        if (str == null) {
            return null;
        }
        o oVarA = GsonHolder.a();
        Type type = new TypeToken<ll3.a>() { // from class: com.revolut.feature.contacts.impl.data.database.typeconverter.ContactTypeConverter$fromJsonToContactType$lambda$0$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (ll3.a) objD;
    }
}
