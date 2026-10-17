package ci7;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f24427a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SerialDescriptor f24428b = a0.Companion.serializer().getDescriptor();

    private x() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Object next;
        t tVar;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof rlm.i)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        rlm.i iVar = (rlm.i) decoder;
        JsonObject jsonObjectK = rlm.j.k(iVar.c());
        String strA = rlm.j.l((JsonElement) r0.h("key", jsonObjectK)).a();
        JsonElement jsonElement = (JsonElement) jsonObjectK.get("instruments");
        Iterable iterableJ = jsonElement != null ? rlm.j.j(jsonElement) : null;
        if (iterableJ == null) {
            iterableJ = f0.f322471a;
        }
        Iterable iterable = iterableJ;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            JsonObject jsonObjectK2 = rlm.j.k((JsonElement) it8.next());
            JsonElement jsonElement2 = (JsonElement) jsonObjectK2.get("customAttributes");
            Iterator<E> it9 = ph7.c.a().iterator();
            while (true) {
                if (it9.hasNext()) {
                    next = it9.next();
                    if (Intrinsics.f(((ph7.c) next).b(), strA)) {
                    }
                } else {
                    next = null;
                }
            }
            ph7.c cVar = (ph7.c) next;
            switch (cVar == null ? -1 : w.f24426a[cVar.ordinal()]) {
                case -1:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    tVar = null;
                    arrayList.add(new u(rlm.j.l((JsonElement) r0.h("ref", jsonObjectK2)).a(), rlm.j.l((JsonElement) r0.h("symbol", jsonObjectK2)).a(), tVar));
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                case 3:
                    if (jsonElement2 == null) {
                        tVar = null;
                        arrayList.add(new u(rlm.j.l((JsonElement) r0.h("ref", jsonObjectK2)).a(), rlm.j.l((JsonElement) r0.h("symbol", jsonObjectK2)).a(), tVar));
                    } else {
                        tVar = (p) iVar.a().a(p.Companion.serializer(), jsonElement2);
                        arrayList.add(new u(rlm.j.l((JsonElement) r0.h("ref", jsonObjectK2)).a(), rlm.j.l((JsonElement) r0.h("symbol", jsonObjectK2)).a(), tVar));
                    }
                    break;
                case 4:
                    if (jsonElement2 == null) {
                        tVar = null;
                        arrayList.add(new u(rlm.j.l((JsonElement) r0.h("ref", jsonObjectK2)).a(), rlm.j.l((JsonElement) r0.h("symbol", jsonObjectK2)).a(), tVar));
                    } else {
                        tVar = (i) iVar.a().a(i.Companion.serializer(), jsonElement2);
                        arrayList.add(new u(rlm.j.l((JsonElement) r0.h("ref", jsonObjectK2)).a(), rlm.j.l((JsonElement) r0.h("symbol", jsonObjectK2)).a(), tVar));
                    }
                    break;
                case 5:
                    if (jsonElement2 == null) {
                        tVar = null;
                        arrayList.add(new u(rlm.j.l((JsonElement) r0.h("ref", jsonObjectK2)).a(), rlm.j.l((JsonElement) r0.h("symbol", jsonObjectK2)).a(), tVar));
                    } else {
                        tVar = (f) iVar.a().a(f.Companion.serializer(), jsonElement2);
                        arrayList.add(new u(rlm.j.l((JsonElement) r0.h("ref", jsonObjectK2)).a(), rlm.j.l((JsonElement) r0.h("symbol", jsonObjectK2)).a(), tVar));
                    }
                    break;
                case 6:
                    if (jsonElement2 == null) {
                        tVar = null;
                        arrayList.add(new u(rlm.j.l((JsonElement) r0.h("ref", jsonObjectK2)).a(), rlm.j.l((JsonElement) r0.h("symbol", jsonObjectK2)).a(), tVar));
                    } else {
                        tVar = (m) iVar.a().a(m.Companion.serializer(), jsonElement2);
                        arrayList.add(new u(rlm.j.l((JsonElement) r0.h("ref", jsonObjectK2)).a(), rlm.j.l((JsonElement) r0.h("symbol", jsonObjectK2)).a(), tVar));
                    }
                    break;
                case 7:
                    if (jsonElement2 == null) {
                        tVar = null;
                        arrayList.add(new u(rlm.j.l((JsonElement) r0.h("ref", jsonObjectK2)).a(), rlm.j.l((JsonElement) r0.h("symbol", jsonObjectK2)).a(), tVar));
                    } else {
                        tVar = (s) iVar.a().a(s.Companion.serializer(), jsonElement2);
                        arrayList.add(new u(rlm.j.l((JsonElement) r0.h("ref", jsonObjectK2)).a(), rlm.j.l((JsonElement) r0.h("symbol", jsonObjectK2)).a(), tVar));
                    }
                    break;
            }
        }
        return new v(strA, arrayList);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f24428b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        v value = (v) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        a0.Companion.serializer().serialize(encoder, new a0(value.f24424a, value.f24425b));
    }
}
