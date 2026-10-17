package u90;

import com.revolut.feature.backend_flow.domain.models.EntityType;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f278334a = zhm.r0.k(new Pair("TRANSACTION", EntityType.Transaction.f63436a), new Pair("CARD", EntityType.Card.f63433a), new Pair("DEVICE", EntityType.Device.f63435a));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final EntityType a(String str) {
        EntityType entityType;
        return (str == null || (entityType = (EntityType) this.f278334a.get(str)) == null) ? new EntityType.Default(str) : entityType;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final String b(EntityType type) {
        Object next;
        String str;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator it8 = this.f278334a.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Map.Entry) next).getValue(), type)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (str = (String) entry.getKey()) != null) {
            return str;
        }
        EntityType.Default r56 = type instanceof EntityType.Default ? (EntityType.Default) type : null;
        if (r56 != null) {
            return r56.f63434a;
        }
        return null;
    }
}
