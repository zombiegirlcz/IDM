package uq2;

import android.content.Context;
import com.revolut.feature.banners.impl.data.database.BannersDatabase;
import com.revolut.feature.banners.impl.data.network.BannersService;
import kotlinx.serialization.json.Json;
import nd.l;
import retrofit2.Converter;
import retrofit2.Retrofit;
import ufg.p0;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f282070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f282071b;

    public e(f fVar, int i) {
        this.f282070a = fVar;
        this.f282071b = i;
    }

    @Override // phm.a
    public final Object get() {
        f fVar = this.f282070a;
        int i = this.f282071b;
        switch (i) {
            case 0:
                return new vq2.a((sq2.b) fVar.k.get());
            case 1:
                return new sq2.b((BannersService) fVar.f282076h.get(), (oq2.a) fVar.f282077j.get(), new ne0.d());
            case 2:
                return p0.w((Retrofit) fVar.f282075g.get());
            case 3:
                Retrofit retrofitE = ((c21.b) fVar.f282072a).e();
                s.j(retrofitE);
                return d.a(retrofitE, (Converter.Factory) fVar.f.get());
            case 4:
                return b.a((Json) fVar.e.get());
            case 5:
                return c.a();
            case 6:
                return p0.j((BannersDatabase) fVar.i.get());
            case 7:
                Context context = fVar.f282073b;
                yk0.a aVarB = fVar.f282074c.b();
                s.j(aVarB);
                return p0.o(context, aVarB, ((c21.b) fVar.f282072a).b());
            case 8:
                return new l((vq2.a) fVar.f282078l.get(), new wq2.a(), ((s41.a) fVar.d).d());
            case 9:
                return new mfg.a(fVar.f282073b, (BannersDatabase) fVar.i.get());
            default:
                throw new AssertionError(i);
        }
    }
}
