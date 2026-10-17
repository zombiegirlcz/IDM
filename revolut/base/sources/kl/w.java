package kl;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.onfido.javax.inject.Provider;
import com.onfido.workflow.internal.ui.WorkflowLoadingFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class w implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WorkflowLoadingFragment f185246a;

    public w(WorkflowLoadingFragment workflowLoadingFragment) {
        this.f185246a = workflowLoadingFragment;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Provider provider = this.f185246a.f50200b0;
        if (provider == null) {
            Intrinsics.r("viewModelProvider");
            throw null;
        }
        e0 e0Var = (e0) provider.get();
        Intrinsics.i(e0Var, "null cannot be cast to non-null type T of com.onfido.android.sdk.capture.component.utils.ViewModelExtKt.createViewModelFactory.<no name provided>.create");
        return e0Var;
    }
}
