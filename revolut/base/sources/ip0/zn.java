package ip0;

import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class zn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bo f167504b;

    public /* synthetic */ zn(bo boVar, int i) {
        this.f167503a = i;
        this.f167504b = boVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f167503a) {
            case 0:
                this.f167504b.f163641h.setBackground((NavBarWithContainerBackground) obj2);
                break;
            case 1:
                this.f167504b.f163641h.setBackground((NavBarWithContainerBackground) obj2);
                break;
            case 2:
                aw0.x8 x8Var = (aw0.x8) obj2;
                wn wnVar = this.f167504b.f;
                Intrinsics.h(x8Var);
                wnVar.F(x8Var);
                break;
            default:
                bo boVar = this.f167504b;
                boVar.i.setShapeAppearanceModel((ShapeAppearanceModel) obj2);
                up0.l0 l0Var = boVar.k;
                if (l0Var != null) {
                    l0Var.invalidateOutline();
                }
                break;
        }
        return Unit.f186387a;
    }
}
