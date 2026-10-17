package kotlinx.serialization.json;

import foh.i;
import kotlin.jvm.internal.Intrinsics;
import mlm.j;
import rlm.h;
import rlm.k;
import slm.d0;
import slm.h0;
import slm.j0;
import slm.n;
import tlm.e;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Json implements j {
    public static final rlm.b d = new rlm.b(new h(0), tlm.h.f272133a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f187948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f187949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f187950c = new n();

    public Json(h hVar, e eVar) {
        this.f187948a = hVar;
        this.f187949b = eVar;
    }

    public final Object a(mlm.b deserializer, JsonElement element) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        return i.u(this, element, deserializer);
    }

    public final Object b(mlm.b deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        h0 h0VarA = edl.a.a(this, string);
        Object objB = new d0(this, j0.OBJ, h0VarA, deserializer.getDescriptor(), null).b(deserializer);
        h0VarA.p();
        return objB;
    }

    public final String c(mlm.h serializer, Object obj2) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        a80.e eVar = new a80.e(7, (byte) 0);
        try {
            ebm.a.j(this, eVar, serializer, obj2);
            return eVar.toString();
        } finally {
            eVar.n();
        }
    }

    public final JsonElement d(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return (JsonElement) b(k.f255111a, string);
    }
}
