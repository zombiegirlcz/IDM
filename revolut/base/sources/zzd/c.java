package zzd;

import com.revolut.rxdata.core.CompositeException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f326673a;

    public c(sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f326673a = serverErrorParser;
    }

    public static boolean a(Throwable th10) {
        if (th10 instanceof CompositeException) {
            List list = ((CompositeException) th10).f104678a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (a((Throwable) it8.next())) {
                }
            }
            return false;
        }
        if (!tj0.a.a(th10) && !(th10 instanceof TimeoutException)) {
            if (!((th10 != null ? th10.getCause() : null) instanceof TimeoutException)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(java.lang.Throwable r24, java.lang.String r25, com.google.protobuf.w0 r26) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zzd.c.b(java.lang.Throwable, java.lang.String, com.google.protobuf.w0):java.util.List");
    }
}
