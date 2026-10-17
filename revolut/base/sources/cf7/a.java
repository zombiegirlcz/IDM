package cf7;

import com.revolut.feature.incentive_reward.impl.network.IncentiveRewardService;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23571b;

    public a(b bVar, int i) {
        this.f23570a = bVar;
        this.f23571b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f23570a;
        ee0.a aVar = bVar.f23574c;
        int i = this.f23571b;
        switch (i) {
            case 0:
                return cdj.b.q(bVar.f23572a);
            case 1:
                return new qf7.i((IncentiveRewardService) bVar.v.get(), (ne0.j) bVar.f23586w.get(), (ue0.c) bVar.f23588y.get());
            case 2:
                ik0.b bVarM = ((nj0.d) bVar.f23573b).m();
                vc.s.j(bVarM);
                return s.a(bVarM, (Converter.Factory) bVar.u.get());
            case 3:
                return n.a((Json) bVar.f23585t.get());
            case 4:
                return cdj.b.n(new hqa.c(fe0.d.a(), 1));
            case 5:
                return new ne0.d();
            case 6:
                je0.d dVar = (je0.d) bVar.f23587x.get();
                yk0.a aVarB = bVar.d.b();
                vc.s.j(aVarB);
                xe0.f fVarF = aVar.f();
                vc.s.j(fVarF);
                return cdj.b.A(dVar, aVarB, fVarF);
            case 7:
                Json json = (Json) bVar.f23585t.get();
                me0.a aVarE = aVar.e();
                vc.s.j(aVarE);
                return cdj.b.t(json, aVarE);
            case 8:
                return new df7.d((qf7.i) bVar.z.get());
            default:
                throw new AssertionError(i);
        }
    }
}
