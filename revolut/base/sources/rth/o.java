package rth;

import com.revolut.shared.feature.workflow.engine.api.models.DataPoint;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pth.e f257263a;

    public o(pth.e configurationProvider) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f257263a = configurationProvider;
    }

    public static boolean a(ril.d dVar, String str) {
        List list = dVar.f254595c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((DataPoint) it8.next()).f105376b, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ril.d r22, java.lang.String r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rth.o.b(ril.d, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
    
        if (r2 == r4) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ril.d r25, java.lang.String r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rth.o.c(ril.d, java.lang.String, gim.c):java.lang.Object");
    }
}
