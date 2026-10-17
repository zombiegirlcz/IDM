package f9b;

import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f132898b;

    public /* synthetic */ d(f fVar, int i) {
        this.f132897a = i;
        this.f132898b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f132897a) {
            case 0:
                yf.c cVar = this.f132898b.f132902a;
                BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) ((WeakReference) cVar.b).get();
                if (baseDelegatesActivity != null) {
                    baseDelegatesActivity.runOnUiThread(new a(cVar, false, true));
                }
                break;
            case 1:
                Throwable th10 = (Throwable) obj2;
                i iVar = this.f132898b.f132903b;
                Intrinsics.h(th10);
                iVar.b(th10, null, null, false, true);
                break;
            case 2:
                yf.c cVar2 = this.f132898b.f132902a;
                BaseDelegatesActivity baseDelegatesActivity2 = (BaseDelegatesActivity) ((WeakReference) cVar2.b).get();
                if (baseDelegatesActivity2 != null) {
                    baseDelegatesActivity2.runOnUiThread(new a(cVar2, false, true));
                }
                break;
            default:
                yf.c cVar3 = this.f132898b.f132902a;
                BaseDelegatesActivity baseDelegatesActivity3 = (BaseDelegatesActivity) ((WeakReference) cVar3.b).get();
                if (baseDelegatesActivity3 != null) {
                    baseDelegatesActivity3.runOnUiThread(new a(cVar3, false, true));
                }
                break;
        }
        return Unit.f186387a;
    }
}
