package ztg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.ConsentPromptPreconditionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentPromptPreconditionScreenContract$InputData f325139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f325140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f325141c;
    public final e4m.e d;

    public j(n nVar, h hVar, ConsentPromptPreconditionScreenContract$InputData consentPromptPreconditionScreenContract$InputData) {
        this.f325140b = nVar;
        this.f325139a = consentPromptPreconditionScreenContract$InputData;
        int i = 6;
        this.f325141c = e4m.b.b(new zpc.m(nVar, this, 1, i));
        this.d = e4m.b.b(new zpc.m(nVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
