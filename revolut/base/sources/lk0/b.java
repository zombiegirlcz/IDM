package lk0;

import com.revolut.data.model.Data;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f196164b;

    public /* synthetic */ b(f fVar, int i) {
        this.f196163a = i;
        this.f196164b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        switch (this.f196163a) {
            case 0:
                g newPagedData = (g) obj2;
                Intrinsics.checkNotNullParameter(newPagedData, "newPagedData");
                List list = newPagedData.f196174a;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = true;
                } else {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        if (Intrinsics.f(((e) it8.next()).f196172b, this.f196164b)) {
                            z = false;
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Data pageData = (Data) obj2;
                Intrinsics.checkNotNullParameter(pageData, "pageData");
                List list2 = (List) pageData.getContent();
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                Throwable error = pageData.getError();
                return new e(list2, this.f196164b, pageData.getLoading(), null, error, 8);
        }
    }
}
