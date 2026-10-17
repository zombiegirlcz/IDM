package z9g;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements kg.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9g.b f320377a = new q9g.b(q.class);

    @Override // kg.t
    public final Object deserialize(kg.u json, Type typeOfT, kg.s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f320377a.deserialize(json, typeOfT, context);
    }
}
