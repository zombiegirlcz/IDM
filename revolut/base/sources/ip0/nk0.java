package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ThemeSwitcherDelegate;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;

/* JADX INFO: loaded from: classes19.dex */
public final class nk0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomTrackableComponent f165530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f165531c;
    public final /* synthetic */ ThemeSwitcherDelegate d;
    public final /* synthetic */ jk0 e;

    public /* synthetic */ nk0(CustomTrackableComponent customTrackableComponent, py0.c cVar, ThemeSwitcherDelegate themeSwitcherDelegate, jk0 jk0Var, int i) {
        this.f165529a = i;
        this.f165530b = customTrackableComponent;
        this.f165531c = cVar;
        this.d = themeSwitcherDelegate;
        this.e = jk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f165529a) {
            case 0:
                h30.l.w(view, view).a(view, this.f165530b, this.f165531c);
                ihm.f fVar = this.d.f53542c;
                this.e.getClass();
                fVar.onNext(new hk0(ik0.DAY));
                break;
            case 1:
                h30.l.w(view, view).a(view, this.f165530b, this.f165531c);
                ihm.f fVar2 = this.d.f53542c;
                this.e.getClass();
                fVar2.onNext(new hk0(ik0.NIGHT));
                break;
            default:
                h30.l.w(view, view).a(view, this.f165530b, this.f165531c);
                ihm.f fVar3 = this.d.f53542c;
                this.e.getClass();
                fVar3.onNext(new hk0(ik0.SYSTEM));
                break;
        }
    }
}
