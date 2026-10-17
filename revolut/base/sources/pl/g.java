package pl;

import com.onfido.android.sdk.capture.upload.ErrorType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ml.f0;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements igm.p, igm.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f237227b = new g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f237228c = new g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237229a;

    public /* synthetic */ g(int i) {
        this.f237229a = i;
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f237229a) {
            case 1:
                m outcome = (m) obj2;
                Intrinsics.checkNotNullParameter(outcome, "outcome");
                if (outcome instanceof k) {
                    ErrorType error = ((k) outcome).f237234a;
                    Intrinsics.checkNotNullParameter(error, "error");
                    return new b();
                }
                if (outcome instanceof l) {
                    return new e(((l) outcome).f237235a);
                }
                throw new NoWhenBranchMatchedException();
            default:
                return h.f.invoke(obj2);
        }
    }

    @Override // igm.p
    public boolean test(Object it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8 instanceof f0;
    }
}
