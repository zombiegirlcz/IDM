package mx0;

import android.view.View;
import com.revolut.core.ui_kit.views.InputTravelView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b8 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTravelView f209608b;

    public /* synthetic */ b8(InputTravelView inputTravelView, int i) {
        this.f209607a = i;
        this.f209608b = inputTravelView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f209607a) {
            case 0:
                Intrinsics.h(view);
                this.f209608b.f58677b.onNext(Unit.f186387a);
                break;
            default:
                Intrinsics.h(view);
                this.f209608b.f58677b.onNext(Unit.f186387a);
                break;
        }
    }
}
