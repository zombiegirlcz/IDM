package zab;

import android.view.View;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import k50.u1;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f320642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f320643c;

    public /* synthetic */ x(Object obj2, Object obj3, int i) {
        this.f320641a = i;
        this.f320642b = obj2;
        this.f320643c = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        int i = this.f320641a;
        Object obj2 = this.f320643c;
        Object obj3 = this.f320642b;
        switch (i) {
            case 0:
                SignSmsStepFragment.Companion companion = SignSmsStepFragment.INSTANCE;
                ((SignSmsStepFragment) obj3).E().setCode((String) obj2);
                break;
            default:
                u1 u1Var = (u1) obj2;
                Instant instant = ((zo0.d) obj3).f323850j;
                if (instant != null) {
                    u1Var.invoke(instant);
                }
                break;
        }
    }
}
