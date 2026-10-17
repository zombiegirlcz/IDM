package qz9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f250422a;

    public g(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f250422a = storage;
    }

    public static String a(zm3.a aVar) {
        String code;
        if (aVar instanceof zm3.l) {
            code = ((zm3.l) aVar).getCode();
        } else if (aVar instanceof zm3.e) {
            code = ((zm3.e) aVar).f323340a;
        } else if (aVar instanceof zm3.f) {
            code = ((zm3.f) aVar).f323345a;
        } else if (aVar instanceof zm3.n) {
            code = ((zm3.n) aVar).f323373a;
        } else {
            if (!(aVar instanceof zm3.o)) {
                throw new NoWhenBranchMatchedException();
            }
            code = ((zm3.o) aVar).f323376a;
        }
        return j6.a.q("KEY_RECIPIENT_WARNING_ACK", code);
    }
}
