package au0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f9227b;

    public /* synthetic */ i(e eVar, int i) {
        this.f9226a = i;
        this.f9227b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9226a) {
            case 0:
                Intrinsics.h(view);
                f fVar = this.f9227b.e;
                if (fVar != null && fVar.e) {
                    fVar.f.invoke(view);
                }
                break;
            default:
                Intrinsics.h(view);
                f fVar2 = this.f9227b.e;
                if (fVar2 != null) {
                    fVar2.f.invoke(view);
                }
                break;
        }
    }
}
