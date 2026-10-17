package ppi;

import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f238606b;

    public /* synthetic */ a(c cVar, int i) {
        this.f238605a = i;
        this.f238606b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f238605a) {
            case 0:
                c cVar = this.f238606b;
                BaseDelegatesActivity baseDelegatesActivity = cVar.f238607h;
                ArrayList arrayList = cVar.f238610m;
                if (!baseDelegatesActivity.isFinishing()) {
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        ((Function0) it8.next()).invoke();
                    }
                    arrayList.clear();
                }
                break;
            case 1:
                c cVar2 = this.f238606b;
                cVar2.f238607h.finish();
                cVar2.f238607h.overridePendingTransition(0, 0);
                break;
            default:
                this.f238606b.f238607h.finish();
                break;
        }
        return Unit.f186387a;
    }
}
