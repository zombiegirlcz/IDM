package be3;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.functions.Function1;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Image f14666b;

    public /* synthetic */ l(int i, Image image) {
        this.f14665a = i;
        this.f14666b = image;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14665a) {
            case 0:
                return f.a((f) obj2, 0L, false, null, this.f14666b, 15);
            case 1:
                return ccb.i.a((ccb.i) obj2, null, null, null, null, null, null, null, null, this.f14666b, null, 12287);
            case 2:
                return j33.i.a((j33.i) obj2, this.f14666b, null, false, false, null, null, ISO781611.SMT_TAG);
            case 3:
                return kd3.f.a((kd3.f) obj2, null, null, null, null, null, null, this.f14666b, 63);
            case 4:
                return nt9.g.a((nt9.g) obj2, this.f14666b, null, null, null, null, false, 126);
            case 5:
                return t8e.a.a((t8e.a) obj2, null, this.f14666b, 3);
            case 6:
                return uod.a.a((uod.a) obj2, this.f14666b, null, null, LDSFile.EF_SOD_TAG);
            default:
                return z32.a.a((z32.a) obj2, null, this.f14666b, null, null, null, 29);
        }
    }
}
