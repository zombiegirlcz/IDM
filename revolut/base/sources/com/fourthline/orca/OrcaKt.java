package com.fourthline.orca;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.fourthline.orca.core.internal.activity.OrcaActivity;
import com.fourthline.orca.internal.d;
import com.fourthline.orca.internal.jr0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0018\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"abort", "", "Lcom/fourthline/orca/Orca;", "launchOrca", "context", "Landroid/content/Context;", "productName", "", "fourthline-sdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class OrcaKt {
    public static final void abort(@NotNull Orca orca) {
        Activity activityB;
        Intrinsics.checkNotNullParameter(orca, "<this>");
        jr0.a(jr0.f30017a, "orca_aborted", null, null, 6, null);
        d dVarA = OrcaActivity.INSTANCE.a();
        if (dVarA == null || (activityB = dVarA.b()) == null) {
            return;
        }
        activityB.finish();
    }

    public static final void launchOrca(@NotNull Context context, @NotNull String productName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intent intent = new Intent(context, (Class<?>) OrcaActivity.class);
        intent.putExtra("productName", productName);
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, 0);
        } else {
            context.startActivity(intent);
        }
    }
}
