package pgc;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.rewards.impl.data.database.RewardsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import pfk.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f235875a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tgc.a f235877c = new tgc.a();
    public final b21.a e = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ofg.i f235876b = new ofg.i(this, 8);
    public final ofg.i d = new ofg.i(this, 9);

    public j(RewardsDatabase rewardsDatabase) {
        this.f235875a = rewardsDatabase;
    }

    public static /* synthetic */ Unit j(j jVar, ArrayList arrayList) {
        super.b(arrayList);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit k(j jVar, ArrayList arrayList) {
        super.c(arrayList);
        return Unit.f186387a;
    }

    @Override // pgc.g
    public final void a() {
        DBUtil.performBlocking(this.f235875a, false, true, new h0(15));
    }

    @Override // pgc.g
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f235875a, false, true, new h(this, arrayList, 2));
    }

    @Override // pgc.g
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f235875a, false, true, new h(this, arrayList, 1));
    }

    @Override // pgc.g
    public final void d() {
        DBUtil.performBlocking(this.f235875a, false, true, new h0(16));
    }

    @Override // pgc.g
    public final List e() {
        return (List) DBUtil.performBlocking(this.f235875a, true, false, new i(this, 0));
    }

    @Override // pgc.g
    public final rgc.i f(String str) {
        return (rgc.i) DBUtil.performBlocking(this.f235875a, true, false, new p5e.h(this, str, 20));
    }

    @Override // pgc.g
    public final List g() {
        return (List) DBUtil.performBlocking(this.f235875a, true, false, new i(this, 1));
    }

    @Override // pgc.g
    public final void h(rgc.i iVar) {
        DBUtil.performBlocking(this.f235875a, false, true, new p5e.h(this, iVar, 19));
    }

    @Override // pgc.g
    public final void i(ArrayList arrayList) {
        DBUtil.performBlocking(this.f235875a, false, true, new h(this, arrayList, 0));
    }
}
