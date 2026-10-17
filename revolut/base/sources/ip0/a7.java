package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a7 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CellDetailsDelegate f163402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CellDetailsDelegate.Model f163403c;

    public /* synthetic */ a7(CellDetailsDelegate cellDetailsDelegate, CellDetailsDelegate.Model model, int i) {
        this.f163401a = i;
        this.f163402b = cellDetailsDelegate;
        this.f163403c = model;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f163401a) {
            case 0:
                Intrinsics.h(view);
                this.f163402b.e.onNext(this.f163403c);
                break;
            default:
                Intrinsics.h(view);
                this.f163402b.d.onNext(this.f163403c);
                break;
        }
    }
}
