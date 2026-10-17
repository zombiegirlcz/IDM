package y8l;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.payments.money_request.domain.impl.data.database.MoneyRequestDatabase;
import dcl.g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import y66.p;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoomDatabase f311705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ay1.f f311706c = new ay1.f(this, 29);

    public o(MoneyRequestDatabase moneyRequestDatabase) {
        this.f311705b = moneyRequestDatabase;
        new g0(23);
        new wsj.c(this, 2);
    }

    public static /* synthetic */ Unit f(o oVar, ArrayList arrayList) {
        super.e(arrayList);
        return Unit.f186387a;
    }

    public static String g(o oVar, b bVar) {
        switch (n.f311703a[bVar.ordinal()]) {
            case 1:
                return "INTERNAL";
            case 2:
                return "MASAV_IL_R2P";
            case 3:
                return "AANI";
            case 4:
                return "BIZUM";
            case 5:
                return "MBWAY";
            case 6:
                return "QVIK";
            case 7:
                return "UPI";
            case 8:
                return "WERO";
            default:
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bVar);
        }
    }

    public static String h(o oVar, j jVar) {
        oVar.getClass();
        int i = n.f311704b[jVar.ordinal()];
        if (i == 1) {
            return "REVOLUT";
        }
        if (i == 2) {
            return "APM";
        }
        if (i == 3) {
            return "BANK_BENEFICIARY";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + jVar);
    }

    public static j i(String str) {
        str.getClass();
        switch (str) {
            case "BANK_BENEFICIARY":
                return j.BANK_BENEFICIARY;
            case "APM":
                return j.APM;
            case "REVOLUT":
                return j.REVOLUT;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    @Override // y8l.l
    public final void a(ArrayList arrayList) {
        DBUtil.performBlocking(this.f311705b, false, true, new m(this, arrayList, 1));
    }

    @Override // y8l.l
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f311705b, false, true, new a54.c(18, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE FROM money_requests WHERE id in ("), ")"), arrayList));
    }

    @Override // y8l.l
    public final List c() {
        return (List) DBUtil.performBlocking(this.f311705b, true, false, new p(this, 23));
    }

    @Override // y8l.l
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f311705b, false, true, new m(this, arrayList, 0));
    }
}
