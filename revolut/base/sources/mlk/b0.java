package mlk;

import com.revolut.data.model.Data;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ms0.k0;
import ms0.l0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b0 implements kfm.o, yil.a, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f206998b;

    public /* synthetic */ b0(Object obj2, int i) {
        this.f206997a = i;
        this.f206998b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f206997a;
        Object obj3 = this.f206998b;
        switch (i) {
            case 11:
                ((mqi.a) obj3).invoke(obj2);
                break;
            case 14:
                ((mqi.a) obj3).invoke(obj2);
                break;
            case 25:
                int i2 = l0.E;
                ((ms0.i0) obj3).invoke(obj2);
                break;
            default:
                int i3 = l0.E;
                ((ms0.i0) obj3).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f206997a;
        Object obj2 = this.f206998b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((a0) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((a0) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((mk5.s) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (u) ((avc.o) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((a0) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((a0) obj2).invoke(p0);
            case 6:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 25:
            default:
                int i2 = l0.E;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k0) ((mqg.b) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) ((ml3.y) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((a0) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((moe.c) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((mqg.b) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((mr9.b) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((mr9.b) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((mr9.b) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) ((mqg.b) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((gpd.j) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Long) ((gpd.j) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CategorisationFilter) ((ja3.d) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((moe.c) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) ((mqg.b) obj2).invoke(p0);
            case 26:
                int i3 = l0.E;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LocalDate) ((mqg.b) obj2).invoke(p0);
        }
    }

    @Override // yil.a
    public String generate() {
        com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = (com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f206998b;
        String strGenerate = cVar.f106426q.generate();
        cVar.H2(cVar.G, new mll.h(strGenerate, 0));
        return strGenerate;
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f206997a;
        Object obj2 = this.f206998b;
        switch (i) {
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((mqi.b) obj2).invoke(p0)).booleanValue();
            case 13:
            case 14:
            default:
                int i2 = l0.E;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((ms0.i0) obj2).invoke(p0)).booleanValue();
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((mqg.b) obj2).invoke(p0)).booleanValue();
        }
    }
}
