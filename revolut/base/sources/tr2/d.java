package tr2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d implements e4m.e {
    public static le0.a a(kg.o gson, le0.b gsonObjectMapperFactory) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return gsonObjectMapperFactory.a(gson);
    }
}
