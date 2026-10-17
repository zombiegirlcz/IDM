package cu0;

import android.view.View;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import h30.l;
import kotlin.Unit;
import py0.d;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomTrackableComponent f108708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f108709c;
    public final /* synthetic */ c d;

    public /* synthetic */ b(CustomTrackableComponent customTrackableComponent, py0.c cVar, c cVar2, int i) {
        this.f108707a = i;
        this.f108708b = customTrackableComponent;
        this.f108709c = cVar;
        this.d = cVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f108707a) {
            case 0:
                l.w(view, view).a(view, this.f108708b, this.f108709c);
                this.d.f108714l.onNext(Unit.f186387a);
                break;
            default:
                l.w(view, view).a(view, this.f108708b, this.f108709c);
                this.d.f108715m.onNext(Unit.f186387a);
                break;
        }
    }
}
