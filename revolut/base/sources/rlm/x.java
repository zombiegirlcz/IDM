package rlm;

import fdl.i2;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class x implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qlm.e f255129a;

    public x(qlm.e tSerializer) {
        Intrinsics.checkNotNullParameter(tSerializer, "tSerializer");
        this.f255129a = tSerializer;
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.json.a aVar;
        JsonElement jsonElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        i iVarB = i26.l.b(decoder);
        Object element = iVarB.c();
        Json jsonA = iVarB.a();
        Intrinsics.checkNotNullParameter(element, "element");
        if (element instanceof kotlinx.serialization.json.a) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) element) {
                JsonElement jsonElement2 = (JsonElement) obj2;
                String strG = null;
                JsonObject jsonObject = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
                if (jsonObject != null && (jsonElement = (JsonElement) jsonObject.get("type")) != null) {
                    strG = j.g(j.l(jsonElement));
                }
                if (d0.T(i2.f134158c, strG)) {
                    arrayList.add(obj2);
                }
            }
            aVar = new kotlinx.serialization.json.a(arrayList);
        } else {
            aVar = new kotlinx.serialization.json.a(f0.f322471a);
        }
        return jsonA.a(this.f255129a, aVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return this.f255129a.getDescriptor();
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        m mVarC = i26.l.c(encoder);
        JsonElement element = g4i.a.O(mVarC.a(), obj2, this.f255129a);
        Intrinsics.checkNotNullParameter(element, "element");
        mVarC.b(element);
    }
}
