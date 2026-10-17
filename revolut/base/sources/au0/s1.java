package au0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final class s1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomTrackableComponent f9348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f9349c;
    public final /* synthetic */ HeaderWithBigTileLayout d;

    public /* synthetic */ s1(CustomTrackableComponent customTrackableComponent, py0.d dVar, HeaderWithBigTileLayout headerWithBigTileLayout, int i) {
        this.f9347a = i;
        this.f9348b = customTrackableComponent;
        this.f9349c = dVar;
        this.d = headerWithBigTileLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9347a) {
            case 0:
                h30.l.w(view, view).a(view, this.f9348b, this.f9349c);
                this.d.f57279r.onNext(Unit.f186387a);
                break;
            default:
                h30.l.w(view, view).a(view, this.f9348b, this.f9349c);
                this.d.f57272l.onNext(Unit.f186387a);
                break;
        }
    }
}
