package no;

import android.R;
import android.app.Dialog;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class z0 {
    private z0() {
    }

    public static a1 a(Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(dialog, "<this>");
        View viewFindViewById = dialog.findViewById(R.id.content);
        return new a1(String.valueOf(System.identityHashCode(viewFindViewById != null ? viewFindViewById : dialog)), viewFindViewById, dialog);
    }
}
