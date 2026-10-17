package qv9;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl0.a f249544a;

    public a(tl0.a base64Wrapper) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f249544a = base64Wrapper;
    }

    public final byte[] a(String value) {
        tl0.a aVar = this.f249544a;
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return aVar.a(value);
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, p.a.p("Unexpected error in string ", value, " decoding process"), th10, h0Var);
            String strD = a0.D(value, "\n", "", false);
            try {
                return aVar.a(strD);
            } catch (Throwable th11) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, p.a.p("Unexpected error in string ", strD, " decoding process"), th11, h0Var2);
                throw th11;
            }
        }
    }

    public final byte[] b(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        try {
            return this.f249544a.b(array);
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, "Unexpected error in array encoding process", th10, h0Var);
            throw th10;
        }
    }
}
