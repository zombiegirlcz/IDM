package du2;

import au6.u;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import r10.v;
import skm.a2;
import vkm.q;
import vkm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends fsi.c {

    @NotNull
    public static final a Companion = new a();
    public static final fsi.b k = new fsi.b("PHONE_CALL_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f117534h;
    public final v i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a2 f117535j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CoroutineScope appCoroutineScope, v callStatusBannerInteractor) {
        super(k);
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(callStatusBannerInteractor, "callStatusBannerInteractor");
        this.f117534h = appCoroutineScope;
        this.i = callStatusBannerInteractor;
    }

    @Override // fsi.a
    public final void onStart() {
        v vVar = this.i;
        vVar.getClass();
        CoroutineScope scope = this.f117534h;
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f117535j = q.G(t1.F(new q0(new t38.e(((zt2.c) vVar.f250863b).f325055m, 24, q.g(((cu2.c) vVar.f250864c).f108801b), new u(3, 2, (Continuation) null)), new dob.c(vVar, null, 16), 1)), scope);
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        a2 a2Var = this.f117535j;
        if (a2Var != null) {
            a2Var.f(null);
        }
        super.onStop();
    }
}
