package com.trustdockekyc.core.backend.presentation;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Metadata;
import n2m.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/trustdockekyc/core/backend/presentation/ProgressDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Companion", "n2m/l", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ProgressDialogFragment extends DialogFragment {

    @NotNull
    public static final l Companion = new l();

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        Dialog dialog = new Dialog(requireActivity());
        Window window = dialog.getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setFlags(1024, 256);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.setContentView(R.layout.tdcoreekyc__fragment_progress_dialog);
        return dialog;
    }
}
