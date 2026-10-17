package g3e;

import android.content.Context;
import com.revolut.feature.store.impl.ui.exclusives.StoreExclusivesScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lk0.h;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoreExclusivesScreen f140278b;

    public /* synthetic */ j(StoreExclusivesScreen storeExclusivesScreen, int i) {
        this.f140277a = i;
        this.f140278b = storeExclusivesScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f140277a;
        StoreExclusivesScreen storeExclusivesScreen = this.f140278b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = StoreExclusivesScreen.W;
                r rVar = (r) storeExclusivesScreen.R2();
                rVar.getClass();
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "event");
                rVar.u.onNext(event);
                return Unit.f186387a;
            default:
                Context context = (Context) obj2;
                KProperty[] kPropertyArr2 = StoreExclusivesScreen.W;
                Intrinsics.checkNotNullParameter(context, "context");
                ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(context, 2, 12);
                screenGridLayoutManager.setSpanSizeLookup(new l(storeExclusivesScreen, screenGridLayoutManager));
                return screenGridLayoutManager;
        }
    }
}
