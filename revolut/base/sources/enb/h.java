package enb;

import cnb.i;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type f127802a = new TypeToken<List<? extends i>>() { // from class: com.revolut.feature.retail.savings.impl.documents.data.repository.SavingsDocumentsRepositoryKt$TAX_FORM$1
    }.getType();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f127803b;

    static {
        Type type = new TypeToken<List<? extends cnb.f>>() { // from class: com.revolut.feature.retail.savings.impl.documents.data.repository.SavingsDocumentsRepositoryKt$STATEMENT_OPTION_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f127803b = type;
    }
}
