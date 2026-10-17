package zc0;

import com.revolut.core.backend_flow.ui.screen.BackendScreenFragment;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BackendScreenFragment f321100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountEditDelegate.Model f321101b;

    public p(BackendScreenFragment backendScreenFragment, AmountEditDelegate.Model model) {
        this.f321100a = backendScreenFragment;
        this.f321101b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f321100a.f51332e0.onNext(new Pair(this.f321101b.f51624a, formattedValue));
    }
}
