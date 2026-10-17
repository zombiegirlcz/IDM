package ce9;

import ip0.pb0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.q implements Function0 {
    public static final k f = new k();

    public k() {
        super(0, m.class, "getLoadingItems", "getLoadingItems()Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pb0("PAGE_LOADING_ID"));
        return arrayList;
    }
}
