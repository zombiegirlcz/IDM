package com.revolut.retail.feature.pod_nominees.impl.edit;

import cli.n;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreenContract$LaunchType;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l80.e;
import mek.f;
import mek.g;
import mek.j;
import mek.m;
import mek.o;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements j {

    @NotNull
    public static final m Companion = new m();
    public final PodNomineeEditScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lek.b f102598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f102599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f102600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zzl.b f102601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f102602t;

    public c(n stateMapper, PodNomineeEditScreenContract$InputData inputData, i90.b uuidUtils, lek.b podNomineesInteractor, e dateProvider, o modelExtension, zzl.b regexMatcher) {
        g gVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(podNomineesInteractor, "podNomineesInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.o = inputData;
        this.f102598p = podNomineesInteractor;
        this.f102599q = dateProvider;
        this.f102600r = modelExtension;
        this.f102601s = regexMatcher;
        PodNomineeEditScreenContract$LaunchType podNomineeEditScreenContract$LaunchType = inputData.f102589a;
        if (podNomineeEditScreenContract$LaunchType instanceof PodNomineeEditScreenContract$LaunchType.Create) {
            t0 t0Var = t0.f186434a;
            m70.a.c(t0Var);
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            gVar = new g("", "", "", I2(podNomineeEditScreenContract$LaunchType), null, !((PodNomineeEditScreenContract$LaunchType.Create) podNomineeEditScreenContract$LaunchType).f102592a, new f(false), wp5.y.u(uuidUtils, "toString(...)"));
        } else {
            if (!(podNomineeEditScreenContract$LaunchType instanceof PodNomineeEditScreenContract$LaunchType.Edit)) {
                throw new NoWhenBranchMatchedException();
            }
            PodNominee podNominee = ((PodNomineeEditScreenContract$LaunchType.Edit) podNomineeEditScreenContract$LaunchType).f102593a;
            String str = podNominee.f102618b;
            String str2 = podNominee.f102619c;
            String str3 = podNominee.f;
            gVar = new g(str, str2, str3 == null ? "" : str3, I2(podNomineeEditScreenContract$LaunchType), podNominee.e, !r3.f102594b, new f(true), wp5.y.u(uuidUtils, "toString(...)"));
        }
        this.f102602t = mra.d.b(this, gVar, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        if (!this.o.f102589a.getF102594b()) {
            l2(new mci.e(this, continuation, 1), new yi5.b(26));
        }
        l.a1(this, this.f102600r.c3(), null, null, new mek.n(this, continuation, 3), 3);
    }

    public final mek.h I2(PodNomineeEditScreenContract$LaunchType podNomineeEditScreenContract$LaunchType) {
        boolean z = true;
        if (podNomineeEditScreenContract$LaunchType instanceof PodNomineeEditScreenContract$LaunchType.Create) {
            m70.a.c(t0.f186434a);
            return new mek.h("", true);
        }
        if (!(podNomineeEditScreenContract$LaunchType instanceof PodNomineeEditScreenContract$LaunchType.Edit)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((PodNomineeEditScreenContract$LaunchType.Edit) podNomineeEditScreenContract$LaunchType).f102593a.f;
        if (str == null) {
            m70.a.c(t0.f186434a);
            return new mek.h("", true);
        }
        if (str.length() != 0 && !((zzl.c) this.f102601s).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", str)) {
            z = false;
        }
        return new mek.h(str, z);
    }

    @Override // yji.l
    public final void T1(long j2) {
        md0.c cVar = new md0.c(14);
        y yVar = this.f102602t;
        Continuation continuation = null;
        l.b1(this, q.H(new mek.n(this, continuation, 1), t1.g(yVar.B(cVar), 500L)), null, new mek.n(this, continuation, 2), 3);
        l.b1(this, q.q(q.H(new mek.n(this, continuation, 0), yVar.B(new md0.c(12)))), null, new jkh.g(this, continuation, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f102602t;
    }
}
