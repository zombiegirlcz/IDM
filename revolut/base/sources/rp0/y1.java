package rp0;

import android.view.View;
import com.revolut.core.ui_kit.models.AppTipUIModel;

/* JADX INFO: loaded from: classes19.dex */
public final class y1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f256225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppTipUIModel f256226c;
    public final /* synthetic */ yr0.u d;

    public /* synthetic */ y1(z1 z1Var, AppTipUIModel appTipUIModel, yr0.u uVar, int i) {
        this.f256224a = i;
        this.f256225b = z1Var;
        this.f256226c = appTipUIModel;
        this.d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f256224a) {
            case 0:
                z1 z1Var = this.f256225b;
                z1Var.f.onNext(this.f256226c);
                yr0.u uVar = this.d;
                z1.a(z1Var, uVar);
                uVar.dismiss();
                break;
            case 1:
                z1 z1Var2 = this.f256225b;
                z1Var2.f256231b.onNext(this.f256226c);
                yr0.u uVar2 = this.d;
                z1.a(z1Var2, uVar2);
                uVar2.dismiss();
                break;
            case 2:
                z1 z1Var3 = this.f256225b;
                z1Var3.f256232c.onNext(this.f256226c);
                yr0.u uVar3 = this.d;
                z1.a(z1Var3, uVar3);
                uVar3.dismiss();
                break;
            default:
                z1 z1Var4 = this.f256225b;
                z1Var4.d.onNext(this.f256226c);
                yr0.u uVar4 = this.d;
                z1.a(z1Var4, uVar4);
                uVar4.dismiss();
                break;
        }
    }
}
