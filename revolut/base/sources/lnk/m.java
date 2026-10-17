package lnk;

import com.revolut.data.model.Data;
import java.util.List;
import jsl.v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f197302b;

    public /* synthetic */ m(Data data, int i) {
        this.f197301a = i;
        this.f197302b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f197301a) {
            case 0:
                Data data = this.f197302b;
                Intrinsics.h(data);
                return e.a((e) obj2, data, false, null, 30);
            case 1:
                return lq7.f.a((lq7.f) obj2, this.f197302b, null, null, 6);
            case 2:
                return lq7.f.a((lq7.f) obj2, null, this.f197302b, null, 5);
            case 3:
                return lq7.f.a((lq7.f) obj2, null, null, this.f197302b, 3);
            case 4:
                ((ls4.f) obj2).getClass();
                Data content = this.f197302b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new ls4.f(content);
            case 5:
                return v.a((v) obj2, null, null, this.f197302b, null, 11);
            case 6:
                return v.a((v) obj2, this.f197302b, null, null, null, 14);
            case 7:
                return v.a((v) obj2, null, this.f197302b, null, null, 13);
            case 8:
                return lu6.l.a((lu6.l) obj2, this.f197302b, null, 6);
            case 9:
                lv4.g gVar = (lv4.g) obj2;
                List list = (List) this.f197302b.getContent();
                if (list == null) {
                    list = f0.f322471a;
                }
                return lv4.g.a(gVar, null, null, list, 3);
            case 10:
                return lv4.g.a((lv4.g) obj2, this.f197302b, null, null, 6);
            case 11:
                return lv4.g.a((lv4.g) obj2, null, this.f197302b, null, 5);
            case 12:
                return lv4.g.a((lv4.g) obj2, null, this.f197302b, null, 5);
            case 13:
                ((lv6.k) obj2).getClass();
                Data cashbackBoosterDetails = this.f197302b;
                Intrinsics.checkNotNullParameter(cashbackBoosterDetails, "cashbackBoosterDetails");
                return new lv6.k(cashbackBoosterDetails);
            case 14:
                ((lw6.d) obj2).getClass();
                Data proVaultsData = this.f197302b;
                Intrinsics.checkNotNullParameter(proVaultsData, "proVaultsData");
                return new lw6.d(proVaultsData);
            case 15:
                return lwf.c.a((lwf.c) obj2, this.f197302b);
            case 16:
                ((ly5.f) obj2).getClass();
                Data collectionsData = this.f197302b;
                Intrinsics.checkNotNullParameter(collectionsData, "collectionsData");
                return new ly5.f(collectionsData);
            case 17:
                Data settingsData = this.f197302b;
                Intrinsics.h(settingsData);
                ((m07.e) obj2).getClass();
                Intrinsics.checkNotNullParameter(settingsData, "settingsData");
                return new m07.e(settingsData);
            case 18:
                f11.c cVar = ((m11.f) obj2).f201176b;
                Data challengeStatus = this.f197302b;
                Intrinsics.checkNotNullParameter(challengeStatus, "challengeStatus");
                return new m11.f(challengeStatus, cVar);
            case 19:
                Data data2 = this.f197302b;
                Intrinsics.h(data2);
                return m1e.f.a((m1e.f) obj2, data2, null, 2);
            case 20:
                ((m22.a) obj2).getClass();
                Data items = this.f197302b;
                Intrinsics.checkNotNullParameter(items, "items");
                return new m22.a(items);
            case 21:
                return m2f.l.a((m2f.l) obj2, this.f197302b, null, 0.0d, null, 0, null, null, null, null, false, false, 8189);
            case 22:
                return m2f.l.a((m2f.l) obj2, null, this.f197302b, 0.0d, null, 0, null, null, null, null, false, false, 8183);
            case 23:
                Data data3 = this.f197302b;
                Intrinsics.h(data3);
                return m2f.l.a((m2f.l) obj2, null, null, 0.0d, null, 0, null, null, null, data3, false, false, 7167);
            case 24:
                return m3g.n.a((m3g.n) obj2, null, null, null, null, null, null, null, null, this.f197302b, false, 767);
            case 25:
                return m3g.n.a((m3g.n) obj2, null, null, null, null, null, null, null, this.f197302b, null, false, 895);
            case 26:
                ((n2h.f) obj2).getClass();
                Data actions = this.f197302b;
                Intrinsics.checkNotNullParameter(actions, "actions");
                return new n2h.f(actions);
            case 27:
                Data categories = this.f197302b;
                Intrinsics.h(categories);
                ((m40.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(categories, "categories");
                return new m40.d(categories);
            case 28:
                ((m4b.d) obj2).getClass();
                return new m4b.d(this.f197302b);
            default:
                ((m56.d) obj2).getClass();
                Data account = this.f197302b;
                Intrinsics.checkNotNullParameter(account, "account");
                return new m56.d(account);
        }
    }
}
