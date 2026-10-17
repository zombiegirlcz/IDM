package c1i;

import com.revolut.core.model.account.AccountId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe0.e f20517a;

    public b(xe0.e storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f20517a = storage;
    }

    public static String a(wd6.e eVar, AccountId accountId) {
        if (accountId instanceof AccountId.Personal) {
            Companion.getClass();
            return a.a(eVar);
        }
        if (!(accountId instanceof AccountId.Joint)) {
            throw new NoWhenBranchMatchedException();
        }
        Companion.getClass();
        return com.google.android.gms.internal.mlkit_vision_face.a.o(a.a(eVar), "_", ((AccountId.Joint) accountId).f51412a);
    }
}
