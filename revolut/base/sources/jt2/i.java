package jt2;

import ip0.gu;
import ip0.pb0;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ws2.a f178326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ws2.g f178327b;

    public i(ws2.a inviteeStateMapper, ws2.g stepsStateMapper) {
        Intrinsics.checkNotNullParameter(inviteeStateMapper, "inviteeStateMapper");
        Intrinsics.checkNotNullParameter(stepsStateMapper, "stepsStateMapper");
        this.f178326a = inviteeStateMapper;
        this.f178327b = stepsStateMapper;
    }

    public final aim.e a() {
        aim.e eVarB = zhm.u.b();
        eVarB.addAll(b());
        aim.e eVarB2 = zhm.u.b();
        v7.C("STEPS_SUBHEADER_LOADING_LIST_ID", 0, 0, 30, eVarB2);
        eVarB2.addAll(((ws2.i) this.f178327b).a());
        eVarB.addAll(zhm.u.a(eVarB2));
        aim.e eVarB3 = zhm.u.b();
        eVarB3.add(new gu("REWARD_SUBHEADER_LOADING_LIST_ID", 0, 0, 30));
        pb0 pb0Var = new pb0("REWARD_LOADING_LIST_ID");
        yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
        eVarB3.add(pb0Var);
        eVarB.addAll(zhm.u.a(eVarB3));
        return zhm.u.a(eVarB);
    }

    public final aim.e b() {
        aim.e eVarB = zhm.u.b();
        v7.C("ACTIVE_INVITEES_SUBHEADER_LOADING_LIST_ID", 0, 0, 30, eVarB);
        eVarB.addAll(((ws2.c) this.f178326a).f());
        return zhm.u.a(eVarB);
    }
}
