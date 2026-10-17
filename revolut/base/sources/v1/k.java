package v1;

import androidx.compose.material.DrawerKt;
import androidx.compose.material.DrawerState;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawerState f285019b;

    public /* synthetic */ k(DrawerState drawerState, int i) {
        this.f285018a = i;
        this.f285019b = drawerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f285018a) {
            case 0:
                return DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$1$4$0(this.f285019b, (Density) obj2);
            default:
                return Float.valueOf(DrawerState.anchoredDraggableState$lambda$0(this.f285019b, ((Float) obj2).floatValue()));
        }
    }
}
