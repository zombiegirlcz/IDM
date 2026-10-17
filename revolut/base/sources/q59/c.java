package q59;

import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import org.jetbrains.annotations.NotNull;
import q56.o;
import w4l.f;
import xe0.e;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f242332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f242333b;

    public c(e storage, d memoryCache) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f242332a = storage;
        this.f242333b = memoryCache;
        final int i = 0;
        final int i2 = 1;
        new f(new Function2(this) { // from class: q59.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f242331b;

            {
                this.f242331b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.c cVar = new ufm.c(new nc0.a(this.f242331b, 17), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    default:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f242331b.f242333b.f("DEPRECATED_APPS", data);
                        return Unit.f186387a;
                }
            }
        }, new o(this, 2), new Function2(this) { // from class: q59.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f242331b;

            {
                this.f242331b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        ufm.c cVar = new ufm.c(new nc0.a(this.f242331b, 17), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    default:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f242331b.f242333b.f("DEPRECATED_APPS", data);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
