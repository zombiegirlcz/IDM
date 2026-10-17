package k79;

import androidx.recyclerview.widget.RecyclerView;
import cli.y;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.RevolutFeedScreen;
import k50.a4;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RevolutFeedScreen f181917a;

    public d(RevolutFeedScreen revolutFeedScreen) {
        this.f181917a = revolutFeedScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i == 1) {
            r rVar = (r) this.f181917a.R2();
            y yVar = rVar.f181939r;
            if (((g) ((j2) yVar.f22677a).getValue()).f181920c) {
                return;
            }
            rVar.H2(yVar, new a4(28));
        }
    }
}
