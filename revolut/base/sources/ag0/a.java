package ag0;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f4748a = new o();

    public final List a(String str) {
        if (str == null || str.length() == 0) {
            return f0.f322471a;
        }
        Type type = new TypeToken<List<? extends zf0.a>>() { // from class: com.revolut.core.faq.data.db.typeconverters.FaqActionsConverter$stringToFaqActions$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = this.f4748a.d(str, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (List) objD;
    }
}
