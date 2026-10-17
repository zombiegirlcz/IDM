package g58;

import com.revolut.feature.joint.impl.ui.phone_confirmation.JointContactPhoneConfirmationContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends jki.g implements d {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JointContactPhoneConfirmationContract$InputData f140695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f140696q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, JointContactPhoneConfirmationContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f140695p = inputData;
        this.f140696q = w.y0(new fp3.a(this, 24));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // jki.g
    public final jki.i r2() {
        return (b) this.f140696q.getValue();
    }
}
