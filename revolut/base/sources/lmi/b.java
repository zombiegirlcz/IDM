package lmi;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.CardService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements AutoCloseable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f197089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f197090b;

    public b(CardService cardService, Function1 doClose) {
        Intrinsics.checkNotNullParameter(doClose, "doClose");
        this.f197089a = cardService;
        this.f197090b = doClose;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f197090b.invoke(this.f197089a);
    }
}
