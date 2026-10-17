package mr;

import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import okk.d;
import olm.g;
import olm.i;
import rlm.j;
import rlm.m;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f208027a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f208028b = c.e("DeviceFingerprintValueSerializer", i.f226485b, new SerialDescriptor[0], new d(13));

    private a() {
    }

    public static JsonElement a(Object obj2) {
        if (obj2 == null) {
            return JsonNull.INSTANCE;
        }
        if (obj2 instanceof String) {
            return j.c((String) obj2);
        }
        if (obj2 instanceof Boolean) {
            return j.a((Boolean) obj2);
        }
        if (obj2 instanceof Number) {
            return j.b((Number) obj2);
        }
        if (obj2 instanceof Map) {
            Set<Map.Entry> setEntrySet = ((Map) obj2).entrySet();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                String str = key instanceof String ? (String) key : null;
                Pair pair = str != null ? new Pair(str, a(value)) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return new JsonObject(r0.t(arrayList));
        }
        if (obj2 instanceof Iterable) {
            Iterable iterable = (Iterable) obj2;
            ArrayList arrayList2 = new ArrayList(w.t(iterable, 10));
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                arrayList2.add(a(it8.next()));
            }
            return new kotlinx.serialization.json.a(arrayList2);
        }
        if (!(obj2 instanceof Object[])) {
            return JsonNull.INSTANCE;
        }
        Object[] objArr = (Object[]) obj2;
        ArrayList arrayList3 = new ArrayList(objArr.length);
        for (Object obj3 : objArr) {
            arrayList3.add(a(obj3));
        }
        return new kotlinx.serialization.json.a(arrayList3);
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter("Deserialization is not supported.", "message");
        throw new NotImplementedError("Deserialization is not supported.");
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f208028b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        m mVar = encoder instanceof m ? (m) encoder : null;
        if (mVar == null) {
            throw new IllegalStateException("DeviceFingerprintValueSerializer supports only JSON");
        }
        mVar.b(a(obj2));
    }
}
