package et0;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f129112b;

    public /* synthetic */ s0(r0 r0Var, int i) {
        this.f129111a = i;
        this.f129112b = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f129111a) {
            case 0:
                Intrinsics.h(view);
                this.f129112b.i.onNext(Unit.f186387a);
                break;
            default:
                Intrinsics.h(view);
                this.f129112b.f129108j.onNext(Unit.f186387a);
                break;
        }
    }
}
