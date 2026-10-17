package acd;

import a09.b;
import a0e.o;
import a72.k;
import a7b.r;
import com.revolut.feature.shared.savings.impl.info_sheets.data.network.InfoSheetsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import ue0.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InfoSheetsService f3126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f3127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f3128c;
    public final x4l.c d;

    public a(InfoSheetsService service, j memoryCache, c savingsStorage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(savingsStorage, "savingsStorage");
        this.f3126a = service;
        this.f3127b = memoryCache;
        this.f3128c = savingsStorage;
        Continuation continuation = null;
        this.d = new x4l.c(new k(this, continuation, 1), new r(this, 17), new b(this, 29), new a0l.k(this, continuation, 26), new o(this, continuation, 3));
    }

    public static String a(mcd.c cVar, String str) {
        String str2 = cVar.f204340b;
        String strConcat = str2 != null ? "_".concat(str2) : "";
        String str3 = cVar.f204341c;
        String strConcat2 = str3 != null ? "_".concat(str3) : "";
        String str4 = cVar.d;
        return j6.a.r(str, strConcat, strConcat2, str4 != null ? "_".concat(str4) : "");
    }
}
