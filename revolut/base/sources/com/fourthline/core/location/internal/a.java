package com.fourthline.core.location.internal;

import androidx.view.result.ActivityResultCallback;
import com.fourthline.orca.workflow.SessionBuilder;
import com.fourthline.orca.workflow.WorkflowConfig;
import com.fourthline.orca.workflow.WorkflowSessionStart;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class a implements ActivityResultCallback, WorkflowSessionStart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f26440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26441b;

    public /* synthetic */ a(Object obj2, Object obj3) {
        this.f26440a = obj2;
        this.f26441b = obj3;
    }

    @Override // androidx.view.result.ActivityResultCallback
    public void onActivityResult(Object obj2) {
        AuthorizationManagerImpl.a((AuthorizationManagerImpl) this.f26440a, (Function1) this.f26441b, (Map) obj2);
    }

    @Override // com.fourthline.orca.workflow.WorkflowSessionStart
    public void start(Function1 function1) {
        SessionBuilder.a((SessionBuilder) this.f26440a, (WorkflowConfig) this.f26441b, function1);
    }
}
