package er9;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f128582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Image f128583c;

    public /* synthetic */ m(x xVar, Image image, int i) {
        this.f128581a = i;
        this.f128582b = xVar;
        this.f128583c = image;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f128581a) {
            case 0:
                cr9.v group = (cr9.v) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                String id10 = group.getId();
                x xVar = this.f128582b;
                return ue0.e.C(xVar.a(id10, this.f128583c), xVar.e(group));
            default:
                File imageFile = (File) obj2;
                Intrinsics.checkNotNullParameter(imageFile, "imageFile");
                return new ufm.f(r80.c.a(this.f128582b.k, imageFile, 70), new k(14, new eq4.c(this.f128583c, imageFile, 12)), 3).o(imageFile);
        }
    }
}
