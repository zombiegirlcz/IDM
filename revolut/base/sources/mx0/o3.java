package mx0;

import android.view.View;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CenteredAmountView f209882b;

    public /* synthetic */ o3(CenteredAmountView centeredAmountView, int i) {
        this.f209881a = i;
        this.f209882b = centeredAmountView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f209881a) {
            case 0:
                Intrinsics.h(view);
                this.f209882b.f.onNext(Unit.f186387a);
                break;
            case 1:
                Intrinsics.h(view);
                this.f209882b.f58408b.onNext(Unit.f186387a);
                break;
            case 2:
                Intrinsics.h(view);
                this.f209882b.f58409g.onNext(Unit.f186387a);
                break;
            case 3:
                Intrinsics.h(view);
                this.f209882b.f58412l.onNext(Unit.f186387a);
                break;
            default:
                Intrinsics.h(view);
                this.f209882b.k.onNext(Unit.f186387a);
                break;
        }
    }
}
