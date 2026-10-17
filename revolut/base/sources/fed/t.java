package fed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qlm.e f134569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f134570b;

    public t() {
        qlm.e eVarA = nlm.a.a(f.INSTANCE.serializer());
        this.f134569a = eVarA;
        this.f134570b = eVarA.f247633b;
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) throws Throwable {
        f fVar;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        rlm.i iVar = decoder instanceof rlm.i ? (rlm.i) decoder : null;
        if (iVar == null) {
            return (List) this.f134569a.deserialize(decoder);
        }
        JsonElement jsonElementC = iVar.c();
        kotlinx.serialization.json.a aVar = jsonElementC instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) jsonElementC : null;
        if (aVar == null) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = aVar.f187952a.iterator();
        while (it8.hasNext()) {
            try {
                fVar = (f) iVar.a().a(f.INSTANCE.serializer(), (JsonElement) it8.next());
            } catch (Exception e) {
                hx7.e.n(e);
                fVar = null;
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return this.f134570b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        List value = (List) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f134569a.serialize(encoder, value);
    }
}
