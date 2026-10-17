package fk4;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.data.model.Policy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f135715b;

    public /* synthetic */ o(Data data, int i) {
        this.f135714a = i;
        this.f135715b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        switch (this.f135714a) {
            case 0:
                ((f) obj2).getClass();
                Data externalLinkedAccounts = this.f135715b;
                Intrinsics.checkNotNullParameter(externalLinkedAccounts, "externalLinkedAccounts");
                return new f(externalLinkedAccounts);
            case 1:
                Data plan = this.f135715b;
                Intrinsics.h(plan);
                ((fk9.c) obj2).getClass();
                Intrinsics.checkNotNullParameter(plan, "plan");
                return new fk9.c(plan);
            case 2:
                ((fkj.e) obj2).getClass();
                Data esimPhoneNumberPortOutCredentials = this.f135715b;
                Intrinsics.checkNotNullParameter(esimPhoneNumberPortOutCredentials, "esimPhoneNumberPortOutCredentials");
                return new fkj.e(esimPhoneNumberPortOutCredentials);
            case 3:
                return fmb.r.a((fmb.r) obj2, this.f135715b);
            case 4:
                return fmb.r.a((fmb.r) obj2, this.f135715b);
            case 5:
                return fnc.m.a((fnc.m) obj2, this.f135715b, false, null, null, null, null, null, null, null, null, null, null, 4094);
            case 6:
                return fnc.m.a((fnc.m) obj2, null, false, null, this.f135715b, null, null, null, null, null, null, null, null, 4087);
            case 7:
                return fnc.m.a((fnc.m) obj2, null, false, null, null, this.f135715b, null, null, null, null, null, null, null, 4079);
            case 8:
                return fnc.m.a((fnc.m) obj2, null, false, null, null, null, null, this.f135715b, null, null, null, null, null, 4031);
            case 9:
                return fnc.m.a((fnc.m) obj2, null, false, null, null, null, null, null, this.f135715b, null, null, null, null, 3967);
            case 10:
                return fnc.m.a((fnc.m) obj2, null, false, null, null, null, null, null, null, this.f135715b, null, null, null, 3839);
            case 11:
                return fnc.m.a((fnc.m) obj2, null, false, null, null, null, null, null, null, null, null, this.f135715b, null, 3071);
            case 12:
                return fnk.f.a((fnk.f) obj2, null, this.f135715b, 1);
            case 13:
                return fnk.f.a((fnk.f) obj2, this.f135715b, null, 2);
            case 14:
                return fo6.i.a((fo6.i) obj2, this.f135715b, null, 2);
            case 15:
                return fo6.i.a((fo6.i) obj2, this.f135715b, null, 2);
            case 16:
                return fo9.h.a((fo9.h) obj2, this.f135715b, null, null, null, 14);
            case 17:
                return foh.p.a((foh.p) obj2, this.f135715b, null, null, null, null, 61);
            case 18:
                return foh.p.a((foh.p) obj2, null, null, null, null, this.f135715b, 31);
            case 19:
                Data data2 = this.f135715b;
                fq7.c cVar = (fq7.c) obj2;
                try {
                    Object content = data2.getContent();
                    data = new Data(content != null ? ((Policy) content).e : null, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return fq7.c.a(cVar, data, null, 2);
            case 20:
                return fq7.c.a((fq7.c) obj2, null, this.f135715b, 1);
            case 21:
                return new fr7.e(this.f135715b);
            case 22:
                return ft2.e.a((ft2.e) obj2, this.f135715b, 2);
            case 23:
                return ft4.m.a((ft4.m) obj2, this.f135715b, null, null, 6);
            case 24:
                return fu6.i.a((fu6.i) obj2, null, null, this.f135715b, null, 11);
            case 25:
                return fu6.i.a((fu6.i) obj2, null, null, null, this.f135715b, 7);
            case 26:
                return fu6.i.a((fu6.i) obj2, null, this.f135715b, null, null, 13);
            case 27:
                return fu6.i.a((fu6.i) obj2, this.f135715b, null, null, null, 14);
            case 28:
                ((fuc.d) obj2).getClass();
                Data cards = this.f135715b;
                Intrinsics.checkNotNullParameter(cards, "cards");
                return new fuc.d(cards);
            default:
                return fuk.h.a((fuk.h) obj2, null, null, null, this.f135715b, 7);
        }
    }
}
