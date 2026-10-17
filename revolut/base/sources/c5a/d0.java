package c5a;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBarWithContainerBackground f21488b;

    public /* synthetic */ d0(NavBarWithContainerBackground navBarWithContainerBackground, int i) {
        this.f21487a = i;
        this.f21488b = navBarWithContainerBackground;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f21487a) {
            case 0:
                return l.a((l) obj2, null, null, null, null, null, false, null, null, null, null, null, this.f21488b, null, null, false, false, null, false, null, 522239);
            default:
                return l5a.l.a((l5a.l) obj2, null, null, this.f21488b, null, null, false, null, null, false, null, 1019);
        }
    }
}
