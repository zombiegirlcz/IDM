package xp0;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f307874b;

    public /* synthetic */ c(f fVar, int i) {
        this.f307873a = i;
        this.f307874b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f307873a) {
            case 0:
                this.f307874b.b();
                break;
            default:
                f fVar = this.f307874b;
                Bitmap bitmap = fVar.f307879g;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                fVar.f307879g = null;
                break;
        }
        return Unit.f186387a;
    }
}
