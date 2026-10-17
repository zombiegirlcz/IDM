package com.revolut.feature.apm.core.ui.api.navigation;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import gim.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public interface a {
    Object b1(Alias alias, i iVar);

    Object s0(RegisterAlias$Alias registerAlias$Alias, ApmAliasRegistrationMode apmAliasRegistrationMode, Function1 function1, Continuation continuation);
}
