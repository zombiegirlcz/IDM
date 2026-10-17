package r3b;

import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.api.models.Subaccount;
import ip0.xo0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f251266b;

    public /* synthetic */ t(Data data, int i) {
        this.f251265a = i;
        this.f251266b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        switch (this.f251265a) {
            case 0:
                return i.c((i) obj2, null, null, null, null, null, null, null, null, this.f251266b, null, 1535);
            case 1:
                return i.c((i) obj2, null, null, null, null, null, null, this.f251266b, null, null, null, 1983);
            case 2:
                return i.c((i) obj2, null, null, null, this.f251266b, zi0.c.P(fsl.e.f137725a, false, null, 3), null, null, null, null, null, 2023);
            case 3:
                return i.c((i) obj2, this.f251266b, null, null, null, null, null, null, null, null, null, 2046);
            case 4:
                return i.c((i) obj2, null, null, this.f251266b, null, null, null, null, null, null, null, 2043);
            case 5:
                return i.c((i) obj2, null, null, null, null, null, null, null, this.f251266b, null, null, 1791);
            case 6:
                return r3e.h.a((r3e.h) obj2, null, this.f251266b, 5);
            case 7:
                return r4k.l.a((r4k.l) obj2, null, null, (List) this.f251266b.getContent(), null, null, null, 991);
            case 8:
                r5e.f fVar = (r5e.f) obj2;
                int i = fVar.f251590b;
                fVar.getClass();
                return new r5e.f(this.f251266b, i);
            case 9:
                xo0 heightMode = ((r6d.d) obj2).f251664a;
                Intrinsics.checkNotNullParameter(heightMode, "heightMode");
                Data previewUrlData = this.f251266b;
                Intrinsics.checkNotNullParameter(previewUrlData, "previewUrlData");
                return new r6d.d(heightMode, previewUrlData);
            case 10:
                return r6f.e.a((r6f.e) obj2, this.f251266b, null, 2);
            case 11:
                return r6f.e.a((r6f.e) obj2, null, this.f251266b, 1);
            case 12:
                ((r74.j) obj2).getClass();
                Data prompt = this.f251266b;
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                return new r74.j(prompt);
            case 13:
                Data data2 = this.f251266b;
                Intrinsics.h(data2);
                return r7b.h.a((r7b.h) obj2, data2, 2);
            case 14:
                Data data3 = this.f251266b;
                r8e.h hVar = (r8e.h) obj2;
                try {
                    Object content = data3.getContent();
                    data = new Data(content != null ? (Subaccount.Group) ((Subaccount) content) : null, data3.getError(), data3.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data3.getLoading());
                }
                return r8e.h.a(hVar, data, null, 2);
            case 15:
                return r8e.h.a((r8e.h) obj2, null, this.f251266b, 1);
            case 16:
                return raf.e.a((raf.e) obj2, this.f251266b, null, 2);
            case 17:
                return raf.e.a((raf.e) obj2, null, this.f251266b, 1);
            case 18:
                ((rbh.c) obj2).getClass();
                return new rbh.c(this.f251266b);
            case 19:
                ((rbh.c) obj2).getClass();
                return new rbh.c(this.f251266b);
            case 20:
                Data favorites = this.f251266b;
                Intrinsics.h(favorites);
                ((rcg.g) obj2).getClass();
                Intrinsics.checkNotNullParameter(favorites, "favorites");
                return new rcg.g(favorites);
            case 21:
                return rch.e.a((rch.e) obj2, this.f251266b, null, null, null, 59);
            case 22:
                return rch.e.a((rch.e) obj2, null, this.f251266b, null, null, 55);
            case 23:
                return rch.e.a((rch.e) obj2, null, null, this.f251266b, null, 47);
            case 24:
                return rch.e.a((rch.e) obj2, null, null, null, this.f251266b, 31);
            case 25:
                return rg4.n.a((rg4.n) obj2, this.f251266b, false, 2);
            case 26:
                return rhg.j.a((rhg.j) obj2, this.f251266b, null, 2);
            case 27:
                ((rhj.f) obj2).getClass();
                Data subscriptionsByView = this.f251266b;
                Intrinsics.checkNotNullParameter(subscriptionsByView, "subscriptionsByView");
                return new rhj.f(subscriptionsByView);
            case 28:
                Data data4 = this.f251266b;
                Intrinsics.h(data4);
                return ri4.e.a((ri4.e) obj2, data4, null, 2);
            default:
                return rj7.j.a((rj7.j) obj2, this.f251266b);
        }
    }
}
