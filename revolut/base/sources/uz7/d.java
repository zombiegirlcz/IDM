package uz7;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v2e.i0;
import zw7.g0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f284595b;

    public /* synthetic */ d(Data data, int i) {
        this.f284594a = i;
        this.f284595b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object transformed) {
        switch (this.f284594a) {
            case 0:
                g0 selectedPlanType = (g0) transformed;
                Intrinsics.checkNotNullParameter(selectedPlanType, "selectedPlanType");
                Data data = this.f284595b;
                Intrinsics.h(data);
                try {
                    Object content = data.getContent();
                    return new Data(content != null ? new Pair((List) content, selectedPlanType) : null, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 1:
                return v17.k.a((v17.k) transformed, null, this.f284595b, 61);
            case 2:
                return v1g.e.a((v1g.e) transformed, null, this.f284595b, 1);
            case 3:
                return v2e.l.a((v2e.l) transformed, null, null, null, false, false, false, false, null, this.f284595b, null, null, 1791);
            case 4:
                v2e.l lVar = (v2e.l) transformed;
                boolean z = lVar.f;
                Data data2 = this.f284595b;
                return v2e.l.a(lVar, null, null, null, false, false, z && (data2.getLoading() || data2.getError() != null || hx7.q.J(data2)), false, data2, null, null, null, 1887);
            case 5:
                ((v2g.d) transformed).getClass();
                Data bookings = this.f284595b;
                Intrinsics.checkNotNullParameter(bookings, "bookings");
                return new v2g.d(bookings);
            case 6:
                return v4e.p.a((v4e.p) transformed, this.f284595b, null, null, null, null, null, 62);
            case 7:
                return v4e.p.a((v4e.p) transformed, null, this.f284595b, null, null, null, null, 61);
            case 8:
                return v4e.p.a((v4e.p) transformed, null, null, null, null, null, this.f284595b, 31);
            case 9:
                return v4e.p.a((v4e.p) transformed, null, null, null, null, this.f284595b, null, 47);
            case 10:
                return v4g.g.a((v4g.g) transformed, this.f284595b, null, 5);
            case 11:
                Intrinsics.checkNotNullParameter(transformed, "transformed");
                Data data3 = this.f284595b;
                return new Data(transformed, data3.getError(), data3.getLoading());
            case 12:
                Intrinsics.checkNotNullParameter(transformed, "transformed");
                Data data4 = this.f284595b;
                return new Data(transformed, data4.getError(), data4.getLoading());
            case 13:
                Data transformed2 = (Data) transformed;
                Intrinsics.checkNotNullParameter(transformed2, "transformed");
                Data data5 = this.f284595b;
                return Data.copy$default(transformed2, null, pd.b.c(data5.getError(), transformed2.getError()), data5.getLoading() || transformed2.getLoading(), 1, null);
            case 14:
                return v5e.e.a((v5e.e) transformed, null, this.f284595b, 1);
            case 15:
                return v6f.e.a((v6f.e) transformed, this.f284595b, null, null, 6);
            case 16:
                return v6f.e.a((v6f.e) transformed, null, this.f284595b, null, 5);
            case 17:
                return v6f.e.a((v6f.e) transformed, null, null, this.f284595b, 3);
            case 18:
                return v6i.f.a((v6i.f) transformed, null, this.f284595b, 31);
            case 19:
                return v7f.a.a((v7f.a) transformed, this.f284595b, null, null, null, false, 30);
            case 20:
                return v7f.a.a((v7f.a) transformed, null, this.f284595b, null, null, false, 29);
            case 21:
                ((v8d.e) transformed).getClass();
                Data categories = this.f284595b;
                Intrinsics.checkNotNullParameter(categories, "categories");
                return new v8d.e(categories);
            case 22:
                return v9f.g.a((v9f.g) transformed, null, this.f284595b, 1);
            case 23:
                ((vb4.g) transformed).getClass();
                Data content2 = this.f284595b;
                Intrinsics.checkNotNullParameter(content2, "content");
                return new vb4.g(content2);
            case 24:
                ((vc2.a) transformed).getClass();
                Data data6 = this.f284595b;
                Intrinsics.checkNotNullParameter(data6, "data");
                return new vc2.a(data6);
            case 25:
                return vch.k.a((vch.k) transformed, null, null, null, null, null, this.f284595b, null, null, null, false, false, false, 16351);
            case 26:
                return vch.k.a((vch.k) transformed, null, null, null, this.f284595b, null, null, null, null, null, false, false, false, 16375);
            case 27:
                return vch.k.a((vch.k) transformed, null, null, null, null, null, null, null, this.f284595b, null, false, false, false, 16255);
            case 28:
                return vch.k.a((vch.k) transformed, null, null, null, null, null, null, null, null, this.f284595b, false, false, false, 16127);
            default:
                return vch.k.a((vch.k) transformed, null, null, null, null, null, null, this.f284595b, null, null, false, false, false, 16319);
        }
    }

    public /* synthetic */ d(i0 i0Var, Data data) {
        this.f284594a = 4;
        this.f284595b = data;
    }
}
