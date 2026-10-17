package d73;

import a83.j0;
import amh.w;
import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f111796b;

    public /* synthetic */ m(u uVar, int i) {
        this.f111795a = i;
        this.f111796b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f111795a) {
            case 0:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f111796b.d.i();
            default:
                Boolean applyJuniorSorting = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(applyJuniorSorting, "applyJuniorSorting");
                if (applyJuniorSorting.booleanValue()) {
                    return rd0.e.c(new j0(new w(this.f111796b.e.e(), 4), 21), p0.f264003c);
                }
                od0.i.Companion.getClass();
                efm.r rVarJust = efm.r.just(od0.i.f224256b);
                Intrinsics.h(rVarJust);
                return rVarJust;
        }
    }
}
