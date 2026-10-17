package com.revolut.sso.impl.ui.email.enter_email;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.sso.impl.ui.email.enter_email.EnterEmailScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vml.e;
import vml.f;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements e {
    public final EnterEmailScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tll.a f106531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f106532q;

    public a(EnterEmailScreenContract$InputData inputData, n stateMapper, tll.a commonDialogsFactory) {
        String str;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(commonDialogsFactory, "commonDialogsFactory");
        this.o = inputData;
        this.f106531p = commonDialogsFactory;
        EnterEmailScreenContract$InputData.Mode mode = inputData.f106527a;
        if (Intrinsics.f(mode, EnterEmailScreenContract$InputData.Mode.LostAccess.f106529a) || (mode instanceof EnterEmailScreenContract$InputData.Mode.Create)) {
            str = null;
        } else {
            if (!(mode instanceof EnterEmailScreenContract$InputData.Mode.Verify)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((EnterEmailScreenContract$InputData.Mode.Verify) mode).f106530a;
        }
        this.f106532q = d.b(this, new f(str == null ? "" : str), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f106532q;
    }
}
