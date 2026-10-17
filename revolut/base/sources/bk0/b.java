package bk0;

import com.revolut.core.network.okhttp.headers.HeadersTooLargeException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.j1;
import ulm.y0;
import zhm.h0;
import zlm.h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Interceptor {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 j1Var = hVar.e;
        String[] strArr = j1Var.f281097c.f281142a;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += (long) str.length();
        }
        if (length >= 52428) {
            HeadersTooLargeException headersTooLargeException = new HeadersTooLargeException(j1Var);
            od0.a aVar = od0.a.f224253a;
            if (od0.a.e()) {
                throw headersTooLargeException;
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, headersTooLargeException, h0Var);
        }
        return hVar.b(j1Var);
    }
}
