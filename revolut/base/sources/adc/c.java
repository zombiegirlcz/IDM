package adc;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l6c.b;
import l6c.f;
import l6c.g;
import l6c.i;
import l6c.j;
import org.jetbrains.annotations.NotNull;
import q6c.n;
import r6c.d;
import r6c.e;
import sf0.h;
import u6c.k;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f3323a;

    public c(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f3323a = serverErrorParser;
    }

    public static l6c.b a(e processingOrderState) {
        Intrinsics.checkNotNullParameter(processingOrderState, "processingOrderState");
        n nVar = processingOrderState.d;
        d dVar = processingOrderState.e;
        String str = dVar.f251656b;
        k kVar = processingOrderState.f251660g;
        String str2 = processingOrderState.f251659c;
        String str3 = processingOrderState.f251658b;
        switch (b.f3321a[nVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new l6c.h(str, str3);
            case 7:
            case 8:
                return new l6c.e(kVar);
            case 9:
            case 10:
                return new f(kVar);
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return b.C1094b.f192385a;
            case 16:
                return (str != null && (dVar.f251655a == r6c.c.REVOLUT_PAY) && (kVar == k.SUSPECTED_FRAUD)) ? new i(str, str3) : new g(str2, str3);
            case 17:
                r6c.b bVar = processingOrderState.f;
                if (bVar == null) {
                    return new g(str2, str3);
                }
                int i = b.f3322b[bVar.f251652a.ordinal()];
                if (i != 1) {
                    return i != 2 ? new g(str2, str3) : new l6c.c(str2, str3, bVar.e, bVar.f);
                }
                String str4 = bVar.f251653b;
                if (str4 != null) {
                    return new l6c.d(str4, str3);
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("THREE_DS type has nullable acceptingUrl");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                return new j(str3);
            case 18:
                return new g(str2, str3);
            case 19:
            case 20:
            case 21:
                return new j(str3);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
