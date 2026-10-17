package ixj;

import e7l.g;
import efm.d0;
import igh.o;
import ik3.c;
import kotlin.jvm.internal.Intrinsics;
import ue0.e;
import w4l.h;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements r0j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f169571a;

    public b(fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f169571a = configurationInteractor;
    }

    public final d0 a() {
        d0 d0VarFirstOrError = e.E(m70.a.h(((c) this.f169571a).l(g.a.f123406a, h.f294642c), new o(this, 23), new iui.b(22), null, 4), r0j.a.TWO_BUTTONS_UI).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
