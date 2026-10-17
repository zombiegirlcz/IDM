package zu8;

import android.app.Activity;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.fourthline.screen.FourthlineControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FourthlineControllerContract$InputData f325327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f325328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zpc.m f325329c;
    public final e4m.e d;
    public final e4m.e e;

    public o(c0 c0Var, p pVar, Activity activity, FourthlineControllerContract$InputData fourthlineControllerContract$InputData) {
        this.f325327a = fourthlineControllerContract$InputData;
        this.f325328b = activity;
        this.f325329c = new zpc.m(c0Var, this, 1, 13);
        this.d = e4m.b.b(new zpc.m(c0Var, this, 0, 13));
        this.e = e4m.b.b(new zpc.m(c0Var, this, 2, 13));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
