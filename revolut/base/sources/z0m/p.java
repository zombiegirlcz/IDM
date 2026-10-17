package z0m;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f318656h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(0);
        this.f = i;
        this.f318656h = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                Intrinsics.checkNotNullParameter(this.f318656h, "serviceProvider");
                return new glm.a();
            case 1:
                q serviceProvider = this.f318656h;
                Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
                v0m.a aVar = new v0m.a(serviceProvider);
                new LinkedHashMap();
                return aVar;
            default:
                q serviceProvider2 = this.f318656h;
                Intrinsics.checkNotNullParameter(serviceProvider2, "serviceProvider");
                return new v0m.a(serviceProvider2);
        }
    }
}
