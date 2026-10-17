package dam;

import android.content.Intent;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends kotlin.jvm.internal.u implements Function1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f112586h;
    public static final q i;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        f112586h = new q(i2, 0);
        i = new q(i2, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f) {
            case 0:
                return Unit.f186387a;
            case 1:
                Future it8 = (Future) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(!((it8.isCancelled() || it8.isDone()) ? false : true));
            case 2:
                Intent it9 = (Intent) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9;
            default:
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kdh.b bVar) {
        super(1);
        this.f = 1;
    }
}
