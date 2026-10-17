package lc0;

import android.graphics.Bitmap;
import com.revolut.kompot.common.flow.permissions.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f193775b;

    public /* synthetic */ w(b0 b0Var, int i) {
        this.f193774a = i;
        this.f193775b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193774a) {
            case 0:
                Bitmap bitmapWithCover = (Bitmap) obj2;
                Intrinsics.checkNotNullParameter(bitmapWithCover, "bitmapWithCover");
                hc0.a aVar = new hc0.a(bitmapWithCover, 1);
                b0 b0Var = this.f193775b;
                b0Var.L2(aVar);
                b0Var.K2();
                return Unit.f186387a;
            case 1:
                Bitmap bitmapWithCover2 = (Bitmap) obj2;
                Intrinsics.checkNotNullParameter(bitmapWithCover2, "bitmapWithCover");
                bitmapWithCover2.recycle();
                b0 b0Var2 = this.f193775b;
                b0Var2.L2(new l9k.v(b0Var2, bitmapWithCover2, 9));
                return Unit.f186387a;
            case 2:
                com.revolut.kompot.common.flow.permissions.a it8 = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean z = it8 instanceof a.C0596a;
                b0 b0Var3 = this.f193775b;
                if (z) {
                    b0Var3.J2();
                } else {
                    b0Var3.B2();
                }
                return Unit.f186387a;
            default:
                j jVar = (j) obj2;
                b0 b0Var4 = this.f193775b;
                cli.y yVar = b0Var4.u;
                Bitmap bitmap = ((j) ((j2) yVar.f22677a).getValue()).f193757a;
                Bitmap bitmap2 = ((j) ((j2) yVar.f22677a).getValue()).f193758b;
                j2 j2Var = (j2) yVar.f22677a;
                return j.a(jVar, null, null, null, null, b0Var4.I2(bitmap, bitmap2, ((j) j2Var.getValue()).d, ((j) j2Var.getValue()).e), false, 95);
        }
    }
}
