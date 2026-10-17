package hy0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.revolut.core.ui_kit.views.stories.StoriesPagerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StoriesPagerView f156625a;

    public e(StoriesPagerView storiesPagerView) {
        this.f156625a = storiesPagerView;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Intrinsics.f(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            StoriesPagerView.k(this.f156625a);
        }
    }
}
