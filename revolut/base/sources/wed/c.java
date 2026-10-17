package wed;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharedAlertsScreen f296715b;

    public /* synthetic */ c(SharedAlertsScreen sharedAlertsScreen, int i) {
        this.f296714a = i;
        this.f296715b = sharedAlertsScreen;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        int i2 = this.f296714a;
        SharedAlertsScreen sharedAlertsScreen = this.f296715b;
        switch (i2) {
            case 0:
                t60.a aVar = (t60.a) obj2;
                SharedAlertsScreen.Companion aVar2 = SharedAlertsScreen.INSTANCE;
                RecyclerView.Adapter adapter = sharedAlertsScreen.h().getAdapter();
                ArrayList arrayList = null;
                z4l.j jVar = adapter instanceof z4l.j ? (z4l.j) adapter : null;
                if (jVar != null) {
                    int i3 = aVar.f268120a;
                    int i5 = aVar.e;
                    if (i3 != -1 && (i = aVar.f268121b) != -1 && i3 < i5 && i < i5) {
                        arrayList = new ArrayList();
                        if (i3 <= i) {
                            while (true) {
                                arrayList.add(jVar.a(i3));
                                if (i3 != i) {
                                    i3++;
                                }
                            }
                        }
                    } else if (i5 > 0) {
                        int i6 = i5 - 1;
                        arrayList = new ArrayList();
                        if (i6 >= 0) {
                            int i21 = 0;
                            while (true) {
                                arrayList.add(jVar.a(i21));
                                if (i21 != i6) {
                                    i21++;
                                }
                            }
                        }
                    }
                }
                return arrayList;
            default:
                Long it8 = (Long) obj2;
                SharedAlertsScreen.Companion aVar3 = SharedAlertsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((t60.g) ((t60.b) sharedAlertsScreen.l0.getValue())).R();
        }
    }
}
