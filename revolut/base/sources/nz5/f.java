package nz5;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final void a(OkHttpClient.a aVar, e interceptor) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        ArrayList arrayList = aVar.f226072c;
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            } else if (((Interceptor) it8.next()) instanceof xj0.a) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.add(i, interceptor);
        } else {
            arrayList.add(interceptor);
        }
    }
}
