package re0;

import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import om4.r0;
import org.jetbrains.annotations.NotNull;
import qqj.g;
import r4k.x;
import w4l.k;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4l.c f253483a;

    public c(d cache, Function1 key, Type dtoType, Function2 mapToDto, Function2 mapToDomain, Function3 fromNetwork) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(dtoType, "dtoType");
        Intrinsics.checkNotNullParameter(mapToDto, "mapToDto");
        Intrinsics.checkNotNullParameter(mapToDomain, "mapToDomain");
        Intrinsics.checkNotNullParameter(fromNetwork, "fromNetwork");
        this.f253483a = new x4l.c(new r0(fromNetwork, mapToDomain, (Continuation) null), new x(cache, key), new qce.b(cache, key, 9), new a9h.c(7, cache, key, dtoType, mapToDomain, (Continuation) null), new b(mapToDto, cache, key, dtoType, null), new g(cache, key, (Continuation) null, 4));
    }

    public final vkm.d a(Object params, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f253483a.b(params, loadingStrategy);
    }

    public final Object b(Object obj2, boolean z, Continuation continuation) {
        Object objD = this.f253483a.d(obj2, z, continuation);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }
}
