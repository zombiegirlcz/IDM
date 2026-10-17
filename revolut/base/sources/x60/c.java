package x60;

import com.revolut.core.account.region.domain.model.AccountRegion;
import elm.f;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import wim.z;
import x0f.g;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f303005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f303006b;

    public c(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f303005a = storage;
        this.f303006b = new AtomicReference(null);
    }

    public final String a() {
        String str;
        String strA;
        AccountRegion accountRegion = (AccountRegion) this.f303006b.get();
        String str2 = accountRegion != null ? accountRegion.f51201a : null;
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            try {
                AccountRegion accountRegion2 = (AccountRegion) this.f303006b.get();
                str = accountRegion2 != null ? accountRegion2.f51201a : null;
                if (str == null) {
                    String str3 = (String) this.f303005a.T2("ACCOUNT_REGION", z.d(o0.b(String.class)));
                    if (str3 != null) {
                        AccountRegion.INSTANCE.getClass();
                        strA = AccountRegion.Companion.a(str3);
                    } else {
                        AccountRegion.INSTANCE.getClass();
                        strA = "undefined";
                    }
                    str = strA;
                    this.f303006b.set(new AccountRegion(str));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return str;
    }

    public final Object b(Continuation continuation) throws Throwable {
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, new g(this, null, 5), continuation);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // od0.e
    public final void clear() {
        synchronized (this) {
            this.f303005a.I0("ACCOUNT_REGION");
            AtomicReference atomicReference = this.f303006b;
            AccountRegion.INSTANCE.getClass();
            atomicReference.set(new AccountRegion("undefined"));
            Unit unit = Unit.f186387a;
        }
    }
}
