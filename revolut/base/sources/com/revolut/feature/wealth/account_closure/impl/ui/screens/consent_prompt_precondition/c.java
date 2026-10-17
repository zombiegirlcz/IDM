package com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition;

import cli.o;
import com.revolut.data.model.Data;
import java.util.List;
import kog.k;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kr.h2;
import kug.g;
import kug.h;
import kug.s;
import yhm.j;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fug.c f94943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentPromptPreconditionScreenContract$InputData f94944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f94945c;

    public c(fug.c accountClosureConfirmationContentFactory, ConsentPromptPreconditionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(accountClosureConfirmationContentFactory, "accountClosureConfirmationContentFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f94943a = accountClosureConfirmationContentFactory;
        this.f94944b = inputData;
        this.f94945c = j.b(new h2(23));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f189794a;
        if (data == null || (list = (List) iii.c.f(data, new k(this, 25), new kj4.c(this, 17), new kcg.j(this, 14))) == null) {
            list = (List) this.f94945c.getValue();
        }
        return new s(list);
    }
}
