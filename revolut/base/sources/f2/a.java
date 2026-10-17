package f2;

import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vf0.l;
import wvg.a1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f131317b;

    public /* synthetic */ a(int i, Function2 function2) {
        this.f131316a = i;
        this.f131317b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        boolean zBooleanValue;
        switch (this.f131316a) {
            case 0:
                return ListSaverKt.listSaver$lambda$0(this.f131317b, (SaverScope) obj2, obj3);
            case 1:
                int iIntValue = ((Integer) obj3).intValue();
                return FloatingActionButtonKt.FloatingActionButton_bogVsAg$lambda$2$0(this.f131317b, (Composer) obj2, iIntValue);
            case 2:
                int iIntValue2 = ((Integer) obj3).intValue();
                return FloatingActionButtonKt.FloatingActionButton_bogVsAg$lambda$2$0$0(this.f131317b, (Composer) obj2, iIntValue2);
            case 3:
                Throwable err = (Throwable) obj2;
                Integer num = (Integer) obj3;
                num.intValue();
                Intrinsics.checkNotNullParameter(err, "err");
                if (err instanceof l) {
                    Object obj4 = ((l) err).f288457a;
                    Intrinsics.i(obj4, "null cannot be cast to non-null type T of com.revolut.core.extensions.rx.RxLoopExtensionsKt.repeatWhile");
                    zBooleanValue = ((Boolean) this.f131317b.invoke(obj4, num)).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                a1 params = (a1) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj5 = pair.f186385a;
                if (obj5 != null) {
                    this.f131317b.invoke(params, obj5);
                }
                return Unit.f186387a;
        }
    }
}
