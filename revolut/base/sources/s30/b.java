package s30;

import com.google.crypto.tink.shaded.protobuf.t1;
import gim.i;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import v20.f0;
import v20.o;
import v20.v;
import w4l.h;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f259391a;

    public b(o chatRepository) {
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f259391a = chatRepository;
    }

    public final Flow a(UUID chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        f0 f0Var = (f0) this.f259391a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return t1.E(new v0b.b(e.n(f0Var.f285396t.b(chatId, loadingStrategy), h0.f322473a), f0Var, 2));
    }

    public final Object b(UUID chatId, i iVar) {
        f0 f0Var = (f0) this.f259391a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        pfm.h hVar = new pfm.h(new v(f0Var, chatId, 0), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
        Object objA = nim.a.a(ue0.e.r(w.g0(hVar), h0.f322473a), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
