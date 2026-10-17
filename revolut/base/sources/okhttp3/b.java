package okhttp3;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mmm.h;
import org.jetbrains.annotations.NotNull;
import ulm.a1;
import ulm.b1;
import ulm.o0;
import vlm.j;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends RequestBody {

    @NotNull
    public static final o0 Companion = new o0();
    public static final b1 k;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f226115j;

    static {
        b1.Companion.getClass();
        k = a1.a("application/x-www-form-urlencoded");
    }

    public b(ArrayList encodedNames, ArrayList encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.i = j.q(encodedNames);
        this.f226115j = j.q(encodedValues);
    }

    public final long a(mmm.j jVar, boolean z) throws EOFException {
        h buffer;
        if (z) {
            buffer = new h();
        } else {
            Intrinsics.h(jVar);
            buffer = jVar.getBuffer();
        }
        List list = this.i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.w(38);
            }
            buffer.D((String) list.get(i));
            buffer.w(61);
            buffer.D((String) this.f226115j.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j2 = buffer.f207266b;
        buffer.f();
        return j2;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return a(null, true);
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return k;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(mmm.j sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
