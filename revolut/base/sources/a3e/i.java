package a3e;

import android.content.Context;
import com.revolut.feature.store.impl.ui.deals.StoreDealsScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lk0.h;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoreDealsScreen f1112b;

    public /* synthetic */ i(StoreDealsScreen storeDealsScreen, int i) {
        this.f1111a = i;
        this.f1112b = storeDealsScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f1111a;
        StoreDealsScreen storeDealsScreen = this.f1112b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = StoreDealsScreen.f88691a0;
                t tVar = (t) storeDealsScreen.R2();
                tVar.getClass();
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "event");
                tVar.f1125w.onNext(event);
                return Unit.f186387a;
            default:
                Context context = (Context) obj2;
                KProperty[] kPropertyArr2 = StoreDealsScreen.f88691a0;
                Intrinsics.checkNotNullParameter(context, "context");
                ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(context, 2, 12);
                screenGridLayoutManager.setSpanSizeLookup(new j(storeDealsScreen, screenGridLayoutManager));
                return screenGridLayoutManager;
        }
    }
}
