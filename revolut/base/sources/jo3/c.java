package jo3;

import com.google.gson.reflect.TypeToken;
import kg.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f176864a = new o();

    public final b a(String str) {
        if (str == null) {
            return null;
        }
        return (b) this.f176864a.d(str, new TypeToken<b>() { // from class: com.revolut.feature.core.model.money.MoneyTypeConverter$jsonToMoney$1$1
        }.getType());
    }
}
