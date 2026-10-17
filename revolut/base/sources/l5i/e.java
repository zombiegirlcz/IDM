package l5i;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f192276b;

    public /* synthetic */ e(f fVar, int i) {
        this.f192275a = i;
        this.f192276b = fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f192275a) {
            case 0:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                this.f192276b.K().invoke(e);
                break;
            default:
                Throwable e2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e2, "e");
                this.f192276b.K().invoke(e2);
                break;
        }
        return null;
    }
}
