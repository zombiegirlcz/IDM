package com.fourthline.orca.workflow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowSessionStart;", "", "Lkotlin/Function1;", "Lyhm/m;", "Lcom/fourthline/orca/workflow/WorkflowSession;", "", "onResult", "start", "(Lkotlin/jvm/functions/Function1;)V", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WorkflowSessionStart {
    void start(@NotNull Function1<? super m<? extends WorkflowSession>, Unit> onResult);
}
