package btb;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f18545b;

    public /* synthetic */ m(Activity activity, int i) {
        this.f18544a = i;
        this.f18545b = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f18544a) {
            case 0:
                WeakReference it8 = (WeakReference) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.get() == this.f18545b);
            default:
                e0m.e.b(this.f18545b, true);
                return Unit.f186387a;
        }
    }
}
