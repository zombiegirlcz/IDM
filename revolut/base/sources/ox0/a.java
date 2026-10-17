package ox0;

import android.content.res.Configuration;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionFooterView f230465b;

    public /* synthetic */ a(ActionFooterView actionFooterView, int i) {
        this.f230464a = i;
        this.f230465b = actionFooterView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f230464a;
        ActionFooterView actionFooterView = this.f230465b;
        switch (i) {
            case 0:
                Configuration it8 = (Configuration) obj2;
                int i2 = ActionFooterView.z;
                Intrinsics.checkNotNullParameter(it8, "it");
                actionFooterView.v = false;
                actionFooterView.b();
                return Unit.f186387a;
            default:
                ihm.f fVar = actionFooterView.f58964s;
                Unit unit = Unit.f186387a;
                fVar.onNext(unit);
                return unit;
        }
    }
}
