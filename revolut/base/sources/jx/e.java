package jx;

import android.content.Context;
import fim.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import nd.n;
import rlm.h;
import rlm.p;
import slm.q;
import slm.y;
import yhm.j;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes16.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f179035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f179036c;

    public e(h configuration, slm.a lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f179036c = lexer;
        this.f179035b = configuration.f255106c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0091 -> B:27:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(jx.e r12, yhm.b r13, gim.a r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jx.e.a(jx.e, yhm.b, gim.a):java.lang.Object");
    }

    public boolean b() {
        return this.f179035b;
    }

    public int c() {
        return this.f179034a;
    }

    public SimpleType d() {
        return (SimpleType) this.f179036c;
    }

    public JsonElement e() {
        JsonElement jsonObject;
        Object obj2;
        Object objInvoke;
        slm.a aVar = (slm.a) this.f179036c;
        byte bW = aVar.w();
        if (bW == 1) {
            return g(true);
        }
        if (bW == 0) {
            return g(false);
        }
        if (bW != 6) {
            if (bW == 8) {
                return f();
            }
            slm.a.r(aVar, "Cannot read Json element because of unexpected ".concat(q.t(bW)), 0, null, 6);
            throw null;
        }
        int i = this.f179034a + 1;
        this.f179034a = i;
        if (i == 200) {
            y block = new y(this, null);
            n nVar = new n(block);
            Unit unit = Unit.f186387a;
            fim.a aVar2 = yhm.a.f314181a;
            Intrinsics.checkNotNullParameter(nVar, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            yhm.c cVar = new yhm.c(null);
            cVar.f314185a = block;
            cVar.f314186b = unit;
            cVar.f314187c = cVar;
            fim.a aVar3 = yhm.a.f314181a;
            cVar.d = aVar3;
            while (true) {
                obj2 = cVar.d;
                Continuation completion = cVar.f314187c;
                if (completion == null) {
                    break;
                }
                m.Companion companion = m.INSTANCE;
                if (Intrinsics.f(aVar3, obj2)) {
                    try {
                        y yVar = cVar.f314185a;
                        Unit unit2 = cVar.f314186b;
                        if (yVar == null) {
                            Intrinsics.checkNotNullParameter(yVar, "<this>");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            CoroutineContext context = completion.getContext();
                            Object fVar = context == g.f186406a ? new f(completion) : new fim.g(completion, context);
                            u0.f(3, yVar);
                            objInvoke = yVar.invoke(cVar, unit2, fVar);
                        } else {
                            u0.f(3, yVar);
                            objInvoke = yVar.invoke(cVar, unit2, completion);
                        }
                        if (objInvoke != fim.a.COROUTINE_SUSPENDED) {
                            completion.resumeWith(objInvoke);
                        }
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        completion.resumeWith(o.a(th10));
                    }
                } else {
                    cVar.d = aVar3;
                    completion.resumeWith(obj2);
                }
            }
            o.b(obj2);
            jsonObject = (JsonElement) obj2;
        } else {
            byte bG = aVar.g((byte) 6);
            if (aVar.w() == 4) {
                slm.a.r(aVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!aVar.c()) {
                    break;
                }
                String strL = this.f179035b ? aVar.l() : aVar.j();
                aVar.g((byte) 5);
                linkedHashMap.put(strL, e());
                bG = aVar.f();
                if (bG != 4) {
                    if (bG != 7) {
                        slm.a.r(aVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bG == 6) {
                aVar.g((byte) 7);
            } else if (bG == 4) {
                q.n(aVar, "object");
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.f179034a--;
        return jsonObject;
    }

    public kotlinx.serialization.json.a f() {
        slm.a aVar = (slm.a) this.f179036c;
        byte bF = aVar.f();
        if (aVar.w() == 4) {
            slm.a.r(aVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.c()) {
            arrayList.add(e());
            bF = aVar.f();
            if (bF != 4) {
                boolean z = bF == 9;
                int i = aVar.f264232a;
                if (!z) {
                    slm.a.r(aVar, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            aVar.g((byte) 9);
        } else if (bF == 4) {
            q.n(aVar, "array");
            throw null;
        }
        return new kotlinx.serialization.json.a(arrayList);
    }

    public kotlinx.serialization.json.b g(boolean z) {
        slm.a aVar = (slm.a) this.f179036c;
        String strL = (this.f179035b || !z) ? aVar.l() : aVar.j();
        return (z || !Intrinsics.f(strL, "null")) ? new p(strL, z, null) : JsonNull.INSTANCE;
    }

    public e(Context context, fx.a currentDateTimeProvider, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currentDateTimeProvider, "currentDateTimeProvider");
        Intrinsics.checkNotNullParameter("default", "analysisCollectionFolder");
        this.f179035b = z;
        this.f179036c = j.b(new jnf.a(context, this, currentDateTimeProvider));
    }

    public e(SimpleType simpleType, int i, boolean z) {
        this.f179036c = simpleType;
        this.f179034a = i;
        this.f179035b = z;
    }
}
